package org.teleclin.scenario;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.NoArgsConstructor;

/**
 * Lock manager.
 * Lock the thread from with is called.
 * The lock condition is based on an object id
 */
@NoArgsConstructor
public final class TelegramScenarioLockManager {

    private int waitForObjectId;

    private final Lock operationFlag = new ReentrantLock();
    private final Condition gotAuthorization = operationFlag.newCondition();

    /**
     * (
     * Lock method. THe lock is set based on provided constructor id
     *
     * @param waitForObjectId constructor id
     * @throws InterruptedException exception on lock set
     */
    public void lockForCondition(int waitForObjectId) throws InterruptedException {
        this.waitForObjectId = 0;
        operationFlag.lock();
        try {
            while (this.waitForObjectId != waitForObjectId) {
                gotAuthorization.await();
            }
        } finally {
            operationFlag.unlock();
        }
    }

    /**
     * set new "wait" object id
     *
     * @param waitForObjectId exception on lock released
     */
    public void setWaitForObjectId(int waitForObjectId) {
        this.waitForObjectId = waitForObjectId;
        operationFlag.lock();
        try {
            gotAuthorization.signal();
        } finally {
            operationFlag.unlock();
        }
    }

}
