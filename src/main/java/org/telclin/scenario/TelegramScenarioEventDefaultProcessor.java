package org.telclin.scenario;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.telclin.tdlib.TdApi;

/**
 * Processor for update event for default flows
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Log4j2
final class TelegramScenarioEventDefaultProcessor {
    static void processEventInternally(TdApi.@NotNull Object object, TelegramScenarioFunctionPool functionPool) {
        TdApi.Chat chat;
        switch (object.getConstructor()) {
            case TdApi.UpdateNewChat.CONSTRUCTOR:
                TdApi.UpdateNewChat updateNewChat = (TdApi.UpdateNewChat) object;
                functionPool.updateChatFunction.accept(updateNewChat.chat.id, updateNewChat.chat);
                break;
            case TdApi.UpdateSecretChat.CONSTRUCTOR:
                TdApi.UpdateSecretChat updateSecretChat = (TdApi.UpdateSecretChat) object;
                functionPool.updateSecretChatFunction.accept(updateSecretChat.secretChat.userId, updateSecretChat.secretChat);
                break;
            case TdApi.UpdateChatTitle.CONSTRUCTOR:
                TdApi.UpdateChatTitle updateChatTitle = (TdApi.UpdateChatTitle) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatTitle.chatId);
                synchronized (chat) {
                    chat.title = updateChatTitle.title;
                }
                break;
            case TdApi.UpdateChatPhoto.CONSTRUCTOR:
                TdApi.UpdateChatPhoto updateChatPhoto = (TdApi.UpdateChatPhoto) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatPhoto.chatId);
                synchronized (chat) {
                    chat.photo = updateChatPhoto.photo;
                }
                break;
            case TdApi.UpdateChatLastMessage.CONSTRUCTOR:
                TdApi.UpdateChatLastMessage updateChatLastMessage = (TdApi.UpdateChatLastMessage) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatLastMessage.chatId);
                synchronized (chat) {
                    chat.lastMessage = updateChatLastMessage.lastMessage;
                }
                break;
            case TdApi.UpdateChatPosition.CONSTRUCTOR:
                TdApi.UpdateChatPosition updateChatPosition = (TdApi.UpdateChatPosition) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatPosition.chatId);
                synchronized (chat) {
                    //  chat.positions = updateChatPosition.position;
                    int x = 1;
                }
                break;
            case TdApi.UpdateChatMessageSender.CONSTRUCTOR:
                TdApi.UpdateChatMessageSender updateChatMessageSender = (TdApi.UpdateChatMessageSender) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatMessageSender.chatId);
                synchronized (chat) {
                    chat.messageSenderId = updateChatMessageSender.messageSenderId;
                }
                break;
            case TdApi.UpdateChatHasProtectedContent.CONSTRUCTOR:
                TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent = (TdApi.UpdateChatHasProtectedContent) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatHasProtectedContent.chatId);
                synchronized (chat) {
                    chat.hasProtectedContent = updateChatHasProtectedContent.hasProtectedContent;
                }
                break;
            case TdApi.UpdateChatIsMarkedAsUnread.CONSTRUCTOR:
                TdApi.UpdateChatIsMarkedAsUnread updateChatIsMarkedAsUnread = (TdApi.UpdateChatIsMarkedAsUnread) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatIsMarkedAsUnread.chatId);
                synchronized (chat) {
                    chat.isMarkedAsUnread = updateChatIsMarkedAsUnread.isMarkedAsUnread;
                }
                break;
            case TdApi.UpdateChatIsBlocked.CONSTRUCTOR:
                TdApi.UpdateChatIsBlocked updateChatIsBlocked = (TdApi.UpdateChatIsBlocked) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatIsBlocked.chatId);
                synchronized (chat) {
                    chat.isBlocked = updateChatIsBlocked.isBlocked;
                }
                break;
            case TdApi.UpdateChatHasScheduledMessages.CONSTRUCTOR:
                TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages = (TdApi.UpdateChatHasScheduledMessages) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatHasScheduledMessages.chatId);
                synchronized (chat) {
                    chat.hasScheduledMessages = updateChatHasScheduledMessages.hasScheduledMessages;
                }
                break;
            case TdApi.UpdateChatDefaultDisableNotification.CONSTRUCTOR:
                TdApi.UpdateChatDefaultDisableNotification updateChatDefaultDisableNotification = (TdApi.UpdateChatDefaultDisableNotification) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatDefaultDisableNotification.chatId);
                synchronized (chat) {
                    chat.defaultDisableNotification = updateChatDefaultDisableNotification.defaultDisableNotification;
                }
                break;
            case TdApi.UpdateChatReadInbox.CONSTRUCTOR:
                TdApi.UpdateChatReadInbox updateChatReadInbox = (TdApi.UpdateChatReadInbox) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatReadInbox.chatId);
                synchronized (chat) {
                    chat.lastReadInboxMessageId = updateChatReadInbox.lastReadInboxMessageId;
                    chat.unreadCount = updateChatReadInbox.unreadCount;
                    break;
                }
            case TdApi.UpdateChatReadOutbox.CONSTRUCTOR:
                TdApi.UpdateChatReadOutbox updateChatReadOutbox = (TdApi.UpdateChatReadOutbox) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatReadOutbox.chatId);
                synchronized (chat) {
                    chat.lastReadOutboxMessageId = updateChatReadOutbox.lastReadOutboxMessageId;
                    break;
                }
            case TdApi.UpdateChatUnreadMentionCount.CONSTRUCTOR:
                TdApi.UpdateChatUnreadMentionCount updateChatUnreadMentionCount = (TdApi.UpdateChatUnreadMentionCount) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatUnreadMentionCount.chatId);
                synchronized (chat) {
                    chat.unreadMentionCount = updateChatUnreadMentionCount.unreadMentionCount;
                }
                break;
            case TdApi.UpdateChatUnreadReactionCount.CONSTRUCTOR:
                TdApi.UpdateChatUnreadReactionCount updateChatUnreadReactionCount = (TdApi.UpdateChatUnreadReactionCount) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatUnreadReactionCount.chatId);
                synchronized (chat) {
                    chat.unreadReactionCount = updateChatUnreadReactionCount.unreadReactionCount;
                }
                break;
            case TdApi.UpdateChatNotificationSettings.CONSTRUCTOR:
                TdApi.UpdateChatNotificationSettings updateChatNotificationSettings = (TdApi.UpdateChatNotificationSettings) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatNotificationSettings.chatId);
                synchronized (chat) {
                    chat.notificationSettings = updateChatNotificationSettings.notificationSettings;
                }
                break;
            case TdApi.UpdateChatAvailableReactions.CONSTRUCTOR:
                TdApi.UpdateChatAvailableReactions updateChatAvailableReactions = (TdApi.UpdateChatAvailableReactions) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatAvailableReactions.chatId);
                synchronized (chat) {
                    chat.availableReactions = updateChatAvailableReactions.availableReactions;
                }
                break;
            case TdApi.UpdateChatMessageTtl.CONSTRUCTOR:
                TdApi.UpdateChatMessageTtl updateChatMessageTtl = (TdApi.UpdateChatMessageTtl) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatMessageTtl.chatId);
                synchronized (chat) {
                    chat.messageTtl = updateChatMessageTtl.messageTtl;
                }
                break;
            case TdApi.UpdateChatTheme.CONSTRUCTOR:
                TdApi.UpdateChatTheme updateChatTheme = (TdApi.UpdateChatTheme) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatTheme.chatId);
                synchronized (chat) {
                    chat.themeName = updateChatTheme.themeName;
                }
                break;
            case TdApi.UpdateChatActionBar.CONSTRUCTOR:
                TdApi.UpdateChatActionBar updateChatActionBar = (TdApi.UpdateChatActionBar) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatActionBar.chatId);
                synchronized (chat) {
                    chat.actionBar = updateChatActionBar.actionBar;
                }
                break;
            case TdApi.UpdateChatVideoChat.CONSTRUCTOR:
                TdApi.UpdateChatVideoChat updateChatVideoChat = (TdApi.UpdateChatVideoChat) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatVideoChat.chatId);
                synchronized (chat) {
                    chat.videoChat = updateChatVideoChat.videoChat;
                }
                break;
            case TdApi.UpdateChatPendingJoinRequests.CONSTRUCTOR:
                TdApi.UpdateChatPendingJoinRequests updateChatPendingJoinRequests = (TdApi.UpdateChatPendingJoinRequests) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatPendingJoinRequests.chatId);
                synchronized (chat) {
                    chat.pendingJoinRequests = updateChatPendingJoinRequests.pendingJoinRequests;
                }
                break;
            case TdApi.UpdateChatReplyMarkup.CONSTRUCTOR:
                TdApi.UpdateChatReplyMarkup updateChatReplyMarkup = (TdApi.UpdateChatReplyMarkup) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatReplyMarkup.chatId);
                synchronized (chat) {
                    chat.replyMarkupMessageId = updateChatReplyMarkup.replyMarkupMessageId;
                }
                break;
            case TdApi.UpdateChatDraftMessage.CONSTRUCTOR:
                TdApi.UpdateChatDraftMessage updateChatDraftMessage = (TdApi.UpdateChatDraftMessage) object;
                chat = functionPool.chatSupplierFunction.apply(updateChatDraftMessage.chatId);
                synchronized (chat) {
                    chat.draftMessage = updateChatDraftMessage.draftMessage;
                }
                break;
            default:
                log.atTrace().log("Skipped object {}", object);
        }
    }
}
