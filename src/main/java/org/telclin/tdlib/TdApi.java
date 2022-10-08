//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.telclin.tdlib;

public class TdApi {
    public TdApi() {
    }

    static {
        try {
            System.loadLibrary("tdjni");
        } catch (UnsatisfiedLinkError var1) {
            var1.printStackTrace();
        }

    }

    public static class WriteGeneratedFilePart extends Function<Ok> {
        public long generationId;
        public long offset;
        public byte[] data;
        public static final int CONSTRUCTOR = 214474389;

        public WriteGeneratedFilePart() {
        }

        public WriteGeneratedFilePart(long var1, long var3, byte[] var5) {
            this.generationId = var1;
            this.offset = var3;
            this.data = var5;
        }

        public int getConstructor() {
            return 214474389;
        }
    }

    public static class ViewTrendingStickerSets extends Function<Ok> {
        public long[] stickerSetIds;
        public static final int CONSTRUCTOR = -952416520;

        public ViewTrendingStickerSets() {
        }

        public ViewTrendingStickerSets(long[] var1) {
            this.stickerSetIds = var1;
        }

        public int getConstructor() {
            return -952416520;
        }
    }

    public static class ViewPremiumFeature extends Function<Ok> {
        public PremiumFeature feature;
        public static final int CONSTRUCTOR = 192950706;

        public ViewPremiumFeature() {
        }

        public ViewPremiumFeature(PremiumFeature var1) {
            this.feature = var1;
        }

        public int getConstructor() {
            return 192950706;
        }
    }

    public static class ViewMessages extends Function<Ok> {
        public long chatId;
        public long messageThreadId;
        public long[] messageIds;
        public boolean forceRead;
        public static final int CONSTRUCTOR = -1155961496;

        public ViewMessages() {
        }

        public ViewMessages(long var1, long var3, long[] var5, boolean var6) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.messageIds = var5;
            this.forceRead = var6;
        }

        public int getConstructor() {
            return -1155961496;
        }
    }

    public static class ValidateOrderInfo extends Function<ValidatedOrderInfo> {
        public InputInvoice inputInvoice;
        public OrderInfo orderInfo;
        public boolean allowSave;
        public static final int CONSTRUCTOR = -1248305201;

        public ValidateOrderInfo() {
        }

        public ValidateOrderInfo(InputInvoice var1, OrderInfo var2, boolean var3) {
            this.inputInvoice = var1;
            this.orderInfo = var2;
            this.allowSave = var3;
        }

        public int getConstructor() {
            return -1248305201;
        }
    }

    public static class UploadStickerFile extends Function<File> {
        public long userId;
        public InputSticker sticker;
        public static final int CONSTRUCTOR = 86279066;

        public UploadStickerFile() {
        }

        public UploadStickerFile(long var1, InputSticker var3) {
            this.userId = var1;
            this.sticker = var3;
        }

        public int getConstructor() {
            return 86279066;
        }
    }

    public static class UpgradeBasicGroupChatToSupergroupChat extends Function<Chat> {
        public long chatId;
        public static final int CONSTRUCTOR = 300488122;

        public UpgradeBasicGroupChatToSupergroupChat() {
        }

        public UpgradeBasicGroupChatToSupergroupChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 300488122;
        }
    }

    public static class UnpinChatMessage extends Function<Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 2065448670;

        public UnpinChatMessage() {
        }

        public UnpinChatMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 2065448670;
        }
    }

    public static class UnpinAllChatMessages extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1437805385;

        public UnpinAllChatMessages() {
        }

        public UnpinAllChatMessages(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1437805385;
        }
    }

    public static class TranslateText extends Function<Text> {
        public String text;
        public String fromLanguageCode;
        public String toLanguageCode;
        public static final int CONSTRUCTOR = -1619686803;

        public TranslateText() {
        }

        public TranslateText(String var1, String var2, String var3) {
            this.text = var1;
            this.fromLanguageCode = var2;
            this.toLanguageCode = var3;
        }

        public int getConstructor() {
            return -1619686803;
        }
    }

    public static class TransferChatOwnership extends Function<Ok> {
        public long chatId;
        public long userId;
        public String password;
        public static final int CONSTRUCTOR = 2006977043;

        public TransferChatOwnership() {
        }

        public TransferChatOwnership(long var1, long var3, String var5) {
            this.chatId = var1;
            this.userId = var3;
            this.password = var5;
        }

        public int getConstructor() {
            return 2006977043;
        }
    }

    public static class ToggleSupergroupSignMessages extends Function<Ok> {
        public long supergroupId;
        public boolean signMessages;
        public static final int CONSTRUCTOR = 1156568356;

        public ToggleSupergroupSignMessages() {
        }

        public ToggleSupergroupSignMessages(long var1, boolean var3) {
            this.supergroupId = var1;
            this.signMessages = var3;
        }

        public int getConstructor() {
            return 1156568356;
        }
    }

    public static class ToggleSupergroupJoinToSendMessages extends Function<Ok> {
        public long supergroupId;
        public boolean joinToSendMessages;
        public static final int CONSTRUCTOR = -182022642;

        public ToggleSupergroupJoinToSendMessages() {
        }

        public ToggleSupergroupJoinToSendMessages(long var1, boolean var3) {
            this.supergroupId = var1;
            this.joinToSendMessages = var3;
        }

        public int getConstructor() {
            return -182022642;
        }
    }

    public static class ToggleSupergroupJoinByRequest extends Function<Ok> {
        public long supergroupId;
        public boolean joinByRequest;
        public static final int CONSTRUCTOR = 2111807454;

        public ToggleSupergroupJoinByRequest() {
        }

        public ToggleSupergroupJoinByRequest(long var1, boolean var3) {
            this.supergroupId = var1;
            this.joinByRequest = var3;
        }

        public int getConstructor() {
            return 2111807454;
        }
    }

    public static class ToggleSupergroupIsBroadcastGroup extends Function<Ok> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 884089365;

        public ToggleSupergroupIsBroadcastGroup() {
        }

        public ToggleSupergroupIsBroadcastGroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 884089365;
        }
    }

    public static class ToggleSupergroupIsAllHistoryAvailable extends Function<Ok> {
        public long supergroupId;
        public boolean isAllHistoryAvailable;
        public static final int CONSTRUCTOR = 1155110478;

        public ToggleSupergroupIsAllHistoryAvailable() {
        }

        public ToggleSupergroupIsAllHistoryAvailable(long var1, boolean var3) {
            this.supergroupId = var1;
            this.isAllHistoryAvailable = var3;
        }

        public int getConstructor() {
            return 1155110478;
        }
    }

    public static class ToggleSessionCanAcceptSecretChats extends Function<Ok> {
        public long sessionId;
        public boolean canAcceptSecretChats;
        public static final int CONSTRUCTOR = 1000843390;

        public ToggleSessionCanAcceptSecretChats() {
        }

        public ToggleSessionCanAcceptSecretChats(long var1, boolean var3) {
            this.sessionId = var1;
            this.canAcceptSecretChats = var3;
        }

        public int getConstructor() {
            return 1000843390;
        }
    }

    public static class ToggleSessionCanAcceptCalls extends Function<Ok> {
        public long sessionId;
        public boolean canAcceptCalls;
        public static final int CONSTRUCTOR = 1819027208;

        public ToggleSessionCanAcceptCalls() {
        }

        public ToggleSessionCanAcceptCalls(long var1, boolean var3) {
            this.sessionId = var1;
            this.canAcceptCalls = var3;
        }

        public int getConstructor() {
            return 1819027208;
        }
    }

    public static class ToggleMessageSenderIsBlocked extends Function<Ok> {
        public MessageSender senderId;
        public boolean isBlocked;
        public static final int CONSTRUCTOR = -2008084779;

        public ToggleMessageSenderIsBlocked() {
        }

        public ToggleMessageSenderIsBlocked(MessageSender var1, boolean var2) {
            this.senderId = var1;
            this.isBlocked = var2;
        }

        public int getConstructor() {
            return -2008084779;
        }
    }

    public static class ToggleGroupCallScreenSharingIsPaused extends Function<Ok> {
        public int groupCallId;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -1602530464;

        public ToggleGroupCallScreenSharingIsPaused() {
        }

        public ToggleGroupCallScreenSharingIsPaused(int var1, boolean var2) {
            this.groupCallId = var1;
            this.isPaused = var2;
        }

        public int getConstructor() {
            return -1602530464;
        }
    }

    public static class ToggleGroupCallParticipantIsMuted extends Function<Ok> {
        public int groupCallId;
        public MessageSender participantId;
        public boolean isMuted;
        public static final int CONSTRUCTOR = -1308093433;

        public ToggleGroupCallParticipantIsMuted() {
        }

        public ToggleGroupCallParticipantIsMuted(int var1, MessageSender var2, boolean var3) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.isMuted = var3;
        }

        public int getConstructor() {
            return -1308093433;
        }
    }

    public static class ToggleGroupCallParticipantIsHandRaised extends Function<Ok> {
        public int groupCallId;
        public MessageSender participantId;
        public boolean isHandRaised;
        public static final int CONSTRUCTOR = -1896127519;

        public ToggleGroupCallParticipantIsHandRaised() {
        }

        public ToggleGroupCallParticipantIsHandRaised(int var1, MessageSender var2, boolean var3) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.isHandRaised = var3;
        }

        public int getConstructor() {
            return -1896127519;
        }
    }

    public static class ToggleGroupCallMuteNewParticipants extends Function<Ok> {
        public int groupCallId;
        public boolean muteNewParticipants;
        public static final int CONSTRUCTOR = 284082626;

        public ToggleGroupCallMuteNewParticipants() {
        }

        public ToggleGroupCallMuteNewParticipants(int var1, boolean var2) {
            this.groupCallId = var1;
            this.muteNewParticipants = var2;
        }

        public int getConstructor() {
            return 284082626;
        }
    }

    public static class ToggleGroupCallIsMyVideoPaused extends Function<Ok> {
        public int groupCallId;
        public boolean isMyVideoPaused;
        public static final int CONSTRUCTOR = -478875239;

        public ToggleGroupCallIsMyVideoPaused() {
        }

        public ToggleGroupCallIsMyVideoPaused(int var1, boolean var2) {
            this.groupCallId = var1;
            this.isMyVideoPaused = var2;
        }

        public int getConstructor() {
            return -478875239;
        }
    }

    public static class ToggleGroupCallIsMyVideoEnabled extends Function<Ok> {
        public int groupCallId;
        public boolean isMyVideoEnabled;
        public static final int CONSTRUCTOR = -1624289030;

        public ToggleGroupCallIsMyVideoEnabled() {
        }

        public ToggleGroupCallIsMyVideoEnabled(int var1, boolean var2) {
            this.groupCallId = var1;
            this.isMyVideoEnabled = var2;
        }

        public int getConstructor() {
            return -1624289030;
        }
    }

    public static class ToggleGroupCallEnabledStartNotification extends Function<Ok> {
        public int groupCallId;
        public boolean enabledStartNotification;
        public static final int CONSTRUCTOR = 707839826;

        public ToggleGroupCallEnabledStartNotification() {
        }

        public ToggleGroupCallEnabledStartNotification(int var1, boolean var2) {
            this.groupCallId = var1;
            this.enabledStartNotification = var2;
        }

        public int getConstructor() {
            return 707839826;
        }
    }

    public static class ToggleDownloadIsPaused extends Function<Ok> {
        public int fileId;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -947493099;

        public ToggleDownloadIsPaused() {
        }

        public ToggleDownloadIsPaused(int var1, boolean var2) {
            this.fileId = var1;
            this.isPaused = var2;
        }

        public int getConstructor() {
            return -947493099;
        }
    }

    public static class ToggleChatIsPinned extends Function<Ok> {
        public ChatList chatList;
        public long chatId;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1485429186;

        public ToggleChatIsPinned() {
        }

        public ToggleChatIsPinned(ChatList var1, long var2, boolean var4) {
            this.chatList = var1;
            this.chatId = var2;
            this.isPinned = var4;
        }

        public int getConstructor() {
            return -1485429186;
        }
    }

    public static class ToggleChatIsMarkedAsUnread extends Function<Ok> {
        public long chatId;
        public boolean isMarkedAsUnread;
        public static final int CONSTRUCTOR = -986129697;

        public ToggleChatIsMarkedAsUnread() {
        }

        public ToggleChatIsMarkedAsUnread(long var1, boolean var3) {
            this.chatId = var1;
            this.isMarkedAsUnread = var3;
        }

        public int getConstructor() {
            return -986129697;
        }
    }

    public static class ToggleChatHasProtectedContent extends Function<Ok> {
        public long chatId;
        public boolean hasProtectedContent;
        public static final int CONSTRUCTOR = 975231309;

        public ToggleChatHasProtectedContent() {
        }

        public ToggleChatHasProtectedContent(long var1, boolean var3) {
            this.chatId = var1;
            this.hasProtectedContent = var3;
        }

        public int getConstructor() {
            return 975231309;
        }
    }

    public static class ToggleChatDefaultDisableNotification extends Function<Ok> {
        public long chatId;
        public boolean defaultDisableNotification;
        public static final int CONSTRUCTOR = 314794002;

        public ToggleChatDefaultDisableNotification() {
        }

        public ToggleChatDefaultDisableNotification(long var1, boolean var3) {
            this.chatId = var1;
            this.defaultDisableNotification = var3;
        }

        public int getConstructor() {
            return 314794002;
        }
    }

    public static class ToggleBotIsAddedToAttachmentMenu extends Function<Ok> {
        public long botUserId;
        public boolean isAdded;
        public static final int CONSTRUCTOR = -1251515422;

        public ToggleBotIsAddedToAttachmentMenu() {
        }

        public ToggleBotIsAddedToAttachmentMenu(long var1, boolean var3) {
            this.botUserId = var1;
            this.isAdded = var3;
        }

        public int getConstructor() {
            return -1251515422;
        }
    }

    public static class ToggleAllDownloadsArePaused extends Function<Ok> {
        public boolean arePaused;
        public static final int CONSTRUCTOR = 1251512322;

        public ToggleAllDownloadsArePaused() {
        }

        public ToggleAllDownloadsArePaused(boolean var1) {
            this.arePaused = var1;
        }

        public int getConstructor() {
            return 1251512322;
        }
    }

    public static class TestUseUpdate extends Function<Update> {
        public static final int CONSTRUCTOR = 717094686;

        public TestUseUpdate() {
        }

        public int getConstructor() {
            return 717094686;
        }
    }

    public static class TestSquareInt extends Function<TestInt> {
        public int x;
        public static final int CONSTRUCTOR = -60135024;

        public TestSquareInt() {
        }

        public TestSquareInt(int var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -60135024;
        }
    }

    public static class TestReturnError extends Function<Error> {
        public Error error;
        public static final int CONSTRUCTOR = 455179506;

        public TestReturnError() {
        }

        public TestReturnError(Error var1) {
            this.error = var1;
        }

        public int getConstructor() {
            return 455179506;
        }
    }

    public static class TestProxy extends Function<Ok> {
        public String server;
        public int port;
        public ProxyType type;
        public int dcId;
        public double timeout;
        public static final int CONSTRUCTOR = -1197366626;

        public TestProxy() {
        }

        public TestProxy(String var1, int var2, ProxyType var3, int var4, double var5) {
            this.server = var1;
            this.port = var2;
            this.type = var3;
            this.dcId = var4;
            this.timeout = var5;
        }

        public int getConstructor() {
            return -1197366626;
        }
    }

    public static class TestNetwork extends Function<Ok> {
        public static final int CONSTRUCTOR = -1343998901;

        public TestNetwork() {
        }

        public int getConstructor() {
            return -1343998901;
        }
    }

    public static class TestGetDifference extends Function<Ok> {
        public static final int CONSTRUCTOR = 1747084069;

        public TestGetDifference() {
        }

        public int getConstructor() {
            return 1747084069;
        }
    }

    public static class TestCallVectorStringObject extends Function<TestVectorStringObject> {
        public TestString[] x;
        public static final int CONSTRUCTOR = 1527666429;

        public TestCallVectorStringObject() {
        }

        public TestCallVectorStringObject(TestString[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return 1527666429;
        }
    }

    public static class TestCallVectorString extends Function<TestVectorString> {
        public String[] x;
        public static final int CONSTRUCTOR = -408600900;

        public TestCallVectorString() {
        }

        public TestCallVectorString(String[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -408600900;
        }
    }

    public static class TestCallVectorIntObject extends Function<TestVectorIntObject> {
        public TestInt[] x;
        public static final int CONSTRUCTOR = 1825428218;

        public TestCallVectorIntObject() {
        }

        public TestCallVectorIntObject(TestInt[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return 1825428218;
        }
    }

    public static class TestCallVectorInt extends Function<TestVectorInt> {
        public int[] x;
        public static final int CONSTRUCTOR = -2137277793;

        public TestCallVectorInt() {
        }

        public TestCallVectorInt(int[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -2137277793;
        }
    }

    public static class TestCallString extends Function<TestString> {
        public String x;
        public static final int CONSTRUCTOR = -1732818385;

        public TestCallString() {
        }

        public TestCallString(String var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -1732818385;
        }
    }

    public static class TestCallEmpty extends Function<Ok> {
        public static final int CONSTRUCTOR = -627291626;

        public TestCallEmpty() {
        }

        public int getConstructor() {
            return -627291626;
        }
    }

    public static class TestCallBytes extends Function<TestBytes> {
        public byte[] x;
        public static final int CONSTRUCTOR = -736011607;

        public TestCallBytes() {
        }

        public TestCallBytes(byte[] var1) {
            this.x = var1;
        }

        public int getConstructor() {
            return -736011607;
        }
    }

    public static class TerminateSession extends Function<Ok> {
        public long sessionId;
        public static final int CONSTRUCTOR = -407385812;

        public TerminateSession() {
        }

        public TerminateSession(long var1) {
            this.sessionId = var1;
        }

        public int getConstructor() {
            return -407385812;
        }
    }

    public static class TerminateAllOtherSessions extends Function<Ok> {
        public static final int CONSTRUCTOR = 1874485523;

        public TerminateAllOtherSessions() {
        }

        public int getConstructor() {
            return 1874485523;
        }
    }

    public static class SynchronizeLanguagePack extends Function<Ok> {
        public String languagePackId;
        public static final int CONSTRUCTOR = -2065307858;

        public SynchronizeLanguagePack() {
        }

        public SynchronizeLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return -2065307858;
        }
    }

    public static class StopPoll extends Function<Ok> {
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 1659374253;

        public StopPoll() {
        }

        public StopPoll(long var1, long var3, ReplyMarkup var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
        }

        public int getConstructor() {
            return 1659374253;
        }
    }

    public static class StartScheduledGroupCall extends Function<Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1519938838;

        public StartScheduledGroupCall() {
        }

        public StartScheduledGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1519938838;
        }
    }

    public static class StartGroupCallScreenSharing extends Function<Text> {
        public int groupCallId;
        public int audioSourceId;
        public String payload;
        public static final int CONSTRUCTOR = -884068051;

        public StartGroupCallScreenSharing() {
        }

        public StartGroupCallScreenSharing(int var1, int var2, String var3) {
            this.groupCallId = var1;
            this.audioSourceId = var2;
            this.payload = var3;
        }

        public int getConstructor() {
            return -884068051;
        }
    }

    public static class StartGroupCallRecording extends Function<Ok> {
        public int groupCallId;
        public String title;
        public boolean recordVideo;
        public boolean usePortraitOrientation;
        public static final int CONSTRUCTOR = 1757774971;

        public StartGroupCallRecording() {
        }

        public StartGroupCallRecording(int var1, String var2, boolean var3, boolean var4) {
            this.groupCallId = var1;
            this.title = var2;
            this.recordVideo = var3;
            this.usePortraitOrientation = var4;
        }

        public int getConstructor() {
            return 1757774971;
        }
    }

    public static class SharePhoneNumber extends Function<Ok> {
        public long userId;
        public static final int CONSTRUCTOR = 1097130069;

        public SharePhoneNumber() {
        }

        public SharePhoneNumber(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1097130069;
        }
    }

    public static class SetVideoChatDefaultParticipant extends Function<Ok> {
        public long chatId;
        public MessageSender defaultParticipantId;
        public static final int CONSTRUCTOR = -240749901;

        public SetVideoChatDefaultParticipant() {
        }

        public SetVideoChatDefaultParticipant(long var1, MessageSender var3) {
            this.chatId = var1;
            this.defaultParticipantId = var3;
        }

        public int getConstructor() {
            return -240749901;
        }
    }

    public static class SetUsername extends Function<Ok> {
        public String username;
        public static final int CONSTRUCTOR = 439901214;

        public SetUsername() {
        }

        public SetUsername(String var1) {
            this.username = var1;
        }

        public int getConstructor() {
            return 439901214;
        }
    }

    public static class SetUserSupportInfo extends Function<UserSupportInfo> {
        public long userId;
        public FormattedText message;
        public static final int CONSTRUCTOR = -2088986621;

        public SetUserSupportInfo() {
        }

        public SetUserSupportInfo(long var1, FormattedText var3) {
            this.userId = var1;
            this.message = var3;
        }

        public int getConstructor() {
            return -2088986621;
        }
    }

    public static class SetUserPrivacySettingRules extends Function<Ok> {
        public UserPrivacySetting setting;
        public UserPrivacySettingRules rules;
        public static final int CONSTRUCTOR = -473812741;

        public SetUserPrivacySettingRules() {
        }

        public SetUserPrivacySettingRules(UserPrivacySetting var1, UserPrivacySettingRules var2) {
            this.setting = var1;
            this.rules = var2;
        }

        public int getConstructor() {
            return -473812741;
        }
    }

    public static class SetTdlibParameters extends Function<Ok> {
        public boolean useTestDc;
        public String databaseDirectory;
        public String filesDirectory;
        public byte[] databaseEncryptionKey;
        public boolean useFileDatabase;
        public boolean useChatInfoDatabase;
        public boolean useMessageDatabase;
        public boolean useSecretChats;
        public int apiId;
        public String apiHash;
        public String systemLanguageCode;
        public String deviceModel;
        public String systemVersion;
        public String applicationVersion;
        public boolean enableStorageOptimizer;
        public boolean ignoreFileNames;
        public static final int CONSTRUCTOR = 1384743481;

        public SetTdlibParameters() {
        }

        public SetTdlibParameters(boolean var1, String var2, String var3, byte[] var4, boolean var5, boolean var6, boolean var7, boolean var8, int var9, String var10, String var11, String var12, String var13, String var14, boolean var15, boolean var16) {
            this.useTestDc = var1;
            this.databaseDirectory = var2;
            this.filesDirectory = var3;
            this.databaseEncryptionKey = var4;
            this.useFileDatabase = var5;
            this.useChatInfoDatabase = var6;
            this.useMessageDatabase = var7;
            this.useSecretChats = var8;
            this.apiId = var9;
            this.apiHash = var10;
            this.systemLanguageCode = var11;
            this.deviceModel = var12;
            this.systemVersion = var13;
            this.applicationVersion = var14;
            this.enableStorageOptimizer = var15;
            this.ignoreFileNames = var16;
        }

        public int getConstructor() {
            return 1384743481;
        }
    }

    public static class SetSupergroupUsername extends Function<Ok> {
        public long supergroupId;
        public String username;
        public static final int CONSTRUCTOR = 1346325252;

        public SetSupergroupUsername() {
        }

        public SetSupergroupUsername(long var1, String var3) {
            this.supergroupId = var1;
            this.username = var3;
        }

        public int getConstructor() {
            return 1346325252;
        }
    }

    public static class SetSupergroupStickerSet extends Function<Ok> {
        public long supergroupId;
        public long stickerSetId;
        public static final int CONSTRUCTOR = -2056344215;

        public SetSupergroupStickerSet() {
        }

        public SetSupergroupStickerSet(long var1, long var3) {
            this.supergroupId = var1;
            this.stickerSetId = var3;
        }

        public int getConstructor() {
            return -2056344215;
        }
    }

    public static class SetStickerSetThumbnail extends Function<StickerSet> {
        public long userId;
        public String name;
        public InputFile thumbnail;
        public static final int CONSTRUCTOR = 1230174856;

        public SetStickerSetThumbnail() {
        }

        public SetStickerSetThumbnail(long var1, String var3, InputFile var4) {
            this.userId = var1;
            this.name = var3;
            this.thumbnail = var4;
        }

        public int getConstructor() {
            return 1230174856;
        }
    }

    public static class SetStickerPositionInSet extends Function<Ok> {
        public InputFile sticker;
        public int position;
        public static final int CONSTRUCTOR = 2075281185;

        public SetStickerPositionInSet() {
        }

        public SetStickerPositionInSet(InputFile var1, int var2) {
            this.sticker = var1;
            this.position = var2;
        }

        public int getConstructor() {
            return 2075281185;
        }
    }

    public static class SetScopeNotificationSettings extends Function<Ok> {
        public NotificationSettingsScope scope;
        public ScopeNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = -2049984966;

        public SetScopeNotificationSettings() {
        }

        public SetScopeNotificationSettings(NotificationSettingsScope var1, ScopeNotificationSettings var2) {
            this.scope = var1;
            this.notificationSettings = var2;
        }

        public int getConstructor() {
            return -2049984966;
        }
    }

    public static class SetRecoveryEmailAddress extends Function<PasswordState> {
        public String password;
        public String newRecoveryEmailAddress;
        public static final int CONSTRUCTOR = -1981836385;

        public SetRecoveryEmailAddress() {
        }

        public SetRecoveryEmailAddress(String var1, String var2) {
            this.password = var1;
            this.newRecoveryEmailAddress = var2;
        }

        public int getConstructor() {
            return -1981836385;
        }
    }

    public static class SetProfilePhoto extends Function<Ok> {
        public InputChatPhoto photo;
        public static final int CONSTRUCTOR = -2069678882;

        public SetProfilePhoto() {
        }

        public SetProfilePhoto(InputChatPhoto var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return -2069678882;
        }
    }

    public static class SetPollAnswer extends Function<Ok> {
        public long chatId;
        public long messageId;
        public int[] optionIds;
        public static final int CONSTRUCTOR = -1399388792;

        public SetPollAnswer() {
        }

        public SetPollAnswer(long var1, long var3, int[] var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.optionIds = var5;
        }

        public int getConstructor() {
            return -1399388792;
        }
    }

    public static class SetPinnedChats extends Function<Ok> {
        public ChatList chatList;
        public long[] chatIds;
        public static final int CONSTRUCTOR = -695640000;

        public SetPinnedChats() {
        }

        public SetPinnedChats(ChatList var1, long[] var2) {
            this.chatList = var1;
            this.chatIds = var2;
        }

        public int getConstructor() {
            return -695640000;
        }
    }

    public static class SetPassword extends Function<PasswordState> {
        public String oldPassword;
        public String newPassword;
        public String newHint;
        public boolean setRecoveryEmailAddress;
        public String newRecoveryEmailAddress;
        public static final int CONSTRUCTOR = -1193589027;

        public SetPassword() {
        }

        public SetPassword(String var1, String var2, String var3, boolean var4, String var5) {
            this.oldPassword = var1;
            this.newPassword = var2;
            this.newHint = var3;
            this.setRecoveryEmailAddress = var4;
            this.newRecoveryEmailAddress = var5;
        }

        public int getConstructor() {
            return -1193589027;
        }
    }

    public static class SetPassportElementErrors extends Function<Ok> {
        public long userId;
        public InputPassportElementError[] errors;
        public static final int CONSTRUCTOR = -2056754881;

        public SetPassportElementErrors() {
        }

        public SetPassportElementErrors(long var1, InputPassportElementError[] var3) {
            this.userId = var1;
            this.errors = var3;
        }

        public int getConstructor() {
            return -2056754881;
        }
    }

    public static class SetPassportElement extends Function<PassportElement> {
        public InputPassportElement element;
        public String password;
        public static final int CONSTRUCTOR = 2068173212;

        public SetPassportElement() {
        }

        public SetPassportElement(InputPassportElement var1, String var2) {
            this.element = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return 2068173212;
        }
    }

    public static class SetOption extends Function<Ok> {
        public String name;
        public OptionValue value;
        public static final int CONSTRUCTOR = 2114670322;

        public SetOption() {
        }

        public SetOption(String var1, OptionValue var2) {
            this.name = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return 2114670322;
        }
    }

    public static class SetNetworkType extends Function<Ok> {
        public NetworkType type;
        public static final int CONSTRUCTOR = -701635234;

        public SetNetworkType() {
        }

        public SetNetworkType(NetworkType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return -701635234;
        }
    }

    public static class SetName extends Function<Ok> {
        public String firstName;
        public String lastName;
        public static final int CONSTRUCTOR = 1711693584;

        public SetName() {
        }

        public SetName(String var1, String var2) {
            this.firstName = var1;
            this.lastName = var2;
        }

        public int getConstructor() {
            return 1711693584;
        }
    }

    public static class SetMenuButton extends Function<Ok> {
        public long userId;
        public BotMenuButton menuButton;
        public static final int CONSTRUCTOR = -1269841599;

        public SetMenuButton() {
        }

        public SetMenuButton(long var1, BotMenuButton var3) {
            this.userId = var1;
            this.menuButton = var3;
        }

        public int getConstructor() {
            return -1269841599;
        }
    }

    public static class SetLoginEmailAddress extends Function<EmailAddressAuthenticationCodeInfo> {
        public String newLoginEmailAddress;
        public static final int CONSTRUCTOR = 935019476;

        public SetLoginEmailAddress() {
        }

        public SetLoginEmailAddress(String var1) {
            this.newLoginEmailAddress = var1;
        }

        public int getConstructor() {
            return 935019476;
        }
    }

    public static class SetLogVerbosityLevel extends Function<Ok> {
        public int newVerbosityLevel;
        public static final int CONSTRUCTOR = -303429678;

        public SetLogVerbosityLevel() {
        }

        public SetLogVerbosityLevel(int var1) {
            this.newVerbosityLevel = var1;
        }

        public int getConstructor() {
            return -303429678;
        }
    }

    public static class SetLogTagVerbosityLevel extends Function<Ok> {
        public String tag;
        public int newVerbosityLevel;
        public static final int CONSTRUCTOR = -2095589738;

        public SetLogTagVerbosityLevel() {
        }

        public SetLogTagVerbosityLevel(String var1, int var2) {
            this.tag = var1;
            this.newVerbosityLevel = var2;
        }

        public int getConstructor() {
            return -2095589738;
        }
    }

    public static class SetLogStream extends Function<Ok> {
        public LogStream logStream;
        public static final int CONSTRUCTOR = -1364199535;

        public SetLogStream() {
        }

        public SetLogStream(LogStream var1) {
            this.logStream = var1;
        }

        public int getConstructor() {
            return -1364199535;
        }
    }

    public static class SetLocation extends Function<Ok> {
        public Location location;
        public static final int CONSTRUCTOR = 93926257;

        public SetLocation() {
        }

        public SetLocation(Location var1) {
            this.location = var1;
        }

        public int getConstructor() {
            return 93926257;
        }
    }

    public static class SetInlineGameScore extends Function<Ok> {
        public String inlineMessageId;
        public boolean editMessage;
        public long userId;
        public int score;
        public boolean force;
        public static final int CONSTRUCTOR = -948871797;

        public SetInlineGameScore() {
        }

        public SetInlineGameScore(String var1, boolean var2, long var3, int var5, boolean var6) {
            this.inlineMessageId = var1;
            this.editMessage = var2;
            this.userId = var3;
            this.score = var5;
            this.force = var6;
        }

        public int getConstructor() {
            return -948871797;
        }
    }

    public static class SetInactiveSessionTtl extends Function<Ok> {
        public int inactiveSessionTtlDays;
        public static final int CONSTRUCTOR = 1570548048;

        public SetInactiveSessionTtl() {
        }

        public SetInactiveSessionTtl(int var1) {
            this.inactiveSessionTtlDays = var1;
        }

        public int getConstructor() {
            return 1570548048;
        }
    }

    public static class SetGroupCallTitle extends Function<Ok> {
        public int groupCallId;
        public String title;
        public static final int CONSTRUCTOR = -1228825139;

        public SetGroupCallTitle() {
        }

        public SetGroupCallTitle(int var1, String var2) {
            this.groupCallId = var1;
            this.title = var2;
        }

        public int getConstructor() {
            return -1228825139;
        }
    }

    public static class SetGroupCallParticipantVolumeLevel extends Function<Ok> {
        public int groupCallId;
        public MessageSender participantId;
        public int volumeLevel;
        public static final int CONSTRUCTOR = -1753769944;

        public SetGroupCallParticipantVolumeLevel() {
        }

        public SetGroupCallParticipantVolumeLevel(int var1, MessageSender var2, int var3) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.volumeLevel = var3;
        }

        public int getConstructor() {
            return -1753769944;
        }
    }

    public static class SetGroupCallParticipantIsSpeaking extends Function<Ok> {
        public int groupCallId;
        public int audioSource;
        public boolean isSpeaking;
        public static final int CONSTRUCTOR = 927506917;

        public SetGroupCallParticipantIsSpeaking() {
        }

        public SetGroupCallParticipantIsSpeaking(int var1, int var2, boolean var3) {
            this.groupCallId = var1;
            this.audioSource = var2;
            this.isSpeaking = var3;
        }

        public int getConstructor() {
            return 927506917;
        }
    }

    public static class SetGameScore extends Function<Message> {
        public long chatId;
        public long messageId;
        public boolean editMessage;
        public long userId;
        public int score;
        public boolean force;
        public static final int CONSTRUCTOR = 2127359430;

        public SetGameScore() {
        }

        public SetGameScore(long var1, long var3, boolean var5, long var6, int var8, boolean var9) {
            this.chatId = var1;
            this.messageId = var3;
            this.editMessage = var5;
            this.userId = var6;
            this.score = var8;
            this.force = var9;
        }

        public int getConstructor() {
            return 2127359430;
        }
    }

    public static class SetFileGenerationProgress extends Function<Ok> {
        public long generationId;
        public long expectedSize;
        public long localPrefixSize;
        public static final int CONSTRUCTOR = 1836403518;

        public SetFileGenerationProgress() {
        }

        public SetFileGenerationProgress(long var1, long var3, long var5) {
            this.generationId = var1;
            this.expectedSize = var3;
            this.localPrefixSize = var5;
        }

        public int getConstructor() {
            return 1836403518;
        }
    }

    public static class SetEmojiStatus extends Function<Ok> {
        public EmojiStatus emojiStatus;
        public int duration;
        public static final int CONSTRUCTOR = -1310680569;

        public SetEmojiStatus() {
        }

        public SetEmojiStatus(EmojiStatus var1, int var2) {
            this.emojiStatus = var1;
            this.duration = var2;
        }

        public int getConstructor() {
            return -1310680569;
        }
    }

    public static class SetDefaultReactionType extends Function<Ok> {
        public ReactionType reactionType;
        public static final int CONSTRUCTOR = 1694730813;

        public SetDefaultReactionType() {
        }

        public SetDefaultReactionType(ReactionType var1) {
            this.reactionType = var1;
        }

        public int getConstructor() {
            return 1694730813;
        }
    }

    public static class SetDefaultGroupAdministratorRights extends Function<Ok> {
        public ChatAdministratorRights defaultGroupAdministratorRights;
        public static final int CONSTRUCTOR = 1700231016;

        public SetDefaultGroupAdministratorRights() {
        }

        public SetDefaultGroupAdministratorRights(ChatAdministratorRights var1) {
            this.defaultGroupAdministratorRights = var1;
        }

        public int getConstructor() {
            return 1700231016;
        }
    }

    public static class SetDefaultChannelAdministratorRights extends Function<Ok> {
        public ChatAdministratorRights defaultChannelAdministratorRights;
        public static final int CONSTRUCTOR = -234004967;

        public SetDefaultChannelAdministratorRights() {
        }

        public SetDefaultChannelAdministratorRights(ChatAdministratorRights var1) {
            this.defaultChannelAdministratorRights = var1;
        }

        public int getConstructor() {
            return -234004967;
        }
    }

    public static class SetDatabaseEncryptionKey extends Function<Ok> {
        public byte[] newEncryptionKey;
        public static final int CONSTRUCTOR = -1204599371;

        public SetDatabaseEncryptionKey() {
        }

        public SetDatabaseEncryptionKey(byte[] var1) {
            this.newEncryptionKey = var1;
        }

        public int getConstructor() {
            return -1204599371;
        }
    }

    public static class SetCustomLanguagePackString extends Function<Ok> {
        public String languagePackId;
        public LanguagePackString newString;
        public static final int CONSTRUCTOR = 1316365592;

        public SetCustomLanguagePackString() {
        }

        public SetCustomLanguagePackString(String var1, LanguagePackString var2) {
            this.languagePackId = var1;
            this.newString = var2;
        }

        public int getConstructor() {
            return 1316365592;
        }
    }

    public static class SetCustomLanguagePack extends Function<Ok> {
        public LanguagePackInfo info;
        public LanguagePackString[] strings;
        public static final int CONSTRUCTOR = -296742819;

        public SetCustomLanguagePack() {
        }

        public SetCustomLanguagePack(LanguagePackInfo var1, LanguagePackString[] var2) {
            this.info = var1;
            this.strings = var2;
        }

        public int getConstructor() {
            return -296742819;
        }
    }

    public static class SetCommands extends Function<Ok> {
        public BotCommandScope scope;
        public String languageCode;
        public BotCommand[] commands;
        public static final int CONSTRUCTOR = -907165606;

        public SetCommands() {
        }

        public SetCommands(BotCommandScope var1, String var2, BotCommand[] var3) {
            this.scope = var1;
            this.languageCode = var2;
            this.commands = var3;
        }

        public int getConstructor() {
            return -907165606;
        }
    }

    public static class SetChatTitle extends Function<Ok> {
        public long chatId;
        public String title;
        public static final int CONSTRUCTOR = 164282047;

        public SetChatTitle() {
        }

        public SetChatTitle(long var1, String var3) {
            this.chatId = var1;
            this.title = var3;
        }

        public int getConstructor() {
            return 164282047;
        }
    }

    public static class SetChatTheme extends Function<Ok> {
        public long chatId;
        public String themeName;
        public static final int CONSTRUCTOR = -1895234925;

        public SetChatTheme() {
        }

        public SetChatTheme(long var1, String var3) {
            this.chatId = var1;
            this.themeName = var3;
        }

        public int getConstructor() {
            return -1895234925;
        }
    }

    public static class SetChatSlowModeDelay extends Function<Ok> {
        public long chatId;
        public int slowModeDelay;
        public static final int CONSTRUCTOR = -540350914;

        public SetChatSlowModeDelay() {
        }

        public SetChatSlowModeDelay(long var1, int var3) {
            this.chatId = var1;
            this.slowModeDelay = var3;
        }

        public int getConstructor() {
            return -540350914;
        }
    }

    public static class SetChatPhoto extends Function<Ok> {
        public long chatId;
        public InputChatPhoto photo;
        public static final int CONSTRUCTOR = -377778941;

        public SetChatPhoto() {
        }

        public SetChatPhoto(long var1, InputChatPhoto var3) {
            this.chatId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return -377778941;
        }
    }

    public static class SetChatPermissions extends Function<Ok> {
        public long chatId;
        public ChatPermissions permissions;
        public static final int CONSTRUCTOR = 2138507006;

        public SetChatPermissions() {
        }

        public SetChatPermissions(long var1, ChatPermissions var3) {
            this.chatId = var1;
            this.permissions = var3;
        }

        public int getConstructor() {
            return 2138507006;
        }
    }

    public static class SetChatNotificationSettings extends Function<Ok> {
        public long chatId;
        public ChatNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = 777199614;

        public SetChatNotificationSettings() {
        }

        public SetChatNotificationSettings(long var1, ChatNotificationSettings var3) {
            this.chatId = var1;
            this.notificationSettings = var3;
        }

        public int getConstructor() {
            return 777199614;
        }
    }

    public static class SetChatMessageTtl extends Function<Ok> {
        public long chatId;
        public int ttl;
        public static final int CONSTRUCTOR = -1578406279;

        public SetChatMessageTtl() {
        }

        public SetChatMessageTtl(long var1, int var3) {
            this.chatId = var1;
            this.ttl = var3;
        }

        public int getConstructor() {
            return -1578406279;
        }
    }

    public static class SetChatMessageSender extends Function<Ok> {
        public long chatId;
        public MessageSender messageSenderId;
        public static final int CONSTRUCTOR = -1421513858;

        public SetChatMessageSender() {
        }

        public SetChatMessageSender(long var1, MessageSender var3) {
            this.chatId = var1;
            this.messageSenderId = var3;
        }

        public int getConstructor() {
            return -1421513858;
        }
    }

    public static class SetChatMemberStatus extends Function<Ok> {
        public long chatId;
        public MessageSender memberId;
        public ChatMemberStatus status;
        public static final int CONSTRUCTOR = 81794847;

        public SetChatMemberStatus() {
        }

        public SetChatMemberStatus(long var1, MessageSender var3, ChatMemberStatus var4) {
            this.chatId = var1;
            this.memberId = var3;
            this.status = var4;
        }

        public int getConstructor() {
            return 81794847;
        }
    }

    public static class SetChatLocation extends Function<Ok> {
        public long chatId;
        public ChatLocation location;
        public static final int CONSTRUCTOR = -767091286;

        public SetChatLocation() {
        }

        public SetChatLocation(long var1, ChatLocation var3) {
            this.chatId = var1;
            this.location = var3;
        }

        public int getConstructor() {
            return -767091286;
        }
    }

    public static class SetChatDraftMessage extends Function<Ok> {
        public long chatId;
        public long messageThreadId;
        public DraftMessage draftMessage;
        public static final int CONSTRUCTOR = 1683889946;

        public SetChatDraftMessage() {
        }

        public SetChatDraftMessage(long var1, long var3, DraftMessage var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.draftMessage = var5;
        }

        public int getConstructor() {
            return 1683889946;
        }
    }

    public static class SetChatDiscussionGroup extends Function<Ok> {
        public long chatId;
        public long discussionChatId;
        public static final int CONSTRUCTOR = -918801736;

        public SetChatDiscussionGroup() {
        }

        public SetChatDiscussionGroup(long var1, long var3) {
            this.chatId = var1;
            this.discussionChatId = var3;
        }

        public int getConstructor() {
            return -918801736;
        }
    }

    public static class SetChatDescription extends Function<Ok> {
        public long chatId;
        public String description;
        public static final int CONSTRUCTOR = 1957213277;

        public SetChatDescription() {
        }

        public SetChatDescription(long var1, String var3) {
            this.chatId = var1;
            this.description = var3;
        }

        public int getConstructor() {
            return 1957213277;
        }
    }

    public static class SetChatClientData extends Function<Ok> {
        public long chatId;
        public String clientData;
        public static final int CONSTRUCTOR = -827119811;

        public SetChatClientData() {
        }

        public SetChatClientData(long var1, String var3) {
            this.chatId = var1;
            this.clientData = var3;
        }

        public int getConstructor() {
            return -827119811;
        }
    }

    public static class SetChatAvailableReactions extends Function<Ok> {
        public long chatId;
        public ChatAvailableReactions availableReactions;
        public static final int CONSTRUCTOR = 267075078;

        public SetChatAvailableReactions() {
        }

        public SetChatAvailableReactions(long var1, ChatAvailableReactions var3) {
            this.chatId = var1;
            this.availableReactions = var3;
        }

        public int getConstructor() {
            return 267075078;
        }
    }

    public static class SetBotUpdatesStatus extends Function<Ok> {
        public int pendingUpdateCount;
        public String errorMessage;
        public static final int CONSTRUCTOR = -1154926191;

        public SetBotUpdatesStatus() {
        }

        public SetBotUpdatesStatus(int var1, String var2) {
            this.pendingUpdateCount = var1;
            this.errorMessage = var2;
        }

        public int getConstructor() {
            return -1154926191;
        }
    }

    public static class SetBio extends Function<Ok> {
        public String bio;
        public static final int CONSTRUCTOR = -1619582124;

        public SetBio() {
        }

        public SetBio(String var1) {
            this.bio = var1;
        }

        public int getConstructor() {
            return -1619582124;
        }
    }

    public static class SetBackground extends Function<Background> {
        public InputBackground background;
        public BackgroundType type;
        public boolean forDarkTheme;
        public static final int CONSTRUCTOR = -1035439225;

        public SetBackground() {
        }

        public SetBackground(InputBackground var1, BackgroundType var2, boolean var3) {
            this.background = var1;
            this.type = var2;
            this.forDarkTheme = var3;
        }

        public int getConstructor() {
            return -1035439225;
        }
    }

    public static class SetAutoDownloadSettings extends Function<Ok> {
        public AutoDownloadSettings settings;
        public NetworkType type;
        public static final int CONSTRUCTOR = -353671948;

        public SetAutoDownloadSettings() {
        }

        public SetAutoDownloadSettings(AutoDownloadSettings var1, NetworkType var2) {
            this.settings = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -353671948;
        }
    }

    public static class SetAuthenticationPhoneNumber extends Function<Ok> {
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = 868276259;

        public SetAuthenticationPhoneNumber() {
        }

        public SetAuthenticationPhoneNumber(String var1, PhoneNumberAuthenticationSettings var2) {
            this.phoneNumber = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return 868276259;
        }
    }

    public static class SetAuthenticationEmailAddress extends Function<Ok> {
        public String emailAddress;
        public static final int CONSTRUCTOR = 1773323522;

        public SetAuthenticationEmailAddress() {
        }

        public SetAuthenticationEmailAddress(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return 1773323522;
        }
    }

    public static class SetAlarm extends Function<Ok> {
        public double seconds;
        public static final int CONSTRUCTOR = -873497067;

        public SetAlarm() {
        }

        public SetAlarm(double var1) {
            this.seconds = var1;
        }

        public int getConstructor() {
            return -873497067;
        }
    }

    public static class SetAccountTtl extends Function<Ok> {
        public AccountTtl ttl;
        public static final int CONSTRUCTOR = 701389032;

        public SetAccountTtl() {
        }

        public SetAccountTtl(AccountTtl var1) {
            this.ttl = var1;
        }

        public int getConstructor() {
            return 701389032;
        }
    }

    public static class SendWebAppData extends Function<Ok> {
        public long botUserId;
        public String buttonText;
        public String data;
        public static final int CONSTRUCTOR = -1423978996;

        public SendWebAppData() {
        }

        public SendWebAppData(long var1, String var3, String var4) {
            this.botUserId = var1;
            this.buttonText = var3;
            this.data = var4;
        }

        public int getConstructor() {
            return -1423978996;
        }
    }

    public static class SendPhoneNumberVerificationCode extends Function<AuthenticationCodeInfo> {
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = 2081689035;

        public SendPhoneNumberVerificationCode() {
        }

        public SendPhoneNumberVerificationCode(String var1, PhoneNumberAuthenticationSettings var2) {
            this.phoneNumber = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return 2081689035;
        }
    }

    public static class SendPhoneNumberConfirmationCode extends Function<AuthenticationCodeInfo> {
        public String hash;
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = -1901171495;

        public SendPhoneNumberConfirmationCode() {
        }

        public SendPhoneNumberConfirmationCode(String var1, String var2, PhoneNumberAuthenticationSettings var3) {
            this.hash = var1;
            this.phoneNumber = var2;
            this.settings = var3;
        }

        public int getConstructor() {
            return -1901171495;
        }
    }

    public static class SendPaymentForm extends Function<PaymentResult> {
        public InputInvoice inputInvoice;
        public long paymentFormId;
        public String orderInfoId;
        public String shippingOptionId;
        public InputCredentials credentials;
        public long tipAmount;
        public static final int CONSTRUCTOR = -965855094;

        public SendPaymentForm() {
        }

        public SendPaymentForm(InputInvoice var1, long var2, String var4, String var5, InputCredentials var6, long var7) {
            this.inputInvoice = var1;
            this.paymentFormId = var2;
            this.orderInfoId = var4;
            this.shippingOptionId = var5;
            this.credentials = var6;
            this.tipAmount = var7;
        }

        public int getConstructor() {
            return -965855094;
        }
    }

    public static class SendPassportAuthorizationForm extends Function<Ok> {
        public int autorizationFormId;
        public PassportElementType[] types;
        public static final int CONSTRUCTOR = -602402218;

        public SendPassportAuthorizationForm() {
        }

        public SendPassportAuthorizationForm(int var1, PassportElementType[] var2) {
            this.autorizationFormId = var1;
            this.types = var2;
        }

        public int getConstructor() {
            return -602402218;
        }
    }

    public static class SendMessageAlbum extends Function<Messages> {
        public long chatId;
        public long messageThreadId;
        public long replyToMessageId;
        public MessageSendOptions options;
        public InputMessageContent[] inputMessageContents;
        public boolean onlyPreview;
        public static final int CONSTRUCTOR = -1639797862;

        public SendMessageAlbum() {
        }

        public SendMessageAlbum(long var1, long var3, long var5, MessageSendOptions var7, InputMessageContent[] var8, boolean var9) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyToMessageId = var5;
            this.options = var7;
            this.inputMessageContents = var8;
            this.onlyPreview = var9;
        }

        public int getConstructor() {
            return -1639797862;
        }
    }

    public static class SendMessage extends Function<Message> {
        public long chatId;
        public long messageThreadId;
        public long replyToMessageId;
        public MessageSendOptions options;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 960453021;

        public SendMessage() {
        }

        public SendMessage(long var1, long var3, long var5, MessageSendOptions var7, ReplyMarkup var8, InputMessageContent var9) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyToMessageId = var5;
            this.options = var7;
            this.replyMarkup = var8;
            this.inputMessageContent = var9;
        }

        public int getConstructor() {
            return 960453021;
        }
    }

    public static class SendInlineQueryResultMessage extends Function<Message> {
        public long chatId;
        public long messageThreadId;
        public long replyToMessageId;
        public MessageSendOptions options;
        public long queryId;
        public String resultId;
        public boolean hideViaBot;
        public static final int CONSTRUCTOR = -948639588;

        public SendInlineQueryResultMessage() {
        }

        public SendInlineQueryResultMessage(long var1, long var3, long var5, MessageSendOptions var7, long var8, String var10, boolean var11) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyToMessageId = var5;
            this.options = var7;
            this.queryId = var8;
            this.resultId = var10;
            this.hideViaBot = var11;
        }

        public int getConstructor() {
            return -948639588;
        }
    }

    public static class SendEmailAddressVerificationCode extends Function<EmailAddressAuthenticationCodeInfo> {
        public String emailAddress;
        public static final int CONSTRUCTOR = -221621379;

        public SendEmailAddressVerificationCode() {
        }

        public SendEmailAddressVerificationCode(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return -221621379;
        }
    }

    public static class SendCustomRequest extends Function<CustomRequestResult> {
        public String method;
        public String parameters;
        public static final int CONSTRUCTOR = 285045153;

        public SendCustomRequest() {
        }

        public SendCustomRequest(String var1, String var2) {
            this.method = var1;
            this.parameters = var2;
        }

        public int getConstructor() {
            return 285045153;
        }
    }

    public static class SendChatScreenshotTakenNotification extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 448399457;

        public SendChatScreenshotTakenNotification() {
        }

        public SendChatScreenshotTakenNotification(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 448399457;
        }
    }

    public static class SendChatAction extends Function<Ok> {
        public long chatId;
        public long messageThreadId;
        public ChatAction action;
        public static final int CONSTRUCTOR = 2096947540;

        public SendChatAction() {
        }

        public SendChatAction(long var1, long var3, ChatAction var5) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.action = var5;
        }

        public int getConstructor() {
            return 2096947540;
        }
    }

    public static class SendCallSignalingData extends Function<Ok> {
        public int callId;
        public byte[] data;
        public static final int CONSTRUCTOR = 1412280732;

        public SendCallSignalingData() {
        }

        public SendCallSignalingData(int var1, byte[] var2) {
            this.callId = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return 1412280732;
        }
    }

    public static class SendCallRating extends Function<Ok> {
        public int callId;
        public int rating;
        public String comment;
        public CallProblem[] problems;
        public static final int CONSTRUCTOR = -1402719502;

        public SendCallRating() {
        }

        public SendCallRating(int var1, int var2, String var3, CallProblem[] var4) {
            this.callId = var1;
            this.rating = var2;
            this.comment = var3;
            this.problems = var4;
        }

        public int getConstructor() {
            return -1402719502;
        }
    }

    public static class SendCallLog extends Function<Ok> {
        public int callId;
        public InputFile logFile;
        public static final int CONSTRUCTOR = 1057638353;

        public SendCallLog() {
        }

        public SendCallLog(int var1, InputFile var2) {
            this.callId = var1;
            this.logFile = var2;
        }

        public int getConstructor() {
            return 1057638353;
        }
    }

    public static class SendCallDebugInformation extends Function<Ok> {
        public int callId;
        public String debugInformation;
        public static final int CONSTRUCTOR = 2019243839;

        public SendCallDebugInformation() {
        }

        public SendCallDebugInformation(int var1, String var2) {
            this.callId = var1;
            this.debugInformation = var2;
        }

        public int getConstructor() {
            return 2019243839;
        }
    }

    public static class SendBotStartMessage extends Function<Message> {
        public long botUserId;
        public long chatId;
        public String parameter;
        public static final int CONSTRUCTOR = -1435877650;

        public SendBotStartMessage() {
        }

        public SendBotStartMessage(long var1, long var3, String var5) {
            this.botUserId = var1;
            this.chatId = var3;
            this.parameter = var5;
        }

        public int getConstructor() {
            return -1435877650;
        }
    }

    public static class SearchUserByPhoneNumber extends Function<User> {
        public String phoneNumber;
        public static final int CONSTRUCTOR = -1562236142;

        public SearchUserByPhoneNumber() {
        }

        public SearchUserByPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return -1562236142;
        }
    }

    public static class SearchStickers extends Function<Stickers> {
        public String emoji;
        public int limit;
        public static final int CONSTRUCTOR = 1555771203;

        public SearchStickers() {
        }

        public SearchStickers(String var1, int var2) {
            this.emoji = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 1555771203;
        }
    }

    public static class SearchStickerSets extends Function<StickerSets> {
        public String query;
        public static final int CONSTRUCTOR = -1082314629;

        public SearchStickerSets() {
        }

        public SearchStickerSets(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1082314629;
        }
    }

    public static class SearchStickerSet extends Function<StickerSet> {
        public String name;
        public static final int CONSTRUCTOR = 1157930222;

        public SearchStickerSet() {
        }

        public SearchStickerSet(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return 1157930222;
        }
    }

    public static class SearchSecretMessages extends Function<FoundMessages> {
        public long chatId;
        public String query;
        public String offset;
        public int limit;
        public SearchMessagesFilter filter;
        public static final int CONSTRUCTOR = -852865892;

        public SearchSecretMessages() {
        }

        public SearchSecretMessages(long var1, String var3, String var4, int var5, SearchMessagesFilter var6) {
            this.chatId = var1;
            this.query = var3;
            this.offset = var4;
            this.limit = var5;
            this.filter = var6;
        }

        public int getConstructor() {
            return -852865892;
        }
    }

    public static class SearchPublicChats extends Function<Chats> {
        public String query;
        public static final int CONSTRUCTOR = 970385337;

        public SearchPublicChats() {
        }

        public SearchPublicChats(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return 970385337;
        }
    }

    public static class SearchPublicChat extends Function<Chat> {
        public String username;
        public static final int CONSTRUCTOR = 857135533;

        public SearchPublicChat() {
        }

        public SearchPublicChat(String var1) {
            this.username = var1;
        }

        public int getConstructor() {
            return 857135533;
        }
    }

    public static class SearchOutgoingDocumentMessages extends Function<FoundMessages> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1071397762;

        public SearchOutgoingDocumentMessages() {
        }

        public SearchOutgoingDocumentMessages(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1071397762;
        }
    }

    public static class SearchMessages extends Function<Messages> {
        public ChatList chatList;
        public String query;
        public int offsetDate;
        public long offsetChatId;
        public long offsetMessageId;
        public int limit;
        public SearchMessagesFilter filter;
        public int minDate;
        public int maxDate;
        public static final int CONSTRUCTOR = -225214062;

        public SearchMessages() {
        }

        public SearchMessages(ChatList var1, String var2, int var3, long var4, long var6, int var8, SearchMessagesFilter var9, int var10, int var11) {
            this.chatList = var1;
            this.query = var2;
            this.offsetDate = var3;
            this.offsetChatId = var4;
            this.offsetMessageId = var6;
            this.limit = var8;
            this.filter = var9;
            this.minDate = var10;
            this.maxDate = var11;
        }

        public int getConstructor() {
            return -225214062;
        }
    }

    public static class SearchInstalledStickerSets extends Function<StickerSets> {
        public StickerType stickerType;
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = 2120122276;

        public SearchInstalledStickerSets() {
        }

        public SearchInstalledStickerSets(StickerType var1, String var2, int var3) {
            this.stickerType = var1;
            this.query = var2;
            this.limit = var3;
        }

        public int getConstructor() {
            return 2120122276;
        }
    }

    public static class SearchHashtags extends Function<Hashtags> {
        public String prefix;
        public int limit;
        public static final int CONSTRUCTOR = 1043637617;

        public SearchHashtags() {
        }

        public SearchHashtags(String var1, int var2) {
            this.prefix = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 1043637617;
        }
    }

    public static class SearchFileDownloads extends Function<FoundFileDownloads> {
        public String query;
        public boolean onlyActive;
        public boolean onlyCompleted;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 706611286;

        public SearchFileDownloads() {
        }

        public SearchFileDownloads(String var1, boolean var2, boolean var3, String var4, int var5) {
            this.query = var1;
            this.onlyActive = var2;
            this.onlyCompleted = var3;
            this.offset = var4;
            this.limit = var5;
        }

        public int getConstructor() {
            return 706611286;
        }
    }

    public static class SearchEmojis extends Function<Emojis> {
        public String text;
        public boolean exactMatch;
        public String[] inputLanguageCodes;
        public static final int CONSTRUCTOR = 398837927;

        public SearchEmojis() {
        }

        public SearchEmojis(String var1, boolean var2, String[] var3) {
            this.text = var1;
            this.exactMatch = var2;
            this.inputLanguageCodes = var3;
        }

        public int getConstructor() {
            return 398837927;
        }
    }

    public static class SearchContacts extends Function<Users> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1794690715;

        public SearchContacts() {
        }

        public SearchContacts(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1794690715;
        }
    }

    public static class SearchChatsOnServer extends Function<Chats> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1158402188;

        public SearchChatsOnServer() {
        }

        public SearchChatsOnServer(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1158402188;
        }
    }

    public static class SearchChatsNearby extends Function<ChatsNearby> {
        public Location location;
        public static final int CONSTRUCTOR = -196753377;

        public SearchChatsNearby() {
        }

        public SearchChatsNearby(Location var1) {
            this.location = var1;
        }

        public int getConstructor() {
            return -196753377;
        }
    }

    public static class SearchChats extends Function<Chats> {
        public String query;
        public int limit;
        public static final int CONSTRUCTOR = -1879787060;

        public SearchChats() {
        }

        public SearchChats(String var1, int var2) {
            this.query = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1879787060;
        }
    }

    public static class SearchChatRecentLocationMessages extends Function<Messages> {
        public long chatId;
        public int limit;
        public static final int CONSTRUCTOR = 950238950;

        public SearchChatRecentLocationMessages() {
        }

        public SearchChatRecentLocationMessages(long var1, int var3) {
            this.chatId = var1;
            this.limit = var3;
        }

        public int getConstructor() {
            return 950238950;
        }
    }

    public static class SearchChatMessages extends Function<Messages> {
        public long chatId;
        public String query;
        public MessageSender senderId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public SearchMessagesFilter filter;
        public long messageThreadId;
        public static final int CONSTRUCTOR = -162154976;

        public SearchChatMessages() {
        }

        public SearchChatMessages(long var1, String var3, MessageSender var4, long var5, int var7, int var8, SearchMessagesFilter var9, long var10) {
            this.chatId = var1;
            this.query = var3;
            this.senderId = var4;
            this.fromMessageId = var5;
            this.offset = var7;
            this.limit = var8;
            this.filter = var9;
            this.messageThreadId = var10;
        }

        public int getConstructor() {
            return -162154976;
        }
    }

    public static class SearchChatMembers extends Function<ChatMembers> {
        public long chatId;
        public String query;
        public int limit;
        public ChatMembersFilter filter;
        public static final int CONSTRUCTOR = -445823291;

        public SearchChatMembers() {
        }

        public SearchChatMembers(long var1, String var3, int var4, ChatMembersFilter var5) {
            this.chatId = var1;
            this.query = var3;
            this.limit = var4;
            this.filter = var5;
        }

        public int getConstructor() {
            return -445823291;
        }
    }

    public static class SearchCallMessages extends Function<Messages> {
        public long fromMessageId;
        public int limit;
        public boolean onlyMissed;
        public static final int CONSTRUCTOR = -1077230820;

        public SearchCallMessages() {
        }

        public SearchCallMessages(long var1, int var3, boolean var4) {
            this.fromMessageId = var1;
            this.limit = var3;
            this.onlyMissed = var4;
        }

        public int getConstructor() {
            return -1077230820;
        }
    }

    public static class SearchBackground extends Function<Background> {
        public String name;
        public static final int CONSTRUCTOR = -2130996959;

        public SearchBackground() {
        }

        public SearchBackground(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -2130996959;
        }
    }

    public static class SaveApplicationLogEvent extends Function<Ok> {
        public String type;
        public long chatId;
        public JsonValue data;
        public static final int CONSTRUCTOR = -811154930;

        public SaveApplicationLogEvent() {
        }

        public SaveApplicationLogEvent(String var1, long var2, JsonValue var4) {
            this.type = var1;
            this.chatId = var2;
            this.data = var4;
        }

        public int getConstructor() {
            return -811154930;
        }
    }

    public static class RevokeGroupCallInviteLink extends Function<Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 501589140;

        public RevokeGroupCallInviteLink() {
        }

        public RevokeGroupCallInviteLink(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 501589140;
        }
    }

    public static class RevokeChatInviteLink extends Function<ChatInviteLinks> {
        public long chatId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -776514135;

        public RevokeChatInviteLink() {
        }

        public RevokeChatInviteLink(long var1, String var3) {
            this.chatId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -776514135;
        }
    }

    public static class ResetPassword extends Function<ResetPasswordResult> {
        public static final int CONSTRUCTOR = -593589091;

        public ResetPassword() {
        }

        public int getConstructor() {
            return -593589091;
        }
    }

    public static class ResetNetworkStatistics extends Function<Ok> {
        public static final int CONSTRUCTOR = 1646452102;

        public ResetNetworkStatistics() {
        }

        public int getConstructor() {
            return 1646452102;
        }
    }

    public static class ResetBackgrounds extends Function<Ok> {
        public static final int CONSTRUCTOR = 204852088;

        public ResetBackgrounds() {
        }

        public int getConstructor() {
            return 204852088;
        }
    }

    public static class ResetAllNotificationSettings extends Function<Ok> {
        public static final int CONSTRUCTOR = -174020359;

        public ResetAllNotificationSettings() {
        }

        public int getConstructor() {
            return -174020359;
        }
    }

    public static class ResendRecoveryEmailAddressCode extends Function<PasswordState> {
        public static final int CONSTRUCTOR = 433483548;

        public ResendRecoveryEmailAddressCode() {
        }

        public int getConstructor() {
            return 433483548;
        }
    }

    public static class ResendPhoneNumberVerificationCode extends Function<AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 1367629820;

        public ResendPhoneNumberVerificationCode() {
        }

        public int getConstructor() {
            return 1367629820;
        }
    }

    public static class ResendPhoneNumberConfirmationCode extends Function<AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 2069068522;

        public ResendPhoneNumberConfirmationCode() {
        }

        public int getConstructor() {
            return 2069068522;
        }
    }

    public static class ResendMessages extends Function<Messages> {
        public long chatId;
        public long[] messageIds;
        public static final int CONSTRUCTOR = -940655817;

        public ResendMessages() {
        }

        public ResendMessages(long var1, long[] var3) {
            this.chatId = var1;
            this.messageIds = var3;
        }

        public int getConstructor() {
            return -940655817;
        }
    }

    public static class ResendLoginEmailAddressCode extends Function<EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = 292966933;

        public ResendLoginEmailAddressCode() {
        }

        public int getConstructor() {
            return 292966933;
        }
    }

    public static class ResendEmailAddressVerificationCode extends Function<EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -1872416732;

        public ResendEmailAddressVerificationCode() {
        }

        public int getConstructor() {
            return -1872416732;
        }
    }

    public static class ResendChangePhoneNumberCode extends Function<AuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -786772060;

        public ResendChangePhoneNumberCode() {
        }

        public int getConstructor() {
            return -786772060;
        }
    }

    public static class ResendAuthenticationCode extends Function<Ok> {
        public static final int CONSTRUCTOR = -814377191;

        public ResendAuthenticationCode() {
        }

        public int getConstructor() {
            return -814377191;
        }
    }

    public static class RequestQrCodeAuthentication extends Function<Ok> {
        public long[] otherUserIds;
        public static final int CONSTRUCTOR = 1363496527;

        public RequestQrCodeAuthentication() {
        }

        public RequestQrCodeAuthentication(long[] var1) {
            this.otherUserIds = var1;
        }

        public int getConstructor() {
            return 1363496527;
        }
    }

    public static class RequestPasswordRecovery extends Function<EmailAddressAuthenticationCodeInfo> {
        public static final int CONSTRUCTOR = -13777582;

        public RequestPasswordRecovery() {
        }

        public int getConstructor() {
            return -13777582;
        }
    }

    public static class RequestAuthenticationPasswordRecovery extends Function<Ok> {
        public static final int CONSTRUCTOR = 1393896118;

        public RequestAuthenticationPasswordRecovery() {
        }

        public int getConstructor() {
            return 1393896118;
        }
    }

    public static class ReportSupergroupSpam extends Function<Ok> {
        public long supergroupId;
        public long[] messageIds;
        public static final int CONSTRUCTOR = -94825000;

        public ReportSupergroupSpam() {
        }

        public ReportSupergroupSpam(long var1, long[] var3) {
            this.supergroupId = var1;
            this.messageIds = var3;
        }

        public int getConstructor() {
            return -94825000;
        }
    }

    public static class ReportMessageReactions extends Function<Ok> {
        public long chatId;
        public long messageId;
        public MessageSender senderId;
        public static final int CONSTRUCTOR = 919111719;

        public ReportMessageReactions() {
        }

        public ReportMessageReactions(long var1, long var3, MessageSender var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.senderId = var5;
        }

        public int getConstructor() {
            return 919111719;
        }
    }

    public static class ReportChatPhoto extends Function<Ok> {
        public long chatId;
        public int fileId;
        public ChatReportReason reason;
        public String text;
        public static final int CONSTRUCTOR = 734652708;

        public ReportChatPhoto() {
        }

        public ReportChatPhoto(long var1, int var3, ChatReportReason var4, String var5) {
            this.chatId = var1;
            this.fileId = var3;
            this.reason = var4;
            this.text = var5;
        }

        public int getConstructor() {
            return 734652708;
        }
    }

    public static class ReportChat extends Function<Ok> {
        public long chatId;
        public long[] messageIds;
        public ChatReportReason reason;
        public String text;
        public static final int CONSTRUCTOR = -964543587;

        public ReportChat() {
        }

        public ReportChat(long var1, long[] var3, ChatReportReason var4, String var5) {
            this.chatId = var1;
            this.messageIds = var3;
            this.reason = var4;
            this.text = var5;
        }

        public int getConstructor() {
            return -964543587;
        }
    }

    public static class ReplaceVideoChatRtmpUrl extends Function<RtmpUrl> {
        public long chatId;
        public static final int CONSTRUCTOR = 558862304;

        public ReplaceVideoChatRtmpUrl() {
        }

        public ReplaceVideoChatRtmpUrl(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 558862304;
        }
    }

    public static class ReplacePrimaryChatInviteLink extends Function<ChatInviteLink> {
        public long chatId;
        public static final int CONSTRUCTOR = 1067350941;

        public ReplacePrimaryChatInviteLink() {
        }

        public ReplacePrimaryChatInviteLink(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1067350941;
        }
    }

    public static class ReorderInstalledStickerSets extends Function<Ok> {
        public StickerType stickerType;
        public long[] stickerSetIds;
        public static final int CONSTRUCTOR = 1074928158;

        public ReorderInstalledStickerSets() {
        }

        public ReorderInstalledStickerSets(StickerType var1, long[] var2) {
            this.stickerType = var1;
            this.stickerSetIds = var2;
        }

        public int getConstructor() {
            return 1074928158;
        }
    }

    public static class ReorderChatFilters extends Function<Ok> {
        public int[] chatFilterIds;
        public int mainChatListPosition;
        public static final int CONSTRUCTOR = -1805801313;

        public ReorderChatFilters() {
        }

        public ReorderChatFilters(int[] var1, int var2) {
            this.chatFilterIds = var1;
            this.mainChatListPosition = var2;
        }

        public int getConstructor() {
            return -1805801313;
        }
    }

    public static class RemoveTopChat extends Function<Ok> {
        public TopChatCategory category;
        public long chatId;
        public static final int CONSTRUCTOR = -1907876267;

        public RemoveTopChat() {
        }

        public RemoveTopChat(TopChatCategory var1, long var2) {
            this.category = var1;
            this.chatId = var2;
        }

        public int getConstructor() {
            return -1907876267;
        }
    }

    public static class RemoveStickerFromSet extends Function<Ok> {
        public InputFile sticker;
        public static final int CONSTRUCTOR = 1642196644;

        public RemoveStickerFromSet() {
        }

        public RemoveStickerFromSet(InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 1642196644;
        }
    }

    public static class RemoveSavedNotificationSound extends Function<Ok> {
        public long notificationSoundId;
        public static final int CONSTRUCTOR = -480032946;

        public RemoveSavedNotificationSound() {
        }

        public RemoveSavedNotificationSound(long var1) {
            this.notificationSoundId = var1;
        }

        public int getConstructor() {
            return -480032946;
        }
    }

    public static class RemoveSavedAnimation extends Function<Ok> {
        public InputFile animation;
        public static final int CONSTRUCTOR = -495605479;

        public RemoveSavedAnimation() {
        }

        public RemoveSavedAnimation(InputFile var1) {
            this.animation = var1;
        }

        public int getConstructor() {
            return -495605479;
        }
    }

    public static class RemoveRecentlyFoundChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 717340444;

        public RemoveRecentlyFoundChat() {
        }

        public RemoveRecentlyFoundChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 717340444;
        }
    }

    public static class RemoveRecentSticker extends Function<Ok> {
        public boolean isAttached;
        public InputFile sticker;
        public static final int CONSTRUCTOR = 1246577677;

        public RemoveRecentSticker() {
        }

        public RemoveRecentSticker(boolean var1, InputFile var2) {
            this.isAttached = var1;
            this.sticker = var2;
        }

        public int getConstructor() {
            return 1246577677;
        }
    }

    public static class RemoveRecentHashtag extends Function<Ok> {
        public String hashtag;
        public static final int CONSTRUCTOR = -1013735260;

        public RemoveRecentHashtag() {
        }

        public RemoveRecentHashtag(String var1) {
            this.hashtag = var1;
        }

        public int getConstructor() {
            return -1013735260;
        }
    }

    public static class RemoveProxy extends Function<Ok> {
        public int proxyId;
        public static final int CONSTRUCTOR = 1369219847;

        public RemoveProxy() {
        }

        public RemoveProxy(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return 1369219847;
        }
    }

    public static class RemoveNotificationGroup extends Function<Ok> {
        public int notificationGroupId;
        public int maxNotificationId;
        public static final int CONSTRUCTOR = 1713005454;

        public RemoveNotificationGroup() {
        }

        public RemoveNotificationGroup(int var1, int var2) {
            this.notificationGroupId = var1;
            this.maxNotificationId = var2;
        }

        public int getConstructor() {
            return 1713005454;
        }
    }

    public static class RemoveNotification extends Function<Ok> {
        public int notificationGroupId;
        public int notificationId;
        public static final int CONSTRUCTOR = 862630734;

        public RemoveNotification() {
        }

        public RemoveNotification(int var1, int var2) {
            this.notificationGroupId = var1;
            this.notificationId = var2;
        }

        public int getConstructor() {
            return 862630734;
        }
    }

    public static class RemoveMessageReaction extends Function<Ok> {
        public long chatId;
        public long messageId;
        public ReactionType reactionType;
        public static final int CONSTRUCTOR = -1756934789;

        public RemoveMessageReaction() {
        }

        public RemoveMessageReaction(long var1, long var3, ReactionType var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.reactionType = var5;
        }

        public int getConstructor() {
            return -1756934789;
        }
    }

    public static class RemoveFileFromDownloads extends Function<Ok> {
        public int fileId;
        public boolean deleteFromCache;
        public static final int CONSTRUCTOR = 1460060142;

        public RemoveFileFromDownloads() {
        }

        public RemoveFileFromDownloads(int var1, boolean var2) {
            this.fileId = var1;
            this.deleteFromCache = var2;
        }

        public int getConstructor() {
            return 1460060142;
        }
    }

    public static class RemoveFavoriteSticker extends Function<Ok> {
        public InputFile sticker;
        public static final int CONSTRUCTOR = 1152945264;

        public RemoveFavoriteSticker() {
        }

        public RemoveFavoriteSticker(InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 1152945264;
        }
    }

    public static class RemoveContacts extends Function<Ok> {
        public long[] userIds;
        public static final int CONSTRUCTOR = 1943858054;

        public RemoveContacts() {
        }

        public RemoveContacts(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return 1943858054;
        }
    }

    public static class RemoveChatActionBar extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1650968070;

        public RemoveChatActionBar() {
        }

        public RemoveChatActionBar(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1650968070;
        }
    }

    public static class RemoveBackground extends Function<Ok> {
        public long backgroundId;
        public static final int CONSTRUCTOR = -1484545642;

        public RemoveBackground() {
        }

        public RemoveBackground(long var1) {
            this.backgroundId = var1;
        }

        public int getConstructor() {
            return -1484545642;
        }
    }

    public static class RemoveAllFilesFromDownloads extends Function<Ok> {
        public boolean onlyActive;
        public boolean onlyCompleted;
        public boolean deleteFromCache;
        public static final int CONSTRUCTOR = -1186433402;

        public RemoveAllFilesFromDownloads() {
        }

        public RemoveAllFilesFromDownloads(boolean var1, boolean var2, boolean var3) {
            this.onlyActive = var1;
            this.onlyCompleted = var2;
            this.deleteFromCache = var3;
        }

        public int getConstructor() {
            return -1186433402;
        }
    }

    public static class RegisterUser extends Function<Ok> {
        public String firstName;
        public String lastName;
        public static final int CONSTRUCTOR = -109994467;

        public RegisterUser() {
        }

        public RegisterUser(String var1, String var2) {
            this.firstName = var1;
            this.lastName = var2;
        }

        public int getConstructor() {
            return -109994467;
        }
    }

    public static class RegisterDevice extends Function<PushReceiverId> {
        public DeviceToken deviceToken;
        public long[] otherUserIds;
        public static final int CONSTRUCTOR = 366088823;

        public RegisterDevice() {
        }

        public RegisterDevice(DeviceToken var1, long[] var2) {
            this.deviceToken = var1;
            this.otherUserIds = var2;
        }

        public int getConstructor() {
            return 366088823;
        }
    }

    public static class RecoverPassword extends Function<PasswordState> {
        public String recoveryCode;
        public String newPassword;
        public String newHint;
        public static final int CONSTRUCTOR = -1524262541;

        public RecoverPassword() {
        }

        public RecoverPassword(String var1, String var2, String var3) {
            this.recoveryCode = var1;
            this.newPassword = var2;
            this.newHint = var3;
        }

        public int getConstructor() {
            return -1524262541;
        }
    }

    public static class RecoverAuthenticationPassword extends Function<Ok> {
        public String recoveryCode;
        public String newPassword;
        public String newHint;
        public static final int CONSTRUCTOR = -131001053;

        public RecoverAuthenticationPassword() {
        }

        public RecoverAuthenticationPassword(String var1, String var2, String var3) {
            this.recoveryCode = var1;
            this.newPassword = var2;
            this.newHint = var3;
        }

        public int getConstructor() {
            return -131001053;
        }
    }

    public static class RecognizeSpeech extends Function<Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1741947577;

        public RecognizeSpeech() {
        }

        public RecognizeSpeech(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1741947577;
        }
    }

    public static class ReadFilePart extends Function<FilePart> {
        public int fileId;
        public long offset;
        public long count;
        public static final int CONSTRUCTOR = 906798861;

        public ReadFilePart() {
        }

        public ReadFilePart(int var1, long var2, long var4) {
            this.fileId = var1;
            this.offset = var2;
            this.count = var4;
        }

        public int getConstructor() {
            return 906798861;
        }
    }

    public static class ReadAllChatReactions extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 1421973357;

        public ReadAllChatReactions() {
        }

        public ReadAllChatReactions(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1421973357;
        }
    }

    public static class ReadAllChatMentions extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 1357558453;

        public ReadAllChatMentions() {
        }

        public ReadAllChatMentions(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1357558453;
        }
    }

    public static class RateSpeechRecognition extends Function<Ok> {
        public long chatId;
        public long messageId;
        public boolean isGood;
        public static final int CONSTRUCTOR = -287521867;

        public RateSpeechRecognition() {
        }

        public RateSpeechRecognition(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.isGood = var5;
        }

        public int getConstructor() {
            return -287521867;
        }
    }

    public static class ProcessPushNotification extends Function<Ok> {
        public String payload;
        public static final int CONSTRUCTOR = 786679952;

        public ProcessPushNotification() {
        }

        public ProcessPushNotification(String var1) {
            this.payload = var1;
        }

        public int getConstructor() {
            return 786679952;
        }
    }

    public static class ProcessChatJoinRequests extends Function<Ok> {
        public long chatId;
        public String inviteLink;
        public boolean approve;
        public static final int CONSTRUCTOR = 1048722894;

        public ProcessChatJoinRequests() {
        }

        public ProcessChatJoinRequests(long var1, String var3, boolean var4) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.approve = var4;
        }

        public int getConstructor() {
            return 1048722894;
        }
    }

    public static class ProcessChatJoinRequest extends Function<Ok> {
        public long chatId;
        public long userId;
        public boolean approve;
        public static final int CONSTRUCTOR = 1004876963;

        public ProcessChatJoinRequest() {
        }

        public ProcessChatJoinRequest(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.userId = var3;
            this.approve = var5;
        }

        public int getConstructor() {
            return 1004876963;
        }
    }

    public static class PreliminaryUploadFile extends Function<File> {
        public InputFile file;
        public FileType fileType;
        public int priority;
        public static final int CONSTRUCTOR = 1894239129;

        public PreliminaryUploadFile() {
        }

        public PreliminaryUploadFile(InputFile var1, FileType var2, int var3) {
            this.file = var1;
            this.fileType = var2;
            this.priority = var3;
        }

        public int getConstructor() {
            return 1894239129;
        }
    }

    public static class PingProxy extends Function<Seconds> {
        public int proxyId;
        public static final int CONSTRUCTOR = -979681103;

        public PingProxy() {
        }

        public PingProxy(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return -979681103;
        }
    }

    public static class PinChatMessage extends Function<Ok> {
        public long chatId;
        public long messageId;
        public boolean disableNotification;
        public boolean onlyForSelf;
        public static final int CONSTRUCTOR = 2034719663;

        public PinChatMessage() {
        }

        public PinChatMessage(long var1, long var3, boolean var5, boolean var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.disableNotification = var5;
            this.onlyForSelf = var6;
        }

        public int getConstructor() {
            return 2034719663;
        }
    }

    public static class ParseTextEntities extends Function<FormattedText> {
        public String text;
        public TextParseMode parseMode;
        public static final int CONSTRUCTOR = -1709194593;

        public ParseTextEntities() {
        }

        public ParseTextEntities(String var1, TextParseMode var2) {
            this.text = var1;
            this.parseMode = var2;
        }

        public int getConstructor() {
            return -1709194593;
        }
    }

    public static class ParseMarkdown extends Function<FormattedText> {
        public FormattedText text;
        public static final int CONSTRUCTOR = 756366063;

        public ParseMarkdown() {
        }

        public ParseMarkdown(FormattedText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 756366063;
        }
    }

    public static class OptimizeStorage extends Function<StorageStatistics> {
        public long size;
        public int ttl;
        public int count;
        public int immunityDelay;
        public FileType[] fileTypes;
        public long[] chatIds;
        public long[] excludeChatIds;
        public boolean returnDeletedFileStatistics;
        public int chatLimit;
        public static final int CONSTRUCTOR = 853186759;

        public OptimizeStorage() {
        }

        public OptimizeStorage(long var1, int var3, int var4, int var5, FileType[] var6, long[] var7, long[] var8, boolean var9, int var10) {
            this.size = var1;
            this.ttl = var3;
            this.count = var4;
            this.immunityDelay = var5;
            this.fileTypes = var6;
            this.chatIds = var7;
            this.excludeChatIds = var8;
            this.returnDeletedFileStatistics = var9;
            this.chatLimit = var10;
        }

        public int getConstructor() {
            return 853186759;
        }
    }

    public static class OpenWebApp extends Function<WebAppInfo> {
        public long chatId;
        public long botUserId;
        public String url;
        public ThemeParameters theme;
        public String applicationName;
        public long replyToMessageId;
        public static final int CONSTRUCTOR = 764544166;

        public OpenWebApp() {
        }

        public OpenWebApp(long var1, long var3, String var5, ThemeParameters var6, String var7, long var8) {
            this.chatId = var1;
            this.botUserId = var3;
            this.url = var5;
            this.theme = var6;
            this.applicationName = var7;
            this.replyToMessageId = var8;
        }

        public int getConstructor() {
            return 764544166;
        }
    }

    public static class OpenMessageContent extends Function<Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -739088005;

        public OpenMessageContent() {
        }

        public OpenMessageContent(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -739088005;
        }
    }

    public static class OpenChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -323371509;

        public OpenChat() {
        }

        public OpenChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -323371509;
        }
    }

    public static class LogOut extends Function<Ok> {
        public static final int CONSTRUCTOR = -1581923301;

        public LogOut() {
        }

        public int getConstructor() {
            return -1581923301;
        }
    }

    public static class LoadGroupCallParticipants extends Function<Ok> {
        public int groupCallId;
        public int limit;
        public static final int CONSTRUCTOR = 938720974;

        public LoadGroupCallParticipants() {
        }

        public LoadGroupCallParticipants(int var1, int var2) {
            this.groupCallId = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 938720974;
        }
    }

    public static class LoadChats extends Function<Ok> {
        public ChatList chatList;
        public int limit;
        public static final int CONSTRUCTOR = -1885635205;

        public LoadChats() {
        }

        public LoadChats(ChatList var1, int var2) {
            this.chatList = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -1885635205;
        }
    }

    public static class LeaveGroupCall extends Function<Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 980152233;

        public LeaveGroupCall() {
        }

        public LeaveGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 980152233;
        }
    }

    public static class LeaveChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1825080735;

        public LeaveChat() {
        }

        public LeaveChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1825080735;
        }
    }

    public static class JoinGroupCall extends Function<Text> {
        public int groupCallId;
        public MessageSender participantId;
        public int audioSourceId;
        public String payload;
        public boolean isMuted;
        public boolean isMyVideoEnabled;
        public String inviteHash;
        public static final int CONSTRUCTOR = -1043773467;

        public JoinGroupCall() {
        }

        public JoinGroupCall(int var1, MessageSender var2, int var3, String var4, boolean var5, boolean var6, String var7) {
            this.groupCallId = var1;
            this.participantId = var2;
            this.audioSourceId = var3;
            this.payload = var4;
            this.isMuted = var5;
            this.isMyVideoEnabled = var6;
            this.inviteHash = var7;
        }

        public int getConstructor() {
            return -1043773467;
        }
    }

    public static class JoinChatByInviteLink extends Function<Chat> {
        public String inviteLink;
        public static final int CONSTRUCTOR = -1049973882;

        public JoinChatByInviteLink() {
        }

        public JoinChatByInviteLink(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1049973882;
        }
    }

    public static class JoinChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 326769313;

        public JoinChat() {
        }

        public JoinChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 326769313;
        }
    }

    public static class InviteGroupCallParticipants extends Function<Ok> {
        public int groupCallId;
        public long[] userIds;
        public static final int CONSTRUCTOR = 1867097679;

        public InviteGroupCallParticipants() {
        }

        public InviteGroupCallParticipants(int var1, long[] var2) {
            this.groupCallId = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return 1867097679;
        }
    }

    public static class ImportMessages extends Function<Ok> {
        public long chatId;
        public InputFile messageFile;
        public InputFile[] attachedFiles;
        public static final int CONSTRUCTOR = -1864116784;

        public ImportMessages() {
        }

        public ImportMessages(long var1, InputFile var3, InputFile[] var4) {
            this.chatId = var1;
            this.messageFile = var3;
            this.attachedFiles = var4;
        }

        public int getConstructor() {
            return -1864116784;
        }
    }

    public static class ImportContacts extends Function<ImportedContacts> {
        public Contact[] contacts;
        public static final int CONSTRUCTOR = -215132767;

        public ImportContacts() {
        }

        public ImportContacts(Contact[] var1) {
            this.contacts = var1;
        }

        public int getConstructor() {
            return -215132767;
        }
    }

    public static class HideSuggestedAction extends Function<Ok> {
        public SuggestedAction action;
        public static final int CONSTRUCTOR = -1561384065;

        public HideSuggestedAction() {
        }

        public HideSuggestedAction(SuggestedAction var1) {
            this.action = var1;
        }

        public int getConstructor() {
            return -1561384065;
        }
    }

    public static class GetWebPagePreview extends Function<WebPage> {
        public FormattedText text;
        public static final int CONSTRUCTOR = 573441580;

        public GetWebPagePreview() {
        }

        public GetWebPagePreview(FormattedText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 573441580;
        }
    }

    public static class GetWebPageInstantView extends Function<WebPageInstantView> {
        public String url;
        public boolean forceFull;
        public static final int CONSTRUCTOR = -1962649975;

        public GetWebPageInstantView() {
        }

        public GetWebPageInstantView(String var1, boolean var2) {
            this.url = var1;
            this.forceFull = var2;
        }

        public int getConstructor() {
            return -1962649975;
        }
    }

    public static class GetWebAppUrl extends Function<HttpUrl> {
        public long botUserId;
        public String url;
        public ThemeParameters theme;
        public String applicationName;
        public static final int CONSTRUCTOR = 1690578110;

        public GetWebAppUrl() {
        }

        public GetWebAppUrl(long var1, String var3, ThemeParameters var4, String var5) {
            this.botUserId = var1;
            this.url = var3;
            this.theme = var4;
            this.applicationName = var5;
        }

        public int getConstructor() {
            return 1690578110;
        }
    }

    public static class GetVideoChatRtmpUrl extends Function<RtmpUrl> {
        public long chatId;
        public static final int CONSTRUCTOR = 1210784543;

        public GetVideoChatRtmpUrl() {
        }

        public GetVideoChatRtmpUrl(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1210784543;
        }
    }

    public static class GetVideoChatAvailableParticipants extends Function<MessageSenders> {
        public long chatId;
        public static final int CONSTRUCTOR = -1000496379;

        public GetVideoChatAvailableParticipants() {
        }

        public GetVideoChatAvailableParticipants(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1000496379;
        }
    }

    public static class GetUserSupportInfo extends Function<UserSupportInfo> {
        public long userId;
        public static final int CONSTRUCTOR = 1957008133;

        public GetUserSupportInfo() {
        }

        public GetUserSupportInfo(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1957008133;
        }
    }

    public static class GetUserProfilePhotos extends Function<ChatPhotos> {
        public long userId;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -908132798;

        public GetUserProfilePhotos() {
        }

        public GetUserProfilePhotos(long var1, int var3, int var4) {
            this.userId = var1;
            this.offset = var3;
            this.limit = var4;
        }

        public int getConstructor() {
            return -908132798;
        }
    }

    public static class GetUserPrivacySettingRules extends Function<UserPrivacySettingRules> {
        public UserPrivacySetting setting;
        public static final int CONSTRUCTOR = -2077223311;

        public GetUserPrivacySettingRules() {
        }

        public GetUserPrivacySettingRules(UserPrivacySetting var1) {
            this.setting = var1;
        }

        public int getConstructor() {
            return -2077223311;
        }
    }

    public static class GetUserFullInfo extends Function<UserFullInfo> {
        public long userId;
        public static final int CONSTRUCTOR = -776823720;

        public GetUserFullInfo() {
        }

        public GetUserFullInfo(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -776823720;
        }
    }

    public static class GetUser extends Function<User> {
        public long userId;
        public static final int CONSTRUCTOR = 1117363211;

        public GetUser() {
        }

        public GetUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1117363211;
        }
    }

    public static class GetTrendingStickerSets extends Function<TrendingStickerSets> {
        public StickerType stickerType;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -531085986;

        public GetTrendingStickerSets() {
        }

        public GetTrendingStickerSets(StickerType var1, int var2, int var3) {
            this.stickerType = var1;
            this.offset = var2;
            this.limit = var3;
        }

        public int getConstructor() {
            return -531085986;
        }
    }

    public static class GetTopChats extends Function<Chats> {
        public TopChatCategory category;
        public int limit;
        public static final int CONSTRUCTOR = -388410847;

        public GetTopChats() {
        }

        public GetTopChats(TopChatCategory var1, int var2) {
            this.category = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -388410847;
        }
    }

    public static class GetThemedEmojiStatuses extends Function<EmojiStatuses> {
        public static final int CONSTRUCTOR = 1791346882;

        public GetThemedEmojiStatuses() {
        }

        public int getConstructor() {
            return 1791346882;
        }
    }

    public static class GetThemeParametersJsonString extends Function<Text> {
        public ThemeParameters theme;
        public static final int CONSTRUCTOR = -1850145288;

        public GetThemeParametersJsonString() {
        }

        public GetThemeParametersJsonString(ThemeParameters var1) {
            this.theme = var1;
        }

        public int getConstructor() {
            return -1850145288;
        }
    }

    public static class GetTextEntities extends Function<TextEntities> {
        public String text;
        public static final int CONSTRUCTOR = -341490693;

        public GetTextEntities() {
        }

        public GetTextEntities(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -341490693;
        }
    }

    public static class GetTemporaryPasswordState extends Function<TemporaryPasswordState> {
        public static final int CONSTRUCTOR = -12670830;

        public GetTemporaryPasswordState() {
        }

        public int getConstructor() {
            return -12670830;
        }
    }

    public static class GetSupportUser extends Function<User> {
        public static final int CONSTRUCTOR = -1733497700;

        public GetSupportUser() {
        }

        public int getConstructor() {
            return -1733497700;
        }
    }

    public static class GetSupergroupMembers extends Function<ChatMembers> {
        public long supergroupId;
        public SupergroupMembersFilter filter;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -570940984;

        public GetSupergroupMembers() {
        }

        public GetSupergroupMembers(long var1, SupergroupMembersFilter var3, int var4, int var5) {
            this.supergroupId = var1;
            this.filter = var3;
            this.offset = var4;
            this.limit = var5;
        }

        public int getConstructor() {
            return -570940984;
        }
    }

    public static class GetSupergroupFullInfo extends Function<SupergroupFullInfo> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 1099776056;

        public GetSupergroupFullInfo() {
        }

        public GetSupergroupFullInfo(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 1099776056;
        }
    }

    public static class GetSupergroup extends Function<Supergroup> {
        public long supergroupId;
        public static final int CONSTRUCTOR = 989663458;

        public GetSupergroup() {
        }

        public GetSupergroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 989663458;
        }
    }

    public static class GetSuitableDiscussionChats extends Function<Chats> {
        public static final int CONSTRUCTOR = 49044982;

        public GetSuitableDiscussionChats() {
        }

        public int getConstructor() {
            return 49044982;
        }
    }

    public static class GetSuggestedStickerSetName extends Function<Text> {
        public String title;
        public static final int CONSTRUCTOR = -1340995520;

        public GetSuggestedStickerSetName() {
        }

        public GetSuggestedStickerSetName(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -1340995520;
        }
    }

    public static class GetSuggestedFileName extends Function<Text> {
        public int fileId;
        public String directory;
        public static final int CONSTRUCTOR = -2049399674;

        public GetSuggestedFileName() {
        }

        public GetSuggestedFileName(int var1, String var2) {
            this.fileId = var1;
            this.directory = var2;
        }

        public int getConstructor() {
            return -2049399674;
        }
    }

    public static class GetStorageStatisticsFast extends Function<StorageStatisticsFast> {
        public static final int CONSTRUCTOR = 61368066;

        public GetStorageStatisticsFast() {
        }

        public int getConstructor() {
            return 61368066;
        }
    }

    public static class GetStorageStatistics extends Function<StorageStatistics> {
        public int chatLimit;
        public static final int CONSTRUCTOR = -853193929;

        public GetStorageStatistics() {
        }

        public GetStorageStatistics(int var1) {
            this.chatLimit = var1;
        }

        public int getConstructor() {
            return -853193929;
        }
    }

    public static class GetStickers extends Function<Stickers> {
        public StickerType stickerType;
        public String emoji;
        public int limit;
        public long chatId;
        public static final int CONSTRUCTOR = 430950994;

        public GetStickers() {
        }

        public GetStickers(StickerType var1, String var2, int var3, long var4) {
            this.stickerType = var1;
            this.emoji = var2;
            this.limit = var3;
            this.chatId = var4;
        }

        public int getConstructor() {
            return 430950994;
        }
    }

    public static class GetStickerSet extends Function<StickerSet> {
        public long setId;
        public static final int CONSTRUCTOR = 1052318659;

        public GetStickerSet() {
        }

        public GetStickerSet(long var1) {
            this.setId = var1;
        }

        public int getConstructor() {
            return 1052318659;
        }
    }

    public static class GetStickerEmojis extends Function<Emojis> {
        public InputFile sticker;
        public static final int CONSTRUCTOR = -1895508665;

        public GetStickerEmojis() {
        }

        public GetStickerEmojis(InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return -1895508665;
        }
    }

    public static class GetStatisticalGraph extends Function<StatisticalGraph> {
        public long chatId;
        public String token;
        public long x;
        public static final int CONSTRUCTOR = 1100975515;

        public GetStatisticalGraph() {
        }

        public GetStatisticalGraph(long var1, String var3, long var4) {
            this.chatId = var1;
            this.token = var3;
            this.x = var4;
        }

        public int getConstructor() {
            return 1100975515;
        }
    }

    public static class GetSecretChat extends Function<SecretChat> {
        public int secretChatId;
        public static final int CONSTRUCTOR = 40599169;

        public GetSecretChat() {
        }

        public GetSecretChat(int var1) {
            this.secretChatId = var1;
        }

        public int getConstructor() {
            return 40599169;
        }
    }

    public static class GetScopeNotificationSettings extends Function<ScopeNotificationSettings> {
        public NotificationSettingsScope scope;
        public static final int CONSTRUCTOR = -995613361;

        public GetScopeNotificationSettings() {
        }

        public GetScopeNotificationSettings(NotificationSettingsScope var1) {
            this.scope = var1;
        }

        public int getConstructor() {
            return -995613361;
        }
    }

    public static class GetSavedOrderInfo extends Function<OrderInfo> {
        public static final int CONSTRUCTOR = -1152016675;

        public GetSavedOrderInfo() {
        }

        public int getConstructor() {
            return -1152016675;
        }
    }

    public static class GetSavedNotificationSounds extends Function<NotificationSounds> {
        public static final int CONSTRUCTOR = -1070305368;

        public GetSavedNotificationSounds() {
        }

        public int getConstructor() {
            return -1070305368;
        }
    }

    public static class GetSavedNotificationSound extends Function<NotificationSounds> {
        public long notificationSoundId;
        public static final int CONSTRUCTOR = 459569431;

        public GetSavedNotificationSound() {
        }

        public GetSavedNotificationSound(long var1) {
            this.notificationSoundId = var1;
        }

        public int getConstructor() {
            return 459569431;
        }
    }

    public static class GetSavedAnimations extends Function<Animations> {
        public static final int CONSTRUCTOR = 7051032;

        public GetSavedAnimations() {
        }

        public int getConstructor() {
            return 7051032;
        }
    }

    public static class GetRepliedMessage extends Function<Message> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -641918531;

        public GetRepliedMessage() {
        }

        public GetRepliedMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -641918531;
        }
    }

    public static class GetRemoteFile extends Function<File> {
        public String remoteFileId;
        public FileType fileType;
        public static final int CONSTRUCTOR = 2137204530;

        public GetRemoteFile() {
        }

        public GetRemoteFile(String var1, FileType var2) {
            this.remoteFileId = var1;
            this.fileType = var2;
        }

        public int getConstructor() {
            return 2137204530;
        }
    }

    public static class GetRecoveryEmailAddress extends Function<RecoveryEmailAddress> {
        public String password;
        public static final int CONSTRUCTOR = -1594770947;

        public GetRecoveryEmailAddress() {
        }

        public GetRecoveryEmailAddress(String var1) {
            this.password = var1;
        }

        public int getConstructor() {
            return -1594770947;
        }
    }

    public static class GetRecommendedChatFilters extends Function<RecommendedChatFilters> {
        public static final int CONSTRUCTOR = -779390746;

        public GetRecommendedChatFilters() {
        }

        public int getConstructor() {
            return -779390746;
        }
    }

    public static class GetRecentlyVisitedTMeUrls extends Function<TMeUrls> {
        public String referrer;
        public static final int CONSTRUCTOR = 806754961;

        public GetRecentlyVisitedTMeUrls() {
        }

        public GetRecentlyVisitedTMeUrls(String var1) {
            this.referrer = var1;
        }

        public int getConstructor() {
            return 806754961;
        }
    }

    public static class GetRecentlyOpenedChats extends Function<Chats> {
        public int limit;
        public static final int CONSTRUCTOR = -1924156893;

        public GetRecentlyOpenedChats() {
        }

        public GetRecentlyOpenedChats(int var1) {
            this.limit = var1;
        }

        public int getConstructor() {
            return -1924156893;
        }
    }

    public static class GetRecentStickers extends Function<Stickers> {
        public boolean isAttached;
        public static final int CONSTRUCTOR = -579622241;

        public GetRecentStickers() {
        }

        public GetRecentStickers(boolean var1) {
            this.isAttached = var1;
        }

        public int getConstructor() {
            return -579622241;
        }
    }

    public static class GetRecentInlineBots extends Function<Users> {
        public static final int CONSTRUCTOR = 1437823548;

        public GetRecentInlineBots() {
        }

        public int getConstructor() {
            return 1437823548;
        }
    }

    public static class GetRecentEmojiStatuses extends Function<EmojiStatuses> {
        public static final int CONSTRUCTOR = -1371914967;

        public GetRecentEmojiStatuses() {
        }

        public int getConstructor() {
            return -1371914967;
        }
    }

    public static class GetPushReceiverId extends Function<PushReceiverId> {
        public String payload;
        public static final int CONSTRUCTOR = -286505294;

        public GetPushReceiverId() {
        }

        public GetPushReceiverId(String var1) {
            this.payload = var1;
        }

        public int getConstructor() {
            return -286505294;
        }
    }

    public static class GetProxyLink extends Function<HttpUrl> {
        public int proxyId;
        public static final int CONSTRUCTOR = -1054495112;

        public GetProxyLink() {
        }

        public GetProxyLink(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return -1054495112;
        }
    }

    public static class GetProxies extends Function<Proxies> {
        public static final int CONSTRUCTOR = -95026381;

        public GetProxies() {
        }

        public int getConstructor() {
            return -95026381;
        }
    }

    public static class GetPremiumStickers extends Function<Stickers> {
        public int limit;
        public static final int CONSTRUCTOR = -280950192;

        public GetPremiumStickers() {
        }

        public GetPremiumStickers(int var1) {
            this.limit = var1;
        }

        public int getConstructor() {
            return -280950192;
        }
    }

    public static class GetPremiumStickerExamples extends Function<Stickers> {
        public static final int CONSTRUCTOR = 1399442328;

        public GetPremiumStickerExamples() {
        }

        public int getConstructor() {
            return 1399442328;
        }
    }

    public static class GetPremiumState extends Function<PremiumState> {
        public static final int CONSTRUCTOR = 663632610;

        public GetPremiumState() {
        }

        public int getConstructor() {
            return 663632610;
        }
    }

    public static class GetPremiumLimit extends Function<PremiumLimit> {
        public PremiumLimitType limitType;
        public static final int CONSTRUCTOR = 1075313898;

        public GetPremiumLimit() {
        }

        public GetPremiumLimit(PremiumLimitType var1) {
            this.limitType = var1;
        }

        public int getConstructor() {
            return 1075313898;
        }
    }

    public static class GetPremiumFeatures extends Function<PremiumFeatures> {
        public PremiumSource source;
        public static final int CONSTRUCTOR = -1260640695;

        public GetPremiumFeatures() {
        }

        public GetPremiumFeatures(PremiumSource var1) {
            this.source = var1;
        }

        public int getConstructor() {
            return -1260640695;
        }
    }

    public static class GetPreferredCountryLanguage extends Function<Text> {
        public String countryCode;
        public static final int CONSTRUCTOR = -933049386;

        public GetPreferredCountryLanguage() {
        }

        public GetPreferredCountryLanguage(String var1) {
            this.countryCode = var1;
        }

        public int getConstructor() {
            return -933049386;
        }
    }

    public static class GetPollVoters extends Function<Users> {
        public long chatId;
        public long messageId;
        public int optionId;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = 2075288734;

        public GetPollVoters() {
        }

        public GetPollVoters(long var1, long var3, int var5, int var6, int var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.optionId = var5;
            this.offset = var6;
            this.limit = var7;
        }

        public int getConstructor() {
            return 2075288734;
        }
    }

    public static class GetPhoneNumberInfoSync extends Function<PhoneNumberInfo> {
        public String languageCode;
        public String phoneNumberPrefix;
        public static final int CONSTRUCTOR = 547061048;

        public GetPhoneNumberInfoSync() {
        }

        public GetPhoneNumberInfoSync(String var1, String var2) {
            this.languageCode = var1;
            this.phoneNumberPrefix = var2;
        }

        public int getConstructor() {
            return 547061048;
        }
    }

    public static class GetPhoneNumberInfo extends Function<PhoneNumberInfo> {
        public String phoneNumberPrefix;
        public static final int CONSTRUCTOR = -1608344583;

        public GetPhoneNumberInfo() {
        }

        public GetPhoneNumberInfo(String var1) {
            this.phoneNumberPrefix = var1;
        }

        public int getConstructor() {
            return -1608344583;
        }
    }

    public static class GetPaymentReceipt extends Function<PaymentReceipt> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1013758294;

        public GetPaymentReceipt() {
        }

        public GetPaymentReceipt(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1013758294;
        }
    }

    public static class GetPaymentForm extends Function<PaymentForm> {
        public InputInvoice inputInvoice;
        public ThemeParameters theme;
        public static final int CONSTRUCTOR = -1924172076;

        public GetPaymentForm() {
        }

        public GetPaymentForm(InputInvoice var1, ThemeParameters var2) {
            this.inputInvoice = var1;
            this.theme = var2;
        }

        public int getConstructor() {
            return -1924172076;
        }
    }

    public static class GetPasswordState extends Function<PasswordState> {
        public static final int CONSTRUCTOR = -174752904;

        public GetPasswordState() {
        }

        public int getConstructor() {
            return -174752904;
        }
    }

    public static class GetPassportElement extends Function<PassportElement> {
        public PassportElementType type;
        public String password;
        public static final int CONSTRUCTOR = -1882398342;

        public GetPassportElement() {
        }

        public GetPassportElement(PassportElementType var1, String var2) {
            this.type = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return -1882398342;
        }
    }

    public static class GetPassportAuthorizationFormAvailableElements extends Function<PassportElementsWithErrors> {
        public int autorizationFormId;
        public String password;
        public static final int CONSTRUCTOR = 1738134754;

        public GetPassportAuthorizationFormAvailableElements() {
        }

        public GetPassportAuthorizationFormAvailableElements(int var1, String var2) {
            this.autorizationFormId = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return 1738134754;
        }
    }

    public static class GetPassportAuthorizationForm extends Function<PassportAuthorizationForm> {
        public long botUserId;
        public String scope;
        public String publicKey;
        public String nonce;
        public static final int CONSTRUCTOR = 1636107398;

        public GetPassportAuthorizationForm() {
        }

        public GetPassportAuthorizationForm(long var1, String var3, String var4, String var5) {
            this.botUserId = var1;
            this.scope = var3;
            this.publicKey = var4;
            this.nonce = var5;
        }

        public int getConstructor() {
            return 1636107398;
        }
    }

    public static class GetOption extends Function<OptionValue> {
        public String name;
        public static final int CONSTRUCTOR = -1572495746;

        public GetOption() {
        }

        public GetOption(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -1572495746;
        }
    }

    public static class GetNetworkStatistics extends Function<NetworkStatistics> {
        public boolean onlyCurrent;
        public static final int CONSTRUCTOR = -986228706;

        public GetNetworkStatistics() {
        }

        public GetNetworkStatistics(boolean var1) {
            this.onlyCurrent = var1;
        }

        public int getConstructor() {
            return -986228706;
        }
    }

    public static class GetMessages extends Function<Messages> {
        public long chatId;
        public long[] messageIds;
        public static final int CONSTRUCTOR = 425299338;

        public GetMessages() {
        }

        public GetMessages(long var1, long[] var3) {
            this.chatId = var1;
            this.messageIds = var3;
        }

        public int getConstructor() {
            return 425299338;
        }
    }

    public static class GetMessageViewers extends Function<Users> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1879496099;

        public GetMessageViewers() {
        }

        public GetMessageViewers(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1879496099;
        }
    }

    public static class GetMessageThreadHistory extends Function<Messages> {
        public long chatId;
        public long messageId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = -1808411608;

        public GetMessageThreadHistory() {
        }

        public GetMessageThreadHistory(long var1, long var3, long var5, int var7, int var8) {
            this.chatId = var1;
            this.messageId = var3;
            this.fromMessageId = var5;
            this.offset = var7;
            this.limit = var8;
        }

        public int getConstructor() {
            return -1808411608;
        }
    }

    public static class GetMessageThread extends Function<MessageThreadInfo> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 2062695998;

        public GetMessageThread() {
        }

        public GetMessageThread(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 2062695998;
        }
    }

    public static class GetMessageStatistics extends Function<MessageStatistics> {
        public long chatId;
        public long messageId;
        public boolean isDark;
        public static final int CONSTRUCTOR = 1270194648;

        public GetMessageStatistics() {
        }

        public GetMessageStatistics(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.isDark = var5;
        }

        public int getConstructor() {
            return 1270194648;
        }
    }

    public static class GetMessagePublicForwards extends Function<FoundMessages> {
        public long chatId;
        public long messageId;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 1611049289;

        public GetMessagePublicForwards() {
        }

        public GetMessagePublicForwards(long var1, long var3, String var5, int var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.offset = var5;
            this.limit = var6;
        }

        public int getConstructor() {
            return 1611049289;
        }
    }

    public static class GetMessageLocally extends Function<Message> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -603575444;

        public GetMessageLocally() {
        }

        public GetMessageLocally(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -603575444;
        }
    }

    public static class GetMessageLinkInfo extends Function<MessageLinkInfo> {
        public String url;
        public static final int CONSTRUCTOR = -700533672;

        public GetMessageLinkInfo() {
        }

        public GetMessageLinkInfo(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -700533672;
        }
    }

    public static class GetMessageLink extends Function<MessageLink> {
        public long chatId;
        public long messageId;
        public int mediaTimestamp;
        public boolean forAlbum;
        public boolean forComment;
        public static final int CONSTRUCTOR = -1607389329;

        public GetMessageLink() {
        }

        public GetMessageLink(long var1, long var3, int var5, boolean var6, boolean var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.mediaTimestamp = var5;
            this.forAlbum = var6;
            this.forComment = var7;
        }

        public int getConstructor() {
            return -1607389329;
        }
    }

    public static class GetMessageImportConfirmationText extends Function<Text> {
        public long chatId;
        public static final int CONSTRUCTOR = 390627752;

        public GetMessageImportConfirmationText() {
        }

        public GetMessageImportConfirmationText(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 390627752;
        }
    }

    public static class GetMessageFileType extends Function<MessageFileType> {
        public String messageFileHead;
        public static final int CONSTRUCTOR = -490270764;

        public GetMessageFileType() {
        }

        public GetMessageFileType(String var1) {
            this.messageFileHead = var1;
        }

        public int getConstructor() {
            return -490270764;
        }
    }

    public static class GetMessageEmbeddingCode extends Function<Text> {
        public long chatId;
        public long messageId;
        public boolean forAlbum;
        public static final int CONSTRUCTOR = 1654967561;

        public GetMessageEmbeddingCode() {
        }

        public GetMessageEmbeddingCode(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.forAlbum = var5;
        }

        public int getConstructor() {
            return 1654967561;
        }
    }

    public static class GetMessageAvailableReactions extends Function<AvailableReactions> {
        public long chatId;
        public long messageId;
        public int rowSize;
        public static final int CONSTRUCTOR = 1994098354;

        public GetMessageAvailableReactions() {
        }

        public GetMessageAvailableReactions(long var1, long var3, int var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.rowSize = var5;
        }

        public int getConstructor() {
            return 1994098354;
        }
    }

    public static class GetMessageAddedReactions extends Function<AddedReactions> {
        public long chatId;
        public long messageId;
        public ReactionType reactionType;
        public String offset;
        public int limit;
        public static final int CONSTRUCTOR = 2110172754;

        public GetMessageAddedReactions() {
        }

        public GetMessageAddedReactions(long var1, long var3, ReactionType var5, String var6, int var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.reactionType = var5;
            this.offset = var6;
            this.limit = var7;
        }

        public int getConstructor() {
            return 2110172754;
        }
    }

    public static class GetMessage extends Function<Message> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1821196160;

        public GetMessage() {
        }

        public GetMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1821196160;
        }
    }

    public static class GetMenuButton extends Function<BotMenuButton> {
        public long userId;
        public static final int CONSTRUCTOR = -437324736;

        public GetMenuButton() {
        }

        public GetMenuButton(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -437324736;
        }
    }

    public static class GetMe extends Function<User> {
        public static final int CONSTRUCTOR = -191516033;

        public GetMe() {
        }

        public int getConstructor() {
            return -191516033;
        }
    }

    public static class GetMarkdownText extends Function<FormattedText> {
        public FormattedText text;
        public static final int CONSTRUCTOR = 164524584;

        public GetMarkdownText() {
        }

        public GetMarkdownText(FormattedText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 164524584;
        }
    }

    public static class GetMapThumbnailFile extends Function<File> {
        public Location location;
        public int zoom;
        public int width;
        public int height;
        public int scale;
        public long chatId;
        public static final int CONSTRUCTOR = -152660070;

        public GetMapThumbnailFile() {
        }

        public GetMapThumbnailFile(Location var1, int var2, int var3, int var4, int var5, long var6) {
            this.location = var1;
            this.zoom = var2;
            this.width = var3;
            this.height = var4;
            this.scale = var5;
            this.chatId = var6;
        }

        public int getConstructor() {
            return -152660070;
        }
    }

    public static class GetLoginUrlInfo extends Function<LoginUrlInfo> {
        public long chatId;
        public long messageId;
        public long buttonId;
        public static final int CONSTRUCTOR = -859202125;

        public GetLoginUrlInfo() {
        }

        public GetLoginUrlInfo(long var1, long var3, long var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.buttonId = var5;
        }

        public int getConstructor() {
            return -859202125;
        }
    }

    public static class GetLoginUrl extends Function<HttpUrl> {
        public long chatId;
        public long messageId;
        public long buttonId;
        public boolean allowWriteAccess;
        public static final int CONSTRUCTOR = 791844305;

        public GetLoginUrl() {
        }

        public GetLoginUrl(long var1, long var3, long var5, boolean var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.buttonId = var5;
            this.allowWriteAccess = var7;
        }

        public int getConstructor() {
            return 791844305;
        }
    }

    public static class GetLogVerbosityLevel extends Function<LogVerbosityLevel> {
        public static final int CONSTRUCTOR = 594057956;

        public GetLogVerbosityLevel() {
        }

        public int getConstructor() {
            return 594057956;
        }
    }

    public static class GetLogTags extends Function<LogTags> {
        public static final int CONSTRUCTOR = -254449190;

        public GetLogTags() {
        }

        public int getConstructor() {
            return -254449190;
        }
    }

    public static class GetLogTagVerbosityLevel extends Function<LogVerbosityLevel> {
        public String tag;
        public static final int CONSTRUCTOR = 951004547;

        public GetLogTagVerbosityLevel() {
        }

        public GetLogTagVerbosityLevel(String var1) {
            this.tag = var1;
        }

        public int getConstructor() {
            return 951004547;
        }
    }

    public static class GetLogStream extends Function<LogStream> {
        public static final int CONSTRUCTOR = 1167608667;

        public GetLogStream() {
        }

        public int getConstructor() {
            return 1167608667;
        }
    }

    public static class GetLocalizationTargetInfo extends Function<LocalizationTargetInfo> {
        public boolean onlyLocal;
        public static final int CONSTRUCTOR = 1849499526;

        public GetLocalizationTargetInfo() {
        }

        public GetLocalizationTargetInfo(boolean var1) {
            this.onlyLocal = var1;
        }

        public int getConstructor() {
            return 1849499526;
        }
    }

    public static class GetLanguagePackStrings extends Function<LanguagePackStrings> {
        public String languagePackId;
        public String[] keys;
        public static final int CONSTRUCTOR = 1246259088;

        public GetLanguagePackStrings() {
        }

        public GetLanguagePackStrings(String var1, String[] var2) {
            this.languagePackId = var1;
            this.keys = var2;
        }

        public int getConstructor() {
            return 1246259088;
        }
    }

    public static class GetLanguagePackString extends Function<LanguagePackStringValue> {
        public String languagePackDatabasePath;
        public String localizationTarget;
        public String languagePackId;
        public String key;
        public static final int CONSTRUCTOR = 150789747;

        public GetLanguagePackString() {
        }

        public GetLanguagePackString(String var1, String var2, String var3, String var4) {
            this.languagePackDatabasePath = var1;
            this.localizationTarget = var2;
            this.languagePackId = var3;
            this.key = var4;
        }

        public int getConstructor() {
            return 150789747;
        }
    }

    public static class GetLanguagePackInfo extends Function<LanguagePackInfo> {
        public String languagePackId;
        public static final int CONSTRUCTOR = 2077809320;

        public GetLanguagePackInfo() {
        }

        public GetLanguagePackInfo(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return 2077809320;
        }
    }

    public static class GetJsonValue extends Function<JsonValue> {
        public String json;
        public static final int CONSTRUCTOR = -1829086715;

        public GetJsonValue() {
        }

        public GetJsonValue(String var1) {
            this.json = var1;
        }

        public int getConstructor() {
            return -1829086715;
        }
    }

    public static class GetJsonString extends Function<Text> {
        public JsonValue jsonValue;
        public static final int CONSTRUCTOR = 663458849;

        public GetJsonString() {
        }

        public GetJsonString(JsonValue var1) {
            this.jsonValue = var1;
        }

        public int getConstructor() {
            return 663458849;
        }
    }

    public static class GetInternalLinkType extends Function<InternalLinkType> {
        public String link;
        public static final int CONSTRUCTOR = -1948428535;

        public GetInternalLinkType() {
        }

        public GetInternalLinkType(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return -1948428535;
        }
    }

    public static class GetInstalledStickerSets extends Function<StickerSets> {
        public StickerType stickerType;
        public static final int CONSTRUCTOR = 1630467830;

        public GetInstalledStickerSets() {
        }

        public GetInstalledStickerSets(StickerType var1) {
            this.stickerType = var1;
        }

        public int getConstructor() {
            return 1630467830;
        }
    }

    public static class GetInlineQueryResults extends Function<InlineQueryResults> {
        public long botUserId;
        public long chatId;
        public Location userLocation;
        public String query;
        public String offset;
        public static final int CONSTRUCTOR = 2044524652;

        public GetInlineQueryResults() {
        }

        public GetInlineQueryResults(long var1, long var3, Location var5, String var6, String var7) {
            this.botUserId = var1;
            this.chatId = var3;
            this.userLocation = var5;
            this.query = var6;
            this.offset = var7;
        }

        public int getConstructor() {
            return 2044524652;
        }
    }

    public static class GetInlineGameHighScores extends Function<GameHighScores> {
        public String inlineMessageId;
        public long userId;
        public static final int CONSTRUCTOR = -533107798;

        public GetInlineGameHighScores() {
        }

        public GetInlineGameHighScores(String var1, long var2) {
            this.inlineMessageId = var1;
            this.userId = var2;
        }

        public int getConstructor() {
            return -533107798;
        }
    }

    public static class GetInactiveSupergroupChats extends Function<Chats> {
        public static final int CONSTRUCTOR = -657720907;

        public GetInactiveSupergroupChats() {
        }

        public int getConstructor() {
            return -657720907;
        }
    }

    public static class GetImportedContactCount extends Function<Count> {
        public static final int CONSTRUCTOR = -656336346;

        public GetImportedContactCount() {
        }

        public int getConstructor() {
            return -656336346;
        }
    }

    public static class GetGroupsInCommon extends Function<Chats> {
        public long userId;
        public long offsetChatId;
        public int limit;
        public static final int CONSTRUCTOR = 381539178;

        public GetGroupsInCommon() {
        }

        public GetGroupsInCommon(long var1, long var3, int var5) {
            this.userId = var1;
            this.offsetChatId = var3;
            this.limit = var5;
        }

        public int getConstructor() {
            return 381539178;
        }
    }

    public static class GetGroupCallStreams extends Function<GroupCallStreams> {
        public int groupCallId;
        public static final int CONSTRUCTOR = -1619226268;

        public GetGroupCallStreams() {
        }

        public GetGroupCallStreams(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return -1619226268;
        }
    }

    public static class GetGroupCallStreamSegment extends Function<FilePart> {
        public int groupCallId;
        public long timeOffset;
        public int scale;
        public int channelId;
        public GroupCallVideoQuality videoQuality;
        public static final int CONSTRUCTOR = -2077959515;

        public GetGroupCallStreamSegment() {
        }

        public GetGroupCallStreamSegment(int var1, long var2, int var4, int var5, GroupCallVideoQuality var6) {
            this.groupCallId = var1;
            this.timeOffset = var2;
            this.scale = var4;
            this.channelId = var5;
            this.videoQuality = var6;
        }

        public int getConstructor() {
            return -2077959515;
        }
    }

    public static class GetGroupCallInviteLink extends Function<HttpUrl> {
        public int groupCallId;
        public boolean canSelfUnmute;
        public static final int CONSTRUCTOR = 719407396;

        public GetGroupCallInviteLink() {
        }

        public GetGroupCallInviteLink(int var1, boolean var2) {
            this.groupCallId = var1;
            this.canSelfUnmute = var2;
        }

        public int getConstructor() {
            return 719407396;
        }
    }

    public static class GetGroupCall extends Function<GroupCall> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1468491406;

        public GetGroupCall() {
        }

        public GetGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1468491406;
        }
    }

    public static class GetGameHighScores extends Function<GameHighScores> {
        public long chatId;
        public long messageId;
        public long userId;
        public static final int CONSTRUCTOR = 15746459;

        public GetGameHighScores() {
        }

        public GetGameHighScores(long var1, long var3, long var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.userId = var5;
        }

        public int getConstructor() {
            return 15746459;
        }
    }

    public static class GetFileMimeType extends Function<Text> {
        public String fileName;
        public static final int CONSTRUCTOR = -2073879671;

        public GetFileMimeType() {
        }

        public GetFileMimeType(String var1) {
            this.fileName = var1;
        }

        public int getConstructor() {
            return -2073879671;
        }
    }

    public static class GetFileExtension extends Function<Text> {
        public String mimeType;
        public static final int CONSTRUCTOR = -106055372;

        public GetFileExtension() {
        }

        public GetFileExtension(String var1) {
            this.mimeType = var1;
        }

        public int getConstructor() {
            return -106055372;
        }
    }

    public static class GetFileDownloadedPrefixSize extends Function<FileDownloadedPrefixSize> {
        public int fileId;
        public long offset;
        public static final int CONSTRUCTOR = 855948589;

        public GetFileDownloadedPrefixSize() {
        }

        public GetFileDownloadedPrefixSize(int var1, long var2) {
            this.fileId = var1;
            this.offset = var2;
        }

        public int getConstructor() {
            return 855948589;
        }
    }

    public static class GetFile extends Function<File> {
        public int fileId;
        public static final int CONSTRUCTOR = 1553923406;

        public GetFile() {
        }

        public GetFile(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 1553923406;
        }
    }

    public static class GetFavoriteStickers extends Function<Stickers> {
        public static final int CONSTRUCTOR = -338964672;

        public GetFavoriteStickers() {
        }

        public int getConstructor() {
            return -338964672;
        }
    }

    public static class GetExternalLinkInfo extends Function<LoginUrlInfo> {
        public String link;
        public static final int CONSTRUCTOR = 1175288383;

        public GetExternalLinkInfo() {
        }

        public GetExternalLinkInfo(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 1175288383;
        }
    }

    public static class GetExternalLink extends Function<HttpUrl> {
        public String link;
        public boolean allowWriteAccess;
        public static final int CONSTRUCTOR = 1586688235;

        public GetExternalLink() {
        }

        public GetExternalLink(String var1, boolean var2) {
            this.link = var1;
            this.allowWriteAccess = var2;
        }

        public int getConstructor() {
            return 1586688235;
        }
    }

    public static class GetEmojiSuggestionsUrl extends Function<HttpUrl> {
        public String languageCode;
        public static final int CONSTRUCTOR = -1404101841;

        public GetEmojiSuggestionsUrl() {
        }

        public GetEmojiSuggestionsUrl(String var1) {
            this.languageCode = var1;
        }

        public int getConstructor() {
            return -1404101841;
        }
    }

    public static class GetEmojiReaction extends Function<EmojiReaction> {
        public String emoji;
        public static final int CONSTRUCTOR = -449572388;

        public GetEmojiReaction() {
        }

        public GetEmojiReaction(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return -449572388;
        }
    }

    public static class GetDefaultEmojiStatuses extends Function<EmojiStatuses> {
        public static final int CONSTRUCTOR = 618946243;

        public GetDefaultEmojiStatuses() {
        }

        public int getConstructor() {
            return 618946243;
        }
    }

    public static class GetDeepLinkInfo extends Function<DeepLinkInfo> {
        public String link;
        public static final int CONSTRUCTOR = 680673150;

        public GetDeepLinkInfo() {
        }

        public GetDeepLinkInfo(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 680673150;
        }
    }

    public static class GetDatabaseStatistics extends Function<DatabaseStatistics> {
        public static final int CONSTRUCTOR = -1942760263;

        public GetDatabaseStatistics() {
        }

        public int getConstructor() {
            return -1942760263;
        }
    }

    public static class GetCustomEmojiStickers extends Function<Stickers> {
        public long[] customEmojiIds;
        public static final int CONSTRUCTOR = -2127427955;

        public GetCustomEmojiStickers() {
        }

        public GetCustomEmojiStickers(long[] var1) {
            this.customEmojiIds = var1;
        }

        public int getConstructor() {
            return -2127427955;
        }
    }

    public static class GetCustomEmojiReactionAnimations extends Function<Files> {
        public static final int CONSTRUCTOR = -1657774049;

        public GetCustomEmojiReactionAnimations() {
        }

        public int getConstructor() {
            return -1657774049;
        }
    }

    public static class GetCurrentState extends Function<Updates> {
        public static final int CONSTRUCTOR = -1191417719;

        public GetCurrentState() {
        }

        public int getConstructor() {
            return -1191417719;
        }
    }

    public static class GetCreatedPublicChats extends Function<Chats> {
        public PublicChatType type;
        public static final int CONSTRUCTOR = 710354415;

        public GetCreatedPublicChats() {
        }

        public GetCreatedPublicChats(PublicChatType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return 710354415;
        }
    }

    public static class GetCountryCode extends Function<Text> {
        public static final int CONSTRUCTOR = 1540593906;

        public GetCountryCode() {
        }

        public int getConstructor() {
            return 1540593906;
        }
    }

    public static class GetCountries extends Function<Countries> {
        public static final int CONSTRUCTOR = -51902050;

        public GetCountries() {
        }

        public int getConstructor() {
            return -51902050;
        }
    }

    public static class GetContacts extends Function<Users> {
        public static final int CONSTRUCTOR = -1417722768;

        public GetContacts() {
        }

        public int getConstructor() {
            return -1417722768;
        }
    }

    public static class GetConnectedWebsites extends Function<ConnectedWebsites> {
        public static final int CONSTRUCTOR = -170536110;

        public GetConnectedWebsites() {
        }

        public int getConstructor() {
            return -170536110;
        }
    }

    public static class GetCommands extends Function<BotCommands> {
        public BotCommandScope scope;
        public String languageCode;
        public static final int CONSTRUCTOR = 1488621559;

        public GetCommands() {
        }

        public GetCommands(BotCommandScope var1, String var2) {
            this.scope = var1;
            this.languageCode = var2;
        }

        public int getConstructor() {
            return 1488621559;
        }
    }

    public static class GetChats extends Function<Chats> {
        public ChatList chatList;
        public int limit;
        public static final int CONSTRUCTOR = -972768574;

        public GetChats() {
        }

        public GetChats(ChatList var1, int var2) {
            this.chatList = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return -972768574;
        }
    }

    public static class GetChatStatistics extends Function<ChatStatistics> {
        public long chatId;
        public boolean isDark;
        public static final int CONSTRUCTOR = 327057816;

        public GetChatStatistics() {
        }

        public GetChatStatistics(long var1, boolean var3) {
            this.chatId = var1;
            this.isDark = var3;
        }

        public int getConstructor() {
            return 327057816;
        }
    }

    public static class GetChatSponsoredMessage extends Function<SponsoredMessage> {
        public long chatId;
        public static final int CONSTRUCTOR = 7520523;

        public GetChatSponsoredMessage() {
        }

        public GetChatSponsoredMessage(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 7520523;
        }
    }

    public static class GetChatSparseMessagePositions extends Function<MessagePositions> {
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;
        public int limit;
        public static final int CONSTRUCTOR = -462227580;

        public GetChatSparseMessagePositions() {
        }

        public GetChatSparseMessagePositions(long var1, SearchMessagesFilter var3, long var4, int var6) {
            this.chatId = var1;
            this.filter = var3;
            this.fromMessageId = var4;
            this.limit = var6;
        }

        public int getConstructor() {
            return -462227580;
        }
    }

    public static class GetChatScheduledMessages extends Function<Messages> {
        public long chatId;
        public static final int CONSTRUCTOR = -549638149;

        public GetChatScheduledMessages() {
        }

        public GetChatScheduledMessages(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -549638149;
        }
    }

    public static class GetChatPinnedMessage extends Function<Message> {
        public long chatId;
        public static final int CONSTRUCTOR = 359865008;

        public GetChatPinnedMessage() {
        }

        public GetChatPinnedMessage(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 359865008;
        }
    }

    public static class GetChatNotificationSettingsExceptions extends Function<Chats> {
        public NotificationSettingsScope scope;
        public boolean compareSound;
        public static final int CONSTRUCTOR = 201199121;

        public GetChatNotificationSettingsExceptions() {
        }

        public GetChatNotificationSettingsExceptions(NotificationSettingsScope var1, boolean var2) {
            this.scope = var1;
            this.compareSound = var2;
        }

        public int getConstructor() {
            return 201199121;
        }
    }

    public static class GetChatMessageCount extends Function<Count> {
        public long chatId;
        public SearchMessagesFilter filter;
        public boolean returnLocal;
        public static final int CONSTRUCTOR = 205435308;

        public GetChatMessageCount() {
        }

        public GetChatMessageCount(long var1, SearchMessagesFilter var3, boolean var4) {
            this.chatId = var1;
            this.filter = var3;
            this.returnLocal = var4;
        }

        public int getConstructor() {
            return 205435308;
        }
    }

    public static class GetChatMessageCalendar extends Function<MessageCalendar> {
        public long chatId;
        public SearchMessagesFilter filter;
        public long fromMessageId;
        public static final int CONSTRUCTOR = -326164204;

        public GetChatMessageCalendar() {
        }

        public GetChatMessageCalendar(long var1, SearchMessagesFilter var3, long var4) {
            this.chatId = var1;
            this.filter = var3;
            this.fromMessageId = var4;
        }

        public int getConstructor() {
            return -326164204;
        }
    }

    public static class GetChatMessageByDate extends Function<Message> {
        public long chatId;
        public int date;
        public static final int CONSTRUCTOR = 1062564150;

        public GetChatMessageByDate() {
        }

        public GetChatMessageByDate(long var1, int var3) {
            this.chatId = var1;
            this.date = var3;
        }

        public int getConstructor() {
            return 1062564150;
        }
    }

    public static class GetChatMember extends Function<ChatMember> {
        public long chatId;
        public MessageSender memberId;
        public static final int CONSTRUCTOR = -792636814;

        public GetChatMember() {
        }

        public GetChatMember(long var1, MessageSender var3) {
            this.chatId = var1;
            this.memberId = var3;
        }

        public int getConstructor() {
            return -792636814;
        }
    }

    public static class GetChatListsToAddChat extends Function<ChatLists> {
        public long chatId;
        public static final int CONSTRUCTOR = 654956193;

        public GetChatListsToAddChat() {
        }

        public GetChatListsToAddChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 654956193;
        }
    }

    public static class GetChatJoinRequests extends Function<ChatJoinRequests> {
        public long chatId;
        public String inviteLink;
        public String query;
        public ChatJoinRequest offsetRequest;
        public int limit;
        public static final int CONSTRUCTOR = -388428126;

        public GetChatJoinRequests() {
        }

        public GetChatJoinRequests(long var1, String var3, String var4, ChatJoinRequest var5, int var6) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.query = var4;
            this.offsetRequest = var5;
            this.limit = var6;
        }

        public int getConstructor() {
            return -388428126;
        }
    }

    public static class GetChatInviteLinks extends Function<ChatInviteLinks> {
        public long chatId;
        public long creatorUserId;
        public boolean isRevoked;
        public int offsetDate;
        public String offsetInviteLink;
        public int limit;
        public static final int CONSTRUCTOR = 883252396;

        public GetChatInviteLinks() {
        }

        public GetChatInviteLinks(long var1, long var3, boolean var5, int var6, String var7, int var8) {
            this.chatId = var1;
            this.creatorUserId = var3;
            this.isRevoked = var5;
            this.offsetDate = var6;
            this.offsetInviteLink = var7;
            this.limit = var8;
        }

        public int getConstructor() {
            return 883252396;
        }
    }

    public static class GetChatInviteLinkMembers extends Function<ChatInviteLinkMembers> {
        public long chatId;
        public String inviteLink;
        public ChatInviteLinkMember offsetMember;
        public int limit;
        public static final int CONSTRUCTOR = -977921638;

        public GetChatInviteLinkMembers() {
        }

        public GetChatInviteLinkMembers(long var1, String var3, ChatInviteLinkMember var4, int var5) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.offsetMember = var4;
            this.limit = var5;
        }

        public int getConstructor() {
            return -977921638;
        }
    }

    public static class GetChatInviteLinkCounts extends Function<ChatInviteLinkCounts> {
        public long chatId;
        public static final int CONSTRUCTOR = 890299025;

        public GetChatInviteLinkCounts() {
        }

        public GetChatInviteLinkCounts(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 890299025;
        }
    }

    public static class GetChatInviteLink extends Function<ChatInviteLink> {
        public long chatId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -479575555;

        public GetChatInviteLink() {
        }

        public GetChatInviteLink(long var1, String var3) {
            this.chatId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -479575555;
        }
    }

    public static class GetChatHistory extends Function<Messages> {
        public long chatId;
        public long fromMessageId;
        public int offset;
        public int limit;
        public boolean onlyLocal;
        public static final int CONSTRUCTOR = -799960451;

        public GetChatHistory() {
        }

        public GetChatHistory(long var1, long var3, int var5, int var6, boolean var7) {
            this.chatId = var1;
            this.fromMessageId = var3;
            this.offset = var5;
            this.limit = var6;
            this.onlyLocal = var7;
        }

        public int getConstructor() {
            return -799960451;
        }
    }

    public static class GetChatFilterDefaultIconName extends Function<Text> {
        public ChatFilter filter;
        public static final int CONSTRUCTOR = -1339828680;

        public GetChatFilterDefaultIconName() {
        }

        public GetChatFilterDefaultIconName(ChatFilter var1) {
            this.filter = var1;
        }

        public int getConstructor() {
            return -1339828680;
        }
    }

    public static class GetChatFilter extends Function<ChatFilter> {
        public int chatFilterId;
        public static final int CONSTRUCTOR = 1826317803;

        public GetChatFilter() {
        }

        public GetChatFilter(int var1) {
            this.chatFilterId = var1;
        }

        public int getConstructor() {
            return 1826317803;
        }
    }

    public static class GetChatEventLog extends Function<ChatEvents> {
        public long chatId;
        public String query;
        public long fromEventId;
        public int limit;
        public ChatEventLogFilters filters;
        public long[] userIds;
        public static final int CONSTRUCTOR = -1281344669;

        public GetChatEventLog() {
        }

        public GetChatEventLog(long var1, String var3, long var4, int var6, ChatEventLogFilters var7, long[] var8) {
            this.chatId = var1;
            this.query = var3;
            this.fromEventId = var4;
            this.limit = var6;
            this.filters = var7;
            this.userIds = var8;
        }

        public int getConstructor() {
            return -1281344669;
        }
    }

    public static class GetChatAvailableMessageSenders extends Function<MessageSenders> {
        public long chatId;
        public static final int CONSTRUCTOR = -1541571496;

        public GetChatAvailableMessageSenders() {
        }

        public GetChatAvailableMessageSenders(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1541571496;
        }
    }

    public static class GetChatAdministrators extends Function<ChatAdministrators> {
        public long chatId;
        public static final int CONSTRUCTOR = 1544468155;

        public GetChatAdministrators() {
        }

        public GetChatAdministrators(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1544468155;
        }
    }

    public static class GetChat extends Function<Chat> {
        public long chatId;
        public static final int CONSTRUCTOR = 1866601536;

        public GetChat() {
        }

        public GetChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1866601536;
        }
    }

    public static class GetCallbackQueryMessage extends Function<Message> {
        public long chatId;
        public long messageId;
        public long callbackQueryId;
        public static final int CONSTRUCTOR = -1121939086;

        public GetCallbackQueryMessage() {
        }

        public GetCallbackQueryMessage(long var1, long var3, long var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.callbackQueryId = var5;
        }

        public int getConstructor() {
            return -1121939086;
        }
    }

    public static class GetCallbackQueryAnswer extends Function<CallbackQueryAnswer> {
        public long chatId;
        public long messageId;
        public CallbackQueryPayload payload;
        public static final int CONSTRUCTOR = 116357727;

        public GetCallbackQueryAnswer() {
        }

        public GetCallbackQueryAnswer(long var1, long var3, CallbackQueryPayload var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.payload = var5;
        }

        public int getConstructor() {
            return 116357727;
        }
    }

    public static class GetBlockedMessageSenders extends Function<MessageSenders> {
        public int offset;
        public int limit;
        public static final int CONSTRUCTOR = 1947079776;

        public GetBlockedMessageSenders() {
        }

        public GetBlockedMessageSenders(int var1, int var2) {
            this.offset = var1;
            this.limit = var2;
        }

        public int getConstructor() {
            return 1947079776;
        }
    }

    public static class GetBasicGroupFullInfo extends Function<BasicGroupFullInfo> {
        public long basicGroupId;
        public static final int CONSTRUCTOR = -1822039253;

        public GetBasicGroupFullInfo() {
        }

        public GetBasicGroupFullInfo(long var1) {
            this.basicGroupId = var1;
        }

        public int getConstructor() {
            return -1822039253;
        }
    }

    public static class GetBasicGroup extends Function<BasicGroup> {
        public long basicGroupId;
        public static final int CONSTRUCTOR = -1635174828;

        public GetBasicGroup() {
        }

        public GetBasicGroup(long var1) {
            this.basicGroupId = var1;
        }

        public int getConstructor() {
            return -1635174828;
        }
    }

    public static class GetBankCardInfo extends Function<BankCardInfo> {
        public String bankCardNumber;
        public static final int CONSTRUCTOR = -1310515792;

        public GetBankCardInfo() {
        }

        public GetBankCardInfo(String var1) {
            this.bankCardNumber = var1;
        }

        public int getConstructor() {
            return -1310515792;
        }
    }

    public static class GetBackgrounds extends Function<Backgrounds> {
        public boolean forDarkTheme;
        public static final int CONSTRUCTOR = 249072633;

        public GetBackgrounds() {
        }

        public GetBackgrounds(boolean var1) {
            this.forDarkTheme = var1;
        }

        public int getConstructor() {
            return 249072633;
        }
    }

    public static class GetBackgroundUrl extends Function<HttpUrl> {
        public String name;
        public BackgroundType type;
        public static final int CONSTRUCTOR = 733769682;

        public GetBackgroundUrl() {
        }

        public GetBackgroundUrl(String var1, BackgroundType var2) {
            this.name = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return 733769682;
        }
    }

    public static class GetAutoDownloadSettingsPresets extends Function<AutoDownloadSettingsPresets> {
        public static final int CONSTRUCTOR = -1721088201;

        public GetAutoDownloadSettingsPresets() {
        }

        public int getConstructor() {
            return -1721088201;
        }
    }

    public static class GetAuthorizationState extends Function<AuthorizationState> {
        public static final int CONSTRUCTOR = 1949154877;

        public GetAuthorizationState() {
        }

        public int getConstructor() {
            return 1949154877;
        }
    }

    public static class GetAttachmentMenuBot extends Function<AttachmentMenuBot> {
        public long botUserId;
        public static final int CONSTRUCTOR = 1034248699;

        public GetAttachmentMenuBot() {
        }

        public GetAttachmentMenuBot(long var1) {
            this.botUserId = var1;
        }

        public int getConstructor() {
            return 1034248699;
        }
    }

    public static class GetAttachedStickerSets extends Function<StickerSets> {
        public int fileId;
        public static final int CONSTRUCTOR = 1302172429;

        public GetAttachedStickerSets() {
        }

        public GetAttachedStickerSets(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 1302172429;
        }
    }

    public static class GetArchivedStickerSets extends Function<StickerSets> {
        public StickerType stickerType;
        public long offsetStickerSetId;
        public int limit;
        public static final int CONSTRUCTOR = 1001931341;

        public GetArchivedStickerSets() {
        }

        public GetArchivedStickerSets(StickerType var1, long var2, int var4) {
            this.stickerType = var1;
            this.offsetStickerSetId = var2;
            this.limit = var4;
        }

        public int getConstructor() {
            return 1001931341;
        }
    }

    public static class GetApplicationDownloadLink extends Function<HttpUrl> {
        public static final int CONSTRUCTOR = 112013252;

        public GetApplicationDownloadLink() {
        }

        public int getConstructor() {
            return 112013252;
        }
    }

    public static class GetApplicationConfig extends Function<JsonValue> {
        public static final int CONSTRUCTOR = -1823144318;

        public GetApplicationConfig() {
        }

        public int getConstructor() {
            return -1823144318;
        }
    }

    public static class GetAnimatedEmoji extends Function<AnimatedEmoji> {
        public String emoji;
        public static final int CONSTRUCTOR = 1065635702;

        public GetAnimatedEmoji() {
        }

        public GetAnimatedEmoji(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return 1065635702;
        }
    }

    public static class GetAllPassportElements extends Function<PassportElements> {
        public String password;
        public static final int CONSTRUCTOR = -2038945045;

        public GetAllPassportElements() {
        }

        public GetAllPassportElements(String var1) {
            this.password = var1;
        }

        public int getConstructor() {
            return -2038945045;
        }
    }

    public static class GetActiveSessions extends Function<Sessions> {
        public static final int CONSTRUCTOR = 1119710526;

        public GetActiveSessions() {
        }

        public int getConstructor() {
            return 1119710526;
        }
    }

    public static class GetActiveLiveLocationMessages extends Function<Messages> {
        public static final int CONSTRUCTOR = -1425459567;

        public GetActiveLiveLocationMessages() {
        }

        public int getConstructor() {
            return -1425459567;
        }
    }

    public static class GetAccountTtl extends Function<AccountTtl> {
        public static final int CONSTRUCTOR = -443905161;

        public GetAccountTtl() {
        }

        public int getConstructor() {
            return -443905161;
        }
    }

    public static class ForwardMessages extends Function<Messages> {
        public long chatId;
        public long fromChatId;
        public long[] messageIds;
        public MessageSendOptions options;
        public boolean sendCopy;
        public boolean removeCaption;
        public boolean onlyPreview;
        public static final int CONSTRUCTOR = -798726491;

        public ForwardMessages() {
        }

        public ForwardMessages(long var1, long var3, long[] var5, MessageSendOptions var6, boolean var7, boolean var8, boolean var9) {
            this.chatId = var1;
            this.fromChatId = var3;
            this.messageIds = var5;
            this.options = var6;
            this.sendCopy = var7;
            this.removeCaption = var8;
            this.onlyPreview = var9;
        }

        public int getConstructor() {
            return -798726491;
        }
    }

    public static class FinishFileGeneration extends Function<Ok> {
        public long generationId;
        public Error error;
        public static final int CONSTRUCTOR = -1055060835;

        public FinishFileGeneration() {
        }

        public FinishFileGeneration(long var1, Error var3) {
            this.generationId = var1;
            this.error = var3;
        }

        public int getConstructor() {
            return -1055060835;
        }
    }

    public static class EndGroupCallScreenSharing extends Function<Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = -2047599540;

        public EndGroupCallScreenSharing() {
        }

        public EndGroupCallScreenSharing(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return -2047599540;
        }
    }

    public static class EndGroupCallRecording extends Function<Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = -75799927;

        public EndGroupCallRecording() {
        }

        public EndGroupCallRecording(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return -75799927;
        }
    }

    public static class EndGroupCall extends Function<Ok> {
        public int groupCallId;
        public static final int CONSTRUCTOR = 573131959;

        public EndGroupCall() {
        }

        public EndGroupCall(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 573131959;
        }
    }

    public static class EnableProxy extends Function<Ok> {
        public int proxyId;
        public static final int CONSTRUCTOR = 1494450838;

        public EnableProxy() {
        }

        public EnableProxy(int var1) {
            this.proxyId = var1;
        }

        public int getConstructor() {
            return 1494450838;
        }
    }

    public static class EditProxy extends Function<Proxy> {
        public int proxyId;
        public String server;
        public int port;
        public boolean enable;
        public ProxyType type;
        public static final int CONSTRUCTOR = -1605883821;

        public EditProxy() {
        }

        public EditProxy(int var1, String var2, int var3, boolean var4, ProxyType var5) {
            this.proxyId = var1;
            this.server = var2;
            this.port = var3;
            this.enable = var4;
            this.type = var5;
        }

        public int getConstructor() {
            return -1605883821;
        }
    }

    public static class EditMessageText extends Function<Message> {
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 196272567;

        public EditMessageText() {
        }

        public EditMessageText(long var1, long var3, ReplyMarkup var5, InputMessageContent var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return 196272567;
        }
    }

    public static class EditMessageSchedulingState extends Function<Ok> {
        public long chatId;
        public long messageId;
        public MessageSchedulingState schedulingState;
        public static final int CONSTRUCTOR = -1372976192;

        public EditMessageSchedulingState() {
        }

        public EditMessageSchedulingState(long var1, long var3, MessageSchedulingState var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.schedulingState = var5;
        }

        public int getConstructor() {
            return -1372976192;
        }
    }

    public static class EditMessageReplyMarkup extends Function<Message> {
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 332127881;

        public EditMessageReplyMarkup() {
        }

        public EditMessageReplyMarkup(long var1, long var3, ReplyMarkup var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
        }

        public int getConstructor() {
            return 332127881;
        }
    }

    public static class EditMessageMedia extends Function<Message> {
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1152678125;

        public EditMessageMedia() {
        }

        public EditMessageMedia(long var1, long var3, ReplyMarkup var5, InputMessageContent var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return -1152678125;
        }
    }

    public static class EditMessageLiveLocation extends Function<Message> {
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public Location location;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = -14047982;

        public EditMessageLiveLocation() {
        }

        public EditMessageLiveLocation(long var1, long var3, ReplyMarkup var5, Location var6, int var7, int var8) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.location = var6;
            this.heading = var7;
            this.proximityAlertRadius = var8;
        }

        public int getConstructor() {
            return -14047982;
        }
    }

    public static class EditMessageCaption extends Function<Message> {
        public long chatId;
        public long messageId;
        public ReplyMarkup replyMarkup;
        public FormattedText caption;
        public static final int CONSTRUCTOR = 1154677038;

        public EditMessageCaption() {
        }

        public EditMessageCaption(long var1, long var3, ReplyMarkup var5, FormattedText var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.replyMarkup = var5;
            this.caption = var6;
        }

        public int getConstructor() {
            return 1154677038;
        }
    }

    public static class EditInlineMessageText extends Function<Ok> {
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -855457307;

        public EditInlineMessageText() {
        }

        public EditInlineMessageText(String var1, ReplyMarkup var2, InputMessageContent var3) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.inputMessageContent = var3;
        }

        public int getConstructor() {
            return -855457307;
        }
    }

    public static class EditInlineMessageReplyMarkup extends Function<Ok> {
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = -67565858;

        public EditInlineMessageReplyMarkup() {
        }

        public EditInlineMessageReplyMarkup(String var1, ReplyMarkup var2) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
        }

        public int getConstructor() {
            return -67565858;
        }
    }

    public static class EditInlineMessageMedia extends Function<Ok> {
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 23553921;

        public EditInlineMessageMedia() {
        }

        public EditInlineMessageMedia(String var1, ReplyMarkup var2, InputMessageContent var3) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.inputMessageContent = var3;
        }

        public int getConstructor() {
            return 23553921;
        }
    }

    public static class EditInlineMessageLiveLocation extends Function<Ok> {
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public Location location;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = -156902912;

        public EditInlineMessageLiveLocation() {
        }

        public EditInlineMessageLiveLocation(String var1, ReplyMarkup var2, Location var3, int var4, int var5) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.location = var3;
            this.heading = var4;
            this.proximityAlertRadius = var5;
        }

        public int getConstructor() {
            return -156902912;
        }
    }

    public static class EditInlineMessageCaption extends Function<Ok> {
        public String inlineMessageId;
        public ReplyMarkup replyMarkup;
        public FormattedText caption;
        public static final int CONSTRUCTOR = -760985929;

        public EditInlineMessageCaption() {
        }

        public EditInlineMessageCaption(String var1, ReplyMarkup var2, FormattedText var3) {
            this.inlineMessageId = var1;
            this.replyMarkup = var2;
            this.caption = var3;
        }

        public int getConstructor() {
            return -760985929;
        }
    }

    public static class EditCustomLanguagePackInfo extends Function<Ok> {
        public LanguagePackInfo info;
        public static final int CONSTRUCTOR = 1320751257;

        public EditCustomLanguagePackInfo() {
        }

        public EditCustomLanguagePackInfo(LanguagePackInfo var1) {
            this.info = var1;
        }

        public int getConstructor() {
            return 1320751257;
        }
    }

    public static class EditChatInviteLink extends Function<ChatInviteLink> {
        public long chatId;
        public String inviteLink;
        public String name;
        public int expirationDate;
        public int memberLimit;
        public boolean createsJoinRequest;
        public static final int CONSTRUCTOR = 1320303996;

        public EditChatInviteLink() {
        }

        public EditChatInviteLink(long var1, String var3, String var4, int var5, int var6, boolean var7) {
            this.chatId = var1;
            this.inviteLink = var3;
            this.name = var4;
            this.expirationDate = var5;
            this.memberLimit = var6;
            this.createsJoinRequest = var7;
        }

        public int getConstructor() {
            return 1320303996;
        }
    }

    public static class EditChatFilter extends Function<ChatFilterInfo> {
        public int chatFilterId;
        public ChatFilter filter;
        public static final int CONSTRUCTOR = -1674793086;

        public EditChatFilter() {
        }

        public EditChatFilter(int var1, ChatFilter var2) {
            this.chatFilterId = var1;
            this.filter = var2;
        }

        public int getConstructor() {
            return -1674793086;
        }
    }

    public static class DownloadFile extends Function<File> {
        public int fileId;
        public int priority;
        public long offset;
        public long limit;
        public boolean synchronous;
        public static final int CONSTRUCTOR = 1059402292;

        public DownloadFile() {
        }

        public DownloadFile(int var1, int var2, long var3, long var5, boolean var7) {
            this.fileId = var1;
            this.priority = var2;
            this.offset = var3;
            this.limit = var5;
            this.synchronous = var7;
        }

        public int getConstructor() {
            return 1059402292;
        }
    }

    public static class DisconnectWebsite extends Function<Ok> {
        public long websiteId;
        public static final int CONSTRUCTOR = -778767395;

        public DisconnectWebsite() {
        }

        public DisconnectWebsite(long var1) {
            this.websiteId = var1;
        }

        public int getConstructor() {
            return -778767395;
        }
    }

    public static class DisconnectAllWebsites extends Function<Ok> {
        public static final int CONSTRUCTOR = -1082985981;

        public DisconnectAllWebsites() {
        }

        public int getConstructor() {
            return -1082985981;
        }
    }

    public static class DiscardCall extends Function<Ok> {
        public int callId;
        public boolean isDisconnected;
        public int duration;
        public boolean isVideo;
        public long connectionId;
        public static final int CONSTRUCTOR = -1784044162;

        public DiscardCall() {
        }

        public DiscardCall(int var1, boolean var2, int var3, boolean var4, long var5) {
            this.callId = var1;
            this.isDisconnected = var2;
            this.duration = var3;
            this.isVideo = var4;
            this.connectionId = var5;
        }

        public int getConstructor() {
            return -1784044162;
        }
    }

    public static class DisableProxy extends Function<Ok> {
        public static final int CONSTRUCTOR = -2100095102;

        public DisableProxy() {
        }

        public int getConstructor() {
            return -2100095102;
        }
    }

    public static class Destroy extends Function<Ok> {
        public static final int CONSTRUCTOR = 685331274;

        public Destroy() {
        }

        public int getConstructor() {
            return 685331274;
        }
    }

    public static class DeleteSavedOrderInfo extends Function<Ok> {
        public static final int CONSTRUCTOR = 1629058164;

        public DeleteSavedOrderInfo() {
        }

        public int getConstructor() {
            return 1629058164;
        }
    }

    public static class DeleteSavedCredentials extends Function<Ok> {
        public static final int CONSTRUCTOR = 826300114;

        public DeleteSavedCredentials() {
        }

        public int getConstructor() {
            return 826300114;
        }
    }

    public static class DeleteRevokedChatInviteLink extends Function<Ok> {
        public long chatId;
        public String inviteLink;
        public static final int CONSTRUCTOR = -1859711873;

        public DeleteRevokedChatInviteLink() {
        }

        public DeleteRevokedChatInviteLink(long var1, String var3) {
            this.chatId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -1859711873;
        }
    }

    public static class DeleteProfilePhoto extends Function<Ok> {
        public long profilePhotoId;
        public static final int CONSTRUCTOR = 1319794625;

        public DeleteProfilePhoto() {
        }

        public DeleteProfilePhoto(long var1) {
            this.profilePhotoId = var1;
        }

        public int getConstructor() {
            return 1319794625;
        }
    }

    public static class DeletePassportElement extends Function<Ok> {
        public PassportElementType type;
        public static final int CONSTRUCTOR = -1719555468;

        public DeletePassportElement() {
        }

        public DeletePassportElement(PassportElementType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return -1719555468;
        }
    }

    public static class DeleteMessages extends Function<Ok> {
        public long chatId;
        public long[] messageIds;
        public boolean revoke;
        public static final int CONSTRUCTOR = 1130090173;

        public DeleteMessages() {
        }

        public DeleteMessages(long var1, long[] var3, boolean var4) {
            this.chatId = var1;
            this.messageIds = var3;
            this.revoke = var4;
        }

        public int getConstructor() {
            return 1130090173;
        }
    }

    public static class DeleteLanguagePack extends Function<Ok> {
        public String languagePackId;
        public static final int CONSTRUCTOR = -2108761026;

        public DeleteLanguagePack() {
        }

        public DeleteLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return -2108761026;
        }
    }

    public static class DeleteFile extends Function<Ok> {
        public int fileId;
        public static final int CONSTRUCTOR = 1807653676;

        public DeleteFile() {
        }

        public DeleteFile(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 1807653676;
        }
    }

    public static class DeleteCommands extends Function<Ok> {
        public BotCommandScope scope;
        public String languageCode;
        public static final int CONSTRUCTOR = 1002732586;

        public DeleteCommands() {
        }

        public DeleteCommands(BotCommandScope var1, String var2) {
            this.scope = var1;
            this.languageCode = var2;
        }

        public int getConstructor() {
            return 1002732586;
        }
    }

    public static class DeleteChatReplyMarkup extends Function<Ok> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 100637531;

        public DeleteChatReplyMarkup() {
        }

        public DeleteChatReplyMarkup(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 100637531;
        }
    }

    public static class DeleteChatMessagesBySender extends Function<Ok> {
        public long chatId;
        public MessageSender senderId;
        public static final int CONSTRUCTOR = -1164235161;

        public DeleteChatMessagesBySender() {
        }

        public DeleteChatMessagesBySender(long var1, MessageSender var3) {
            this.chatId = var1;
            this.senderId = var3;
        }

        public int getConstructor() {
            return -1164235161;
        }
    }

    public static class DeleteChatMessagesByDate extends Function<Ok> {
        public long chatId;
        public int minDate;
        public int maxDate;
        public boolean revoke;
        public static final int CONSTRUCTOR = -1639653185;

        public DeleteChatMessagesByDate() {
        }

        public DeleteChatMessagesByDate(long var1, int var3, int var4, boolean var5) {
            this.chatId = var1;
            this.minDate = var3;
            this.maxDate = var4;
            this.revoke = var5;
        }

        public int getConstructor() {
            return -1639653185;
        }
    }

    public static class DeleteChatHistory extends Function<Ok> {
        public long chatId;
        public boolean removeFromChatList;
        public boolean revoke;
        public static final int CONSTRUCTOR = -1472081761;

        public DeleteChatHistory() {
        }

        public DeleteChatHistory(long var1, boolean var3, boolean var4) {
            this.chatId = var1;
            this.removeFromChatList = var3;
            this.revoke = var4;
        }

        public int getConstructor() {
            return -1472081761;
        }
    }

    public static class DeleteChatFilter extends Function<Ok> {
        public int chatFilterId;
        public static final int CONSTRUCTOR = -523220877;

        public DeleteChatFilter() {
        }

        public DeleteChatFilter(int var1) {
            this.chatFilterId = var1;
        }

        public int getConstructor() {
            return -523220877;
        }
    }

    public static class DeleteChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -171253666;

        public DeleteChat() {
        }

        public DeleteChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -171253666;
        }
    }

    public static class DeleteAllRevokedChatInviteLinks extends Function<Ok> {
        public long chatId;
        public long creatorUserId;
        public static final int CONSTRUCTOR = 1112020698;

        public DeleteAllRevokedChatInviteLinks() {
        }

        public DeleteAllRevokedChatInviteLinks(long var1, long var3) {
            this.chatId = var1;
            this.creatorUserId = var3;
        }

        public int getConstructor() {
            return 1112020698;
        }
    }

    public static class DeleteAllCallMessages extends Function<Ok> {
        public boolean revoke;
        public static final int CONSTRUCTOR = -1466445325;

        public DeleteAllCallMessages() {
        }

        public DeleteAllCallMessages(boolean var1) {
            this.revoke = var1;
        }

        public int getConstructor() {
            return -1466445325;
        }
    }

    public static class DeleteAccount extends Function<Ok> {
        public String reason;
        public String password;
        public static final int CONSTRUCTOR = 1395816134;

        public DeleteAccount() {
        }

        public DeleteAccount(String var1, String var2) {
            this.reason = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return 1395816134;
        }
    }

    public static class CreateVideoChat extends Function<GroupCallId> {
        public long chatId;
        public String title;
        public int startDate;
        public boolean isRtmpStream;
        public static final int CONSTRUCTOR = 2124715405;

        public CreateVideoChat() {
        }

        public CreateVideoChat(long var1, String var3, int var4, boolean var5) {
            this.chatId = var1;
            this.title = var3;
            this.startDate = var4;
            this.isRtmpStream = var5;
        }

        public int getConstructor() {
            return 2124715405;
        }
    }

    public static class CreateTemporaryPassword extends Function<TemporaryPasswordState> {
        public String password;
        public int validFor;
        public static final int CONSTRUCTOR = -1626509434;

        public CreateTemporaryPassword() {
        }

        public CreateTemporaryPassword(String var1, int var2) {
            this.password = var1;
            this.validFor = var2;
        }

        public int getConstructor() {
            return -1626509434;
        }
    }

    public static class CreateSupergroupChat extends Function<Chat> {
        public long supergroupId;
        public boolean force;
        public static final int CONSTRUCTOR = 1187475691;

        public CreateSupergroupChat() {
        }

        public CreateSupergroupChat(long var1, boolean var3) {
            this.supergroupId = var1;
            this.force = var3;
        }

        public int getConstructor() {
            return 1187475691;
        }
    }

    public static class CreateSecretChat extends Function<Chat> {
        public int secretChatId;
        public static final int CONSTRUCTOR = 1930285615;

        public CreateSecretChat() {
        }

        public CreateSecretChat(int var1) {
            this.secretChatId = var1;
        }

        public int getConstructor() {
            return 1930285615;
        }
    }

    public static class CreatePrivateChat extends Function<Chat> {
        public long userId;
        public boolean force;
        public static final int CONSTRUCTOR = -947758327;

        public CreatePrivateChat() {
        }

        public CreatePrivateChat(long var1, boolean var3) {
            this.userId = var1;
            this.force = var3;
        }

        public int getConstructor() {
            return -947758327;
        }
    }

    public static class CreateNewSupergroupChat extends Function<Chat> {
        public String title;
        public boolean isChannel;
        public String description;
        public ChatLocation location;
        public boolean forImport;
        public static final int CONSTRUCTOR = -830232895;

        public CreateNewSupergroupChat() {
        }

        public CreateNewSupergroupChat(String var1, boolean var2, String var3, ChatLocation var4, boolean var5) {
            this.title = var1;
            this.isChannel = var2;
            this.description = var3;
            this.location = var4;
            this.forImport = var5;
        }

        public int getConstructor() {
            return -830232895;
        }
    }

    public static class CreateNewStickerSet extends Function<StickerSet> {
        public long userId;
        public String title;
        public String name;
        public StickerType stickerType;
        public InputSticker[] stickers;
        public String source;
        public static final int CONSTRUCTOR = 1424129402;

        public CreateNewStickerSet() {
        }

        public CreateNewStickerSet(long var1, String var3, String var4, StickerType var5, InputSticker[] var6, String var7) {
            this.userId = var1;
            this.title = var3;
            this.name = var4;
            this.stickerType = var5;
            this.stickers = var6;
            this.source = var7;
        }

        public int getConstructor() {
            return 1424129402;
        }
    }

    public static class CreateNewSecretChat extends Function<Chat> {
        public long userId;
        public static final int CONSTRUCTOR = -620682651;

        public CreateNewSecretChat() {
        }

        public CreateNewSecretChat(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -620682651;
        }
    }

    public static class CreateNewBasicGroupChat extends Function<Chat> {
        public long[] userIds;
        public String title;
        public static final int CONSTRUCTOR = -2104438789;

        public CreateNewBasicGroupChat() {
        }

        public CreateNewBasicGroupChat(long[] var1, String var2) {
            this.userIds = var1;
            this.title = var2;
        }

        public int getConstructor() {
            return -2104438789;
        }
    }

    public static class CreateInvoiceLink extends Function<HttpUrl> {
        public InputMessageContent invoice;
        public static final int CONSTRUCTOR = 216787233;

        public CreateInvoiceLink() {
        }

        public CreateInvoiceLink(InputMessageContent var1) {
            this.invoice = var1;
        }

        public int getConstructor() {
            return 216787233;
        }
    }

    public static class CreateChatInviteLink extends Function<ChatInviteLink> {
        public long chatId;
        public String name;
        public int expirationDate;
        public int memberLimit;
        public boolean createsJoinRequest;
        public static final int CONSTRUCTOR = 287744833;

        public CreateChatInviteLink() {
        }

        public CreateChatInviteLink(long var1, String var3, int var4, int var5, boolean var6) {
            this.chatId = var1;
            this.name = var3;
            this.expirationDate = var4;
            this.memberLimit = var5;
            this.createsJoinRequest = var6;
        }

        public int getConstructor() {
            return 287744833;
        }
    }

    public static class CreateChatFilter extends Function<ChatFilterInfo> {
        public ChatFilter filter;
        public static final int CONSTRUCTOR = 49065126;

        public CreateChatFilter() {
        }

        public CreateChatFilter(ChatFilter var1) {
            this.filter = var1;
        }

        public int getConstructor() {
            return 49065126;
        }
    }

    public static class CreateCall extends Function<CallId> {
        public long userId;
        public CallProtocol protocol;
        public boolean isVideo;
        public static final int CONSTRUCTOR = -1104663024;

        public CreateCall() {
        }

        public CreateCall(long var1, CallProtocol var3, boolean var4) {
            this.userId = var1;
            this.protocol = var3;
            this.isVideo = var4;
        }

        public int getConstructor() {
            return -1104663024;
        }
    }

    public static class CreateBasicGroupChat extends Function<Chat> {
        public long basicGroupId;
        public boolean force;
        public static final int CONSTRUCTOR = 1972024548;

        public CreateBasicGroupChat() {
        }

        public CreateBasicGroupChat(long var1, boolean var3) {
            this.basicGroupId = var1;
            this.force = var3;
        }

        public int getConstructor() {
            return 1972024548;
        }
    }

    public static class ConfirmQrCodeAuthentication extends Function<Session> {
        public String link;
        public static final int CONSTRUCTOR = -376199379;

        public ConfirmQrCodeAuthentication() {
        }

        public ConfirmQrCodeAuthentication(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return -376199379;
        }
    }

    public static class CloseWebApp extends Function<Ok> {
        public long webAppLaunchId;
        public static final int CONSTRUCTOR = 1755391174;

        public CloseWebApp() {
        }

        public CloseWebApp(long var1) {
            this.webAppLaunchId = var1;
        }

        public int getConstructor() {
            return 1755391174;
        }
    }

    public static class CloseSecretChat extends Function<Ok> {
        public int secretChatId;
        public static final int CONSTRUCTOR = -471006133;

        public CloseSecretChat() {
        }

        public CloseSecretChat(int var1) {
            this.secretChatId = var1;
        }

        public int getConstructor() {
            return -471006133;
        }
    }

    public static class CloseChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = 39749353;

        public CloseChat() {
        }

        public CloseChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 39749353;
        }
    }

    public static class Close extends Function<Ok> {
        public static final int CONSTRUCTOR = -1187782273;

        public Close() {
        }

        public int getConstructor() {
            return -1187782273;
        }
    }

    public static class ClickPremiumSubscriptionButton extends Function<Ok> {
        public static final int CONSTRUCTOR = -369319162;

        public ClickPremiumSubscriptionButton() {
        }

        public int getConstructor() {
            return -369319162;
        }
    }

    public static class ClickAnimatedEmojiMessage extends Function<Sticker> {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 196179554;

        public ClickAnimatedEmojiMessage() {
        }

        public ClickAnimatedEmojiMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 196179554;
        }
    }

    public static class ClearRecentlyFoundChats extends Function<Ok> {
        public static final int CONSTRUCTOR = -285582542;

        public ClearRecentlyFoundChats() {
        }

        public int getConstructor() {
            return -285582542;
        }
    }

    public static class ClearRecentStickers extends Function<Ok> {
        public boolean isAttached;
        public static final int CONSTRUCTOR = -321242684;

        public ClearRecentStickers() {
        }

        public ClearRecentStickers(boolean var1) {
            this.isAttached = var1;
        }

        public int getConstructor() {
            return -321242684;
        }
    }

    public static class ClearRecentReactions extends Function<Ok> {
        public static final int CONSTRUCTOR = 1298253650;

        public ClearRecentReactions() {
        }

        public int getConstructor() {
            return 1298253650;
        }
    }

    public static class ClearRecentEmojiStatuses extends Function<Ok> {
        public static final int CONSTRUCTOR = -428749986;

        public ClearRecentEmojiStatuses() {
        }

        public int getConstructor() {
            return -428749986;
        }
    }

    public static class ClearImportedContacts extends Function<Ok> {
        public static final int CONSTRUCTOR = 869503298;

        public ClearImportedContacts() {
        }

        public int getConstructor() {
            return 869503298;
        }
    }

    public static class ClearAllDraftMessages extends Function<Ok> {
        public boolean excludeSecretChats;
        public static final int CONSTRUCTOR = -46369573;

        public ClearAllDraftMessages() {
        }

        public ClearAllDraftMessages(boolean var1) {
            this.excludeSecretChats = var1;
        }

        public int getConstructor() {
            return -46369573;
        }
    }

    public static class CleanFileName extends Function<Text> {
        public String fileName;
        public static final int CONSTRUCTOR = 967964667;

        public CleanFileName() {
        }

        public CleanFileName(String var1) {
            this.fileName = var1;
        }

        public int getConstructor() {
            return 967964667;
        }
    }

    public static class CheckStickerSetName extends Function<CheckStickerSetNameResult> {
        public String name;
        public static final int CONSTRUCTOR = -1789392642;

        public CheckStickerSetName() {
        }

        public CheckStickerSetName(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -1789392642;
        }
    }

    public static class CheckRecoveryEmailAddressCode extends Function<PasswordState> {
        public String code;
        public static final int CONSTRUCTOR = -1997039589;

        public CheckRecoveryEmailAddressCode() {
        }

        public CheckRecoveryEmailAddressCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1997039589;
        }
    }

    public static class CheckPhoneNumberVerificationCode extends Function<Ok> {
        public String code;
        public static final int CONSTRUCTOR = 1497462718;

        public CheckPhoneNumberVerificationCode() {
        }

        public CheckPhoneNumberVerificationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return 1497462718;
        }
    }

    public static class CheckPhoneNumberConfirmationCode extends Function<Ok> {
        public String code;
        public static final int CONSTRUCTOR = -1348060966;

        public CheckPhoneNumberConfirmationCode() {
        }

        public CheckPhoneNumberConfirmationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1348060966;
        }
    }

    public static class CheckPasswordRecoveryCode extends Function<Ok> {
        public String recoveryCode;
        public static final int CONSTRUCTOR = -200794600;

        public CheckPasswordRecoveryCode() {
        }

        public CheckPasswordRecoveryCode(String var1) {
            this.recoveryCode = var1;
        }

        public int getConstructor() {
            return -200794600;
        }
    }

    public static class CheckLoginEmailAddressCode extends Function<Ok> {
        public EmailAddressAuthentication code;
        public static final int CONSTRUCTOR = -1454244766;

        public CheckLoginEmailAddressCode() {
        }

        public CheckLoginEmailAddressCode(EmailAddressAuthentication var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1454244766;
        }
    }

    public static class CheckEmailAddressVerificationCode extends Function<Ok> {
        public String code;
        public static final int CONSTRUCTOR = -426386685;

        public CheckEmailAddressVerificationCode() {
        }

        public CheckEmailAddressVerificationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -426386685;
        }
    }

    public static class CheckCreatedPublicChatsLimit extends Function<Ok> {
        public PublicChatType type;
        public static final int CONSTRUCTOR = -445546591;

        public CheckCreatedPublicChatsLimit() {
        }

        public CheckCreatedPublicChatsLimit(PublicChatType var1) {
            this.type = var1;
        }

        public int getConstructor() {
            return -445546591;
        }
    }

    public static class CheckChatUsername extends Function<CheckChatUsernameResult> {
        public long chatId;
        public String username;
        public static final int CONSTRUCTOR = -119119344;

        public CheckChatUsername() {
        }

        public CheckChatUsername(long var1, String var3) {
            this.chatId = var1;
            this.username = var3;
        }

        public int getConstructor() {
            return -119119344;
        }
    }

    public static class CheckChatInviteLink extends Function<ChatInviteLinkInfo> {
        public String inviteLink;
        public static final int CONSTRUCTOR = -496940997;

        public CheckChatInviteLink() {
        }

        public CheckChatInviteLink(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -496940997;
        }
    }

    public static class CheckChangePhoneNumberCode extends Function<Ok> {
        public String code;
        public static final int CONSTRUCTOR = -1720278429;

        public CheckChangePhoneNumberCode() {
        }

        public CheckChangePhoneNumberCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -1720278429;
        }
    }

    public static class CheckAuthenticationPasswordRecoveryCode extends Function<Ok> {
        public String recoveryCode;
        public static final int CONSTRUCTOR = -603309083;

        public CheckAuthenticationPasswordRecoveryCode() {
        }

        public CheckAuthenticationPasswordRecoveryCode(String var1) {
            this.recoveryCode = var1;
        }

        public int getConstructor() {
            return -603309083;
        }
    }

    public static class CheckAuthenticationPassword extends Function<Ok> {
        public String password;
        public static final int CONSTRUCTOR = -2025698400;

        public CheckAuthenticationPassword() {
        }

        public CheckAuthenticationPassword(String var1) {
            this.password = var1;
        }

        public int getConstructor() {
            return -2025698400;
        }
    }

    public static class CheckAuthenticationEmailCode extends Function<Ok> {
        public EmailAddressAuthentication code;
        public static final int CONSTRUCTOR = -582827361;

        public CheckAuthenticationEmailCode() {
        }

        public CheckAuthenticationEmailCode(EmailAddressAuthentication var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -582827361;
        }
    }

    public static class CheckAuthenticationCode extends Function<Ok> {
        public String code;
        public static final int CONSTRUCTOR = -302103382;

        public CheckAuthenticationCode() {
        }

        public CheckAuthenticationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -302103382;
        }
    }

    public static class CheckAuthenticationBotToken extends Function<Ok> {
        public String token;
        public static final int CONSTRUCTOR = 639321206;

        public CheckAuthenticationBotToken() {
        }

        public CheckAuthenticationBotToken(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 639321206;
        }
    }

    public static class ChangeStickerSet extends Function<Ok> {
        public long setId;
        public boolean isInstalled;
        public boolean isArchived;
        public static final int CONSTRUCTOR = 449357293;

        public ChangeStickerSet() {
        }

        public ChangeStickerSet(long var1, boolean var3, boolean var4) {
            this.setId = var1;
            this.isInstalled = var3;
            this.isArchived = var4;
        }

        public int getConstructor() {
            return 449357293;
        }
    }

    public static class ChangePhoneNumber extends Function<AuthenticationCodeInfo> {
        public String phoneNumber;
        public PhoneNumberAuthenticationSettings settings;
        public static final int CONSTRUCTOR = -124666973;

        public ChangePhoneNumber() {
        }

        public ChangePhoneNumber(String var1, PhoneNumberAuthenticationSettings var2) {
            this.phoneNumber = var1;
            this.settings = var2;
        }

        public int getConstructor() {
            return -124666973;
        }
    }

    public static class ChangeImportedContacts extends Function<ImportedContacts> {
        public Contact[] contacts;
        public static final int CONSTRUCTOR = 1968207955;

        public ChangeImportedContacts() {
        }

        public ChangeImportedContacts(Contact[] var1) {
            this.contacts = var1;
        }

        public int getConstructor() {
            return 1968207955;
        }
    }

    public static class CancelPreliminaryUploadFile extends Function<Ok> {
        public int fileId;
        public static final int CONSTRUCTOR = 823412414;

        public CancelPreliminaryUploadFile() {
        }

        public CancelPreliminaryUploadFile(int var1) {
            this.fileId = var1;
        }

        public int getConstructor() {
            return 823412414;
        }
    }

    public static class CancelPasswordReset extends Function<Ok> {
        public static final int CONSTRUCTOR = 940733538;

        public CancelPasswordReset() {
        }

        public int getConstructor() {
            return 940733538;
        }
    }

    public static class CancelDownloadFile extends Function<Ok> {
        public int fileId;
        public boolean onlyIfPending;
        public static final int CONSTRUCTOR = -1954524450;

        public CancelDownloadFile() {
        }

        public CancelDownloadFile(int var1, boolean var2) {
            this.fileId = var1;
            this.onlyIfPending = var2;
        }

        public int getConstructor() {
            return -1954524450;
        }
    }

    public static class CanTransferOwnership extends Function<CanTransferOwnershipResult> {
        public static final int CONSTRUCTOR = 634602508;

        public CanTransferOwnership() {
        }

        public int getConstructor() {
            return 634602508;
        }
    }

    public static class CanPurchasePremium extends Function<Ok> {
        public StorePaymentPurpose purpose;
        public static final int CONSTRUCTOR = -371319616;

        public CanPurchasePremium() {
        }

        public CanPurchasePremium(StorePaymentPurpose var1) {
            this.purpose = var1;
        }

        public int getConstructor() {
            return -371319616;
        }
    }

    public static class BlockMessageSenderFromReplies extends Function<Ok> {
        public long messageId;
        public boolean deleteMessage;
        public boolean deleteAllMessages;
        public boolean reportSpam;
        public static final int CONSTRUCTOR = -1214384757;

        public BlockMessageSenderFromReplies() {
        }

        public BlockMessageSenderFromReplies(long var1, boolean var3, boolean var4, boolean var5) {
            this.messageId = var1;
            this.deleteMessage = var3;
            this.deleteAllMessages = var4;
            this.reportSpam = var5;
        }

        public int getConstructor() {
            return -1214384757;
        }
    }

    public static class BanChatMember extends Function<Ok> {
        public long chatId;
        public MessageSender memberId;
        public int bannedUntilDate;
        public boolean revokeMessages;
        public static final int CONSTRUCTOR = -888111748;

        public BanChatMember() {
        }

        public BanChatMember(long var1, MessageSender var3, int var4, boolean var5) {
            this.chatId = var1;
            this.memberId = var3;
            this.bannedUntilDate = var4;
            this.revokeMessages = var5;
        }

        public int getConstructor() {
            return -888111748;
        }
    }

    public static class AssignGooglePlayTransaction extends Function<Ok> {
        public String packageName;
        public String storeProductId;
        public String purchaseToken;
        public StorePaymentPurpose purpose;
        public static final int CONSTRUCTOR = -1992704860;

        public AssignGooglePlayTransaction() {
        }

        public AssignGooglePlayTransaction(String var1, String var2, String var3, StorePaymentPurpose var4) {
            this.packageName = var1;
            this.storeProductId = var2;
            this.purchaseToken = var3;
            this.purpose = var4;
        }

        public int getConstructor() {
            return -1992704860;
        }
    }

    public static class AssignAppStoreTransaction extends Function<Ok> {
        public byte[] receipt;
        public StorePaymentPurpose purpose;
        public static final int CONSTRUCTOR = -2030892112;

        public AssignAppStoreTransaction() {
        }

        public AssignAppStoreTransaction(byte[] var1, StorePaymentPurpose var2) {
            this.receipt = var1;
            this.purpose = var2;
        }

        public int getConstructor() {
            return -2030892112;
        }
    }

    public static class AnswerWebAppQuery extends Function<SentWebAppMessage> {
        public String webAppQueryId;
        public InputInlineQueryResult result;
        public static final int CONSTRUCTOR = -1598776079;

        public AnswerWebAppQuery() {
        }

        public AnswerWebAppQuery(String var1, InputInlineQueryResult var2) {
            this.webAppQueryId = var1;
            this.result = var2;
        }

        public int getConstructor() {
            return -1598776079;
        }
    }

    public static class AnswerShippingQuery extends Function<Ok> {
        public long shippingQueryId;
        public ShippingOption[] shippingOptions;
        public String errorMessage;
        public static final int CONSTRUCTOR = -434601324;

        public AnswerShippingQuery() {
        }

        public AnswerShippingQuery(long var1, ShippingOption[] var3, String var4) {
            this.shippingQueryId = var1;
            this.shippingOptions = var3;
            this.errorMessage = var4;
        }

        public int getConstructor() {
            return -434601324;
        }
    }

    public static class AnswerPreCheckoutQuery extends Function<Ok> {
        public long preCheckoutQueryId;
        public String errorMessage;
        public static final int CONSTRUCTOR = -1486789653;

        public AnswerPreCheckoutQuery() {
        }

        public AnswerPreCheckoutQuery(long var1, String var3) {
            this.preCheckoutQueryId = var1;
            this.errorMessage = var3;
        }

        public int getConstructor() {
            return -1486789653;
        }
    }

    public static class AnswerInlineQuery extends Function<Ok> {
        public long inlineQueryId;
        public boolean isPersonal;
        public InputInlineQueryResult[] results;
        public int cacheTime;
        public String nextOffset;
        public String switchPmText;
        public String switchPmParameter;
        public static final int CONSTRUCTOR = 485879477;

        public AnswerInlineQuery() {
        }

        public AnswerInlineQuery(long var1, boolean var3, InputInlineQueryResult[] var4, int var5, String var6, String var7, String var8) {
            this.inlineQueryId = var1;
            this.isPersonal = var3;
            this.results = var4;
            this.cacheTime = var5;
            this.nextOffset = var6;
            this.switchPmText = var7;
            this.switchPmParameter = var8;
        }

        public int getConstructor() {
            return 485879477;
        }
    }

    public static class AnswerCustomQuery extends Function<Ok> {
        public long customQueryId;
        public String data;
        public static final int CONSTRUCTOR = -1293603521;

        public AnswerCustomQuery() {
        }

        public AnswerCustomQuery(long var1, String var3) {
            this.customQueryId = var1;
            this.data = var3;
        }

        public int getConstructor() {
            return -1293603521;
        }
    }

    public static class AnswerCallbackQuery extends Function<Ok> {
        public long callbackQueryId;
        public String text;
        public boolean showAlert;
        public String url;
        public int cacheTime;
        public static final int CONSTRUCTOR = -1153028490;

        public AnswerCallbackQuery() {
        }

        public AnswerCallbackQuery(long var1, String var3, boolean var4, String var5, int var6) {
            this.callbackQueryId = var1;
            this.text = var3;
            this.showAlert = var4;
            this.url = var5;
            this.cacheTime = var6;
        }

        public int getConstructor() {
            return -1153028490;
        }
    }

    public static class AddStickerToSet extends Function<StickerSet> {
        public long userId;
        public String name;
        public InputSticker sticker;
        public static final int CONSTRUCTOR = -1340783267;

        public AddStickerToSet() {
        }

        public AddStickerToSet(long var1, String var3, InputSticker var4) {
            this.userId = var1;
            this.name = var3;
            this.sticker = var4;
        }

        public int getConstructor() {
            return -1340783267;
        }
    }

    public static class AddSavedNotificationSound extends Function<NotificationSound> {
        public InputFile sound;
        public static final int CONSTRUCTOR = 1043956975;

        public AddSavedNotificationSound() {
        }

        public AddSavedNotificationSound(InputFile var1) {
            this.sound = var1;
        }

        public int getConstructor() {
            return 1043956975;
        }
    }

    public static class AddSavedAnimation extends Function<Ok> {
        public InputFile animation;
        public static final int CONSTRUCTOR = -1538525088;

        public AddSavedAnimation() {
        }

        public AddSavedAnimation(InputFile var1) {
            this.animation = var1;
        }

        public int getConstructor() {
            return -1538525088;
        }
    }

    public static class AddRecentlyFoundChat extends Function<Ok> {
        public long chatId;
        public static final int CONSTRUCTOR = -1746396787;

        public AddRecentlyFoundChat() {
        }

        public AddRecentlyFoundChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -1746396787;
        }
    }

    public static class AddRecentSticker extends Function<Stickers> {
        public boolean isAttached;
        public InputFile sticker;
        public static final int CONSTRUCTOR = -1478109026;

        public AddRecentSticker() {
        }

        public AddRecentSticker(boolean var1, InputFile var2) {
            this.isAttached = var1;
            this.sticker = var2;
        }

        public int getConstructor() {
            return -1478109026;
        }
    }

    public static class AddProxy extends Function<Proxy> {
        public String server;
        public int port;
        public boolean enable;
        public ProxyType type;
        public static final int CONSTRUCTOR = 331529432;

        public AddProxy() {
        }

        public AddProxy(String var1, int var2, boolean var3, ProxyType var4) {
            this.server = var1;
            this.port = var2;
            this.enable = var3;
            this.type = var4;
        }

        public int getConstructor() {
            return 331529432;
        }
    }

    public static class AddNetworkStatistics extends Function<Ok> {
        public NetworkStatisticsEntry entry;
        public static final int CONSTRUCTOR = 1264825305;

        public AddNetworkStatistics() {
        }

        public AddNetworkStatistics(NetworkStatisticsEntry var1) {
            this.entry = var1;
        }

        public int getConstructor() {
            return 1264825305;
        }
    }

    public static class AddMessageReaction extends Function<Ok> {
        public long chatId;
        public long messageId;
        public ReactionType reactionType;
        public boolean isBig;
        public boolean updateRecentReactions;
        public static final int CONSTRUCTOR = 1419269613;

        public AddMessageReaction() {
        }

        public AddMessageReaction(long var1, long var3, ReactionType var5, boolean var6, boolean var7) {
            this.chatId = var1;
            this.messageId = var3;
            this.reactionType = var5;
            this.isBig = var6;
            this.updateRecentReactions = var7;
        }

        public int getConstructor() {
            return 1419269613;
        }
    }

    public static class AddLogMessage extends Function<Ok> {
        public int verbosityLevel;
        public String text;
        public static final int CONSTRUCTOR = 1597427692;

        public AddLogMessage() {
        }

        public AddLogMessage(int var1, String var2) {
            this.verbosityLevel = var1;
            this.text = var2;
        }

        public int getConstructor() {
            return 1597427692;
        }
    }

    public static class AddLocalMessage extends Function<Message> {
        public long chatId;
        public MessageSender senderId;
        public long replyToMessageId;
        public boolean disableNotification;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1998878725;

        public AddLocalMessage() {
        }

        public AddLocalMessage(long var1, MessageSender var3, long var4, boolean var6, InputMessageContent var7) {
            this.chatId = var1;
            this.senderId = var3;
            this.replyToMessageId = var4;
            this.disableNotification = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return -1998878725;
        }
    }

    public static class AddFileToDownloads extends Function<File> {
        public int fileId;
        public long chatId;
        public long messageId;
        public int priority;
        public static final int CONSTRUCTOR = 867533751;

        public AddFileToDownloads() {
        }

        public AddFileToDownloads(int var1, long var2, long var4, int var6) {
            this.fileId = var1;
            this.chatId = var2;
            this.messageId = var4;
            this.priority = var6;
        }

        public int getConstructor() {
            return 867533751;
        }
    }

    public static class AddFavoriteSticker extends Function<Ok> {
        public InputFile sticker;
        public static final int CONSTRUCTOR = 324504799;

        public AddFavoriteSticker() {
        }

        public AddFavoriteSticker(InputFile var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return 324504799;
        }
    }

    public static class AddCustomServerLanguagePack extends Function<Ok> {
        public String languagePackId;
        public static final int CONSTRUCTOR = 4492771;

        public AddCustomServerLanguagePack() {
        }

        public AddCustomServerLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return 4492771;
        }
    }

    public static class AddContact extends Function<Ok> {
        public Contact contact;
        public boolean sharePhoneNumber;
        public static final int CONSTRUCTOR = 1869640000;

        public AddContact() {
        }

        public AddContact(Contact var1, boolean var2) {
            this.contact = var1;
            this.sharePhoneNumber = var2;
        }

        public int getConstructor() {
            return 1869640000;
        }
    }

    public static class AddChatToList extends Function<Ok> {
        public long chatId;
        public ChatList chatList;
        public static final int CONSTRUCTOR = -80523595;

        public AddChatToList() {
        }

        public AddChatToList(long var1, ChatList var3) {
            this.chatId = var1;
            this.chatList = var3;
        }

        public int getConstructor() {
            return -80523595;
        }
    }

    public static class AddChatMembers extends Function<Ok> {
        public long chatId;
        public long[] userIds;
        public static final int CONSTRUCTOR = -519951226;

        public AddChatMembers() {
        }

        public AddChatMembers(long var1, long[] var3) {
            this.chatId = var1;
            this.userIds = var3;
        }

        public int getConstructor() {
            return -519951226;
        }
    }

    public static class AddChatMember extends Function<Ok> {
        public long chatId;
        public long userId;
        public int forwardLimit;
        public static final int CONSTRUCTOR = 499426810;

        public AddChatMember() {
        }

        public AddChatMember(long var1, long var3, int var5) {
            this.chatId = var1;
            this.userId = var3;
            this.forwardLimit = var5;
        }

        public int getConstructor() {
            return 499426810;
        }
    }

    public static class AcceptTermsOfService extends Function<Ok> {
        public String termsOfServiceId;
        public static final int CONSTRUCTOR = 2130576356;

        public AcceptTermsOfService() {
        }

        public AcceptTermsOfService(String var1) {
            this.termsOfServiceId = var1;
        }

        public int getConstructor() {
            return 2130576356;
        }
    }

    public static class AcceptCall extends Function<Ok> {
        public int callId;
        public CallProtocol protocol;
        public static final int CONSTRUCTOR = -646618416;

        public AcceptCall() {
        }

        public AcceptCall(int var1, CallProtocol var2) {
            this.callId = var1;
            this.protocol = var2;
        }

        public int getConstructor() {
            return -646618416;
        }
    }

    public static class WebPageInstantView extends Object {
        public PageBlock[] pageBlocks;
        public int viewCount;
        public int version;
        public boolean isRtl;
        public boolean isFull;
        public InternalLinkType feedbackLink;
        public static final int CONSTRUCTOR = 778202453;

        public WebPageInstantView() {
        }

        public WebPageInstantView(PageBlock[] var1, int var2, int var3, boolean var4, boolean var5, InternalLinkType var6) {
            this.pageBlocks = var1;
            this.viewCount = var2;
            this.version = var3;
            this.isRtl = var4;
            this.isFull = var5;
            this.feedbackLink = var6;
        }

        public int getConstructor() {
            return 778202453;
        }
    }

    public static class WebPage extends Object {
        public String url;
        public String displayUrl;
        public String type;
        public String siteName;
        public String title;
        public FormattedText description;
        public Photo photo;
        public String embedUrl;
        public String embedType;
        public int embedWidth;
        public int embedHeight;
        public int duration;
        public String author;
        public Animation animation;
        public Audio audio;
        public Document document;
        public Sticker sticker;
        public Video video;
        public VideoNote videoNote;
        public VoiceNote voiceNote;
        public int instantViewVersion;
        public static final int CONSTRUCTOR = -577333714;

        public WebPage() {
        }

        public WebPage(String var1, String var2, String var3, String var4, String var5, FormattedText var6, Photo var7, String var8, String var9, int var10, int var11, int var12, String var13, Animation var14, Audio var15, Document var16, Sticker var17, Video var18, VideoNote var19, VoiceNote var20, int var21) {
            this.url = var1;
            this.displayUrl = var2;
            this.type = var3;
            this.siteName = var4;
            this.title = var5;
            this.description = var6;
            this.photo = var7;
            this.embedUrl = var8;
            this.embedType = var9;
            this.embedWidth = var10;
            this.embedHeight = var11;
            this.duration = var12;
            this.author = var13;
            this.animation = var14;
            this.audio = var15;
            this.document = var16;
            this.sticker = var17;
            this.video = var18;
            this.videoNote = var19;
            this.voiceNote = var20;
            this.instantViewVersion = var21;
        }

        public int getConstructor() {
            return -577333714;
        }
    }

    public static class WebAppInfo extends Object {
        public long launchId;
        public String url;
        public static final int CONSTRUCTOR = 788378344;

        public WebAppInfo() {
        }

        public WebAppInfo(long var1, String var3) {
            this.launchId = var1;
            this.url = var3;
        }

        public int getConstructor() {
            return 788378344;
        }
    }

    public static class VoiceNote extends Object {
        public int duration;
        public byte[] waveform;
        public String mimeType;
        public SpeechRecognitionResult speechRecognitionResult;
        public File voice;
        public static final int CONSTRUCTOR = -1175302923;

        public VoiceNote() {
        }

        public VoiceNote(int var1, byte[] var2, String var3, SpeechRecognitionResult var4, File var5) {
            this.duration = var1;
            this.waveform = var2;
            this.mimeType = var3;
            this.speechRecognitionResult = var4;
            this.voice = var5;
        }

        public int getConstructor() {
            return -1175302923;
        }
    }

    public static class VideoNote extends Object {
        public int duration;
        public int length;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File video;
        public static final int CONSTRUCTOR = -71734726;

        public VideoNote() {
        }

        public VideoNote(int var1, int var2, Minithumbnail var3, Thumbnail var4, File var5) {
            this.duration = var1;
            this.length = var2;
            this.minithumbnail = var3;
            this.thumbnail = var4;
            this.video = var5;
        }

        public int getConstructor() {
            return -71734726;
        }
    }

    public static class VideoChat extends Object {
        public int groupCallId;
        public boolean hasParticipants;
        public MessageSender defaultParticipantId;
        public static final int CONSTRUCTOR = -1374319320;

        public VideoChat() {
        }

        public VideoChat(int var1, boolean var2, MessageSender var3) {
            this.groupCallId = var1;
            this.hasParticipants = var2;
            this.defaultParticipantId = var3;
        }

        public int getConstructor() {
            return -1374319320;
        }
    }

    public static class Video extends Object {
        public int duration;
        public int width;
        public int height;
        public String fileName;
        public String mimeType;
        public boolean hasStickers;
        public boolean supportsStreaming;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File video;
        public static final int CONSTRUCTOR = 832856268;

        public Video() {
        }

        public Video(int var1, int var2, int var3, String var4, String var5, boolean var6, boolean var7, Minithumbnail var8, Thumbnail var9, File var10) {
            this.duration = var1;
            this.width = var2;
            this.height = var3;
            this.fileName = var4;
            this.mimeType = var5;
            this.hasStickers = var6;
            this.supportsStreaming = var7;
            this.minithumbnail = var8;
            this.thumbnail = var9;
            this.video = var10;
        }

        public int getConstructor() {
            return 832856268;
        }
    }

    public static class Venue extends Object {
        public Location location;
        public String title;
        public String address;
        public String provider;
        public String id;
        public String type;
        public static final int CONSTRUCTOR = 1070406393;

        public Venue() {
        }

        public Venue(Location var1, String var2, String var3, String var4, String var5, String var6) {
            this.location = var1;
            this.title = var2;
            this.address = var3;
            this.provider = var4;
            this.id = var5;
            this.type = var6;
        }

        public int getConstructor() {
            return 1070406393;
        }
    }

    public static class VectorPathCommandCubicBezierCurve extends VectorPathCommand {
        public Point startControlPoint;
        public Point endControlPoint;
        public Point endPoint;
        public static final int CONSTRUCTOR = 1229733434;

        public VectorPathCommandCubicBezierCurve() {
        }

        public VectorPathCommandCubicBezierCurve(Point var1, Point var2, Point var3) {
            this.startControlPoint = var1;
            this.endControlPoint = var2;
            this.endPoint = var3;
        }

        public int getConstructor() {
            return 1229733434;
        }
    }

    public static class VectorPathCommandLine extends VectorPathCommand {
        public Point endPoint;
        public static final int CONSTRUCTOR = -614056822;

        public VectorPathCommandLine() {
        }

        public VectorPathCommandLine(Point var1) {
            this.endPoint = var1;
        }

        public int getConstructor() {
            return -614056822;
        }
    }

    public abstract static class VectorPathCommand extends Object {
        public VectorPathCommand() {
        }
    }

    public static class ValidatedOrderInfo extends Object {
        public String orderInfoId;
        public ShippingOption[] shippingOptions;
        public static final int CONSTRUCTOR = 1511451484;

        public ValidatedOrderInfo() {
        }

        public ValidatedOrderInfo(String var1, ShippingOption[] var2) {
            this.orderInfoId = var1;
            this.shippingOptions = var2;
        }

        public int getConstructor() {
            return 1511451484;
        }
    }

    public static class Users extends Object {
        public int totalCount;
        public long[] userIds;
        public static final int CONSTRUCTOR = 171203420;

        public Users() {
        }

        public Users(int var1, long[] var2) {
            this.totalCount = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return 171203420;
        }
    }

    public static class UserTypeUnknown extends UserType {
        public static final int CONSTRUCTOR = -724541123;

        public UserTypeUnknown() {
        }

        public int getConstructor() {
            return -724541123;
        }
    }

    public static class UserTypeBot extends UserType {
        public boolean canJoinGroups;
        public boolean canReadAllGroupMessages;
        public boolean isInline;
        public String inlineQueryPlaceholder;
        public boolean needLocation;
        public boolean canBeAddedToAttachmentMenu;
        public static final int CONSTRUCTOR = -970625144;

        public UserTypeBot() {
        }

        public UserTypeBot(boolean var1, boolean var2, boolean var3, String var4, boolean var5, boolean var6) {
            this.canJoinGroups = var1;
            this.canReadAllGroupMessages = var2;
            this.isInline = var3;
            this.inlineQueryPlaceholder = var4;
            this.needLocation = var5;
            this.canBeAddedToAttachmentMenu = var6;
        }

        public int getConstructor() {
            return -970625144;
        }
    }

    public static class UserTypeDeleted extends UserType {
        public static final int CONSTRUCTOR = -1807729372;

        public UserTypeDeleted() {
        }

        public int getConstructor() {
            return -1807729372;
        }
    }

    public static class UserTypeRegular extends UserType {
        public static final int CONSTRUCTOR = -598644325;

        public UserTypeRegular() {
        }

        public int getConstructor() {
            return -598644325;
        }
    }

    public abstract static class UserType extends Object {
        public UserType() {
        }
    }

    public static class UserSupportInfo extends Object {
        public FormattedText message;
        public String author;
        public int date;
        public static final int CONSTRUCTOR = -1257366487;

        public UserSupportInfo() {
        }

        public UserSupportInfo(FormattedText var1, String var2, int var3) {
            this.message = var1;
            this.author = var2;
            this.date = var3;
        }

        public int getConstructor() {
            return -1257366487;
        }
    }

    public static class UserStatusLastMonth extends UserStatus {
        public static final int CONSTRUCTOR = 2011940674;

        public UserStatusLastMonth() {
        }

        public int getConstructor() {
            return 2011940674;
        }
    }

    public static class UserStatusLastWeek extends UserStatus {
        public static final int CONSTRUCTOR = 129960444;

        public UserStatusLastWeek() {
        }

        public int getConstructor() {
            return 129960444;
        }
    }

    public static class UserStatusRecently extends UserStatus {
        public static final int CONSTRUCTOR = -496024847;

        public UserStatusRecently() {
        }

        public int getConstructor() {
            return -496024847;
        }
    }

    public static class UserStatusOffline extends UserStatus {
        public int wasOnline;
        public static final int CONSTRUCTOR = -759984891;

        public UserStatusOffline() {
        }

        public UserStatusOffline(int var1) {
            this.wasOnline = var1;
        }

        public int getConstructor() {
            return -759984891;
        }
    }

    public static class UserStatusOnline extends UserStatus {
        public int expires;
        public static final int CONSTRUCTOR = -1529460876;

        public UserStatusOnline() {
        }

        public UserStatusOnline(int var1) {
            this.expires = var1;
        }

        public int getConstructor() {
            return -1529460876;
        }
    }

    public static class UserStatusEmpty extends UserStatus {
        public static final int CONSTRUCTOR = 164646985;

        public UserStatusEmpty() {
        }

        public int getConstructor() {
            return 164646985;
        }
    }

    public abstract static class UserStatus extends Object {
        public UserStatus() {
        }
    }

    public static class UserPrivacySettingRules extends Object {
        public UserPrivacySettingRule[] rules;
        public static final int CONSTRUCTOR = 322477541;

        public UserPrivacySettingRules() {
        }

        public UserPrivacySettingRules(UserPrivacySettingRule[] var1) {
            this.rules = var1;
        }

        public int getConstructor() {
            return 322477541;
        }
    }

    public static class UserPrivacySettingRuleRestrictChatMembers extends UserPrivacySettingRule {
        public long[] chatIds;
        public static final int CONSTRUCTOR = 392530897;

        public UserPrivacySettingRuleRestrictChatMembers() {
        }

        public UserPrivacySettingRuleRestrictChatMembers(long[] var1) {
            this.chatIds = var1;
        }

        public int getConstructor() {
            return 392530897;
        }
    }

    public static class UserPrivacySettingRuleRestrictUsers extends UserPrivacySettingRule {
        public long[] userIds;
        public static final int CONSTRUCTOR = 622796522;

        public UserPrivacySettingRuleRestrictUsers() {
        }

        public UserPrivacySettingRuleRestrictUsers(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return 622796522;
        }
    }

    public static class UserPrivacySettingRuleRestrictContacts extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = 1008389378;

        public UserPrivacySettingRuleRestrictContacts() {
        }

        public int getConstructor() {
            return 1008389378;
        }
    }

    public static class UserPrivacySettingRuleRestrictAll extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1406495408;

        public UserPrivacySettingRuleRestrictAll() {
        }

        public int getConstructor() {
            return -1406495408;
        }
    }

    public static class UserPrivacySettingRuleAllowChatMembers extends UserPrivacySettingRule {
        public long[] chatIds;
        public static final int CONSTRUCTOR = -2048749863;

        public UserPrivacySettingRuleAllowChatMembers() {
        }

        public UserPrivacySettingRuleAllowChatMembers(long[] var1) {
            this.chatIds = var1;
        }

        public int getConstructor() {
            return -2048749863;
        }
    }

    public static class UserPrivacySettingRuleAllowUsers extends UserPrivacySettingRule {
        public long[] userIds;
        public static final int CONSTRUCTOR = 1110988334;

        public UserPrivacySettingRuleAllowUsers() {
        }

        public UserPrivacySettingRuleAllowUsers(long[] var1) {
            this.userIds = var1;
        }

        public int getConstructor() {
            return 1110988334;
        }
    }

    public static class UserPrivacySettingRuleAllowContacts extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1892733680;

        public UserPrivacySettingRuleAllowContacts() {
        }

        public int getConstructor() {
            return -1892733680;
        }
    }

    public static class UserPrivacySettingRuleAllowAll extends UserPrivacySettingRule {
        public static final int CONSTRUCTOR = -1967186881;

        public UserPrivacySettingRuleAllowAll() {
        }

        public int getConstructor() {
            return -1967186881;
        }
    }

    public abstract static class UserPrivacySettingRule extends Object {
        public UserPrivacySettingRule() {
        }
    }

    public static class UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 338112060;

        public UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages() {
        }

        public int getConstructor() {
            return 338112060;
        }
    }

    public static class UserPrivacySettingAllowFindingByPhoneNumber extends UserPrivacySetting {
        public static final int CONSTRUCTOR = -1846645423;

        public UserPrivacySettingAllowFindingByPhoneNumber() {
        }

        public int getConstructor() {
            return -1846645423;
        }
    }

    public static class UserPrivacySettingAllowPeerToPeerCalls extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 352500032;

        public UserPrivacySettingAllowPeerToPeerCalls() {
        }

        public int getConstructor() {
            return 352500032;
        }
    }

    public static class UserPrivacySettingAllowCalls extends UserPrivacySetting {
        public static final int CONSTRUCTOR = -906967291;

        public UserPrivacySettingAllowCalls() {
        }

        public int getConstructor() {
            return -906967291;
        }
    }

    public static class UserPrivacySettingAllowChatInvites extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 1271668007;

        public UserPrivacySettingAllowChatInvites() {
        }

        public int getConstructor() {
            return 1271668007;
        }
    }

    public static class UserPrivacySettingShowPhoneNumber extends UserPrivacySetting {
        public static final int CONSTRUCTOR = -791567831;

        public UserPrivacySettingShowPhoneNumber() {
        }

        public int getConstructor() {
            return -791567831;
        }
    }

    public static class UserPrivacySettingShowLinkInForwardedMessages extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 592688870;

        public UserPrivacySettingShowLinkInForwardedMessages() {
        }

        public int getConstructor() {
            return 592688870;
        }
    }

    public static class UserPrivacySettingShowProfilePhoto extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 1408485877;

        public UserPrivacySettingShowProfilePhoto() {
        }

        public int getConstructor() {
            return 1408485877;
        }
    }

    public static class UserPrivacySettingShowStatus extends UserPrivacySetting {
        public static final int CONSTRUCTOR = 1862829310;

        public UserPrivacySettingShowStatus() {
        }

        public int getConstructor() {
            return 1862829310;
        }
    }

    public abstract static class UserPrivacySetting extends Object {
        public UserPrivacySetting() {
        }
    }

    public static class UserFullInfo extends Object {
        public ChatPhoto photo;
        public boolean isBlocked;
        public boolean canBeCalled;
        public boolean supportsVideoCalls;
        public boolean hasPrivateCalls;
        public boolean hasPrivateForwards;
        public boolean hasRestrictedVoiceAndVideoNoteMessages;
        public boolean needPhoneNumberPrivacyException;
        public FormattedText bio;
        public PremiumPaymentOption[] premiumGiftOptions;
        public int groupInCommonCount;
        public BotInfo botInfo;
        public static final int CONSTRUCTOR = -272527755;

        public UserFullInfo() {
        }

        public UserFullInfo(ChatPhoto var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, FormattedText var9, PremiumPaymentOption[] var10, int var11, BotInfo var12) {
            this.photo = var1;
            this.isBlocked = var2;
            this.canBeCalled = var3;
            this.supportsVideoCalls = var4;
            this.hasPrivateCalls = var5;
            this.hasPrivateForwards = var6;
            this.hasRestrictedVoiceAndVideoNoteMessages = var7;
            this.needPhoneNumberPrivacyException = var8;
            this.bio = var9;
            this.premiumGiftOptions = var10;
            this.groupInCommonCount = var11;
            this.botInfo = var12;
        }

        public int getConstructor() {
            return -272527755;
        }
    }

    public static class User extends Object {
        public long id;
        public String firstName;
        public String lastName;
        public String username;
        public String phoneNumber;
        public UserStatus status;
        public ProfilePhoto profilePhoto;
        public EmojiStatus emojiStatus;
        public boolean isContact;
        public boolean isMutualContact;
        public boolean isVerified;
        public boolean isPremium;
        public boolean isSupport;
        public String restrictionReason;
        public boolean isScam;
        public boolean isFake;
        public boolean haveAccess;
        public UserType type;
        public String languageCode;
        public boolean addedToAttachmentMenu;
        public static final int CONSTRUCTOR = 136562702;

        public User() {
        }

        public User(long var1, String var3, String var4, String var5, String var6, UserStatus var7, ProfilePhoto var8, EmojiStatus var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, String var15, boolean var16, boolean var17, boolean var18, UserType var19, String var20, boolean var21) {
            this.id = var1;
            this.firstName = var3;
            this.lastName = var4;
            this.username = var5;
            this.phoneNumber = var6;
            this.status = var7;
            this.profilePhoto = var8;
            this.emojiStatus = var9;
            this.isContact = var10;
            this.isMutualContact = var11;
            this.isVerified = var12;
            this.isPremium = var13;
            this.isSupport = var14;
            this.restrictionReason = var15;
            this.isScam = var16;
            this.isFake = var17;
            this.haveAccess = var18;
            this.type = var19;
            this.languageCode = var20;
            this.addedToAttachmentMenu = var21;
        }

        public int getConstructor() {
            return 136562702;
        }
    }

    public static class Updates extends Object {
        public Update[] updates;
        public static final int CONSTRUCTOR = 475842347;

        public Updates() {
        }

        public Updates(Update[] var1) {
            this.updates = var1;
        }

        public int getConstructor() {
            return 475842347;
        }
    }

    public static class UpdateNewChatJoinRequest extends Update {
        public long chatId;
        public ChatJoinRequest request;
        public ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = 175285905;

        public UpdateNewChatJoinRequest() {
        }

        public UpdateNewChatJoinRequest(long var1, ChatJoinRequest var3, ChatInviteLink var4) {
            this.chatId = var1;
            this.request = var3;
            this.inviteLink = var4;
        }

        public int getConstructor() {
            return 175285905;
        }
    }

    public static class UpdateChatMember extends Update {
        public long chatId;
        public long actorUserId;
        public int date;
        public ChatInviteLink inviteLink;
        public ChatMember oldChatMember;
        public ChatMember newChatMember;
        public static final int CONSTRUCTOR = -2027989165;

        public UpdateChatMember() {
        }

        public UpdateChatMember(long var1, long var3, int var5, ChatInviteLink var6, ChatMember var7, ChatMember var8) {
            this.chatId = var1;
            this.actorUserId = var3;
            this.date = var5;
            this.inviteLink = var6;
            this.oldChatMember = var7;
            this.newChatMember = var8;
        }

        public int getConstructor() {
            return -2027989165;
        }
    }

    public static class UpdatePollAnswer extends Update {
        public long pollId;
        public long userId;
        public int[] optionIds;
        public static final int CONSTRUCTOR = -1209100651;

        public UpdatePollAnswer() {
        }

        public UpdatePollAnswer(long var1, long var3, int[] var5) {
            this.pollId = var1;
            this.userId = var3;
            this.optionIds = var5;
        }

        public int getConstructor() {
            return -1209100651;
        }
    }

    public static class UpdatePoll extends Update {
        public Poll poll;
        public static final int CONSTRUCTOR = -1771342902;

        public UpdatePoll() {
        }

        public UpdatePoll(Poll var1) {
            this.poll = var1;
        }

        public int getConstructor() {
            return -1771342902;
        }
    }

    public static class UpdateNewCustomQuery extends Update {
        public long id;
        public String data;
        public int timeout;
        public static final int CONSTRUCTOR = -687670874;

        public UpdateNewCustomQuery() {
        }

        public UpdateNewCustomQuery(long var1, String var3, int var4) {
            this.id = var1;
            this.data = var3;
            this.timeout = var4;
        }

        public int getConstructor() {
            return -687670874;
        }
    }

    public static class UpdateNewCustomEvent extends Update {
        public String event;
        public static final int CONSTRUCTOR = 1994222092;

        public UpdateNewCustomEvent() {
        }

        public UpdateNewCustomEvent(String var1) {
            this.event = var1;
        }

        public int getConstructor() {
            return 1994222092;
        }
    }

    public static class UpdateNewPreCheckoutQuery extends Update {
        public long id;
        public long senderUserId;
        public String currency;
        public long totalAmount;
        public byte[] invoicePayload;
        public String shippingOptionId;
        public OrderInfo orderInfo;
        public static final int CONSTRUCTOR = 708342217;

        public UpdateNewPreCheckoutQuery() {
        }

        public UpdateNewPreCheckoutQuery(long var1, long var3, String var5, long var6, byte[] var8, String var9, OrderInfo var10) {
            this.id = var1;
            this.senderUserId = var3;
            this.currency = var5;
            this.totalAmount = var6;
            this.invoicePayload = var8;
            this.shippingOptionId = var9;
            this.orderInfo = var10;
        }

        public int getConstructor() {
            return 708342217;
        }
    }

    public static class UpdateNewShippingQuery extends Update {
        public long id;
        public long senderUserId;
        public String invoicePayload;
        public Address shippingAddress;
        public static final int CONSTRUCTOR = 693651058;

        public UpdateNewShippingQuery() {
        }

        public UpdateNewShippingQuery(long var1, long var3, String var5, Address var6) {
            this.id = var1;
            this.senderUserId = var3;
            this.invoicePayload = var5;
            this.shippingAddress = var6;
        }

        public int getConstructor() {
            return 693651058;
        }
    }

    public static class UpdateNewInlineCallbackQuery extends Update {
        public long id;
        public long senderUserId;
        public String inlineMessageId;
        public long chatInstance;
        public CallbackQueryPayload payload;
        public static final int CONSTRUCTOR = -319212358;

        public UpdateNewInlineCallbackQuery() {
        }

        public UpdateNewInlineCallbackQuery(long var1, long var3, String var5, long var6, CallbackQueryPayload var8) {
            this.id = var1;
            this.senderUserId = var3;
            this.inlineMessageId = var5;
            this.chatInstance = var6;
            this.payload = var8;
        }

        public int getConstructor() {
            return -319212358;
        }
    }

    public static class UpdateNewCallbackQuery extends Update {
        public long id;
        public long senderUserId;
        public long chatId;
        public long messageId;
        public long chatInstance;
        public CallbackQueryPayload payload;
        public static final int CONSTRUCTOR = -1989881762;

        public UpdateNewCallbackQuery() {
        }

        public UpdateNewCallbackQuery(long var1, long var3, long var5, long var7, long var9, CallbackQueryPayload var11) {
            this.id = var1;
            this.senderUserId = var3;
            this.chatId = var5;
            this.messageId = var7;
            this.chatInstance = var9;
            this.payload = var11;
        }

        public int getConstructor() {
            return -1989881762;
        }
    }

    public static class UpdateNewChosenInlineResult extends Update {
        public long senderUserId;
        public Location userLocation;
        public String query;
        public String resultId;
        public String inlineMessageId;
        public static final int CONSTRUCTOR = -884191395;

        public UpdateNewChosenInlineResult() {
        }

        public UpdateNewChosenInlineResult(long var1, Location var3, String var4, String var5, String var6) {
            this.senderUserId = var1;
            this.userLocation = var3;
            this.query = var4;
            this.resultId = var5;
            this.inlineMessageId = var6;
        }

        public int getConstructor() {
            return -884191395;
        }
    }

    public static class UpdateNewInlineQuery extends Update {
        public long id;
        public long senderUserId;
        public Location userLocation;
        public ChatType chatType;
        public String query;
        public String offset;
        public static final int CONSTRUCTOR = 1903279924;

        public UpdateNewInlineQuery() {
        }

        public UpdateNewInlineQuery(long var1, long var3, Location var5, ChatType var6, String var7, String var8) {
            this.id = var1;
            this.senderUserId = var3;
            this.userLocation = var5;
            this.chatType = var6;
            this.query = var7;
            this.offset = var8;
        }

        public int getConstructor() {
            return 1903279924;
        }
    }

    public static class UpdateSuggestedActions extends Update {
        public SuggestedAction[] addedActions;
        public SuggestedAction[] removedActions;
        public static final int CONSTRUCTOR = 1459452346;

        public UpdateSuggestedActions() {
        }

        public UpdateSuggestedActions(SuggestedAction[] var1, SuggestedAction[] var2) {
            this.addedActions = var1;
            this.removedActions = var2;
        }

        public int getConstructor() {
            return 1459452346;
        }
    }

    public static class UpdateAnimationSearchParameters extends Update {
        public String provider;
        public String[] emojis;
        public static final int CONSTRUCTOR = -1144983202;

        public UpdateAnimationSearchParameters() {
        }

        public UpdateAnimationSearchParameters(String var1, String[] var2) {
            this.provider = var1;
            this.emojis = var2;
        }

        public int getConstructor() {
            return -1144983202;
        }
    }

    public static class UpdateAnimatedEmojiMessageClicked extends Update {
        public long chatId;
        public long messageId;
        public Sticker sticker;
        public static final int CONSTRUCTOR = -1558809595;

        public UpdateAnimatedEmojiMessageClicked() {
        }

        public UpdateAnimatedEmojiMessageClicked(long var1, long var3, Sticker var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.sticker = var5;
        }

        public int getConstructor() {
            return -1558809595;
        }
    }

    public static class UpdateDiceEmojis extends Update {
        public String[] emojis;
        public static final int CONSTRUCTOR = -1069066940;

        public UpdateDiceEmojis() {
        }

        public UpdateDiceEmojis(String[] var1) {
            this.emojis = var1;
        }

        public int getConstructor() {
            return -1069066940;
        }
    }

    public static class UpdateDefaultReactionType extends Update {
        public ReactionType reactionType;
        public static final int CONSTRUCTOR = 1264668933;

        public UpdateDefaultReactionType() {
        }

        public UpdateDefaultReactionType(ReactionType var1) {
            this.reactionType = var1;
        }

        public int getConstructor() {
            return 1264668933;
        }
    }

    public static class UpdateActiveEmojiReactions extends Update {
        public String[] emojis;
        public static final int CONSTRUCTOR = 77556818;

        public UpdateActiveEmojiReactions() {
        }

        public UpdateActiveEmojiReactions(String[] var1) {
            this.emojis = var1;
        }

        public int getConstructor() {
            return 77556818;
        }
    }

    public static class UpdateWebAppMessageSent extends Update {
        public long webAppLaunchId;
        public static final int CONSTRUCTOR = 1480790569;

        public UpdateWebAppMessageSent() {
        }

        public UpdateWebAppMessageSent(long var1) {
            this.webAppLaunchId = var1;
        }

        public int getConstructor() {
            return 1480790569;
        }
    }

    public static class UpdateAttachmentMenuBots extends Update {
        public AttachmentMenuBot[] bots;
        public static final int CONSTRUCTOR = 291369922;

        public UpdateAttachmentMenuBots() {
        }

        public UpdateAttachmentMenuBots(AttachmentMenuBot[] var1) {
            this.bots = var1;
        }

        public int getConstructor() {
            return 291369922;
        }
    }

    public static class UpdateUsersNearby extends Update {
        public ChatNearby[] usersNearby;
        public static final int CONSTRUCTOR = -1517109163;

        public UpdateUsersNearby() {
        }

        public UpdateUsersNearby(ChatNearby[] var1) {
            this.usersNearby = var1;
        }

        public int getConstructor() {
            return -1517109163;
        }
    }

    public static class UpdateTermsOfService extends Update {
        public String termsOfServiceId;
        public TermsOfService termsOfService;
        public static final int CONSTRUCTOR = -1304640162;

        public UpdateTermsOfService() {
        }

        public UpdateTermsOfService(String var1, TermsOfService var2) {
            this.termsOfServiceId = var1;
            this.termsOfService = var2;
        }

        public int getConstructor() {
            return -1304640162;
        }
    }

    public static class UpdateConnectionState extends Update {
        public ConnectionState state;
        public static final int CONSTRUCTOR = 1469292078;

        public UpdateConnectionState() {
        }

        public UpdateConnectionState(ConnectionState var1) {
            this.state = var1;
        }

        public int getConstructor() {
            return 1469292078;
        }
    }

    public static class UpdateLanguagePackStrings extends Update {
        public String localizationTarget;
        public String languagePackId;
        public LanguagePackString[] strings;
        public static final int CONSTRUCTOR = -1056319886;

        public UpdateLanguagePackStrings() {
        }

        public UpdateLanguagePackStrings(String var1, String var2, LanguagePackString[] var3) {
            this.localizationTarget = var1;
            this.languagePackId = var2;
            this.strings = var3;
        }

        public int getConstructor() {
            return -1056319886;
        }
    }

    public static class UpdateChatThemes extends Update {
        public ChatTheme[] chatThemes;
        public static final int CONSTRUCTOR = -1588098376;

        public UpdateChatThemes() {
        }

        public UpdateChatThemes(ChatTheme[] var1) {
            this.chatThemes = var1;
        }

        public int getConstructor() {
            return -1588098376;
        }
    }

    public static class UpdateSelectedBackground extends Update {
        public boolean forDarkTheme;
        public Background background;
        public static final int CONSTRUCTOR = -1715658659;

        public UpdateSelectedBackground() {
        }

        public UpdateSelectedBackground(boolean var1, Background var2) {
            this.forDarkTheme = var1;
            this.background = var2;
        }

        public int getConstructor() {
            return -1715658659;
        }
    }

    public static class UpdateSavedNotificationSounds extends Update {
        public long[] notificationSoundIds;
        public static final int CONSTRUCTOR = 1052725698;

        public UpdateSavedNotificationSounds() {
        }

        public UpdateSavedNotificationSounds(long[] var1) {
            this.notificationSoundIds = var1;
        }

        public int getConstructor() {
            return 1052725698;
        }
    }

    public static class UpdateSavedAnimations extends Update {
        public int[] animationIds;
        public static final int CONSTRUCTOR = 65563814;

        public UpdateSavedAnimations() {
        }

        public UpdateSavedAnimations(int[] var1) {
            this.animationIds = var1;
        }

        public int getConstructor() {
            return 65563814;
        }
    }

    public static class UpdateFavoriteStickers extends Update {
        public int[] stickerIds;
        public static final int CONSTRUCTOR = 1662240999;

        public UpdateFavoriteStickers() {
        }

        public UpdateFavoriteStickers(int[] var1) {
            this.stickerIds = var1;
        }

        public int getConstructor() {
            return 1662240999;
        }
    }

    public static class UpdateRecentStickers extends Update {
        public boolean isAttached;
        public int[] stickerIds;
        public static final int CONSTRUCTOR = 1906403540;

        public UpdateRecentStickers() {
        }

        public UpdateRecentStickers(boolean var1, int[] var2) {
            this.isAttached = var1;
            this.stickerIds = var2;
        }

        public int getConstructor() {
            return 1906403540;
        }
    }

    public static class UpdateTrendingStickerSets extends Update {
        public StickerType stickerType;
        public TrendingStickerSets stickerSets;
        public static final int CONSTRUCTOR = 1266307239;

        public UpdateTrendingStickerSets() {
        }

        public UpdateTrendingStickerSets(StickerType var1, TrendingStickerSets var2) {
            this.stickerType = var1;
            this.stickerSets = var2;
        }

        public int getConstructor() {
            return 1266307239;
        }
    }

    public static class UpdateInstalledStickerSets extends Update {
        public StickerType stickerType;
        public long[] stickerSetIds;
        public static final int CONSTRUCTOR = -1735084182;

        public UpdateInstalledStickerSets() {
        }

        public UpdateInstalledStickerSets(StickerType var1, long[] var2) {
            this.stickerType = var1;
            this.stickerSetIds = var2;
        }

        public int getConstructor() {
            return -1735084182;
        }
    }

    public static class UpdateStickerSet extends Update {
        public StickerSet stickerSet;
        public static final int CONSTRUCTOR = 1879268812;

        public UpdateStickerSet() {
        }

        public UpdateStickerSet(StickerSet var1) {
            this.stickerSet = var1;
        }

        public int getConstructor() {
            return 1879268812;
        }
    }

    public static class UpdateOption extends Update {
        public String name;
        public OptionValue value;
        public static final int CONSTRUCTOR = 900822020;

        public UpdateOption() {
        }

        public UpdateOption(String var1, OptionValue var2) {
            this.name = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return 900822020;
        }
    }

    public static class UpdateUnreadChatCount extends Update {
        public ChatList chatList;
        public int totalCount;
        public int unreadCount;
        public int unreadUnmutedCount;
        public int markedAsUnreadCount;
        public int markedAsUnreadUnmutedCount;
        public static final int CONSTRUCTOR = 1994494530;

        public UpdateUnreadChatCount() {
        }

        public UpdateUnreadChatCount(ChatList var1, int var2, int var3, int var4, int var5, int var6) {
            this.chatList = var1;
            this.totalCount = var2;
            this.unreadCount = var3;
            this.unreadUnmutedCount = var4;
            this.markedAsUnreadCount = var5;
            this.markedAsUnreadUnmutedCount = var6;
        }

        public int getConstructor() {
            return 1994494530;
        }
    }

    public static class UpdateUnreadMessageCount extends Update {
        public ChatList chatList;
        public int unreadCount;
        public int unreadUnmutedCount;
        public static final int CONSTRUCTOR = 78987721;

        public UpdateUnreadMessageCount() {
        }

        public UpdateUnreadMessageCount(ChatList var1, int var2, int var3) {
            this.chatList = var1;
            this.unreadCount = var2;
            this.unreadUnmutedCount = var3;
        }

        public int getConstructor() {
            return 78987721;
        }
    }

    public static class UpdateUserPrivacySettingRules extends Update {
        public UserPrivacySetting setting;
        public UserPrivacySettingRules rules;
        public static final int CONSTRUCTOR = -912960778;

        public UpdateUserPrivacySettingRules() {
        }

        public UpdateUserPrivacySettingRules(UserPrivacySetting var1, UserPrivacySettingRules var2) {
            this.setting = var1;
            this.rules = var2;
        }

        public int getConstructor() {
            return -912960778;
        }
    }

    public static class UpdateNewCallSignalingData extends Update {
        public int callId;
        public byte[] data;
        public static final int CONSTRUCTOR = 583634317;

        public UpdateNewCallSignalingData() {
        }

        public UpdateNewCallSignalingData(int var1, byte[] var2) {
            this.callId = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return 583634317;
        }
    }

    public static class UpdateGroupCallParticipant extends Update {
        public int groupCallId;
        public GroupCallParticipant participant;
        public static final int CONSTRUCTOR = -803128071;

        public UpdateGroupCallParticipant() {
        }

        public UpdateGroupCallParticipant(int var1, GroupCallParticipant var2) {
            this.groupCallId = var1;
            this.participant = var2;
        }

        public int getConstructor() {
            return -803128071;
        }
    }

    public static class UpdateGroupCall extends Update {
        public GroupCall groupCall;
        public static final int CONSTRUCTOR = 808603136;

        public UpdateGroupCall() {
        }

        public UpdateGroupCall(GroupCall var1) {
            this.groupCall = var1;
        }

        public int getConstructor() {
            return 808603136;
        }
    }

    public static class UpdateCall extends Update {
        public Call call;
        public static final int CONSTRUCTOR = 1337184477;

        public UpdateCall() {
        }

        public UpdateCall(Call var1) {
            this.call = var1;
        }

        public int getConstructor() {
            return 1337184477;
        }
    }

    public static class UpdateFileRemovedFromDownloads extends Update {
        public int fileId;
        public DownloadedFileCounts counts;
        public static final int CONSTRUCTOR = 1853625576;

        public UpdateFileRemovedFromDownloads() {
        }

        public UpdateFileRemovedFromDownloads(int var1, DownloadedFileCounts var2) {
            this.fileId = var1;
            this.counts = var2;
        }

        public int getConstructor() {
            return 1853625576;
        }
    }

    public static class UpdateFileDownload extends Update {
        public int fileId;
        public int completeDate;
        public boolean isPaused;
        public DownloadedFileCounts counts;
        public static final int CONSTRUCTOR = 875529162;

        public UpdateFileDownload() {
        }

        public UpdateFileDownload(int var1, int var2, boolean var3, DownloadedFileCounts var4) {
            this.fileId = var1;
            this.completeDate = var2;
            this.isPaused = var3;
            this.counts = var4;
        }

        public int getConstructor() {
            return 875529162;
        }
    }

    public static class UpdateFileAddedToDownloads extends Update {
        public FileDownload fileDownload;
        public DownloadedFileCounts counts;
        public static final int CONSTRUCTOR = 1609929242;

        public UpdateFileAddedToDownloads() {
        }

        public UpdateFileAddedToDownloads(FileDownload var1, DownloadedFileCounts var2) {
            this.fileDownload = var1;
            this.counts = var2;
        }

        public int getConstructor() {
            return 1609929242;
        }
    }

    public static class UpdateFileDownloads extends Update {
        public long totalSize;
        public int totalCount;
        public long downloadedSize;
        public static final int CONSTRUCTOR = -389213497;

        public UpdateFileDownloads() {
        }

        public UpdateFileDownloads(long var1, int var3, long var4) {
            this.totalSize = var1;
            this.totalCount = var3;
            this.downloadedSize = var4;
        }

        public int getConstructor() {
            return -389213497;
        }
    }

    public static class UpdateFileGenerationStop extends Update {
        public long generationId;
        public static final int CONSTRUCTOR = -1894449685;

        public UpdateFileGenerationStop() {
        }

        public UpdateFileGenerationStop(long var1) {
            this.generationId = var1;
        }

        public int getConstructor() {
            return -1894449685;
        }
    }

    public static class UpdateFileGenerationStart extends Update {
        public long generationId;
        public String originalPath;
        public String destinationPath;
        public String conversion;
        public static final int CONSTRUCTOR = 216817388;

        public UpdateFileGenerationStart() {
        }

        public UpdateFileGenerationStart(long var1, String var3, String var4, String var5) {
            this.generationId = var1;
            this.originalPath = var3;
            this.destinationPath = var4;
            this.conversion = var5;
        }

        public int getConstructor() {
            return 216817388;
        }
    }

    public static class UpdateFile extends Update {
        public File file;
        public static final int CONSTRUCTOR = 114132831;

        public UpdateFile() {
        }

        public UpdateFile(File var1) {
            this.file = var1;
        }

        public int getConstructor() {
            return 114132831;
        }
    }

    public static class UpdateServiceNotification extends Update {
        public String type;
        public MessageContent content;
        public static final int CONSTRUCTOR = 1318622637;

        public UpdateServiceNotification() {
        }

        public UpdateServiceNotification(String var1, MessageContent var2) {
            this.type = var1;
            this.content = var2;
        }

        public int getConstructor() {
            return 1318622637;
        }
    }

    public static class UpdateSupergroupFullInfo extends Update {
        public long supergroupId;
        public SupergroupFullInfo supergroupFullInfo;
        public static final int CONSTRUCTOR = 435539214;

        public UpdateSupergroupFullInfo() {
        }

        public UpdateSupergroupFullInfo(long var1, SupergroupFullInfo var3) {
            this.supergroupId = var1;
            this.supergroupFullInfo = var3;
        }

        public int getConstructor() {
            return 435539214;
        }
    }

    public static class UpdateBasicGroupFullInfo extends Update {
        public long basicGroupId;
        public BasicGroupFullInfo basicGroupFullInfo;
        public static final int CONSTRUCTOR = 1391881151;

        public UpdateBasicGroupFullInfo() {
        }

        public UpdateBasicGroupFullInfo(long var1, BasicGroupFullInfo var3) {
            this.basicGroupId = var1;
            this.basicGroupFullInfo = var3;
        }

        public int getConstructor() {
            return 1391881151;
        }
    }

    public static class UpdateUserFullInfo extends Update {
        public long userId;
        public UserFullInfo userFullInfo;
        public static final int CONSTRUCTOR = -51197161;

        public UpdateUserFullInfo() {
        }

        public UpdateUserFullInfo(long var1, UserFullInfo var3) {
            this.userId = var1;
            this.userFullInfo = var3;
        }

        public int getConstructor() {
            return -51197161;
        }
    }

    public static class UpdateSecretChat extends Update {
        public SecretChat secretChat;
        public static final int CONSTRUCTOR = -1666903253;

        public UpdateSecretChat() {
        }

        public UpdateSecretChat(SecretChat var1) {
            this.secretChat = var1;
        }

        public int getConstructor() {
            return -1666903253;
        }
    }

    public static class UpdateSupergroup extends Update {
        public Supergroup supergroup;
        public static final int CONSTRUCTOR = -76782300;

        public UpdateSupergroup() {
        }

        public UpdateSupergroup(Supergroup var1) {
            this.supergroup = var1;
        }

        public int getConstructor() {
            return -76782300;
        }
    }

    public static class UpdateBasicGroup extends Update {
        public BasicGroup basicGroup;
        public static final int CONSTRUCTOR = -1003239581;

        public UpdateBasicGroup() {
        }

        public UpdateBasicGroup(BasicGroup var1) {
            this.basicGroup = var1;
        }

        public int getConstructor() {
            return -1003239581;
        }
    }

    public static class UpdateUser extends Update {
        public User user;
        public static final int CONSTRUCTOR = 1183394041;

        public UpdateUser() {
        }

        public UpdateUser(User var1) {
            this.user = var1;
        }

        public int getConstructor() {
            return 1183394041;
        }
    }

    public static class UpdateUserStatus extends Update {
        public long userId;
        public UserStatus status;
        public static final int CONSTRUCTOR = 958468625;

        public UpdateUserStatus() {
        }

        public UpdateUserStatus(long var1, UserStatus var3) {
            this.userId = var1;
            this.status = var3;
        }

        public int getConstructor() {
            return 958468625;
        }
    }

    public static class UpdateChatAction extends Update {
        public long chatId;
        public long messageThreadId;
        public MessageSender senderId;
        public ChatAction action;
        public static final int CONSTRUCTOR = -1698703832;

        public UpdateChatAction() {
        }

        public UpdateChatAction(long var1, long var3, MessageSender var5, ChatAction var6) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.senderId = var5;
            this.action = var6;
        }

        public int getConstructor() {
            return -1698703832;
        }
    }

    public static class UpdateDeleteMessages extends Update {
        public long chatId;
        public long[] messageIds;
        public boolean isPermanent;
        public boolean fromCache;
        public static final int CONSTRUCTOR = 1669252686;

        public UpdateDeleteMessages() {
        }

        public UpdateDeleteMessages(long var1, long[] var3, boolean var4, boolean var5) {
            this.chatId = var1;
            this.messageIds = var3;
            this.isPermanent = var4;
            this.fromCache = var5;
        }

        public int getConstructor() {
            return 1669252686;
        }
    }

    public static class UpdateHavePendingNotifications extends Update {
        public boolean haveDelayedNotifications;
        public boolean haveUnreceivedNotifications;
        public static final int CONSTRUCTOR = 179233243;

        public UpdateHavePendingNotifications() {
        }

        public UpdateHavePendingNotifications(boolean var1, boolean var2) {
            this.haveDelayedNotifications = var1;
            this.haveUnreceivedNotifications = var2;
        }

        public int getConstructor() {
            return 179233243;
        }
    }

    public static class UpdateActiveNotifications extends Update {
        public NotificationGroup[] groups;
        public static final int CONSTRUCTOR = -1306672221;

        public UpdateActiveNotifications() {
        }

        public UpdateActiveNotifications(NotificationGroup[] var1) {
            this.groups = var1;
        }

        public int getConstructor() {
            return -1306672221;
        }
    }

    public static class UpdateNotificationGroup extends Update {
        public int notificationGroupId;
        public NotificationGroupType type;
        public long chatId;
        public long notificationSettingsChatId;
        public long notificationSoundId;
        public int totalCount;
        public Notification[] addedNotifications;
        public int[] removedNotificationIds;
        public static final int CONSTRUCTOR = 1381081378;

        public UpdateNotificationGroup() {
        }

        public UpdateNotificationGroup(int var1, NotificationGroupType var2, long var3, long var5, long var7, int var9, Notification[] var10, int[] var11) {
            this.notificationGroupId = var1;
            this.type = var2;
            this.chatId = var3;
            this.notificationSettingsChatId = var5;
            this.notificationSoundId = var7;
            this.totalCount = var9;
            this.addedNotifications = var10;
            this.removedNotificationIds = var11;
        }

        public int getConstructor() {
            return 1381081378;
        }
    }

    public static class UpdateNotification extends Update {
        public int notificationGroupId;
        public Notification notification;
        public static final int CONSTRUCTOR = -1897496876;

        public UpdateNotification() {
        }

        public UpdateNotification(int var1, Notification var2) {
            this.notificationGroupId = var1;
            this.notification = var2;
        }

        public int getConstructor() {
            return -1897496876;
        }
    }

    public static class UpdateScopeNotificationSettings extends Update {
        public NotificationSettingsScope scope;
        public ScopeNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = -1203975309;

        public UpdateScopeNotificationSettings() {
        }

        public UpdateScopeNotificationSettings(NotificationSettingsScope var1, ScopeNotificationSettings var2) {
            this.scope = var1;
            this.notificationSettings = var2;
        }

        public int getConstructor() {
            return -1203975309;
        }
    }

    public static class UpdateChatOnlineMemberCount extends Update {
        public long chatId;
        public int onlineMemberCount;
        public static final int CONSTRUCTOR = 487369373;

        public UpdateChatOnlineMemberCount() {
        }

        public UpdateChatOnlineMemberCount(long var1, int var3) {
            this.chatId = var1;
            this.onlineMemberCount = var3;
        }

        public int getConstructor() {
            return 487369373;
        }
    }

    public static class UpdateChatFilters extends Update {
        public ChatFilterInfo[] chatFilters;
        public int mainChatListPosition;
        public static final int CONSTRUCTOR = 81316953;

        public UpdateChatFilters() {
        }

        public UpdateChatFilters(ChatFilterInfo[] var1, int var2) {
            this.chatFilters = var1;
            this.mainChatListPosition = var2;
        }

        public int getConstructor() {
            return 81316953;
        }
    }

    public static class UpdateChatIsMarkedAsUnread extends Update {
        public long chatId;
        public boolean isMarkedAsUnread;
        public static final int CONSTRUCTOR = 1468347188;

        public UpdateChatIsMarkedAsUnread() {
        }

        public UpdateChatIsMarkedAsUnread(long var1, boolean var3) {
            this.chatId = var1;
            this.isMarkedAsUnread = var3;
        }

        public int getConstructor() {
            return 1468347188;
        }
    }

    public static class UpdateChatIsBlocked extends Update {
        public long chatId;
        public boolean isBlocked;
        public static final int CONSTRUCTOR = -1998946752;

        public UpdateChatIsBlocked() {
        }

        public UpdateChatIsBlocked(long var1, boolean var3) {
            this.chatId = var1;
            this.isBlocked = var3;
        }

        public int getConstructor() {
            return -1998946752;
        }
    }

    public static class UpdateChatHasScheduledMessages extends Update {
        public long chatId;
        public boolean hasScheduledMessages;
        public static final int CONSTRUCTOR = 2064958167;

        public UpdateChatHasScheduledMessages() {
        }

        public UpdateChatHasScheduledMessages(long var1, boolean var3) {
            this.chatId = var1;
            this.hasScheduledMessages = var3;
        }

        public int getConstructor() {
            return 2064958167;
        }
    }

    public static class UpdateChatHasProtectedContent extends Update {
        public long chatId;
        public boolean hasProtectedContent;
        public static final int CONSTRUCTOR = 1800406811;

        public UpdateChatHasProtectedContent() {
        }

        public UpdateChatHasProtectedContent(long var1, boolean var3) {
            this.chatId = var1;
            this.hasProtectedContent = var3;
        }

        public int getConstructor() {
            return 1800406811;
        }
    }

    public static class UpdateChatDefaultDisableNotification extends Update {
        public long chatId;
        public boolean defaultDisableNotification;
        public static final int CONSTRUCTOR = 464087707;

        public UpdateChatDefaultDisableNotification() {
        }

        public UpdateChatDefaultDisableNotification(long var1, boolean var3) {
            this.chatId = var1;
            this.defaultDisableNotification = var3;
        }

        public int getConstructor() {
            return 464087707;
        }
    }

    public static class UpdateChatVideoChat extends Update {
        public long chatId;
        public VideoChat videoChat;
        public static final int CONSTRUCTOR = 637226150;

        public UpdateChatVideoChat() {
        }

        public UpdateChatVideoChat(long var1, VideoChat var3) {
            this.chatId = var1;
            this.videoChat = var3;
        }

        public int getConstructor() {
            return 637226150;
        }
    }

    public static class UpdateChatUnreadReactionCount extends Update {
        public long chatId;
        public int unreadReactionCount;
        public static final int CONSTRUCTOR = -2124399395;

        public UpdateChatUnreadReactionCount() {
        }

        public UpdateChatUnreadReactionCount(long var1, int var3) {
            this.chatId = var1;
            this.unreadReactionCount = var3;
        }

        public int getConstructor() {
            return -2124399395;
        }
    }

    public static class UpdateChatUnreadMentionCount extends Update {
        public long chatId;
        public int unreadMentionCount;
        public static final int CONSTRUCTOR = -2131461348;

        public UpdateChatUnreadMentionCount() {
        }

        public UpdateChatUnreadMentionCount(long var1, int var3) {
            this.chatId = var1;
            this.unreadMentionCount = var3;
        }

        public int getConstructor() {
            return -2131461348;
        }
    }

    public static class UpdateChatTheme extends Update {
        public long chatId;
        public String themeName;
        public static final int CONSTRUCTOR = 838063205;

        public UpdateChatTheme() {
        }

        public UpdateChatTheme(long var1, String var3) {
            this.chatId = var1;
            this.themeName = var3;
        }

        public int getConstructor() {
            return 838063205;
        }
    }

    public static class UpdateChatReplyMarkup extends Update {
        public long chatId;
        public long replyMarkupMessageId;
        public static final int CONSTRUCTOR = 1309386144;

        public UpdateChatReplyMarkup() {
        }

        public UpdateChatReplyMarkup(long var1, long var3) {
            this.chatId = var1;
            this.replyMarkupMessageId = var3;
        }

        public int getConstructor() {
            return 1309386144;
        }
    }

    public static class UpdateChatPendingJoinRequests extends Update {
        public long chatId;
        public ChatJoinRequestsInfo pendingJoinRequests;
        public static final int CONSTRUCTOR = 348578785;

        public UpdateChatPendingJoinRequests() {
        }

        public UpdateChatPendingJoinRequests(long var1, ChatJoinRequestsInfo var3) {
            this.chatId = var1;
            this.pendingJoinRequests = var3;
        }

        public int getConstructor() {
            return 348578785;
        }
    }

    public static class UpdateChatNotificationSettings extends Update {
        public long chatId;
        public ChatNotificationSettings notificationSettings;
        public static final int CONSTRUCTOR = -803163050;

        public UpdateChatNotificationSettings() {
        }

        public UpdateChatNotificationSettings(long var1, ChatNotificationSettings var3) {
            this.chatId = var1;
            this.notificationSettings = var3;
        }

        public int getConstructor() {
            return -803163050;
        }
    }

    public static class UpdateChatMessageTtl extends Update {
        public long chatId;
        public int messageTtl;
        public static final int CONSTRUCTOR = -572479112;

        public UpdateChatMessageTtl() {
        }

        public UpdateChatMessageTtl(long var1, int var3) {
            this.chatId = var1;
            this.messageTtl = var3;
        }

        public int getConstructor() {
            return -572479112;
        }
    }

    public static class UpdateChatMessageSender extends Update {
        public long chatId;
        public MessageSender messageSenderId;
        public static final int CONSTRUCTOR = 2003849793;

        public UpdateChatMessageSender() {
        }

        public UpdateChatMessageSender(long var1, MessageSender var3) {
            this.chatId = var1;
            this.messageSenderId = var3;
        }

        public int getConstructor() {
            return 2003849793;
        }
    }

    public static class UpdateChatDraftMessage extends Update {
        public long chatId;
        public DraftMessage draftMessage;
        public ChatPosition[] positions;
        public static final int CONSTRUCTOR = 1455190380;

        public UpdateChatDraftMessage() {
        }

        public UpdateChatDraftMessage(long var1, DraftMessage var3, ChatPosition[] var4) {
            this.chatId = var1;
            this.draftMessage = var3;
            this.positions = var4;
        }

        public int getConstructor() {
            return 1455190380;
        }
    }

    public static class UpdateChatAvailableReactions extends Update {
        public long chatId;
        public ChatAvailableReactions availableReactions;
        public static final int CONSTRUCTOR = -1967909895;

        public UpdateChatAvailableReactions() {
        }

        public UpdateChatAvailableReactions(long var1, ChatAvailableReactions var3) {
            this.chatId = var1;
            this.availableReactions = var3;
        }

        public int getConstructor() {
            return -1967909895;
        }
    }

    public static class UpdateChatActionBar extends Update {
        public long chatId;
        public ChatActionBar actionBar;
        public static final int CONSTRUCTOR = -643671870;

        public UpdateChatActionBar() {
        }

        public UpdateChatActionBar(long var1, ChatActionBar var3) {
            this.chatId = var1;
            this.actionBar = var3;
        }

        public int getConstructor() {
            return -643671870;
        }
    }

    public static class UpdateChatReadOutbox extends Update {
        public long chatId;
        public long lastReadOutboxMessageId;
        public static final int CONSTRUCTOR = 708334213;

        public UpdateChatReadOutbox() {
        }

        public UpdateChatReadOutbox(long var1, long var3) {
            this.chatId = var1;
            this.lastReadOutboxMessageId = var3;
        }

        public int getConstructor() {
            return 708334213;
        }
    }

    public static class UpdateChatReadInbox extends Update {
        public long chatId;
        public long lastReadInboxMessageId;
        public int unreadCount;
        public static final int CONSTRUCTOR = -797952281;

        public UpdateChatReadInbox() {
        }

        public UpdateChatReadInbox(long var1, long var3, int var5) {
            this.chatId = var1;
            this.lastReadInboxMessageId = var3;
            this.unreadCount = var5;
        }

        public int getConstructor() {
            return -797952281;
        }
    }

    public static class UpdateChatPosition extends Update {
        public long chatId;
        public ChatPosition position;
        public static final int CONSTRUCTOR = -8979849;

        public UpdateChatPosition() {
        }

        public UpdateChatPosition(long var1, ChatPosition var3) {
            this.chatId = var1;
            this.position = var3;
        }

        public int getConstructor() {
            return -8979849;
        }
    }

    public static class UpdateChatLastMessage extends Update {
        public long chatId;
        public Message lastMessage;
        public ChatPosition[] positions;
        public static final int CONSTRUCTOR = -923244537;

        public UpdateChatLastMessage() {
        }

        public UpdateChatLastMessage(long var1, Message var3, ChatPosition[] var4) {
            this.chatId = var1;
            this.lastMessage = var3;
            this.positions = var4;
        }

        public int getConstructor() {
            return -923244537;
        }
    }

    public static class UpdateChatPermissions extends Update {
        public long chatId;
        public ChatPermissions permissions;
        public static final int CONSTRUCTOR = -1622010003;

        public UpdateChatPermissions() {
        }

        public UpdateChatPermissions(long var1, ChatPermissions var3) {
            this.chatId = var1;
            this.permissions = var3;
        }

        public int getConstructor() {
            return -1622010003;
        }
    }

    public static class UpdateChatPhoto extends Update {
        public long chatId;
        public ChatPhotoInfo photo;
        public static final int CONSTRUCTOR = -324713921;

        public UpdateChatPhoto() {
        }

        public UpdateChatPhoto(long var1, ChatPhotoInfo var3) {
            this.chatId = var1;
            this.photo = var3;
        }

        public int getConstructor() {
            return -324713921;
        }
    }

    public static class UpdateChatTitle extends Update {
        public long chatId;
        public String title;
        public static final int CONSTRUCTOR = -175405660;

        public UpdateChatTitle() {
        }

        public UpdateChatTitle(long var1, String var3) {
            this.chatId = var1;
            this.title = var3;
        }

        public int getConstructor() {
            return -175405660;
        }
    }

    public static class UpdateNewChat extends Update {
        public Chat chat;
        public static final int CONSTRUCTOR = 2075757773;

        public UpdateNewChat() {
        }

        public UpdateNewChat(Chat var1) {
            this.chat = var1;
        }

        public int getConstructor() {
            return 2075757773;
        }
    }

    public static class UpdateMessageLiveLocationViewed extends Update {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1308260971;

        public UpdateMessageLiveLocationViewed() {
        }

        public UpdateMessageLiveLocationViewed(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1308260971;
        }
    }

    public static class UpdateMessageUnreadReactions extends Update {
        public long chatId;
        public long messageId;
        public UnreadReaction[] unreadReactions;
        public int unreadReactionCount;
        public static final int CONSTRUCTOR = 942840008;

        public UpdateMessageUnreadReactions() {
        }

        public UpdateMessageUnreadReactions(long var1, long var3, UnreadReaction[] var5, int var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.unreadReactions = var5;
            this.unreadReactionCount = var6;
        }

        public int getConstructor() {
            return 942840008;
        }
    }

    public static class UpdateMessageMentionRead extends Update {
        public long chatId;
        public long messageId;
        public int unreadMentionCount;
        public static final int CONSTRUCTOR = -252228282;

        public UpdateMessageMentionRead() {
        }

        public UpdateMessageMentionRead(long var1, long var3, int var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.unreadMentionCount = var5;
        }

        public int getConstructor() {
            return -252228282;
        }
    }

    public static class UpdateMessageContentOpened extends Update {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = -1520523131;

        public UpdateMessageContentOpened() {
        }

        public UpdateMessageContentOpened(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return -1520523131;
        }
    }

    public static class UpdateMessageInteractionInfo extends Update {
        public long chatId;
        public long messageId;
        public MessageInteractionInfo interactionInfo;
        public static final int CONSTRUCTOR = -1417659394;

        public UpdateMessageInteractionInfo() {
        }

        public UpdateMessageInteractionInfo(long var1, long var3, MessageInteractionInfo var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.interactionInfo = var5;
        }

        public int getConstructor() {
            return -1417659394;
        }
    }

    public static class UpdateMessageIsPinned extends Update {
        public long chatId;
        public long messageId;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1102848829;

        public UpdateMessageIsPinned() {
        }

        public UpdateMessageIsPinned(long var1, long var3, boolean var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.isPinned = var5;
        }

        public int getConstructor() {
            return 1102848829;
        }
    }

    public static class UpdateMessageEdited extends Update {
        public long chatId;
        public long messageId;
        public int editDate;
        public ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = -559545626;

        public UpdateMessageEdited() {
        }

        public UpdateMessageEdited(long var1, long var3, int var5, ReplyMarkup var6) {
            this.chatId = var1;
            this.messageId = var3;
            this.editDate = var5;
            this.replyMarkup = var6;
        }

        public int getConstructor() {
            return -559545626;
        }
    }

    public static class UpdateMessageContent extends Update {
        public long chatId;
        public long messageId;
        public MessageContent newContent;
        public static final int CONSTRUCTOR = 506903332;

        public UpdateMessageContent() {
        }

        public UpdateMessageContent(long var1, long var3, MessageContent var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.newContent = var5;
        }

        public int getConstructor() {
            return 506903332;
        }
    }

    public static class UpdateMessageSendFailed extends Update {
        public Message message;
        public long oldMessageId;
        public int errorCode;
        public String errorMessage;
        public static final int CONSTRUCTOR = -1032335779;

        public UpdateMessageSendFailed() {
        }

        public UpdateMessageSendFailed(Message var1, long var2, int var4, String var5) {
            this.message = var1;
            this.oldMessageId = var2;
            this.errorCode = var4;
            this.errorMessage = var5;
        }

        public int getConstructor() {
            return -1032335779;
        }
    }

    public static class UpdateMessageSendSucceeded extends Update {
        public Message message;
        public long oldMessageId;
        public static final int CONSTRUCTOR = 1815715197;

        public UpdateMessageSendSucceeded() {
        }

        public UpdateMessageSendSucceeded(Message var1, long var2) {
            this.message = var1;
            this.oldMessageId = var2;
        }

        public int getConstructor() {
            return 1815715197;
        }
    }

    public static class UpdateMessageSendAcknowledged extends Update {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1302843961;

        public UpdateMessageSendAcknowledged() {
        }

        public UpdateMessageSendAcknowledged(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1302843961;
        }
    }

    public static class UpdateNewMessage extends Update {
        public Message message;
        public static final int CONSTRUCTOR = -563105266;

        public UpdateNewMessage() {
        }

        public UpdateNewMessage(Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return -563105266;
        }
    }

    public static class UpdateAuthorizationState extends Update {
        public AuthorizationState authorizationState;
        public static final int CONSTRUCTOR = 1622347490;

        public UpdateAuthorizationState() {
        }

        public UpdateAuthorizationState(AuthorizationState var1) {
            this.authorizationState = var1;
        }

        public int getConstructor() {
            return 1622347490;
        }
    }

    public abstract static class Update extends Object {
        public Update() {
        }
    }

    public static class UnreadReaction extends Object {
        public ReactionType type;
        public MessageSender senderId;
        public boolean isBig;
        public static final int CONSTRUCTOR = -1940178046;

        public UnreadReaction() {
        }

        public UnreadReaction(ReactionType var1, MessageSender var2, boolean var3) {
            this.type = var1;
            this.senderId = var2;
            this.isBig = var3;
        }

        public int getConstructor() {
            return -1940178046;
        }
    }

    public static class TrendingStickerSets extends Object {
        public int totalCount;
        public StickerSetInfo[] sets;
        public boolean isPremium;
        public static final int CONSTRUCTOR = 41028940;

        public TrendingStickerSets() {
        }

        public TrendingStickerSets(int var1, StickerSetInfo[] var2, boolean var3) {
            this.totalCount = var1;
            this.sets = var2;
            this.isPremium = var3;
        }

        public int getConstructor() {
            return 41028940;
        }
    }

    public static class TopChatCategoryForwardChats extends TopChatCategory {
        public static final int CONSTRUCTOR = 1695922133;

        public TopChatCategoryForwardChats() {
        }

        public int getConstructor() {
            return 1695922133;
        }
    }

    public static class TopChatCategoryCalls extends TopChatCategory {
        public static final int CONSTRUCTOR = 356208861;

        public TopChatCategoryCalls() {
        }

        public int getConstructor() {
            return 356208861;
        }
    }

    public static class TopChatCategoryInlineBots extends TopChatCategory {
        public static final int CONSTRUCTOR = 377023356;

        public TopChatCategoryInlineBots() {
        }

        public int getConstructor() {
            return 377023356;
        }
    }

    public static class TopChatCategoryChannels extends TopChatCategory {
        public static final int CONSTRUCTOR = -500825885;

        public TopChatCategoryChannels() {
        }

        public int getConstructor() {
            return -500825885;
        }
    }

    public static class TopChatCategoryGroups extends TopChatCategory {
        public static final int CONSTRUCTOR = 1530056846;

        public TopChatCategoryGroups() {
        }

        public int getConstructor() {
            return 1530056846;
        }
    }

    public static class TopChatCategoryBots extends TopChatCategory {
        public static final int CONSTRUCTOR = -1577129195;

        public TopChatCategoryBots() {
        }

        public int getConstructor() {
            return -1577129195;
        }
    }

    public static class TopChatCategoryUsers extends TopChatCategory {
        public static final int CONSTRUCTOR = 1026706816;

        public TopChatCategoryUsers() {
        }

        public int getConstructor() {
            return 1026706816;
        }
    }

    public abstract static class TopChatCategory extends Object {
        public TopChatCategory() {
        }
    }

    public static class ThumbnailFormatWebp extends ThumbnailFormat {
        public static final int CONSTRUCTOR = -53588974;

        public ThumbnailFormatWebp() {
        }

        public int getConstructor() {
            return -53588974;
        }
    }

    public static class ThumbnailFormatWebm extends ThumbnailFormat {
        public static final int CONSTRUCTOR = -660084953;

        public ThumbnailFormatWebm() {
        }

        public int getConstructor() {
            return -660084953;
        }
    }

    public static class ThumbnailFormatTgs extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 1315522642;

        public ThumbnailFormatTgs() {
        }

        public int getConstructor() {
            return 1315522642;
        }
    }

    public static class ThumbnailFormatPng extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 1577490421;

        public ThumbnailFormatPng() {
        }

        public int getConstructor() {
            return 1577490421;
        }
    }

    public static class ThumbnailFormatMpeg4 extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 278616062;

        public ThumbnailFormatMpeg4() {
        }

        public int getConstructor() {
            return 278616062;
        }
    }

    public static class ThumbnailFormatGif extends ThumbnailFormat {
        public static final int CONSTRUCTOR = 1252205962;

        public ThumbnailFormatGif() {
        }

        public int getConstructor() {
            return 1252205962;
        }
    }

    public static class ThumbnailFormatJpeg extends ThumbnailFormat {
        public static final int CONSTRUCTOR = -653503352;

        public ThumbnailFormatJpeg() {
        }

        public int getConstructor() {
            return -653503352;
        }
    }

    public abstract static class ThumbnailFormat extends Object {
        public ThumbnailFormat() {
        }
    }

    public static class Thumbnail extends Object {
        public ThumbnailFormat format;
        public int width;
        public int height;
        public File file;
        public static final int CONSTRUCTOR = 1243275371;

        public Thumbnail() {
        }

        public Thumbnail(ThumbnailFormat var1, int var2, int var3, File var4) {
            this.format = var1;
            this.width = var2;
            this.height = var3;
            this.file = var4;
        }

        public int getConstructor() {
            return 1243275371;
        }
    }

    public static class ThemeSettings extends Object {
        public int accentColor;
        public Background background;
        public BackgroundFill outgoingMessageFill;
        public boolean animateOutgoingMessageFill;
        public int outgoingMessageAccentColor;
        public static final int CONSTRUCTOR = -62120942;

        public ThemeSettings() {
        }

        public ThemeSettings(int var1, Background var2, BackgroundFill var3, boolean var4, int var5) {
            this.accentColor = var1;
            this.background = var2;
            this.outgoingMessageFill = var3;
            this.animateOutgoingMessageFill = var4;
            this.outgoingMessageAccentColor = var5;
        }

        public int getConstructor() {
            return -62120942;
        }
    }

    public static class ThemeParameters extends Object {
        public int backgroundColor;
        public int secondaryBackgroundColor;
        public int textColor;
        public int hintColor;
        public int linkColor;
        public int buttonColor;
        public int buttonTextColor;
        public static final int CONSTRUCTOR = -644809106;

        public ThemeParameters() {
        }

        public ThemeParameters(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
            this.backgroundColor = var1;
            this.secondaryBackgroundColor = var2;
            this.textColor = var3;
            this.hintColor = var4;
            this.linkColor = var5;
            this.buttonColor = var6;
            this.buttonTextColor = var7;
        }

        public int getConstructor() {
            return -644809106;
        }
    }

    public static class TextParseModeHTML extends TextParseMode {
        public static final int CONSTRUCTOR = 1660208627;

        public TextParseModeHTML() {
        }

        public int getConstructor() {
            return 1660208627;
        }
    }

    public static class TextParseModeMarkdown extends TextParseMode {
        public int version;
        public static final int CONSTRUCTOR = 360073407;

        public TextParseModeMarkdown() {
        }

        public TextParseModeMarkdown(int var1) {
            this.version = var1;
        }

        public int getConstructor() {
            return 360073407;
        }
    }

    public abstract static class TextParseMode extends Object {
        public TextParseMode() {
        }
    }

    public static class TextEntityTypeMediaTimestamp extends TextEntityType {
        public int mediaTimestamp;
        public static final int CONSTRUCTOR = -1841898992;

        public TextEntityTypeMediaTimestamp() {
        }

        public TextEntityTypeMediaTimestamp(int var1) {
            this.mediaTimestamp = var1;
        }

        public int getConstructor() {
            return -1841898992;
        }
    }

    public static class TextEntityTypeCustomEmoji extends TextEntityType {
        public long customEmojiId;
        public static final int CONSTRUCTOR = 1724820677;

        public TextEntityTypeCustomEmoji() {
        }

        public TextEntityTypeCustomEmoji(long var1) {
            this.customEmojiId = var1;
        }

        public int getConstructor() {
            return 1724820677;
        }
    }

    public static class TextEntityTypeMentionName extends TextEntityType {
        public long userId;
        public static final int CONSTRUCTOR = -1570974289;

        public TextEntityTypeMentionName() {
        }

        public TextEntityTypeMentionName(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -1570974289;
        }
    }

    public static class TextEntityTypeTextUrl extends TextEntityType {
        public String url;
        public static final int CONSTRUCTOR = 445719651;

        public TextEntityTypeTextUrl() {
        }

        public TextEntityTypeTextUrl(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 445719651;
        }
    }

    public static class TextEntityTypePreCode extends TextEntityType {
        public String language;
        public static final int CONSTRUCTOR = -945325397;

        public TextEntityTypePreCode() {
        }

        public TextEntityTypePreCode(String var1) {
            this.language = var1;
        }

        public int getConstructor() {
            return -945325397;
        }
    }

    public static class TextEntityTypePre extends TextEntityType {
        public static final int CONSTRUCTOR = 1648958606;

        public TextEntityTypePre() {
        }

        public int getConstructor() {
            return 1648958606;
        }
    }

    public static class TextEntityTypeCode extends TextEntityType {
        public static final int CONSTRUCTOR = -974534326;

        public TextEntityTypeCode() {
        }

        public int getConstructor() {
            return -974534326;
        }
    }

    public static class TextEntityTypeSpoiler extends TextEntityType {
        public static final int CONSTRUCTOR = 544019899;

        public TextEntityTypeSpoiler() {
        }

        public int getConstructor() {
            return 544019899;
        }
    }

    public static class TextEntityTypeStrikethrough extends TextEntityType {
        public static final int CONSTRUCTOR = 961529082;

        public TextEntityTypeStrikethrough() {
        }

        public int getConstructor() {
            return 961529082;
        }
    }

    public static class TextEntityTypeUnderline extends TextEntityType {
        public static final int CONSTRUCTOR = 792317842;

        public TextEntityTypeUnderline() {
        }

        public int getConstructor() {
            return 792317842;
        }
    }

    public static class TextEntityTypeItalic extends TextEntityType {
        public static final int CONSTRUCTOR = -118253987;

        public TextEntityTypeItalic() {
        }

        public int getConstructor() {
            return -118253987;
        }
    }

    public static class TextEntityTypeBold extends TextEntityType {
        public static final int CONSTRUCTOR = -1128210000;

        public TextEntityTypeBold() {
        }

        public int getConstructor() {
            return -1128210000;
        }
    }

    public static class TextEntityTypeBankCardNumber extends TextEntityType {
        public static final int CONSTRUCTOR = 105986320;

        public TextEntityTypeBankCardNumber() {
        }

        public int getConstructor() {
            return 105986320;
        }
    }

    public static class TextEntityTypePhoneNumber extends TextEntityType {
        public static final int CONSTRUCTOR = -1160140246;

        public TextEntityTypePhoneNumber() {
        }

        public int getConstructor() {
            return -1160140246;
        }
    }

    public static class TextEntityTypeEmailAddress extends TextEntityType {
        public static final int CONSTRUCTOR = 1425545249;

        public TextEntityTypeEmailAddress() {
        }

        public int getConstructor() {
            return 1425545249;
        }
    }

    public static class TextEntityTypeUrl extends TextEntityType {
        public static final int CONSTRUCTOR = -1312762756;

        public TextEntityTypeUrl() {
        }

        public int getConstructor() {
            return -1312762756;
        }
    }

    public static class TextEntityTypeBotCommand extends TextEntityType {
        public static final int CONSTRUCTOR = -1150997581;

        public TextEntityTypeBotCommand() {
        }

        public int getConstructor() {
            return -1150997581;
        }
    }

    public static class TextEntityTypeCashtag extends TextEntityType {
        public static final int CONSTRUCTOR = 1222915915;

        public TextEntityTypeCashtag() {
        }

        public int getConstructor() {
            return 1222915915;
        }
    }

    public static class TextEntityTypeHashtag extends TextEntityType {
        public static final int CONSTRUCTOR = -1023958307;

        public TextEntityTypeHashtag() {
        }

        public int getConstructor() {
            return -1023958307;
        }
    }

    public static class TextEntityTypeMention extends TextEntityType {
        public static final int CONSTRUCTOR = 934535013;

        public TextEntityTypeMention() {
        }

        public int getConstructor() {
            return 934535013;
        }
    }

    public abstract static class TextEntityType extends Object {
        public TextEntityType() {
        }
    }

    public static class TextEntity extends Object {
        public int offset;
        public int length;
        public TextEntityType type;
        public static final int CONSTRUCTOR = -1951688280;

        public TextEntity() {
        }

        public TextEntity(int var1, int var2, TextEntityType var3) {
            this.offset = var1;
            this.length = var2;
            this.type = var3;
        }

        public int getConstructor() {
            return -1951688280;
        }
    }

    public static class TextEntities extends Object {
        public TextEntity[] entities;
        public static final int CONSTRUCTOR = -933199172;

        public TextEntities() {
        }

        public TextEntities(TextEntity[] var1) {
            this.entities = var1;
        }

        public int getConstructor() {
            return -933199172;
        }
    }

    public static class Text extends Object {
        public String text;
        public static final int CONSTRUCTOR = 578181272;

        public Text() {
        }

        public Text(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 578181272;
        }
    }

    public static class TestVectorStringObject extends Object {
        public TestString[] value;
        public static final int CONSTRUCTOR = 80780537;

        public TestVectorStringObject() {
        }

        public TestVectorStringObject(TestString[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 80780537;
        }
    }

    public static class TestVectorString extends Object {
        public String[] value;
        public static final int CONSTRUCTOR = 79339995;

        public TestVectorString() {
        }

        public TestVectorString(String[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 79339995;
        }
    }

    public static class TestVectorIntObject extends Object {
        public TestInt[] value;
        public static final int CONSTRUCTOR = 125891546;

        public TestVectorIntObject() {
        }

        public TestVectorIntObject(TestInt[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 125891546;
        }
    }

    public static class TestVectorInt extends Object {
        public int[] value;
        public static final int CONSTRUCTOR = 593682027;

        public TestVectorInt() {
        }

        public TestVectorInt(int[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 593682027;
        }
    }

    public static class TestString extends Object {
        public String value;
        public static final int CONSTRUCTOR = -27891572;

        public TestString() {
        }

        public TestString(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -27891572;
        }
    }

    public static class TestInt extends Object {
        public int value;
        public static final int CONSTRUCTOR = -574804983;

        public TestInt() {
        }

        public TestInt(int var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -574804983;
        }
    }

    public static class TestBytes extends Object {
        public byte[] value;
        public static final int CONSTRUCTOR = -1541225250;

        public TestBytes() {
        }

        public TestBytes(byte[] var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -1541225250;
        }
    }

    public static class TermsOfService extends Object {
        public FormattedText text;
        public int minUserAge;
        public boolean showPopup;
        public static final int CONSTRUCTOR = 739422597;

        public TermsOfService() {
        }

        public TermsOfService(FormattedText var1, int var2, boolean var3) {
            this.text = var1;
            this.minUserAge = var2;
            this.showPopup = var3;
        }

        public int getConstructor() {
            return 739422597;
        }
    }

    public static class TemporaryPasswordState extends Object {
        public boolean hasPassword;
        public int validFor;
        public static final int CONSTRUCTOR = 939837410;

        public TemporaryPasswordState() {
        }

        public TemporaryPasswordState(boolean var1, int var2) {
            this.hasPassword = var1;
            this.validFor = var2;
        }

        public int getConstructor() {
            return 939837410;
        }
    }

    public static class TargetChatInternalLink extends TargetChat {
        public InternalLinkType link;
        public static final int CONSTRUCTOR = -579301408;

        public TargetChatInternalLink() {
        }

        public TargetChatInternalLink(InternalLinkType var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return -579301408;
        }
    }

    public static class TargetChatChosen extends TargetChat {
        public boolean allowUserChats;
        public boolean allowBotChats;
        public boolean allowGroupChats;
        public boolean allowChannelChats;
        public static final int CONSTRUCTOR = -307442990;

        public TargetChatChosen() {
        }

        public TargetChatChosen(boolean var1, boolean var2, boolean var3, boolean var4) {
            this.allowUserChats = var1;
            this.allowBotChats = var2;
            this.allowGroupChats = var3;
            this.allowChannelChats = var4;
        }

        public int getConstructor() {
            return -307442990;
        }
    }

    public static class TargetChatCurrent extends TargetChat {
        public static final int CONSTRUCTOR = -416689904;

        public TargetChatCurrent() {
        }

        public int getConstructor() {
            return -416689904;
        }
    }

    public abstract static class TargetChat extends Object {
        public TargetChat() {
        }
    }

    public static class TMeUrls extends Object {
        public TMeUrl[] urls;
        public static final int CONSTRUCTOR = -1130595098;

        public TMeUrls() {
        }

        public TMeUrls(TMeUrl[] var1) {
            this.urls = var1;
        }

        public int getConstructor() {
            return -1130595098;
        }
    }

    public static class TMeUrlTypeStickerSet extends TMeUrlType {
        public long stickerSetId;
        public static final int CONSTRUCTOR = 1602473196;

        public TMeUrlTypeStickerSet() {
        }

        public TMeUrlTypeStickerSet(long var1) {
            this.stickerSetId = var1;
        }

        public int getConstructor() {
            return 1602473196;
        }
    }

    public static class TMeUrlTypeChatInvite extends TMeUrlType {
        public ChatInviteLinkInfo info;
        public static final int CONSTRUCTOR = 313907785;

        public TMeUrlTypeChatInvite() {
        }

        public TMeUrlTypeChatInvite(ChatInviteLinkInfo var1) {
            this.info = var1;
        }

        public int getConstructor() {
            return 313907785;
        }
    }

    public static class TMeUrlTypeSupergroup extends TMeUrlType {
        public long supergroupId;
        public static final int CONSTRUCTOR = -1353369944;

        public TMeUrlTypeSupergroup() {
        }

        public TMeUrlTypeSupergroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return -1353369944;
        }
    }

    public static class TMeUrlTypeUser extends TMeUrlType {
        public long userId;
        public static final int CONSTRUCTOR = 125336602;

        public TMeUrlTypeUser() {
        }

        public TMeUrlTypeUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 125336602;
        }
    }

    public abstract static class TMeUrlType extends Object {
        public TMeUrlType() {
        }
    }

    public static class TMeUrl extends Object {
        public String url;
        public TMeUrlType type;
        public static final int CONSTRUCTOR = -1140786622;

        public TMeUrl() {
        }

        public TMeUrl(String var1, TMeUrlType var2) {
            this.url = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -1140786622;
        }
    }

    public static class SupergroupMembersFilterBots extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 492138918;

        public SupergroupMembersFilterBots() {
        }

        public int getConstructor() {
            return 492138918;
        }
    }

    public static class SupergroupMembersFilterMention extends SupergroupMembersFilter {
        public String query;
        public long messageThreadId;
        public static final int CONSTRUCTOR = 947915036;

        public SupergroupMembersFilterMention() {
        }

        public SupergroupMembersFilterMention(String var1, long var2) {
            this.query = var1;
            this.messageThreadId = var2;
        }

        public int getConstructor() {
            return 947915036;
        }
    }

    public static class SupergroupMembersFilterBanned extends SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1210621683;

        public SupergroupMembersFilterBanned() {
        }

        public SupergroupMembersFilterBanned(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1210621683;
        }
    }

    public static class SupergroupMembersFilterRestricted extends SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1107800034;

        public SupergroupMembersFilterRestricted() {
        }

        public SupergroupMembersFilterRestricted(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1107800034;
        }
    }

    public static class SupergroupMembersFilterSearch extends SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1696358469;

        public SupergroupMembersFilterSearch() {
        }

        public SupergroupMembersFilterSearch(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1696358469;
        }
    }

    public static class SupergroupMembersFilterAdministrators extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = -2097380265;

        public SupergroupMembersFilterAdministrators() {
        }

        public int getConstructor() {
            return -2097380265;
        }
    }

    public static class SupergroupMembersFilterContacts extends SupergroupMembersFilter {
        public String query;
        public static final int CONSTRUCTOR = -1282910856;

        public SupergroupMembersFilterContacts() {
        }

        public SupergroupMembersFilterContacts(String var1) {
            this.query = var1;
        }

        public int getConstructor() {
            return -1282910856;
        }
    }

    public static class SupergroupMembersFilterRecent extends SupergroupMembersFilter {
        public static final int CONSTRUCTOR = 1178199509;

        public SupergroupMembersFilterRecent() {
        }

        public int getConstructor() {
            return 1178199509;
        }
    }

    public abstract static class SupergroupMembersFilter extends Object {
        public SupergroupMembersFilter() {
        }
    }

    public static class SupergroupFullInfo extends Object {
        public ChatPhoto photo;
        public String description;
        public int memberCount;
        public int administratorCount;
        public int restrictedCount;
        public int bannedCount;
        public long linkedChatId;
        public int slowModeDelay;
        public double slowModeDelayExpiresIn;
        public boolean canGetMembers;
        public boolean canSetUsername;
        public boolean canSetStickerSet;
        public boolean canSetLocation;
        public boolean canGetStatistics;
        public boolean isAllHistoryAvailable;
        public long stickerSetId;
        public ChatLocation location;
        public ChatInviteLink inviteLink;
        public BotCommands[] botCommands;
        public long upgradedFromBasicGroupId;
        public long upgradedFromMaxMessageId;
        public static final int CONSTRUCTOR = -1035719349;

        public SupergroupFullInfo() {
        }

        public SupergroupFullInfo(ChatPhoto var1, String var2, int var3, int var4, int var5, int var6, long var7, int var9, double var10, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, long var18, ChatLocation var20, ChatInviteLink var21, BotCommands[] var22, long var23, long var25) {
            this.photo = var1;
            this.description = var2;
            this.memberCount = var3;
            this.administratorCount = var4;
            this.restrictedCount = var5;
            this.bannedCount = var6;
            this.linkedChatId = var7;
            this.slowModeDelay = var9;
            this.slowModeDelayExpiresIn = var10;
            this.canGetMembers = var12;
            this.canSetUsername = var13;
            this.canSetStickerSet = var14;
            this.canSetLocation = var15;
            this.canGetStatistics = var16;
            this.isAllHistoryAvailable = var17;
            this.stickerSetId = var18;
            this.location = var20;
            this.inviteLink = var21;
            this.botCommands = var22;
            this.upgradedFromBasicGroupId = var23;
            this.upgradedFromMaxMessageId = var25;
        }

        public int getConstructor() {
            return -1035719349;
        }
    }

    public static class Supergroup extends Object {
        public long id;
        public String username;
        public int date;
        public ChatMemberStatus status;
        public int memberCount;
        public boolean hasLinkedChat;
        public boolean hasLocation;
        public boolean signMessages;
        public boolean joinToSendMessages;
        public boolean joinByRequest;
        public boolean isSlowModeEnabled;
        public boolean isChannel;
        public boolean isBroadcastGroup;
        public boolean isVerified;
        public String restrictionReason;
        public boolean isScam;
        public boolean isFake;
        public static final int CONSTRUCTOR = -868093427;

        public Supergroup() {
        }

        public Supergroup(long var1, String var3, int var4, ChatMemberStatus var5, int var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, String var16, boolean var17, boolean var18) {
            this.id = var1;
            this.username = var3;
            this.date = var4;
            this.status = var5;
            this.memberCount = var6;
            this.hasLinkedChat = var7;
            this.hasLocation = var8;
            this.signMessages = var9;
            this.joinToSendMessages = var10;
            this.joinByRequest = var11;
            this.isSlowModeEnabled = var12;
            this.isChannel = var13;
            this.isBroadcastGroup = var14;
            this.isVerified = var15;
            this.restrictionReason = var16;
            this.isScam = var17;
            this.isFake = var18;
        }

        public int getConstructor() {
            return -868093427;
        }
    }

    public static class SuggestedActionSetPassword extends SuggestedAction {
        public int authorizationDelay;
        public static final int CONSTRUCTOR = 1863613848;

        public SuggestedActionSetPassword() {
        }

        public SuggestedActionSetPassword(int var1) {
            this.authorizationDelay = var1;
        }

        public int getConstructor() {
            return 1863613848;
        }
    }

    public static class SuggestedActionConvertToBroadcastGroup extends SuggestedAction {
        public long supergroupId;
        public static final int CONSTRUCTOR = -965071304;

        public SuggestedActionConvertToBroadcastGroup() {
        }

        public SuggestedActionConvertToBroadcastGroup(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return -965071304;
        }
    }

    public static class SuggestedActionViewChecksHint extends SuggestedAction {
        public static final int CONSTRUCTOR = 891303239;

        public SuggestedActionViewChecksHint() {
        }

        public int getConstructor() {
            return 891303239;
        }
    }

    public static class SuggestedActionCheckPhoneNumber extends SuggestedAction {
        public static final int CONSTRUCTOR = 648771563;

        public SuggestedActionCheckPhoneNumber() {
        }

        public int getConstructor() {
            return 648771563;
        }
    }

    public static class SuggestedActionCheckPassword extends SuggestedAction {
        public static final int CONSTRUCTOR = 1910534839;

        public SuggestedActionCheckPassword() {
        }

        public int getConstructor() {
            return 1910534839;
        }
    }

    public static class SuggestedActionEnableArchiveAndMuteNewChats extends SuggestedAction {
        public static final int CONSTRUCTOR = 2017586255;

        public SuggestedActionEnableArchiveAndMuteNewChats() {
        }

        public int getConstructor() {
            return 2017586255;
        }
    }

    public abstract static class SuggestedAction extends Object {
        public SuggestedAction() {
        }
    }

    public static class StorePaymentPurposeGiftedPremium extends StorePaymentPurpose {
        public long userId;
        public String currency;
        public long amount;
        public static final int CONSTRUCTOR = 1916846289;

        public StorePaymentPurposeGiftedPremium() {
        }

        public StorePaymentPurposeGiftedPremium(long var1, String var3, long var4) {
            this.userId = var1;
            this.currency = var3;
            this.amount = var4;
        }

        public int getConstructor() {
            return 1916846289;
        }
    }

    public static class StorePaymentPurposePremiumSubscription extends StorePaymentPurpose {
        public boolean isRestore;
        public static final int CONSTRUCTOR = -1497906096;

        public StorePaymentPurposePremiumSubscription() {
        }

        public StorePaymentPurposePremiumSubscription(boolean var1) {
            this.isRestore = var1;
        }

        public int getConstructor() {
            return -1497906096;
        }
    }

    public abstract static class StorePaymentPurpose extends Object {
        public StorePaymentPurpose() {
        }
    }

    public static class StorageStatisticsFast extends Object {
        public long filesSize;
        public int fileCount;
        public long databaseSize;
        public long languagePackDatabaseSize;
        public long logSize;
        public static final int CONSTRUCTOR = -884922271;

        public StorageStatisticsFast() {
        }

        public StorageStatisticsFast(long var1, int var3, long var4, long var6, long var8) {
            this.filesSize = var1;
            this.fileCount = var3;
            this.databaseSize = var4;
            this.languagePackDatabaseSize = var6;
            this.logSize = var8;
        }

        public int getConstructor() {
            return -884922271;
        }
    }

    public static class StorageStatisticsByFileType extends Object {
        public FileType fileType;
        public long size;
        public int count;
        public static final int CONSTRUCTOR = 714012840;

        public StorageStatisticsByFileType() {
        }

        public StorageStatisticsByFileType(FileType var1, long var2, int var4) {
            this.fileType = var1;
            this.size = var2;
            this.count = var4;
        }

        public int getConstructor() {
            return 714012840;
        }
    }

    public static class StorageStatisticsByChat extends Object {
        public long chatId;
        public long size;
        public int count;
        public StorageStatisticsByFileType[] byFileType;
        public static final int CONSTRUCTOR = 635434531;

        public StorageStatisticsByChat() {
        }

        public StorageStatisticsByChat(long var1, long var3, int var5, StorageStatisticsByFileType[] var6) {
            this.chatId = var1;
            this.size = var3;
            this.count = var5;
            this.byFileType = var6;
        }

        public int getConstructor() {
            return 635434531;
        }
    }

    public static class StorageStatistics extends Object {
        public long size;
        public int count;
        public StorageStatisticsByChat[] byChat;
        public static final int CONSTRUCTOR = 217237013;

        public StorageStatistics() {
        }

        public StorageStatistics(long var1, int var3, StorageStatisticsByChat[] var4) {
            this.size = var1;
            this.count = var3;
            this.byChat = var4;
        }

        public int getConstructor() {
            return 217237013;
        }
    }

    public static class Stickers extends Object {
        public Sticker[] stickers;
        public static final int CONSTRUCTOR = 1974859260;

        public Stickers() {
        }

        public Stickers(Sticker[] var1) {
            this.stickers = var1;
        }

        public int getConstructor() {
            return 1974859260;
        }
    }

    public static class StickerTypeCustomEmoji extends StickerType {
        public static final int CONSTRUCTOR = -120752249;

        public StickerTypeCustomEmoji() {
        }

        public int getConstructor() {
            return -120752249;
        }
    }

    public static class StickerTypeMask extends StickerType {
        public static final int CONSTRUCTOR = -1765394796;

        public StickerTypeMask() {
        }

        public int getConstructor() {
            return -1765394796;
        }
    }

    public static class StickerTypeRegular extends StickerType {
        public static final int CONSTRUCTOR = 56345973;

        public StickerTypeRegular() {
        }

        public int getConstructor() {
            return 56345973;
        }
    }

    public abstract static class StickerType extends Object {
        public StickerType() {
        }
    }

    public static class StickerSets extends Object {
        public int totalCount;
        public StickerSetInfo[] sets;
        public static final int CONSTRUCTOR = -1883828812;

        public StickerSets() {
        }

        public StickerSets(int var1, StickerSetInfo[] var2) {
            this.totalCount = var1;
            this.sets = var2;
        }

        public int getConstructor() {
            return -1883828812;
        }
    }

    public static class StickerSetInfo extends Object {
        public long id;
        public String title;
        public String name;
        public Thumbnail thumbnail;
        public ClosedVectorPath[] thumbnailOutline;
        public boolean isInstalled;
        public boolean isArchived;
        public boolean isOfficial;
        public StickerFormat stickerFormat;
        public StickerType stickerType;
        public boolean isViewed;
        public int size;
        public Sticker[] covers;
        public static final int CONSTRUCTOR = 745543121;

        public StickerSetInfo() {
        }

        public StickerSetInfo(long var1, String var3, String var4, Thumbnail var5, ClosedVectorPath[] var6, boolean var7, boolean var8, boolean var9, StickerFormat var10, StickerType var11, boolean var12, int var13, Sticker[] var14) {
            this.id = var1;
            this.title = var3;
            this.name = var4;
            this.thumbnail = var5;
            this.thumbnailOutline = var6;
            this.isInstalled = var7;
            this.isArchived = var8;
            this.isOfficial = var9;
            this.stickerFormat = var10;
            this.stickerType = var11;
            this.isViewed = var12;
            this.size = var13;
            this.covers = var14;
        }

        public int getConstructor() {
            return 745543121;
        }
    }

    public static class StickerSet extends Object {
        public long id;
        public String title;
        public String name;
        public Thumbnail thumbnail;
        public ClosedVectorPath[] thumbnailOutline;
        public boolean isInstalled;
        public boolean isArchived;
        public boolean isOfficial;
        public StickerFormat stickerFormat;
        public StickerType stickerType;
        public boolean isViewed;
        public Sticker[] stickers;
        public Emojis[] emojis;
        public static final int CONSTRUCTOR = 1899632064;

        public StickerSet() {
        }

        public StickerSet(long var1, String var3, String var4, Thumbnail var5, ClosedVectorPath[] var6, boolean var7, boolean var8, boolean var9, StickerFormat var10, StickerType var11, boolean var12, Sticker[] var13, Emojis[] var14) {
            this.id = var1;
            this.title = var3;
            this.name = var4;
            this.thumbnail = var5;
            this.thumbnailOutline = var6;
            this.isInstalled = var7;
            this.isArchived = var8;
            this.isOfficial = var9;
            this.stickerFormat = var10;
            this.stickerType = var11;
            this.isViewed = var12;
            this.stickers = var13;
            this.emojis = var14;
        }

        public int getConstructor() {
            return 1899632064;
        }
    }

    public static class StickerFormatWebm extends StickerFormat {
        public static final int CONSTRUCTOR = -2070162097;

        public StickerFormatWebm() {
        }

        public int getConstructor() {
            return -2070162097;
        }
    }

    public static class StickerFormatTgs extends StickerFormat {
        public static final int CONSTRUCTOR = 1614588662;

        public StickerFormatTgs() {
        }

        public int getConstructor() {
            return 1614588662;
        }
    }

    public static class StickerFormatWebp extends StickerFormat {
        public static final int CONSTRUCTOR = -2123043040;

        public StickerFormatWebp() {
        }

        public int getConstructor() {
            return -2123043040;
        }
    }

    public abstract static class StickerFormat extends Object {
        public StickerFormat() {
        }
    }

    public static class Sticker extends Object {
        public long setId;
        public int width;
        public int height;
        public String emoji;
        public StickerFormat format;
        public StickerType type;
        public MaskPosition maskPosition;
        public long customEmojiId;
        public ClosedVectorPath[] outline;
        public Thumbnail thumbnail;
        public boolean isPremium;
        public File premiumAnimation;
        public File sticker;
        public static final int CONSTRUCTOR = -1108220879;

        public Sticker() {
        }

        public Sticker(long var1, int var3, int var4, String var5, StickerFormat var6, StickerType var7, MaskPosition var8, long var9, ClosedVectorPath[] var11, Thumbnail var12, boolean var13, File var14, File var15) {
            this.setId = var1;
            this.width = var3;
            this.height = var4;
            this.emoji = var5;
            this.format = var6;
            this.type = var7;
            this.maskPosition = var8;
            this.customEmojiId = var9;
            this.outline = var11;
            this.thumbnail = var12;
            this.isPremium = var13;
            this.premiumAnimation = var14;
            this.sticker = var15;
        }

        public int getConstructor() {
            return -1108220879;
        }
    }

    public static class StatisticalValue extends Object {
        public double value;
        public double previousValue;
        public double growthRatePercentage;
        public static final int CONSTRUCTOR = 1651337846;

        public StatisticalValue() {
        }

        public StatisticalValue(double var1, double var3, double var5) {
            this.value = var1;
            this.previousValue = var3;
            this.growthRatePercentage = var5;
        }

        public int getConstructor() {
            return 1651337846;
        }
    }

    public static class StatisticalGraphError extends StatisticalGraph {
        public String errorMessage;
        public static final int CONSTRUCTOR = -1006788526;

        public StatisticalGraphError() {
        }

        public StatisticalGraphError(String var1) {
            this.errorMessage = var1;
        }

        public int getConstructor() {
            return -1006788526;
        }
    }

    public static class StatisticalGraphAsync extends StatisticalGraph {
        public String token;
        public static final int CONSTRUCTOR = 435891103;

        public StatisticalGraphAsync() {
        }

        public StatisticalGraphAsync(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 435891103;
        }
    }

    public static class StatisticalGraphData extends StatisticalGraph {
        public String jsonData;
        public String zoomToken;
        public static final int CONSTRUCTOR = -1988940244;

        public StatisticalGraphData() {
        }

        public StatisticalGraphData(String var1, String var2) {
            this.jsonData = var1;
            this.zoomToken = var2;
        }

        public int getConstructor() {
            return -1988940244;
        }
    }

    public abstract static class StatisticalGraph extends Object {
        public StatisticalGraph() {
        }
    }

    public static class SponsoredMessage extends Object {
        public long messageId;
        public boolean isRecommended;
        public long sponsorChatId;
        public ChatInviteLinkInfo sponsorChatInfo;
        public InternalLinkType link;
        public MessageContent content;
        public static final int CONSTRUCTOR = 555261322;

        public SponsoredMessage() {
        }

        public SponsoredMessage(long var1, boolean var3, long var4, ChatInviteLinkInfo var6, InternalLinkType var7, MessageContent var8) {
            this.messageId = var1;
            this.isRecommended = var3;
            this.sponsorChatId = var4;
            this.sponsorChatInfo = var6;
            this.link = var7;
            this.content = var8;
        }

        public int getConstructor() {
            return 555261322;
        }
    }

    public static class SpeechRecognitionResultError extends SpeechRecognitionResult {
        public Error error;
        public static final int CONSTRUCTOR = 164774908;

        public SpeechRecognitionResultError() {
        }

        public SpeechRecognitionResultError(Error var1) {
            this.error = var1;
        }

        public int getConstructor() {
            return 164774908;
        }
    }

    public static class SpeechRecognitionResultText extends SpeechRecognitionResult {
        public String text;
        public static final int CONSTRUCTOR = -2132377123;

        public SpeechRecognitionResultText() {
        }

        public SpeechRecognitionResultText(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -2132377123;
        }
    }

    public static class SpeechRecognitionResultPending extends SpeechRecognitionResult {
        public String partialText;
        public static final int CONSTRUCTOR = -1631810048;

        public SpeechRecognitionResultPending() {
        }

        public SpeechRecognitionResultPending(String var1) {
            this.partialText = var1;
        }

        public int getConstructor() {
            return -1631810048;
        }
    }

    public abstract static class SpeechRecognitionResult extends Object {
        public SpeechRecognitionResult() {
        }
    }

    public static class ShippingOption extends Object {
        public String id;
        public String title;
        public LabeledPricePart[] priceParts;
        public static final int CONSTRUCTOR = 1425690001;

        public ShippingOption() {
        }

        public ShippingOption(String var1, String var2, LabeledPricePart[] var3) {
            this.id = var1;
            this.title = var2;
            this.priceParts = var3;
        }

        public int getConstructor() {
            return 1425690001;
        }
    }

    public static class Sessions extends Object {
        public Session[] sessions;
        public int inactiveSessionTtlDays;
        public static final int CONSTRUCTOR = 842912274;

        public Sessions() {
        }

        public Sessions(Session[] var1, int var2) {
            this.sessions = var1;
            this.inactiveSessionTtlDays = var2;
        }

        public int getConstructor() {
            return 842912274;
        }
    }

    public static class SessionTypeXbox extends SessionType {
        public static final int CONSTRUCTOR = 1856216492;

        public SessionTypeXbox() {
        }

        public int getConstructor() {
            return 1856216492;
        }
    }

    public static class SessionTypeWindows extends SessionType {
        public static final int CONSTRUCTOR = -1676512600;

        public SessionTypeWindows() {
        }

        public int getConstructor() {
            return -1676512600;
        }
    }

    public static class SessionTypeVivaldi extends SessionType {
        public static final int CONSTRUCTOR = 1120503279;

        public SessionTypeVivaldi() {
        }

        public int getConstructor() {
            return 1120503279;
        }
    }

    public static class SessionTypeUnknown extends SessionType {
        public static final int CONSTRUCTOR = 233926704;

        public SessionTypeUnknown() {
        }

        public int getConstructor() {
            return 233926704;
        }
    }

    public static class SessionTypeUbuntu extends SessionType {
        public static final int CONSTRUCTOR = 1569680069;

        public SessionTypeUbuntu() {
        }

        public int getConstructor() {
            return 1569680069;
        }
    }

    public static class SessionTypeSafari extends SessionType {
        public static final int CONSTRUCTOR = 710646873;

        public SessionTypeSafari() {
        }

        public int getConstructor() {
            return 710646873;
        }
    }

    public static class SessionTypeOpera extends SessionType {
        public static final int CONSTRUCTOR = -1463673734;

        public SessionTypeOpera() {
        }

        public int getConstructor() {
            return -1463673734;
        }
    }

    public static class SessionTypeMac extends SessionType {
        public static final int CONSTRUCTOR = -612250975;

        public SessionTypeMac() {
        }

        public int getConstructor() {
            return -612250975;
        }
    }

    public static class SessionTypeLinux extends SessionType {
        public static final int CONSTRUCTOR = -1487422871;

        public SessionTypeLinux() {
        }

        public int getConstructor() {
            return -1487422871;
        }
    }

    public static class SessionTypeIphone extends SessionType {
        public static final int CONSTRUCTOR = 97616573;

        public SessionTypeIphone() {
        }

        public int getConstructor() {
            return 97616573;
        }
    }

    public static class SessionTypeIpad extends SessionType {
        public static final int CONSTRUCTOR = 1294647023;

        public SessionTypeIpad() {
        }

        public int getConstructor() {
            return 1294647023;
        }
    }

    public static class SessionTypeFirefox extends SessionType {
        public static final int CONSTRUCTOR = 2122579364;

        public SessionTypeFirefox() {
        }

        public int getConstructor() {
            return 2122579364;
        }
    }

    public static class SessionTypeEdge extends SessionType {
        public static final int CONSTRUCTOR = -538916005;

        public SessionTypeEdge() {
        }

        public int getConstructor() {
            return -538916005;
        }
    }

    public static class SessionTypeChrome extends SessionType {
        public static final int CONSTRUCTOR = 1573464425;

        public SessionTypeChrome() {
        }

        public int getConstructor() {
            return 1573464425;
        }
    }

    public static class SessionTypeBrave extends SessionType {
        public static final int CONSTRUCTOR = -1216812563;

        public SessionTypeBrave() {
        }

        public int getConstructor() {
            return -1216812563;
        }
    }

    public static class SessionTypeApple extends SessionType {
        public static final int CONSTRUCTOR = -1818635701;

        public SessionTypeApple() {
        }

        public int getConstructor() {
            return -1818635701;
        }
    }

    public static class SessionTypeAndroid extends SessionType {
        public static final int CONSTRUCTOR = -2071764840;

        public SessionTypeAndroid() {
        }

        public int getConstructor() {
            return -2071764840;
        }
    }

    public abstract static class SessionType extends Object {
        public SessionType() {
        }
    }

    public static class Session extends Object {
        public long id;
        public boolean isCurrent;
        public boolean isPasswordPending;
        public boolean canAcceptSecretChats;
        public boolean canAcceptCalls;
        public SessionType type;
        public int apiId;
        public String applicationName;
        public String applicationVersion;
        public boolean isOfficialApplication;
        public String deviceModel;
        public String platform;
        public String systemVersion;
        public int logInDate;
        public int lastActiveDate;
        public String ip;
        public String country;
        public String region;
        public static final int CONSTRUCTOR = -1961323642;

        public Session() {
        }

        public Session(long var1, boolean var3, boolean var4, boolean var5, boolean var6, SessionType var7, int var8, String var9, String var10, boolean var11, String var12, String var13, String var14, int var15, int var16, String var17, String var18, String var19) {
            this.id = var1;
            this.isCurrent = var3;
            this.isPasswordPending = var4;
            this.canAcceptSecretChats = var5;
            this.canAcceptCalls = var6;
            this.type = var7;
            this.apiId = var8;
            this.applicationName = var9;
            this.applicationVersion = var10;
            this.isOfficialApplication = var11;
            this.deviceModel = var12;
            this.platform = var13;
            this.systemVersion = var14;
            this.logInDate = var15;
            this.lastActiveDate = var16;
            this.ip = var17;
            this.country = var18;
            this.region = var19;
        }

        public int getConstructor() {
            return -1961323642;
        }
    }

    public static class SentWebAppMessage extends Object {
        public String inlineMessageId;
        public static final int CONSTRUCTOR = 1243934400;

        public SentWebAppMessage() {
        }

        public SentWebAppMessage(String var1) {
            this.inlineMessageId = var1;
        }

        public int getConstructor() {
            return 1243934400;
        }
    }

    public static class SecretChatStateClosed extends SecretChatState {
        public static final int CONSTRUCTOR = -1945106707;

        public SecretChatStateClosed() {
        }

        public int getConstructor() {
            return -1945106707;
        }
    }

    public static class SecretChatStateReady extends SecretChatState {
        public static final int CONSTRUCTOR = -1611352087;

        public SecretChatStateReady() {
        }

        public int getConstructor() {
            return -1611352087;
        }
    }

    public static class SecretChatStatePending extends SecretChatState {
        public static final int CONSTRUCTOR = -1637050756;

        public SecretChatStatePending() {
        }

        public int getConstructor() {
            return -1637050756;
        }
    }

    public abstract static class SecretChatState extends Object {
        public SecretChatState() {
        }
    }

    public static class SecretChat extends Object {
        public int id;
        public long userId;
        public SecretChatState state;
        public boolean isOutbound;
        public byte[] keyHash;
        public int layer;
        public static final int CONSTRUCTOR = -676918325;

        public SecretChat() {
        }

        public SecretChat(int var1, long var2, SecretChatState var4, boolean var5, byte[] var6, int var7) {
            this.id = var1;
            this.userId = var2;
            this.state = var4;
            this.isOutbound = var5;
            this.keyHash = var6;
            this.layer = var7;
        }

        public int getConstructor() {
            return -676918325;
        }
    }

    public static class Seconds extends Object {
        public double seconds;
        public static final int CONSTRUCTOR = 959899022;

        public Seconds() {
        }

        public Seconds(double var1) {
            this.seconds = var1;
        }

        public int getConstructor() {
            return 959899022;
        }
    }

    public static class SearchMessagesFilterPinned extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 371805512;

        public SearchMessagesFilterPinned() {
        }

        public int getConstructor() {
            return 371805512;
        }
    }

    public static class SearchMessagesFilterFailedToSend extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -596322564;

        public SearchMessagesFilterFailedToSend() {
        }

        public int getConstructor() {
            return -596322564;
        }
    }

    public static class SearchMessagesFilterUnreadReaction extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1379651328;

        public SearchMessagesFilterUnreadReaction() {
        }

        public int getConstructor() {
            return -1379651328;
        }
    }

    public static class SearchMessagesFilterUnreadMention extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -95769149;

        public SearchMessagesFilterUnreadMention() {
        }

        public int getConstructor() {
            return -95769149;
        }
    }

    public static class SearchMessagesFilterMention extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 2001258652;

        public SearchMessagesFilterMention() {
        }

        public int getConstructor() {
            return 2001258652;
        }
    }

    public static class SearchMessagesFilterVoiceAndVideoNote extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 664174819;

        public SearchMessagesFilterVoiceAndVideoNote() {
        }

        public int getConstructor() {
            return 664174819;
        }
    }

    public static class SearchMessagesFilterVideoNote extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 564323321;

        public SearchMessagesFilterVideoNote() {
        }

        public int getConstructor() {
            return 564323321;
        }
    }

    public static class SearchMessagesFilterChatPhoto extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1247751329;

        public SearchMessagesFilterChatPhoto() {
        }

        public int getConstructor() {
            return -1247751329;
        }
    }

    public static class SearchMessagesFilterUrl extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -1828724341;

        public SearchMessagesFilterUrl() {
        }

        public int getConstructor() {
            return -1828724341;
        }
    }

    public static class SearchMessagesFilterPhotoAndVideo extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1352130963;

        public SearchMessagesFilterPhotoAndVideo() {
        }

        public int getConstructor() {
            return 1352130963;
        }
    }

    public static class SearchMessagesFilterVoiceNote extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1841439357;

        public SearchMessagesFilterVoiceNote() {
        }

        public int getConstructor() {
            return 1841439357;
        }
    }

    public static class SearchMessagesFilterVideo extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 115538222;

        public SearchMessagesFilterVideo() {
        }

        public int getConstructor() {
            return 115538222;
        }
    }

    public static class SearchMessagesFilterPhoto extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 925932293;

        public SearchMessagesFilterPhoto() {
        }

        public int getConstructor() {
            return 925932293;
        }
    }

    public static class SearchMessagesFilterDocument extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 1526331215;

        public SearchMessagesFilterDocument() {
        }

        public int getConstructor() {
            return 1526331215;
        }
    }

    public static class SearchMessagesFilterAudio extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = 867505275;

        public SearchMessagesFilterAudio() {
        }

        public int getConstructor() {
            return 867505275;
        }
    }

    public static class SearchMessagesFilterAnimation extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -155713339;

        public SearchMessagesFilterAnimation() {
        }

        public int getConstructor() {
            return -155713339;
        }
    }

    public static class SearchMessagesFilterEmpty extends SearchMessagesFilter {
        public static final int CONSTRUCTOR = -869395657;

        public SearchMessagesFilterEmpty() {
        }

        public int getConstructor() {
            return -869395657;
        }
    }

    public abstract static class SearchMessagesFilter extends Object {
        public SearchMessagesFilter() {
        }
    }

    public static class ScopeNotificationSettings extends Object {
        public int muteFor;
        public long soundId;
        public boolean showPreview;
        public boolean disablePinnedMessageNotifications;
        public boolean disableMentionNotifications;
        public static final int CONSTRUCTOR = -1383458661;

        public ScopeNotificationSettings() {
        }

        public ScopeNotificationSettings(int var1, long var2, boolean var4, boolean var5, boolean var6) {
            this.muteFor = var1;
            this.soundId = var2;
            this.showPreview = var4;
            this.disablePinnedMessageNotifications = var5;
            this.disableMentionNotifications = var6;
        }

        public int getConstructor() {
            return -1383458661;
        }
    }

    public static class SavedCredentials extends Object {
        public String id;
        public String title;
        public static final int CONSTRUCTOR = -370273060;

        public SavedCredentials() {
        }

        public SavedCredentials(String var1, String var2) {
            this.id = var1;
            this.title = var2;
        }

        public int getConstructor() {
            return -370273060;
        }
    }

    public static class RtmpUrl extends Object {
        public String url;
        public String streamKey;
        public static final int CONSTRUCTOR = 1009302613;

        public RtmpUrl() {
        }

        public RtmpUrl(String var1, String var2) {
            this.url = var1;
            this.streamKey = var2;
        }

        public int getConstructor() {
            return 1009302613;
        }
    }

    public static class RichTexts extends RichText {
        public RichText[] texts;
        public static final int CONSTRUCTOR = 1647457821;

        public RichTexts() {
        }

        public RichTexts(RichText[] var1) {
            this.texts = var1;
        }

        public int getConstructor() {
            return 1647457821;
        }
    }

    public static class RichTextAnchorLink extends RichText {
        public RichText text;
        public String anchorName;
        public String url;
        public static final int CONSTRUCTOR = -1541418282;

        public RichTextAnchorLink() {
        }

        public RichTextAnchorLink(RichText var1, String var2, String var3) {
            this.text = var1;
            this.anchorName = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return -1541418282;
        }
    }

    public static class RichTextAnchor extends RichText {
        public String name;
        public static final int CONSTRUCTOR = 1316950068;

        public RichTextAnchor() {
        }

        public RichTextAnchor(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return 1316950068;
        }
    }

    public static class RichTextReference extends RichText {
        public RichText text;
        public String anchorName;
        public String url;
        public static final int CONSTRUCTOR = -1147530634;

        public RichTextReference() {
        }

        public RichTextReference(RichText var1, String var2, String var3) {
            this.text = var1;
            this.anchorName = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return -1147530634;
        }
    }

    public static class RichTextIcon extends RichText {
        public Document document;
        public int width;
        public int height;
        public static final int CONSTRUCTOR = -1480316158;

        public RichTextIcon() {
        }

        public RichTextIcon(Document var1, int var2, int var3) {
            this.document = var1;
            this.width = var2;
            this.height = var3;
        }

        public int getConstructor() {
            return -1480316158;
        }
    }

    public static class RichTextPhoneNumber extends RichText {
        public RichText text;
        public String phoneNumber;
        public static final int CONSTRUCTOR = 128521539;

        public RichTextPhoneNumber() {
        }

        public RichTextPhoneNumber(RichText var1, String var2) {
            this.text = var1;
            this.phoneNumber = var2;
        }

        public int getConstructor() {
            return 128521539;
        }
    }

    public static class RichTextMarked extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = -1271999614;

        public RichTextMarked() {
        }

        public RichTextMarked(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -1271999614;
        }
    }

    public static class RichTextSuperscript extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = -382241437;

        public RichTextSuperscript() {
        }

        public RichTextSuperscript(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -382241437;
        }
    }

    public static class RichTextSubscript extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = -868197812;

        public RichTextSubscript() {
        }

        public RichTextSubscript(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -868197812;
        }
    }

    public static class RichTextEmailAddress extends RichText {
        public RichText text;
        public String emailAddress;
        public static final int CONSTRUCTOR = 40018679;

        public RichTextEmailAddress() {
        }

        public RichTextEmailAddress(RichText var1, String var2) {
            this.text = var1;
            this.emailAddress = var2;
        }

        public int getConstructor() {
            return 40018679;
        }
    }

    public static class RichTextUrl extends RichText {
        public RichText text;
        public String url;
        public boolean isCached;
        public static final int CONSTRUCTOR = 83939092;

        public RichTextUrl() {
        }

        public RichTextUrl(RichText var1, String var2, boolean var3) {
            this.text = var1;
            this.url = var2;
            this.isCached = var3;
        }

        public int getConstructor() {
            return 83939092;
        }
    }

    public static class RichTextFixed extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = -1271496249;

        public RichTextFixed() {
        }

        public RichTextFixed(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -1271496249;
        }
    }

    public static class RichTextStrikethrough extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = 723413585;

        public RichTextStrikethrough() {
        }

        public RichTextStrikethrough(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 723413585;
        }
    }

    public static class RichTextUnderline extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = -536019572;

        public RichTextUnderline() {
        }

        public RichTextUnderline(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return -536019572;
        }
    }

    public static class RichTextItalic extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = 1853354047;

        public RichTextItalic() {
        }

        public RichTextItalic(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1853354047;
        }
    }

    public static class RichTextBold extends RichText {
        public RichText text;
        public static final int CONSTRUCTOR = 1670844268;

        public RichTextBold() {
        }

        public RichTextBold(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1670844268;
        }
    }

    public static class RichTextPlain extends RichText {
        public String text;
        public static final int CONSTRUCTOR = 482617702;

        public RichTextPlain() {
        }

        public RichTextPlain(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 482617702;
        }
    }

    public abstract static class RichText extends Object {
        public RichText() {
        }
    }

    public static class ResetPasswordResultDeclined extends ResetPasswordResult {
        public int retryDate;
        public static final int CONSTRUCTOR = -1202200373;

        public ResetPasswordResultDeclined() {
        }

        public ResetPasswordResultDeclined(int var1) {
            this.retryDate = var1;
        }

        public int getConstructor() {
            return -1202200373;
        }
    }

    public static class ResetPasswordResultPending extends ResetPasswordResult {
        public int pendingResetDate;
        public static final int CONSTRUCTOR = 1193925721;

        public ResetPasswordResultPending() {
        }

        public ResetPasswordResultPending(int var1) {
            this.pendingResetDate = var1;
        }

        public int getConstructor() {
            return 1193925721;
        }
    }

    public static class ResetPasswordResultOk extends ResetPasswordResult {
        public static final int CONSTRUCTOR = -1397267463;

        public ResetPasswordResultOk() {
        }

        public int getConstructor() {
            return -1397267463;
        }
    }

    public abstract static class ResetPasswordResult extends Object {
        public ResetPasswordResult() {
        }
    }

    public static class ReplyMarkupInlineKeyboard extends ReplyMarkup {
        public InlineKeyboardButton[][] rows;
        public static final int CONSTRUCTOR = -619317658;

        public ReplyMarkupInlineKeyboard() {
        }

        public ReplyMarkupInlineKeyboard(InlineKeyboardButton[][] var1) {
            this.rows = var1;
        }

        public int getConstructor() {
            return -619317658;
        }
    }

    public static class ReplyMarkupShowKeyboard extends ReplyMarkup {
        public KeyboardButton[][] rows;
        public boolean resizeKeyboard;
        public boolean oneTime;
        public boolean isPersonal;
        public String inputFieldPlaceholder;
        public static final int CONSTRUCTOR = -64985802;

        public ReplyMarkupShowKeyboard() {
        }

        public ReplyMarkupShowKeyboard(KeyboardButton[][] var1, boolean var2, boolean var3, boolean var4, String var5) {
            this.rows = var1;
            this.resizeKeyboard = var2;
            this.oneTime = var3;
            this.isPersonal = var4;
            this.inputFieldPlaceholder = var5;
        }

        public int getConstructor() {
            return -64985802;
        }
    }

    public static class ReplyMarkupForceReply extends ReplyMarkup {
        public boolean isPersonal;
        public String inputFieldPlaceholder;
        public static final int CONSTRUCTOR = 1101461919;

        public ReplyMarkupForceReply() {
        }

        public ReplyMarkupForceReply(boolean var1, String var2) {
            this.isPersonal = var1;
            this.inputFieldPlaceholder = var2;
        }

        public int getConstructor() {
            return 1101461919;
        }
    }

    public static class ReplyMarkupRemoveKeyboard extends ReplyMarkup {
        public boolean isPersonal;
        public static final int CONSTRUCTOR = -691252879;

        public ReplyMarkupRemoveKeyboard() {
        }

        public ReplyMarkupRemoveKeyboard(boolean var1) {
            this.isPersonal = var1;
        }

        public int getConstructor() {
            return -691252879;
        }
    }

    public abstract static class ReplyMarkup extends Object {
        public ReplyMarkup() {
        }
    }

    public static class RemoteFile extends Object {
        public String id;
        public String uniqueId;
        public boolean isUploadingActive;
        public boolean isUploadingCompleted;
        public long uploadedSize;
        public static final int CONSTRUCTOR = 747731030;

        public RemoteFile() {
        }

        public RemoteFile(String var1, String var2, boolean var3, boolean var4, long var5) {
            this.id = var1;
            this.uniqueId = var2;
            this.isUploadingActive = var3;
            this.isUploadingCompleted = var4;
            this.uploadedSize = var5;
        }

        public int getConstructor() {
            return 747731030;
        }
    }

    public static class RecoveryEmailAddress extends Object {
        public String recoveryEmailAddress;
        public static final int CONSTRUCTOR = 1290526187;

        public RecoveryEmailAddress() {
        }

        public RecoveryEmailAddress(String var1) {
            this.recoveryEmailAddress = var1;
        }

        public int getConstructor() {
            return 1290526187;
        }
    }

    public static class RecommendedChatFilters extends Object {
        public RecommendedChatFilter[] chatFilters;
        public static final int CONSTRUCTOR = -263416880;

        public RecommendedChatFilters() {
        }

        public RecommendedChatFilters(RecommendedChatFilter[] var1) {
            this.chatFilters = var1;
        }

        public int getConstructor() {
            return -263416880;
        }
    }

    public static class RecommendedChatFilter extends Object {
        public ChatFilter filter;
        public String description;
        public static final int CONSTRUCTOR = 36048610;

        public RecommendedChatFilter() {
        }

        public RecommendedChatFilter(ChatFilter var1, String var2) {
            this.filter = var1;
            this.description = var2;
        }

        public int getConstructor() {
            return 36048610;
        }
    }

    public static class ReactionTypeCustomEmoji extends ReactionType {
        public long customEmojiId;
        public static final int CONSTRUCTOR = -989117709;

        public ReactionTypeCustomEmoji() {
        }

        public ReactionTypeCustomEmoji(long var1) {
            this.customEmojiId = var1;
        }

        public int getConstructor() {
            return -989117709;
        }
    }

    public static class ReactionTypeEmoji extends ReactionType {
        public String emoji;
        public static final int CONSTRUCTOR = -1942084920;

        public ReactionTypeEmoji() {
        }

        public ReactionTypeEmoji(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return -1942084920;
        }
    }

    public abstract static class ReactionType extends Object {
        public ReactionType() {
        }
    }

    public static class PushReceiverId extends Object {
        public long id;
        public static final int CONSTRUCTOR = 371056428;

        public PushReceiverId() {
        }

        public PushReceiverId(long var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 371056428;
        }
    }

    public static class PushMessageContentMediaAlbum extends PushMessageContent {
        public int totalCount;
        public boolean hasPhotos;
        public boolean hasVideos;
        public boolean hasAudios;
        public boolean hasDocuments;
        public static final int CONSTRUCTOR = -748426897;

        public PushMessageContentMediaAlbum() {
        }

        public PushMessageContentMediaAlbum(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
            this.totalCount = var1;
            this.hasPhotos = var2;
            this.hasVideos = var3;
            this.hasAudios = var4;
            this.hasDocuments = var5;
        }

        public int getConstructor() {
            return -748426897;
        }
    }

    public static class PushMessageContentMessageForwards extends PushMessageContent {
        public int totalCount;
        public static final int CONSTRUCTOR = -1913083876;

        public PushMessageContentMessageForwards() {
        }

        public PushMessageContentMessageForwards(int var1) {
            this.totalCount = var1;
        }

        public int getConstructor() {
            return -1913083876;
        }
    }

    public static class PushMessageContentRecurringPayment extends PushMessageContent {
        public String amount;
        public static final int CONSTRUCTOR = 1619211802;

        public PushMessageContentRecurringPayment() {
        }

        public PushMessageContentRecurringPayment(String var1) {
            this.amount = var1;
        }

        public int getConstructor() {
            return 1619211802;
        }
    }

    public static class PushMessageContentChatJoinByRequest extends PushMessageContent {
        public static final int CONSTRUCTOR = -205823627;

        public PushMessageContentChatJoinByRequest() {
        }

        public int getConstructor() {
            return -205823627;
        }
    }

    public static class PushMessageContentChatJoinByLink extends PushMessageContent {
        public static final int CONSTRUCTOR = 1553719113;

        public PushMessageContentChatJoinByLink() {
        }

        public int getConstructor() {
            return 1553719113;
        }
    }

    public static class PushMessageContentChatDeleteMember extends PushMessageContent {
        public String memberName;
        public boolean isCurrentUser;
        public boolean isLeft;
        public static final int CONSTRUCTOR = 598714783;

        public PushMessageContentChatDeleteMember() {
        }

        public PushMessageContentChatDeleteMember(String var1, boolean var2, boolean var3) {
            this.memberName = var1;
            this.isCurrentUser = var2;
            this.isLeft = var3;
        }

        public int getConstructor() {
            return 598714783;
        }
    }

    public static class PushMessageContentChatSetTheme extends PushMessageContent {
        public String themeName;
        public static final int CONSTRUCTOR = 173882216;

        public PushMessageContentChatSetTheme() {
        }

        public PushMessageContentChatSetTheme(String var1) {
            this.themeName = var1;
        }

        public int getConstructor() {
            return 173882216;
        }
    }

    public static class PushMessageContentChatChangeTitle extends PushMessageContent {
        public String title;
        public static final int CONSTRUCTOR = -1964902749;

        public PushMessageContentChatChangeTitle() {
        }

        public PushMessageContentChatChangeTitle(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -1964902749;
        }
    }

    public static class PushMessageContentChatChangePhoto extends PushMessageContent {
        public static final int CONSTRUCTOR = -1114222051;

        public PushMessageContentChatChangePhoto() {
        }

        public int getConstructor() {
            return -1114222051;
        }
    }

    public static class PushMessageContentChatAddMembers extends PushMessageContent {
        public String memberName;
        public boolean isCurrentUser;
        public boolean isReturned;
        public static final int CONSTRUCTOR = -1087145158;

        public PushMessageContentChatAddMembers() {
        }

        public PushMessageContentChatAddMembers(String var1, boolean var2, boolean var3) {
            this.memberName = var1;
            this.isCurrentUser = var2;
            this.isReturned = var3;
        }

        public int getConstructor() {
            return -1087145158;
        }
    }

    public static class PushMessageContentBasicGroupChatCreate extends PushMessageContent {
        public static final int CONSTRUCTOR = -2114855172;

        public PushMessageContentBasicGroupChatCreate() {
        }

        public int getConstructor() {
            return -2114855172;
        }
    }

    public static class PushMessageContentVoiceNote extends PushMessageContent {
        public VoiceNote voiceNote;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 88910987;

        public PushMessageContentVoiceNote() {
        }

        public PushMessageContentVoiceNote(VoiceNote var1, boolean var2) {
            this.voiceNote = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return 88910987;
        }
    }

    public static class PushMessageContentVideoNote extends PushMessageContent {
        public VideoNote videoNote;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1122764417;

        public PushMessageContentVideoNote() {
        }

        public PushMessageContentVideoNote(VideoNote var1, boolean var2) {
            this.videoNote = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -1122764417;
        }
    }

    public static class PushMessageContentVideo extends PushMessageContent {
        public Video video;
        public String caption;
        public boolean isSecret;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 310038831;

        public PushMessageContentVideo() {
        }

        public PushMessageContentVideo(Video var1, String var2, boolean var3, boolean var4) {
            this.video = var1;
            this.caption = var2;
            this.isSecret = var3;
            this.isPinned = var4;
        }

        public int getConstructor() {
            return 310038831;
        }
    }

    public static class PushMessageContentText extends PushMessageContent {
        public String text;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 274587305;

        public PushMessageContentText() {
        }

        public PushMessageContentText(String var1, boolean var2) {
            this.text = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return 274587305;
        }
    }

    public static class PushMessageContentSticker extends PushMessageContent {
        public Sticker sticker;
        public String emoji;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1553513939;

        public PushMessageContentSticker() {
        }

        public PushMessageContentSticker(Sticker var1, String var2, boolean var3) {
            this.sticker = var1;
            this.emoji = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return 1553513939;
        }
    }

    public static class PushMessageContentScreenshotTaken extends PushMessageContent {
        public static final int CONSTRUCTOR = 214245369;

        public PushMessageContentScreenshotTaken() {
        }

        public int getConstructor() {
            return 214245369;
        }
    }

    public static class PushMessageContentPoll extends PushMessageContent {
        public String question;
        public boolean isRegular;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -44403654;

        public PushMessageContentPoll() {
        }

        public PushMessageContentPoll(String var1, boolean var2, boolean var3) {
            this.question = var1;
            this.isRegular = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return -44403654;
        }
    }

    public static class PushMessageContentPhoto extends PushMessageContent {
        public Photo photo;
        public String caption;
        public boolean isSecret;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 140631122;

        public PushMessageContentPhoto() {
        }

        public PushMessageContentPhoto(Photo var1, String var2, boolean var3, boolean var4) {
            this.photo = var1;
            this.caption = var2;
            this.isSecret = var3;
            this.isPinned = var4;
        }

        public int getConstructor() {
            return 140631122;
        }
    }

    public static class PushMessageContentLocation extends PushMessageContent {
        public boolean isLive;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1288005709;

        public PushMessageContentLocation() {
        }

        public PushMessageContentLocation(boolean var1, boolean var2) {
            this.isLive = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -1288005709;
        }
    }

    public static class PushMessageContentInvoice extends PushMessageContent {
        public String price;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -1731687492;

        public PushMessageContentInvoice() {
        }

        public PushMessageContentInvoice(String var1, boolean var2) {
            this.price = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -1731687492;
        }
    }

    public static class PushMessageContentGameScore extends PushMessageContent {
        public String title;
        public int score;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 901303688;

        public PushMessageContentGameScore() {
        }

        public PushMessageContentGameScore(String var1, int var2, boolean var3) {
            this.title = var1;
            this.score = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return 901303688;
        }
    }

    public static class PushMessageContentGame extends PushMessageContent {
        public String title;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -515131109;

        public PushMessageContentGame() {
        }

        public PushMessageContentGame(String var1, boolean var2) {
            this.title = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -515131109;
        }
    }

    public static class PushMessageContentDocument extends PushMessageContent {
        public Document document;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -458379775;

        public PushMessageContentDocument() {
        }

        public PushMessageContentDocument(Document var1, boolean var2) {
            this.document = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -458379775;
        }
    }

    public static class PushMessageContentContactRegistered extends PushMessageContent {
        public static final int CONSTRUCTOR = -303962720;

        public PushMessageContentContactRegistered() {
        }

        public int getConstructor() {
            return -303962720;
        }
    }

    public static class PushMessageContentContact extends PushMessageContent {
        public String name;
        public boolean isPinned;
        public static final int CONSTRUCTOR = -12219820;

        public PushMessageContentContact() {
        }

        public PushMessageContentContact(String var1, boolean var2) {
            this.name = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return -12219820;
        }
    }

    public static class PushMessageContentAudio extends PushMessageContent {
        public Audio audio;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 381581426;

        public PushMessageContentAudio() {
        }

        public PushMessageContentAudio(Audio var1, boolean var2) {
            this.audio = var1;
            this.isPinned = var2;
        }

        public int getConstructor() {
            return 381581426;
        }
    }

    public static class PushMessageContentAnimation extends PushMessageContent {
        public Animation animation;
        public String caption;
        public boolean isPinned;
        public static final int CONSTRUCTOR = 1034215396;

        public PushMessageContentAnimation() {
        }

        public PushMessageContentAnimation(Animation var1, String var2, boolean var3) {
            this.animation = var1;
            this.caption = var2;
            this.isPinned = var3;
        }

        public int getConstructor() {
            return 1034215396;
        }
    }

    public static class PushMessageContentHidden extends PushMessageContent {
        public boolean isPinned;
        public static final int CONSTRUCTOR = -316950436;

        public PushMessageContentHidden() {
        }

        public PushMessageContentHidden(boolean var1) {
            this.isPinned = var1;
        }

        public int getConstructor() {
            return -316950436;
        }
    }

    public abstract static class PushMessageContent extends Object {
        public PushMessageContent() {
        }
    }

    public static class PublicChatTypeIsLocationBased extends PublicChatType {
        public static final int CONSTRUCTOR = 1183735952;

        public PublicChatTypeIsLocationBased() {
        }

        public int getConstructor() {
            return 1183735952;
        }
    }

    public static class PublicChatTypeHasUsername extends PublicChatType {
        public static final int CONSTRUCTOR = 350789758;

        public PublicChatTypeHasUsername() {
        }

        public int getConstructor() {
            return 350789758;
        }
    }

    public abstract static class PublicChatType extends Object {
        public PublicChatType() {
        }
    }

    public static class ProxyTypeMtproto extends ProxyType {
        public String secret;
        public static final int CONSTRUCTOR = -1964826627;

        public ProxyTypeMtproto() {
        }

        public ProxyTypeMtproto(String var1) {
            this.secret = var1;
        }

        public int getConstructor() {
            return -1964826627;
        }
    }

    public static class ProxyTypeHttp extends ProxyType {
        public String username;
        public String password;
        public boolean httpOnly;
        public static final int CONSTRUCTOR = -1547188361;

        public ProxyTypeHttp() {
        }

        public ProxyTypeHttp(String var1, String var2, boolean var3) {
            this.username = var1;
            this.password = var2;
            this.httpOnly = var3;
        }

        public int getConstructor() {
            return -1547188361;
        }
    }

    public static class ProxyTypeSocks5 extends ProxyType {
        public String username;
        public String password;
        public static final int CONSTRUCTOR = -890027341;

        public ProxyTypeSocks5() {
        }

        public ProxyTypeSocks5(String var1, String var2) {
            this.username = var1;
            this.password = var2;
        }

        public int getConstructor() {
            return -890027341;
        }
    }

    public abstract static class ProxyType extends Object {
        public ProxyType() {
        }
    }

    public static class Proxy extends Object {
        public int id;
        public String server;
        public int port;
        public int lastUsedDate;
        public boolean isEnabled;
        public ProxyType type;
        public static final int CONSTRUCTOR = 196049779;

        public Proxy() {
        }

        public Proxy(int var1, String var2, int var3, int var4, boolean var5, ProxyType var6) {
            this.id = var1;
            this.server = var2;
            this.port = var3;
            this.lastUsedDate = var4;
            this.isEnabled = var5;
            this.type = var6;
        }

        public int getConstructor() {
            return 196049779;
        }
    }

    public static class Proxies extends Object {
        public Proxy[] proxies;
        public static final int CONSTRUCTOR = 1200447205;

        public Proxies() {
        }

        public Proxies(Proxy[] var1) {
            this.proxies = var1;
        }

        public int getConstructor() {
            return 1200447205;
        }
    }

    public static class ProfilePhoto extends Object {
        public long id;
        public File small;
        public File big;
        public Minithumbnail minithumbnail;
        public boolean hasAnimation;
        public static final int CONSTRUCTOR = -131097523;

        public ProfilePhoto() {
        }

        public ProfilePhoto(long var1, File var3, File var4, Minithumbnail var5, boolean var6) {
            this.id = var1;
            this.small = var3;
            this.big = var4;
            this.minithumbnail = var5;
            this.hasAnimation = var6;
        }

        public int getConstructor() {
            return -131097523;
        }
    }

    public static class PremiumState extends Object {
        public FormattedText state;
        public PremiumPaymentOption[] paymentOptions;
        public PremiumFeaturePromotionAnimation[] animations;
        public static final int CONSTRUCTOR = -1502199392;

        public PremiumState() {
        }

        public PremiumState(FormattedText var1, PremiumPaymentOption[] var2, PremiumFeaturePromotionAnimation[] var3) {
            this.state = var1;
            this.paymentOptions = var2;
            this.animations = var3;
        }

        public int getConstructor() {
            return -1502199392;
        }
    }

    public static class PremiumSourceSettings extends PremiumSource {
        public static final int CONSTRUCTOR = -285702859;

        public PremiumSourceSettings() {
        }

        public int getConstructor() {
            return -285702859;
        }
    }

    public static class PremiumSourceLink extends PremiumSource {
        public String referrer;
        public static final int CONSTRUCTOR = 2135071132;

        public PremiumSourceLink() {
        }

        public PremiumSourceLink(String var1) {
            this.referrer = var1;
        }

        public int getConstructor() {
            return 2135071132;
        }
    }

    public static class PremiumSourceFeature extends PremiumSource {
        public PremiumFeature feature;
        public static final int CONSTRUCTOR = 445813541;

        public PremiumSourceFeature() {
        }

        public PremiumSourceFeature(PremiumFeature var1) {
            this.feature = var1;
        }

        public int getConstructor() {
            return 445813541;
        }
    }

    public static class PremiumSourceLimitExceeded extends PremiumSource {
        public PremiumLimitType limitType;
        public static final int CONSTRUCTOR = -2052159742;

        public PremiumSourceLimitExceeded() {
        }

        public PremiumSourceLimitExceeded(PremiumLimitType var1) {
            this.limitType = var1;
        }

        public int getConstructor() {
            return -2052159742;
        }
    }

    public abstract static class PremiumSource extends Object {
        public PremiumSource() {
        }
    }

    public static class PremiumPaymentOption extends Object {
        public String currency;
        public long amount;
        public int discountPercentage;
        public int monthCount;
        public String storeProductId;
        public InternalLinkType paymentLink;
        public static final int CONSTRUCTOR = -1945346126;

        public PremiumPaymentOption() {
        }

        public PremiumPaymentOption(String var1, long var2, int var4, int var5, String var6, InternalLinkType var7) {
            this.currency = var1;
            this.amount = var2;
            this.discountPercentage = var4;
            this.monthCount = var5;
            this.storeProductId = var6;
            this.paymentLink = var7;
        }

        public int getConstructor() {
            return -1945346126;
        }
    }

    public static class PremiumLimitTypeBioLength extends PremiumLimitType {
        public static final int CONSTRUCTOR = -1146976765;

        public PremiumLimitTypeBioLength() {
        }

        public int getConstructor() {
            return -1146976765;
        }
    }

    public static class PremiumLimitTypeCaptionLength extends PremiumLimitType {
        public static final int CONSTRUCTOR = 293984314;

        public PremiumLimitTypeCaptionLength() {
        }

        public int getConstructor() {
            return 293984314;
        }
    }

    public static class PremiumLimitTypePinnedArchivedChatCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = 1485515276;

        public PremiumLimitTypePinnedArchivedChatCount() {
        }

        public int getConstructor() {
            return 1485515276;
        }
    }

    public static class PremiumLimitTypeChatFilterChosenChatCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = 2057969759;

        public PremiumLimitTypeChatFilterChosenChatCount() {
        }

        public int getConstructor() {
            return 2057969759;
        }
    }

    public static class PremiumLimitTypeChatFilterCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = -644517214;

        public PremiumLimitTypeChatFilterCount() {
        }

        public int getConstructor() {
            return -644517214;
        }
    }

    public static class PremiumLimitTypeFavoriteStickerCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = 639754787;

        public PremiumLimitTypeFavoriteStickerCount() {
        }

        public int getConstructor() {
            return 639754787;
        }
    }

    public static class PremiumLimitTypeSavedAnimationCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = -19759735;

        public PremiumLimitTypeSavedAnimationCount() {
        }

        public int getConstructor() {
            return -19759735;
        }
    }

    public static class PremiumLimitTypeCreatedPublicChatCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = 446086841;

        public PremiumLimitTypeCreatedPublicChatCount() {
        }

        public int getConstructor() {
            return 446086841;
        }
    }

    public static class PremiumLimitTypePinnedChatCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = -998947871;

        public PremiumLimitTypePinnedChatCount() {
        }

        public int getConstructor() {
            return -998947871;
        }
    }

    public static class PremiumLimitTypeSupergroupCount extends PremiumLimitType {
        public static final int CONSTRUCTOR = -247467131;

        public PremiumLimitTypeSupergroupCount() {
        }

        public int getConstructor() {
            return -247467131;
        }
    }

    public abstract static class PremiumLimitType extends Object {
        public PremiumLimitType() {
        }
    }

    public static class PremiumLimit extends Object {
        public PremiumLimitType type;
        public int defaultValue;
        public int premiumValue;
        public static final int CONSTRUCTOR = 2127786726;

        public PremiumLimit() {
        }

        public PremiumLimit(PremiumLimitType var1, int var2, int var3) {
            this.type = var1;
            this.defaultValue = var2;
            this.premiumValue = var3;
        }

        public int getConstructor() {
            return 2127786726;
        }
    }

    public static class PremiumFeatures extends Object {
        public PremiumFeature[] features;
        public PremiumLimit[] limits;
        public InternalLinkType paymentLink;
        public static final int CONSTRUCTOR = 1875162172;

        public PremiumFeatures() {
        }

        public PremiumFeatures(PremiumFeature[] var1, PremiumLimit[] var2, InternalLinkType var3) {
            this.features = var1;
            this.limits = var2;
            this.paymentLink = var3;
        }

        public int getConstructor() {
            return 1875162172;
        }
    }

    public static class PremiumFeaturePromotionAnimation extends Object {
        public PremiumFeature feature;
        public Animation animation;
        public static final int CONSTRUCTOR = -1986155748;

        public PremiumFeaturePromotionAnimation() {
        }

        public PremiumFeaturePromotionAnimation(PremiumFeature var1, Animation var2) {
            this.feature = var1;
            this.animation = var2;
        }

        public int getConstructor() {
            return -1986155748;
        }
    }

    public static class PremiumFeatureAppIcons extends PremiumFeature {
        public static final int CONSTRUCTOR = 1585050761;

        public PremiumFeatureAppIcons() {
        }

        public int getConstructor() {
            return 1585050761;
        }
    }

    public static class PremiumFeatureAnimatedProfilePhoto extends PremiumFeature {
        public static final int CONSTRUCTOR = -100741914;

        public PremiumFeatureAnimatedProfilePhoto() {
        }

        public int getConstructor() {
            return -100741914;
        }
    }

    public static class PremiumFeatureEmojiStatus extends PremiumFeature {
        public static final int CONSTRUCTOR = -36516639;

        public PremiumFeatureEmojiStatus() {
        }

        public int getConstructor() {
            return -36516639;
        }
    }

    public static class PremiumFeatureProfileBadge extends PremiumFeature {
        public static final int CONSTRUCTOR = 233648322;

        public PremiumFeatureProfileBadge() {
        }

        public int getConstructor() {
            return 233648322;
        }
    }

    public static class PremiumFeatureAdvancedChatManagement extends PremiumFeature {
        public static final int CONSTRUCTOR = 796347674;

        public PremiumFeatureAdvancedChatManagement() {
        }

        public int getConstructor() {
            return 796347674;
        }
    }

    public static class PremiumFeatureCustomEmoji extends PremiumFeature {
        public static final int CONSTRUCTOR = 1332599628;

        public PremiumFeatureCustomEmoji() {
        }

        public int getConstructor() {
            return 1332599628;
        }
    }

    public static class PremiumFeatureUniqueStickers extends PremiumFeature {
        public static final int CONSTRUCTOR = -2101773312;

        public PremiumFeatureUniqueStickers() {
        }

        public int getConstructor() {
            return -2101773312;
        }
    }

    public static class PremiumFeatureUniqueReactions extends PremiumFeature {
        public static final int CONSTRUCTOR = 766750743;

        public PremiumFeatureUniqueReactions() {
        }

        public int getConstructor() {
            return 766750743;
        }
    }

    public static class PremiumFeatureDisabledAds extends PremiumFeature {
        public static final int CONSTRUCTOR = -2008587702;

        public PremiumFeatureDisabledAds() {
        }

        public int getConstructor() {
            return -2008587702;
        }
    }

    public static class PremiumFeatureVoiceRecognition extends PremiumFeature {
        public static final int CONSTRUCTOR = 1288216542;

        public PremiumFeatureVoiceRecognition() {
        }

        public int getConstructor() {
            return 1288216542;
        }
    }

    public static class PremiumFeatureImprovedDownloadSpeed extends PremiumFeature {
        public static final int CONSTRUCTOR = -267695554;

        public PremiumFeatureImprovedDownloadSpeed() {
        }

        public int getConstructor() {
            return -267695554;
        }
    }

    public static class PremiumFeatureIncreasedUploadFileSize extends PremiumFeature {
        public static final int CONSTRUCTOR = 1825367155;

        public PremiumFeatureIncreasedUploadFileSize() {
        }

        public int getConstructor() {
            return 1825367155;
        }
    }

    public static class PremiumFeatureIncreasedLimits extends PremiumFeature {
        public static final int CONSTRUCTOR = 1785455031;

        public PremiumFeatureIncreasedLimits() {
        }

        public int getConstructor() {
            return 1785455031;
        }
    }

    public abstract static class PremiumFeature extends Object {
        public PremiumFeature() {
        }
    }

    public static class PollTypeQuiz extends PollType {
        public int correctOptionId;
        public FormattedText explanation;
        public static final int CONSTRUCTOR = 657013913;

        public PollTypeQuiz() {
        }

        public PollTypeQuiz(int var1, FormattedText var2) {
            this.correctOptionId = var1;
            this.explanation = var2;
        }

        public int getConstructor() {
            return 657013913;
        }
    }

    public static class PollTypeRegular extends PollType {
        public boolean allowMultipleAnswers;
        public static final int CONSTRUCTOR = 641265698;

        public PollTypeRegular() {
        }

        public PollTypeRegular(boolean var1) {
            this.allowMultipleAnswers = var1;
        }

        public int getConstructor() {
            return 641265698;
        }
    }

    public abstract static class PollType extends Object {
        public PollType() {
        }
    }

    public static class PollOption extends Object {
        public String text;
        public int voterCount;
        public int votePercentage;
        public boolean isChosen;
        public boolean isBeingChosen;
        public static final int CONSTRUCTOR = 1473893797;

        public PollOption() {
        }

        public PollOption(String var1, int var2, int var3, boolean var4, boolean var5) {
            this.text = var1;
            this.voterCount = var2;
            this.votePercentage = var3;
            this.isChosen = var4;
            this.isBeingChosen = var5;
        }

        public int getConstructor() {
            return 1473893797;
        }
    }

    public static class Poll extends Object {
        public long id;
        public String question;
        public PollOption[] options;
        public int totalVoterCount;
        public long[] recentVoterUserIds;
        public boolean isAnonymous;
        public PollType type;
        public int openPeriod;
        public int closeDate;
        public boolean isClosed;
        public static final int CONSTRUCTOR = 116940085;

        public Poll() {
        }

        public Poll(long var1, String var3, PollOption[] var4, int var5, long[] var6, boolean var7, PollType var8, int var9, int var10, boolean var11) {
            this.id = var1;
            this.question = var3;
            this.options = var4;
            this.totalVoterCount = var5;
            this.recentVoterUserIds = var6;
            this.isAnonymous = var7;
            this.type = var8;
            this.openPeriod = var9;
            this.closeDate = var10;
            this.isClosed = var11;
        }

        public int getConstructor() {
            return 116940085;
        }
    }

    public static class Point extends Object {
        public double x;
        public double y;
        public static final int CONSTRUCTOR = 437515705;

        public Point() {
        }

        public Point(double var1, double var3) {
            this.x = var1;
            this.y = var3;
        }

        public int getConstructor() {
            return 437515705;
        }
    }

    public static class PhotoSize extends Object {
        public String type;
        public File photo;
        public int width;
        public int height;
        public int[] progressiveSizes;
        public static final int CONSTRUCTOR = 1609182352;

        public PhotoSize() {
        }

        public PhotoSize(String var1, File var2, int var3, int var4, int[] var5) {
            this.type = var1;
            this.photo = var2;
            this.width = var3;
            this.height = var4;
            this.progressiveSizes = var5;
        }

        public int getConstructor() {
            return 1609182352;
        }
    }

    public static class Photo extends Object {
        public boolean hasStickers;
        public Minithumbnail minithumbnail;
        public PhotoSize[] sizes;
        public static final int CONSTRUCTOR = -2022871583;

        public Photo() {
        }

        public Photo(boolean var1, Minithumbnail var2, PhotoSize[] var3) {
            this.hasStickers = var1;
            this.minithumbnail = var2;
            this.sizes = var3;
        }

        public int getConstructor() {
            return -2022871583;
        }
    }

    public static class PhoneNumberInfo extends Object {
        public CountryInfo country;
        public String countryCallingCode;
        public String formattedPhoneNumber;
        public static final int CONSTRUCTOR = 560180961;

        public PhoneNumberInfo() {
        }

        public PhoneNumberInfo(CountryInfo var1, String var2, String var3) {
            this.country = var1;
            this.countryCallingCode = var2;
            this.formattedPhoneNumber = var3;
        }

        public int getConstructor() {
            return 560180961;
        }
    }

    public static class PhoneNumberAuthenticationSettings extends Object {
        public boolean allowFlashCall;
        public boolean allowMissedCall;
        public boolean isCurrentPhoneNumber;
        public boolean allowSmsRetrieverApi;
        public String[] authenticationTokens;
        public static final int CONSTRUCTOR = -421219756;

        public PhoneNumberAuthenticationSettings() {
        }

        public PhoneNumberAuthenticationSettings(boolean var1, boolean var2, boolean var3, boolean var4, String[] var5) {
            this.allowFlashCall = var1;
            this.allowMissedCall = var2;
            this.isCurrentPhoneNumber = var3;
            this.allowSmsRetrieverApi = var4;
            this.authenticationTokens = var5;
        }

        public int getConstructor() {
            return -421219756;
        }
    }

    public static class PersonalDocument extends Object {
        public DatedFile[] files;
        public DatedFile[] translation;
        public static final int CONSTRUCTOR = -1011634661;

        public PersonalDocument() {
        }

        public PersonalDocument(DatedFile[] var1, DatedFile[] var2) {
            this.files = var1;
            this.translation = var2;
        }

        public int getConstructor() {
            return -1011634661;
        }
    }

    public static class PersonalDetails extends Object {
        public String firstName;
        public String middleName;
        public String lastName;
        public String nativeFirstName;
        public String nativeMiddleName;
        public String nativeLastName;
        public Date birthdate;
        public String gender;
        public String countryCode;
        public String residenceCountryCode;
        public static final int CONSTRUCTOR = -1061656137;

        public PersonalDetails() {
        }

        public PersonalDetails(String var1, String var2, String var3, String var4, String var5, String var6, Date var7, String var8, String var9, String var10) {
            this.firstName = var1;
            this.middleName = var2;
            this.lastName = var3;
            this.nativeFirstName = var4;
            this.nativeMiddleName = var5;
            this.nativeLastName = var6;
            this.birthdate = var7;
            this.gender = var8;
            this.countryCode = var9;
            this.residenceCountryCode = var10;
        }

        public int getConstructor() {
            return -1061656137;
        }
    }

    public static class PaymentResult extends Object {
        public boolean success;
        public String verificationUrl;
        public static final int CONSTRUCTOR = -804263843;

        public PaymentResult() {
        }

        public PaymentResult(boolean var1, String var2) {
            this.success = var1;
            this.verificationUrl = var2;
        }

        public int getConstructor() {
            return -804263843;
        }
    }

    public static class PaymentReceipt extends Object {
        public String title;
        public FormattedText description;
        public Photo photo;
        public int date;
        public long sellerBotUserId;
        public long paymentProviderUserId;
        public Invoice invoice;
        public OrderInfo orderInfo;
        public ShippingOption shippingOption;
        public String credentialsTitle;
        public long tipAmount;
        public static final int CONSTRUCTOR = -400955711;

        public PaymentReceipt() {
        }

        public PaymentReceipt(String var1, FormattedText var2, Photo var3, int var4, long var5, long var7, Invoice var9, OrderInfo var10, ShippingOption var11, String var12, long var13) {
            this.title = var1;
            this.description = var2;
            this.photo = var3;
            this.date = var4;
            this.sellerBotUserId = var5;
            this.paymentProviderUserId = var7;
            this.invoice = var9;
            this.orderInfo = var10;
            this.shippingOption = var11;
            this.credentialsTitle = var12;
            this.tipAmount = var13;
        }

        public int getConstructor() {
            return -400955711;
        }
    }

    public static class PaymentProviderOther extends PaymentProvider {
        public String url;
        public static final int CONSTRUCTOR = -1336876828;

        public PaymentProviderOther() {
        }

        public PaymentProviderOther(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -1336876828;
        }
    }

    public static class PaymentProviderStripe extends PaymentProvider {
        public String publishableKey;
        public boolean needCountry;
        public boolean needPostalCode;
        public boolean needCardholderName;
        public static final int CONSTRUCTOR = 370467227;

        public PaymentProviderStripe() {
        }

        public PaymentProviderStripe(String var1, boolean var2, boolean var3, boolean var4) {
            this.publishableKey = var1;
            this.needCountry = var2;
            this.needPostalCode = var3;
            this.needCardholderName = var4;
        }

        public int getConstructor() {
            return 370467227;
        }
    }

    public static class PaymentProviderSmartGlocal extends PaymentProvider {
        public String publicToken;
        public static final int CONSTRUCTOR = 1800479470;

        public PaymentProviderSmartGlocal() {
        }

        public PaymentProviderSmartGlocal(String var1) {
            this.publicToken = var1;
        }

        public int getConstructor() {
            return 1800479470;
        }
    }

    public abstract static class PaymentProvider extends Object {
        public PaymentProvider() {
        }
    }

    public static class PaymentOption extends Object {
        public String title;
        public String url;
        public static final int CONSTRUCTOR = -294020965;

        public PaymentOption() {
        }

        public PaymentOption(String var1, String var2) {
            this.title = var1;
            this.url = var2;
        }

        public int getConstructor() {
            return -294020965;
        }
    }

    public static class PaymentForm extends Object {
        public long id;
        public Invoice invoice;
        public long sellerBotUserId;
        public long paymentProviderUserId;
        public PaymentProvider paymentProvider;
        public PaymentOption[] additionalPaymentOptions;
        public OrderInfo savedOrderInfo;
        public SavedCredentials[] savedCredentials;
        public boolean canSaveCredentials;
        public boolean needPassword;
        public String productTitle;
        public FormattedText productDescription;
        public Photo productPhoto;
        public static final int CONSTRUCTOR = -1468471378;

        public PaymentForm() {
        }

        public PaymentForm(long var1, Invoice var3, long var4, long var6, PaymentProvider var8, PaymentOption[] var9, OrderInfo var10, SavedCredentials[] var11, boolean var12, boolean var13, String var14, FormattedText var15, Photo var16) {
            this.id = var1;
            this.invoice = var3;
            this.sellerBotUserId = var4;
            this.paymentProviderUserId = var6;
            this.paymentProvider = var8;
            this.additionalPaymentOptions = var9;
            this.savedOrderInfo = var10;
            this.savedCredentials = var11;
            this.canSaveCredentials = var12;
            this.needPassword = var13;
            this.productTitle = var14;
            this.productDescription = var15;
            this.productPhoto = var16;
        }

        public int getConstructor() {
            return -1468471378;
        }
    }

    public static class PasswordState extends Object {
        public boolean hasPassword;
        public String passwordHint;
        public boolean hasRecoveryEmailAddress;
        public boolean hasPassportData;
        public EmailAddressAuthenticationCodeInfo recoveryEmailAddressCodeInfo;
        public String loginEmailAddressPattern;
        public int pendingResetDate;
        public static final int CONSTRUCTOR = 483801128;

        public PasswordState() {
        }

        public PasswordState(boolean var1, String var2, boolean var3, boolean var4, EmailAddressAuthenticationCodeInfo var5, String var6, int var7) {
            this.hasPassword = var1;
            this.passwordHint = var2;
            this.hasRecoveryEmailAddress = var3;
            this.hasPassportData = var4;
            this.recoveryEmailAddressCodeInfo = var5;
            this.loginEmailAddressPattern = var6;
            this.pendingResetDate = var7;
        }

        public int getConstructor() {
            return 483801128;
        }
    }

    public static class PassportSuitableElement extends Object {
        public PassportElementType type;
        public boolean isSelfieRequired;
        public boolean isTranslationRequired;
        public boolean isNativeNameRequired;
        public static final int CONSTRUCTOR = -789019876;

        public PassportSuitableElement() {
        }

        public PassportSuitableElement(PassportElementType var1, boolean var2, boolean var3, boolean var4) {
            this.type = var1;
            this.isSelfieRequired = var2;
            this.isTranslationRequired = var3;
            this.isNativeNameRequired = var4;
        }

        public int getConstructor() {
            return -789019876;
        }
    }

    public static class PassportRequiredElement extends Object {
        public PassportSuitableElement[] suitableElements;
        public static final int CONSTRUCTOR = -1983641651;

        public PassportRequiredElement() {
        }

        public PassportRequiredElement(PassportSuitableElement[] var1) {
            this.suitableElements = var1;
        }

        public int getConstructor() {
            return -1983641651;
        }
    }

    public static class PassportElementsWithErrors extends Object {
        public PassportElement[] elements;
        public PassportElementError[] errors;
        public static final int CONSTRUCTOR = 1308923044;

        public PassportElementsWithErrors() {
        }

        public PassportElementsWithErrors(PassportElement[] var1, PassportElementError[] var2) {
            this.elements = var1;
            this.errors = var2;
        }

        public int getConstructor() {
            return 1308923044;
        }
    }

    public static class PassportElements extends Object {
        public PassportElement[] elements;
        public static final int CONSTRUCTOR = 1264617556;

        public PassportElements() {
        }

        public PassportElements(PassportElement[] var1) {
            this.elements = var1;
        }

        public int getConstructor() {
            return 1264617556;
        }
    }

    public static class PassportElementTypeEmailAddress extends PassportElementType {
        public static final int CONSTRUCTOR = -79321405;

        public PassportElementTypeEmailAddress() {
        }

        public int getConstructor() {
            return -79321405;
        }
    }

    public static class PassportElementTypePhoneNumber extends PassportElementType {
        public static final int CONSTRUCTOR = -995361172;

        public PassportElementTypePhoneNumber() {
        }

        public int getConstructor() {
            return -995361172;
        }
    }

    public static class PassportElementTypeTemporaryRegistration extends PassportElementType {
        public static final int CONSTRUCTOR = 1092498527;

        public PassportElementTypeTemporaryRegistration() {
        }

        public int getConstructor() {
            return 1092498527;
        }
    }

    public static class PassportElementTypePassportRegistration extends PassportElementType {
        public static final int CONSTRUCTOR = -159478209;

        public PassportElementTypePassportRegistration() {
        }

        public int getConstructor() {
            return -159478209;
        }
    }

    public static class PassportElementTypeRentalAgreement extends PassportElementType {
        public static final int CONSTRUCTOR = -2060583280;

        public PassportElementTypeRentalAgreement() {
        }

        public int getConstructor() {
            return -2060583280;
        }
    }

    public static class PassportElementTypeBankStatement extends PassportElementType {
        public static final int CONSTRUCTOR = 574095667;

        public PassportElementTypeBankStatement() {
        }

        public int getConstructor() {
            return 574095667;
        }
    }

    public static class PassportElementTypeUtilityBill extends PassportElementType {
        public static final int CONSTRUCTOR = 627084906;

        public PassportElementTypeUtilityBill() {
        }

        public int getConstructor() {
            return 627084906;
        }
    }

    public static class PassportElementTypeAddress extends PassportElementType {
        public static final int CONSTRUCTOR = 496327874;

        public PassportElementTypeAddress() {
        }

        public int getConstructor() {
            return 496327874;
        }
    }

    public static class PassportElementTypeInternalPassport extends PassportElementType {
        public static final int CONSTRUCTOR = -793781959;

        public PassportElementTypeInternalPassport() {
        }

        public int getConstructor() {
            return -793781959;
        }
    }

    public static class PassportElementTypeIdentityCard extends PassportElementType {
        public static final int CONSTRUCTOR = -502356132;

        public PassportElementTypeIdentityCard() {
        }

        public int getConstructor() {
            return -502356132;
        }
    }

    public static class PassportElementTypeDriverLicense extends PassportElementType {
        public static final int CONSTRUCTOR = 1827298379;

        public PassportElementTypeDriverLicense() {
        }

        public int getConstructor() {
            return 1827298379;
        }
    }

    public static class PassportElementTypePassport extends PassportElementType {
        public static final int CONSTRUCTOR = -436360376;

        public PassportElementTypePassport() {
        }

        public int getConstructor() {
            return -436360376;
        }
    }

    public static class PassportElementTypePersonalDetails extends PassportElementType {
        public static final int CONSTRUCTOR = -1032136365;

        public PassportElementTypePersonalDetails() {
        }

        public int getConstructor() {
            return -1032136365;
        }
    }

    public abstract static class PassportElementType extends Object {
        public PassportElementType() {
        }
    }

    public static class PassportElementErrorSourceFiles extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1894164178;

        public PassportElementErrorSourceFiles() {
        }

        public int getConstructor() {
            return 1894164178;
        }
    }

    public static class PassportElementErrorSourceFile extends PassportElementErrorSource {
        public int fileIndex;
        public static final int CONSTRUCTOR = 2020358960;

        public PassportElementErrorSourceFile() {
        }

        public PassportElementErrorSourceFile(int var1) {
            this.fileIndex = var1;
        }

        public int getConstructor() {
            return 2020358960;
        }
    }

    public static class PassportElementErrorSourceTranslationFiles extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 581280796;

        public PassportElementErrorSourceTranslationFiles() {
        }

        public int getConstructor() {
            return 581280796;
        }
    }

    public static class PassportElementErrorSourceTranslationFile extends PassportElementErrorSource {
        public int fileIndex;
        public static final int CONSTRUCTOR = -689621228;

        public PassportElementErrorSourceTranslationFile() {
        }

        public PassportElementErrorSourceTranslationFile(int var1) {
            this.fileIndex = var1;
        }

        public int getConstructor() {
            return -689621228;
        }
    }

    public static class PassportElementErrorSourceSelfie extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -797043672;

        public PassportElementErrorSourceSelfie() {
        }

        public int getConstructor() {
            return -797043672;
        }
    }

    public static class PassportElementErrorSourceReverseSide extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1918630391;

        public PassportElementErrorSourceReverseSide() {
        }

        public int getConstructor() {
            return 1918630391;
        }
    }

    public static class PassportElementErrorSourceFrontSide extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = 1895658292;

        public PassportElementErrorSourceFrontSide() {
        }

        public int getConstructor() {
            return 1895658292;
        }
    }

    public static class PassportElementErrorSourceDataField extends PassportElementErrorSource {
        public String fieldName;
        public static final int CONSTRUCTOR = -308650776;

        public PassportElementErrorSourceDataField() {
        }

        public PassportElementErrorSourceDataField(String var1) {
            this.fieldName = var1;
        }

        public int getConstructor() {
            return -308650776;
        }
    }

    public static class PassportElementErrorSourceUnspecified extends PassportElementErrorSource {
        public static final int CONSTRUCTOR = -378320830;

        public PassportElementErrorSourceUnspecified() {
        }

        public int getConstructor() {
            return -378320830;
        }
    }

    public abstract static class PassportElementErrorSource extends Object {
        public PassportElementErrorSource() {
        }
    }

    public static class PassportElementError extends Object {
        public PassportElementType type;
        public String message;
        public PassportElementErrorSource source;
        public static final int CONSTRUCTOR = -1861902395;

        public PassportElementError() {
        }

        public PassportElementError(PassportElementType var1, String var2, PassportElementErrorSource var3) {
            this.type = var1;
            this.message = var2;
            this.source = var3;
        }

        public int getConstructor() {
            return -1861902395;
        }
    }

    public static class PassportElementEmailAddress extends PassportElement {
        public String emailAddress;
        public static final int CONSTRUCTOR = -1528129531;

        public PassportElementEmailAddress() {
        }

        public PassportElementEmailAddress(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return -1528129531;
        }
    }

    public static class PassportElementPhoneNumber extends PassportElement {
        public String phoneNumber;
        public static final int CONSTRUCTOR = -1320118375;

        public PassportElementPhoneNumber() {
        }

        public PassportElementPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return -1320118375;
        }
    }

    public static class PassportElementTemporaryRegistration extends PassportElement {
        public PersonalDocument temporaryRegistration;
        public static final int CONSTRUCTOR = 1237626864;

        public PassportElementTemporaryRegistration() {
        }

        public PassportElementTemporaryRegistration(PersonalDocument var1) {
            this.temporaryRegistration = var1;
        }

        public int getConstructor() {
            return 1237626864;
        }
    }

    public static class PassportElementPassportRegistration extends PassportElement {
        public PersonalDocument passportRegistration;
        public static final int CONSTRUCTOR = 618323071;

        public PassportElementPassportRegistration() {
        }

        public PassportElementPassportRegistration(PersonalDocument var1) {
            this.passportRegistration = var1;
        }

        public int getConstructor() {
            return 618323071;
        }
    }

    public static class PassportElementRentalAgreement extends PassportElement {
        public PersonalDocument rentalAgreement;
        public static final int CONSTRUCTOR = -290141400;

        public PassportElementRentalAgreement() {
        }

        public PassportElementRentalAgreement(PersonalDocument var1) {
            this.rentalAgreement = var1;
        }

        public int getConstructor() {
            return -290141400;
        }
    }

    public static class PassportElementBankStatement extends PassportElement {
        public PersonalDocument bankStatement;
        public static final int CONSTRUCTOR = -366464408;

        public PassportElementBankStatement() {
        }

        public PassportElementBankStatement(PersonalDocument var1) {
            this.bankStatement = var1;
        }

        public int getConstructor() {
            return -366464408;
        }
    }

    public static class PassportElementUtilityBill extends PassportElement {
        public PersonalDocument utilityBill;
        public static final int CONSTRUCTOR = -234611246;

        public PassportElementUtilityBill() {
        }

        public PassportElementUtilityBill(PersonalDocument var1) {
            this.utilityBill = var1;
        }

        public int getConstructor() {
            return -234611246;
        }
    }

    public static class PassportElementAddress extends PassportElement {
        public Address address;
        public static final int CONSTRUCTOR = -782625232;

        public PassportElementAddress() {
        }

        public PassportElementAddress(Address var1) {
            this.address = var1;
        }

        public int getConstructor() {
            return -782625232;
        }
    }

    public static class PassportElementInternalPassport extends PassportElement {
        public IdentityDocument internalPassport;
        public static final int CONSTRUCTOR = 36220295;

        public PassportElementInternalPassport() {
        }

        public PassportElementInternalPassport(IdentityDocument var1) {
            this.internalPassport = var1;
        }

        public int getConstructor() {
            return 36220295;
        }
    }

    public static class PassportElementIdentityCard extends PassportElement {
        public IdentityDocument identityCard;
        public static final int CONSTRUCTOR = 2083775797;

        public PassportElementIdentityCard() {
        }

        public PassportElementIdentityCard(IdentityDocument var1) {
            this.identityCard = var1;
        }

        public int getConstructor() {
            return 2083775797;
        }
    }

    public static class PassportElementDriverLicense extends PassportElement {
        public IdentityDocument driverLicense;
        public static final int CONSTRUCTOR = 1643580589;

        public PassportElementDriverLicense() {
        }

        public PassportElementDriverLicense(IdentityDocument var1) {
            this.driverLicense = var1;
        }

        public int getConstructor() {
            return 1643580589;
        }
    }

    public static class PassportElementPassport extends PassportElement {
        public IdentityDocument passport;
        public static final int CONSTRUCTOR = -263985373;

        public PassportElementPassport() {
        }

        public PassportElementPassport(IdentityDocument var1) {
            this.passport = var1;
        }

        public int getConstructor() {
            return -263985373;
        }
    }

    public static class PassportElementPersonalDetails extends PassportElement {
        public PersonalDetails personalDetails;
        public static final int CONSTRUCTOR = 1217724035;

        public PassportElementPersonalDetails() {
        }

        public PassportElementPersonalDetails(PersonalDetails var1) {
            this.personalDetails = var1;
        }

        public int getConstructor() {
            return 1217724035;
        }
    }

    public abstract static class PassportElement extends Object {
        public PassportElement() {
        }
    }

    public static class PassportAuthorizationForm extends Object {
        public int id;
        public PassportRequiredElement[] requiredElements;
        public String privacyPolicyUrl;
        public static final int CONSTRUCTOR = -1070673218;

        public PassportAuthorizationForm() {
        }

        public PassportAuthorizationForm(int var1, PassportRequiredElement[] var2, String var3) {
            this.id = var1;
            this.requiredElements = var2;
            this.privacyPolicyUrl = var3;
        }

        public int getConstructor() {
            return -1070673218;
        }
    }

    public static class PageBlockVerticalAlignmentBottom extends PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = 2092531158;

        public PageBlockVerticalAlignmentBottom() {
        }

        public int getConstructor() {
            return 2092531158;
        }
    }

    public static class PageBlockVerticalAlignmentMiddle extends PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = -2123096587;

        public PageBlockVerticalAlignmentMiddle() {
        }

        public int getConstructor() {
            return -2123096587;
        }
    }

    public static class PageBlockVerticalAlignmentTop extends PageBlockVerticalAlignment {
        public static final int CONSTRUCTOR = 195500454;

        public PageBlockVerticalAlignmentTop() {
        }

        public int getConstructor() {
            return 195500454;
        }
    }

    public abstract static class PageBlockVerticalAlignment extends Object {
        public PageBlockVerticalAlignment() {
        }
    }

    public static class PageBlockTableCell extends Object {
        public RichText text;
        public boolean isHeader;
        public int colspan;
        public int rowspan;
        public PageBlockHorizontalAlignment align;
        public PageBlockVerticalAlignment valign;
        public static final int CONSTRUCTOR = 1417658214;

        public PageBlockTableCell() {
        }

        public PageBlockTableCell(RichText var1, boolean var2, int var3, int var4, PageBlockHorizontalAlignment var5, PageBlockVerticalAlignment var6) {
            this.text = var1;
            this.isHeader = var2;
            this.colspan = var3;
            this.rowspan = var4;
            this.align = var5;
            this.valign = var6;
        }

        public int getConstructor() {
            return 1417658214;
        }
    }

    public static class PageBlockRelatedArticle extends Object {
        public String url;
        public String title;
        public String description;
        public Photo photo;
        public String author;
        public int publishDate;
        public static final int CONSTRUCTOR = 481199251;

        public PageBlockRelatedArticle() {
        }

        public PageBlockRelatedArticle(String var1, String var2, String var3, Photo var4, String var5, int var6) {
            this.url = var1;
            this.title = var2;
            this.description = var3;
            this.photo = var4;
            this.author = var5;
            this.publishDate = var6;
        }

        public int getConstructor() {
            return 481199251;
        }
    }

    public static class PageBlockListItem extends Object {
        public String label;
        public PageBlock[] pageBlocks;
        public static final int CONSTRUCTOR = 323186259;

        public PageBlockListItem() {
        }

        public PageBlockListItem(String var1, PageBlock[] var2) {
            this.label = var1;
            this.pageBlocks = var2;
        }

        public int getConstructor() {
            return 323186259;
        }
    }

    public static class PageBlockHorizontalAlignmentRight extends PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = 1371369214;

        public PageBlockHorizontalAlignmentRight() {
        }

        public int getConstructor() {
            return 1371369214;
        }
    }

    public static class PageBlockHorizontalAlignmentCenter extends PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = -1009203990;

        public PageBlockHorizontalAlignmentCenter() {
        }

        public int getConstructor() {
            return -1009203990;
        }
    }

    public static class PageBlockHorizontalAlignmentLeft extends PageBlockHorizontalAlignment {
        public static final int CONSTRUCTOR = 848701417;

        public PageBlockHorizontalAlignmentLeft() {
        }

        public int getConstructor() {
            return 848701417;
        }
    }

    public abstract static class PageBlockHorizontalAlignment extends Object {
        public PageBlockHorizontalAlignment() {
        }
    }

    public static class PageBlockCaption extends Object {
        public RichText text;
        public RichText credit;
        public static final int CONSTRUCTOR = -1180064650;

        public PageBlockCaption() {
        }

        public PageBlockCaption(RichText var1, RichText var2) {
            this.text = var1;
            this.credit = var2;
        }

        public int getConstructor() {
            return -1180064650;
        }
    }

    public static class PageBlockMap extends PageBlock {
        public Location location;
        public int zoom;
        public int width;
        public int height;
        public PageBlockCaption caption;
        public static final int CONSTRUCTOR = 1510961171;

        public PageBlockMap() {
        }

        public PageBlockMap(Location var1, int var2, int var3, int var4, PageBlockCaption var5) {
            this.location = var1;
            this.zoom = var2;
            this.width = var3;
            this.height = var4;
            this.caption = var5;
        }

        public int getConstructor() {
            return 1510961171;
        }
    }

    public static class PageBlockRelatedArticles extends PageBlock {
        public RichText header;
        public PageBlockRelatedArticle[] articles;
        public static final int CONSTRUCTOR = -1807324374;

        public PageBlockRelatedArticles() {
        }

        public PageBlockRelatedArticles(RichText var1, PageBlockRelatedArticle[] var2) {
            this.header = var1;
            this.articles = var2;
        }

        public int getConstructor() {
            return -1807324374;
        }
    }

    public static class PageBlockDetails extends PageBlock {
        public RichText header;
        public PageBlock[] pageBlocks;
        public boolean isOpen;
        public static final int CONSTRUCTOR = -1599869809;

        public PageBlockDetails() {
        }

        public PageBlockDetails(RichText var1, PageBlock[] var2, boolean var3) {
            this.header = var1;
            this.pageBlocks = var2;
            this.isOpen = var3;
        }

        public int getConstructor() {
            return -1599869809;
        }
    }

    public static class PageBlockTable extends PageBlock {
        public RichText caption;
        public PageBlockTableCell[][] cells;
        public boolean isBordered;
        public boolean isStriped;
        public static final int CONSTRUCTOR = -942649288;

        public PageBlockTable() {
        }

        public PageBlockTable(RichText var1, PageBlockTableCell[][] var2, boolean var3, boolean var4) {
            this.caption = var1;
            this.cells = var2;
            this.isBordered = var3;
            this.isStriped = var4;
        }

        public int getConstructor() {
            return -942649288;
        }
    }

    public static class PageBlockChatLink extends PageBlock {
        public String title;
        public ChatPhotoInfo photo;
        public String username;
        public static final int CONSTRUCTOR = -202091253;

        public PageBlockChatLink() {
        }

        public PageBlockChatLink(String var1, ChatPhotoInfo var2, String var3) {
            this.title = var1;
            this.photo = var2;
            this.username = var3;
        }

        public int getConstructor() {
            return -202091253;
        }
    }

    public static class PageBlockSlideshow extends PageBlock {
        public PageBlock[] pageBlocks;
        public PageBlockCaption caption;
        public static final int CONSTRUCTOR = 539217375;

        public PageBlockSlideshow() {
        }

        public PageBlockSlideshow(PageBlock[] var1, PageBlockCaption var2) {
            this.pageBlocks = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 539217375;
        }
    }

    public static class PageBlockCollage extends PageBlock {
        public PageBlock[] pageBlocks;
        public PageBlockCaption caption;
        public static final int CONSTRUCTOR = 1163760110;

        public PageBlockCollage() {
        }

        public PageBlockCollage(PageBlock[] var1, PageBlockCaption var2) {
            this.pageBlocks = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 1163760110;
        }
    }

    public static class PageBlockEmbeddedPost extends PageBlock {
        public String url;
        public String author;
        public Photo authorPhoto;
        public int date;
        public PageBlock[] pageBlocks;
        public PageBlockCaption caption;
        public static final int CONSTRUCTOR = 397600949;

        public PageBlockEmbeddedPost() {
        }

        public PageBlockEmbeddedPost(String var1, String var2, Photo var3, int var4, PageBlock[] var5, PageBlockCaption var6) {
            this.url = var1;
            this.author = var2;
            this.authorPhoto = var3;
            this.date = var4;
            this.pageBlocks = var5;
            this.caption = var6;
        }

        public int getConstructor() {
            return 397600949;
        }
    }

    public static class PageBlockEmbedded extends PageBlock {
        public String url;
        public String html;
        public Photo posterPhoto;
        public int width;
        public int height;
        public PageBlockCaption caption;
        public boolean isFullWidth;
        public boolean allowScrolling;
        public static final int CONSTRUCTOR = -1942577763;

        public PageBlockEmbedded() {
        }

        public PageBlockEmbedded(String var1, String var2, Photo var3, int var4, int var5, PageBlockCaption var6, boolean var7, boolean var8) {
            this.url = var1;
            this.html = var2;
            this.posterPhoto = var3;
            this.width = var4;
            this.height = var5;
            this.caption = var6;
            this.isFullWidth = var7;
            this.allowScrolling = var8;
        }

        public int getConstructor() {
            return -1942577763;
        }
    }

    public static class PageBlockCover extends PageBlock {
        public PageBlock cover;
        public static final int CONSTRUCTOR = 972174080;

        public PageBlockCover() {
        }

        public PageBlockCover(PageBlock var1) {
            this.cover = var1;
        }

        public int getConstructor() {
            return 972174080;
        }
    }

    public static class PageBlockVoiceNote extends PageBlock {
        public VoiceNote voiceNote;
        public PageBlockCaption caption;
        public static final int CONSTRUCTOR = 1823310463;

        public PageBlockVoiceNote() {
        }

        public PageBlockVoiceNote(VoiceNote var1, PageBlockCaption var2) {
            this.voiceNote = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 1823310463;
        }
    }

    public static class PageBlockVideo extends PageBlock {
        public Video video;
        public PageBlockCaption caption;
        public boolean needAutoplay;
        public boolean isLooped;
        public static final int CONSTRUCTOR = 510041394;

        public PageBlockVideo() {
        }

        public PageBlockVideo(Video var1, PageBlockCaption var2, boolean var3, boolean var4) {
            this.video = var1;
            this.caption = var2;
            this.needAutoplay = var3;
            this.isLooped = var4;
        }

        public int getConstructor() {
            return 510041394;
        }
    }

    public static class PageBlockPhoto extends PageBlock {
        public Photo photo;
        public PageBlockCaption caption;
        public String url;
        public static final int CONSTRUCTOR = 417601156;

        public PageBlockPhoto() {
        }

        public PageBlockPhoto(Photo var1, PageBlockCaption var2, String var3) {
            this.photo = var1;
            this.caption = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return 417601156;
        }
    }

    public static class PageBlockAudio extends PageBlock {
        public Audio audio;
        public PageBlockCaption caption;
        public static final int CONSTRUCTOR = -63371245;

        public PageBlockAudio() {
        }

        public PageBlockAudio(Audio var1, PageBlockCaption var2) {
            this.audio = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return -63371245;
        }
    }

    public static class PageBlockAnimation extends PageBlock {
        public Animation animation;
        public PageBlockCaption caption;
        public boolean needAutoplay;
        public static final int CONSTRUCTOR = 1355669513;

        public PageBlockAnimation() {
        }

        public PageBlockAnimation(Animation var1, PageBlockCaption var2, boolean var3) {
            this.animation = var1;
            this.caption = var2;
            this.needAutoplay = var3;
        }

        public int getConstructor() {
            return 1355669513;
        }
    }

    public static class PageBlockPullQuote extends PageBlock {
        public RichText text;
        public RichText credit;
        public static final int CONSTRUCTOR = 490242317;

        public PageBlockPullQuote() {
        }

        public PageBlockPullQuote(RichText var1, RichText var2) {
            this.text = var1;
            this.credit = var2;
        }

        public int getConstructor() {
            return 490242317;
        }
    }

    public static class PageBlockBlockQuote extends PageBlock {
        public RichText text;
        public RichText credit;
        public static final int CONSTRUCTOR = 1657834142;

        public PageBlockBlockQuote() {
        }

        public PageBlockBlockQuote(RichText var1, RichText var2) {
            this.text = var1;
            this.credit = var2;
        }

        public int getConstructor() {
            return 1657834142;
        }
    }

    public static class PageBlockList extends PageBlock {
        public PageBlockListItem[] items;
        public static final int CONSTRUCTOR = -1037074852;

        public PageBlockList() {
        }

        public PageBlockList(PageBlockListItem[] var1) {
            this.items = var1;
        }

        public int getConstructor() {
            return -1037074852;
        }
    }

    public static class PageBlockAnchor extends PageBlock {
        public String name;
        public static final int CONSTRUCTOR = -837994576;

        public PageBlockAnchor() {
        }

        public PageBlockAnchor(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -837994576;
        }
    }

    public static class PageBlockDivider extends PageBlock {
        public static final int CONSTRUCTOR = -618614392;

        public PageBlockDivider() {
        }

        public int getConstructor() {
            return -618614392;
        }
    }

    public static class PageBlockFooter extends PageBlock {
        public RichText footer;
        public static final int CONSTRUCTOR = 886429480;

        public PageBlockFooter() {
        }

        public PageBlockFooter(RichText var1) {
            this.footer = var1;
        }

        public int getConstructor() {
            return 886429480;
        }
    }

    public static class PageBlockPreformatted extends PageBlock {
        public RichText text;
        public String language;
        public static final int CONSTRUCTOR = -1066346178;

        public PageBlockPreformatted() {
        }

        public PageBlockPreformatted(RichText var1, String var2) {
            this.text = var1;
            this.language = var2;
        }

        public int getConstructor() {
            return -1066346178;
        }
    }

    public static class PageBlockParagraph extends PageBlock {
        public RichText text;
        public static final int CONSTRUCTOR = 1182402406;

        public PageBlockParagraph() {
        }

        public PageBlockParagraph(RichText var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1182402406;
        }
    }

    public static class PageBlockKicker extends PageBlock {
        public RichText kicker;
        public static final int CONSTRUCTOR = 1361282635;

        public PageBlockKicker() {
        }

        public PageBlockKicker(RichText var1) {
            this.kicker = var1;
        }

        public int getConstructor() {
            return 1361282635;
        }
    }

    public static class PageBlockSubheader extends PageBlock {
        public RichText subheader;
        public static final int CONSTRUCTOR = 1263956774;

        public PageBlockSubheader() {
        }

        public PageBlockSubheader(RichText var1) {
            this.subheader = var1;
        }

        public int getConstructor() {
            return 1263956774;
        }
    }

    public static class PageBlockHeader extends PageBlock {
        public RichText header;
        public static final int CONSTRUCTOR = 1402854811;

        public PageBlockHeader() {
        }

        public PageBlockHeader(RichText var1) {
            this.header = var1;
        }

        public int getConstructor() {
            return 1402854811;
        }
    }

    public static class PageBlockAuthorDate extends PageBlock {
        public RichText author;
        public int publishDate;
        public static final int CONSTRUCTOR = 1300231184;

        public PageBlockAuthorDate() {
        }

        public PageBlockAuthorDate(RichText var1, int var2) {
            this.author = var1;
            this.publishDate = var2;
        }

        public int getConstructor() {
            return 1300231184;
        }
    }

    public static class PageBlockSubtitle extends PageBlock {
        public RichText subtitle;
        public static final int CONSTRUCTOR = 264524263;

        public PageBlockSubtitle() {
        }

        public PageBlockSubtitle(RichText var1) {
            this.subtitle = var1;
        }

        public int getConstructor() {
            return 264524263;
        }
    }

    public static class PageBlockTitle extends PageBlock {
        public RichText title;
        public static final int CONSTRUCTOR = 1629664784;

        public PageBlockTitle() {
        }

        public PageBlockTitle(RichText var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return 1629664784;
        }
    }

    public abstract static class PageBlock extends Object {
        public PageBlock() {
        }
    }

    public static class OrderInfo extends Object {
        public String name;
        public String phoneNumber;
        public String emailAddress;
        public Address shippingAddress;
        public static final int CONSTRUCTOR = 783997294;

        public OrderInfo() {
        }

        public OrderInfo(String var1, String var2, String var3, Address var4) {
            this.name = var1;
            this.phoneNumber = var2;
            this.emailAddress = var3;
            this.shippingAddress = var4;
        }

        public int getConstructor() {
            return 783997294;
        }
    }

    public static class OptionValueString extends OptionValue {
        public String value;
        public static final int CONSTRUCTOR = 756248212;

        public OptionValueString() {
        }

        public OptionValueString(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 756248212;
        }
    }

    public static class OptionValueInteger extends OptionValue {
        public long value;
        public static final int CONSTRUCTOR = -186858780;

        public OptionValueInteger() {
        }

        public OptionValueInteger(long var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -186858780;
        }
    }

    public static class OptionValueEmpty extends OptionValue {
        public static final int CONSTRUCTOR = 918955155;

        public OptionValueEmpty() {
        }

        public int getConstructor() {
            return 918955155;
        }
    }

    public static class OptionValueBoolean extends OptionValue {
        public boolean value;
        public static final int CONSTRUCTOR = 63135518;

        public OptionValueBoolean() {
        }

        public OptionValueBoolean(boolean var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 63135518;
        }
    }

    public abstract static class OptionValue extends Object {
        public OptionValue() {
        }
    }

    public static class Ok extends Object {
        public static final int CONSTRUCTOR = -722616727;

        public Ok() {
        }

        public int getConstructor() {
            return -722616727;
        }
    }

    public static class NotificationTypeNewPushMessage extends NotificationType {
        public long messageId;
        public MessageSender senderId;
        public String senderName;
        public boolean isOutgoing;
        public PushMessageContent content;
        public static final int CONSTRUCTOR = -711680462;

        public NotificationTypeNewPushMessage() {
        }

        public NotificationTypeNewPushMessage(long var1, MessageSender var3, String var4, boolean var5, PushMessageContent var6) {
            this.messageId = var1;
            this.senderId = var3;
            this.senderName = var4;
            this.isOutgoing = var5;
            this.content = var6;
        }

        public int getConstructor() {
            return -711680462;
        }
    }

    public static class NotificationTypeNewCall extends NotificationType {
        public int callId;
        public static final int CONSTRUCTOR = 1712734585;

        public NotificationTypeNewCall() {
        }

        public NotificationTypeNewCall(int var1) {
            this.callId = var1;
        }

        public int getConstructor() {
            return 1712734585;
        }
    }

    public static class NotificationTypeNewSecretChat extends NotificationType {
        public static final int CONSTRUCTOR = 1198638768;

        public NotificationTypeNewSecretChat() {
        }

        public int getConstructor() {
            return 1198638768;
        }
    }

    public static class NotificationTypeNewMessage extends NotificationType {
        public Message message;
        public boolean showPreview;
        public static final int CONSTRUCTOR = -254745614;

        public NotificationTypeNewMessage() {
        }

        public NotificationTypeNewMessage(Message var1, boolean var2) {
            this.message = var1;
            this.showPreview = var2;
        }

        public int getConstructor() {
            return -254745614;
        }
    }

    public abstract static class NotificationType extends Object {
        public NotificationType() {
        }
    }

    public static class NotificationSounds extends Object {
        public NotificationSound[] notificationSounds;
        public static final int CONSTRUCTOR = -630813169;

        public NotificationSounds() {
        }

        public NotificationSounds(NotificationSound[] var1) {
            this.notificationSounds = var1;
        }

        public int getConstructor() {
            return -630813169;
        }
    }

    public static class NotificationSound extends Object {
        public long id;
        public int duration;
        public int date;
        public String title;
        public String data;
        public File sound;
        public static final int CONSTRUCTOR = -185638601;

        public NotificationSound() {
        }

        public NotificationSound(long var1, int var3, int var4, String var5, String var6, File var7) {
            this.id = var1;
            this.duration = var3;
            this.date = var4;
            this.title = var5;
            this.data = var6;
            this.sound = var7;
        }

        public int getConstructor() {
            return -185638601;
        }
    }

    public static class NotificationSettingsScopeChannelChats extends NotificationSettingsScope {
        public static final int CONSTRUCTOR = 548013448;

        public NotificationSettingsScopeChannelChats() {
        }

        public int getConstructor() {
            return 548013448;
        }
    }

    public static class NotificationSettingsScopeGroupChats extends NotificationSettingsScope {
        public static final int CONSTRUCTOR = 1212142067;

        public NotificationSettingsScopeGroupChats() {
        }

        public int getConstructor() {
            return 1212142067;
        }
    }

    public static class NotificationSettingsScopePrivateChats extends NotificationSettingsScope {
        public static final int CONSTRUCTOR = 937446759;

        public NotificationSettingsScopePrivateChats() {
        }

        public int getConstructor() {
            return 937446759;
        }
    }

    public abstract static class NotificationSettingsScope extends Object {
        public NotificationSettingsScope() {
        }
    }

    public static class NotificationGroupTypeCalls extends NotificationGroupType {
        public static final int CONSTRUCTOR = 1379123538;

        public NotificationGroupTypeCalls() {
        }

        public int getConstructor() {
            return 1379123538;
        }
    }

    public static class NotificationGroupTypeSecretChat extends NotificationGroupType {
        public static final int CONSTRUCTOR = 1390759476;

        public NotificationGroupTypeSecretChat() {
        }

        public int getConstructor() {
            return 1390759476;
        }
    }

    public static class NotificationGroupTypeMentions extends NotificationGroupType {
        public static final int CONSTRUCTOR = -2050324051;

        public NotificationGroupTypeMentions() {
        }

        public int getConstructor() {
            return -2050324051;
        }
    }

    public static class NotificationGroupTypeMessages extends NotificationGroupType {
        public static final int CONSTRUCTOR = -1702481123;

        public NotificationGroupTypeMessages() {
        }

        public int getConstructor() {
            return -1702481123;
        }
    }

    public abstract static class NotificationGroupType extends Object {
        public NotificationGroupType() {
        }
    }

    public static class NotificationGroup extends Object {
        public int id;
        public NotificationGroupType type;
        public long chatId;
        public int totalCount;
        public Notification[] notifications;
        public static final int CONSTRUCTOR = 780691541;

        public NotificationGroup() {
        }

        public NotificationGroup(int var1, NotificationGroupType var2, long var3, int var5, Notification[] var6) {
            this.id = var1;
            this.type = var2;
            this.chatId = var3;
            this.totalCount = var5;
            this.notifications = var6;
        }

        public int getConstructor() {
            return 780691541;
        }
    }

    public static class Notification extends Object {
        public int id;
        public int date;
        public boolean isSilent;
        public NotificationType type;
        public static final int CONSTRUCTOR = 788743120;

        public Notification() {
        }

        public Notification(int var1, int var2, boolean var3, NotificationType var4) {
            this.id = var1;
            this.date = var2;
            this.isSilent = var3;
            this.type = var4;
        }

        public int getConstructor() {
            return 788743120;
        }
    }

    public static class NetworkTypeOther extends NetworkType {
        public static final int CONSTRUCTOR = 1942128539;

        public NetworkTypeOther() {
        }

        public int getConstructor() {
            return 1942128539;
        }
    }

    public static class NetworkTypeWiFi extends NetworkType {
        public static final int CONSTRUCTOR = -633872070;

        public NetworkTypeWiFi() {
        }

        public int getConstructor() {
            return -633872070;
        }
    }

    public static class NetworkTypeMobileRoaming extends NetworkType {
        public static final int CONSTRUCTOR = -1435199760;

        public NetworkTypeMobileRoaming() {
        }

        public int getConstructor() {
            return -1435199760;
        }
    }

    public static class NetworkTypeMobile extends NetworkType {
        public static final int CONSTRUCTOR = 819228239;

        public NetworkTypeMobile() {
        }

        public int getConstructor() {
            return 819228239;
        }
    }

    public static class NetworkTypeNone extends NetworkType {
        public static final int CONSTRUCTOR = -1971691759;

        public NetworkTypeNone() {
        }

        public int getConstructor() {
            return -1971691759;
        }
    }

    public abstract static class NetworkType extends Object {
        public NetworkType() {
        }
    }

    public static class NetworkStatisticsEntryCall extends NetworkStatisticsEntry {
        public NetworkType networkType;
        public long sentBytes;
        public long receivedBytes;
        public double duration;
        public static final int CONSTRUCTOR = 737000365;

        public NetworkStatisticsEntryCall() {
        }

        public NetworkStatisticsEntryCall(NetworkType var1, long var2, long var4, double var6) {
            this.networkType = var1;
            this.sentBytes = var2;
            this.receivedBytes = var4;
            this.duration = var6;
        }

        public int getConstructor() {
            return 737000365;
        }
    }

    public static class NetworkStatisticsEntryFile extends NetworkStatisticsEntry {
        public FileType fileType;
        public NetworkType networkType;
        public long sentBytes;
        public long receivedBytes;
        public static final int CONSTRUCTOR = 188452706;

        public NetworkStatisticsEntryFile() {
        }

        public NetworkStatisticsEntryFile(FileType var1, NetworkType var2, long var3, long var5) {
            this.fileType = var1;
            this.networkType = var2;
            this.sentBytes = var3;
            this.receivedBytes = var5;
        }

        public int getConstructor() {
            return 188452706;
        }
    }

    public abstract static class NetworkStatisticsEntry extends Object {
        public NetworkStatisticsEntry() {
        }
    }

    public static class NetworkStatistics extends Object {
        public int sinceDate;
        public NetworkStatisticsEntry[] entries;
        public static final int CONSTRUCTOR = 1615554212;

        public NetworkStatistics() {
        }

        public NetworkStatistics(int var1, NetworkStatisticsEntry[] var2) {
            this.sinceDate = var1;
            this.entries = var2;
        }

        public int getConstructor() {
            return 1615554212;
        }
    }

    public static class Minithumbnail extends Object {
        public int width;
        public int height;
        public byte[] data;
        public static final int CONSTRUCTOR = -328540758;

        public Minithumbnail() {
        }

        public Minithumbnail(int var1, int var2, byte[] var3) {
            this.width = var1;
            this.height = var2;
            this.data = var3;
        }

        public int getConstructor() {
            return -328540758;
        }
    }

    public static class Messages extends Object {
        public int totalCount;
        public Message[] messages;
        public static final int CONSTRUCTOR = -16498159;

        public Messages() {
        }

        public Messages(int var1, Message[] var2) {
            this.totalCount = var1;
            this.messages = var2;
        }

        public int getConstructor() {
            return -16498159;
        }
    }

    public static class MessageThreadInfo extends Object {
        public long chatId;
        public long messageThreadId;
        public MessageReplyInfo replyInfo;
        public int unreadMessageCount;
        public Message[] messages;
        public DraftMessage draftMessage;
        public static final int CONSTRUCTOR = -248536056;

        public MessageThreadInfo() {
        }

        public MessageThreadInfo(long var1, long var3, MessageReplyInfo var5, int var6, Message[] var7, DraftMessage var8) {
            this.chatId = var1;
            this.messageThreadId = var3;
            this.replyInfo = var5;
            this.unreadMessageCount = var6;
            this.messages = var7;
            this.draftMessage = var8;
        }

        public int getConstructor() {
            return -248536056;
        }
    }

    public static class MessageStatistics extends Object {
        public StatisticalGraph messageInteractionGraph;
        public static final int CONSTRUCTOR = -1011383888;

        public MessageStatistics() {
        }

        public MessageStatistics(StatisticalGraph var1) {
            this.messageInteractionGraph = var1;
        }

        public int getConstructor() {
            return -1011383888;
        }
    }

    public static class MessageSendingStateFailed extends MessageSendingState {
        public int errorCode;
        public String errorMessage;
        public boolean canRetry;
        public boolean needAnotherSender;
        public double retryAfter;
        public static final int CONSTRUCTOR = -1741887228;

        public MessageSendingStateFailed() {
        }

        public MessageSendingStateFailed(int var1, String var2, boolean var3, boolean var4, double var5) {
            this.errorCode = var1;
            this.errorMessage = var2;
            this.canRetry = var3;
            this.needAnotherSender = var4;
            this.retryAfter = var5;
        }

        public int getConstructor() {
            return -1741887228;
        }
    }

    public static class MessageSendingStatePending extends MessageSendingState {
        public static final int CONSTRUCTOR = -1381803582;

        public MessageSendingStatePending() {
        }

        public int getConstructor() {
            return -1381803582;
        }
    }

    public abstract static class MessageSendingState extends Object {
        public MessageSendingState() {
        }
    }

    public static class MessageSenders extends Object {
        public int totalCount;
        public MessageSender[] senders;
        public static final int CONSTRUCTOR = -690158467;

        public MessageSenders() {
        }

        public MessageSenders(int var1, MessageSender[] var2) {
            this.totalCount = var1;
            this.senders = var2;
        }

        public int getConstructor() {
            return -690158467;
        }
    }

    public static class MessageSenderChat extends MessageSender {
        public long chatId;
        public static final int CONSTRUCTOR = -239660751;

        public MessageSenderChat() {
        }

        public MessageSenderChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -239660751;
        }
    }

    public static class MessageSenderUser extends MessageSender {
        public long userId;
        public static final int CONSTRUCTOR = -336109341;

        public MessageSenderUser() {
        }

        public MessageSenderUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return -336109341;
        }
    }

    public abstract static class MessageSender extends Object {
        public MessageSender() {
        }
    }

    public static class MessageSendOptions extends Object {
        public boolean disableNotification;
        public boolean fromBackground;
        public boolean protectContent;
        public boolean updateOrderOfInstalledStickerSets;
        public MessageSchedulingState schedulingState;
        public static final int CONSTRUCTOR = -783267022;

        public MessageSendOptions() {
        }

        public MessageSendOptions(boolean var1, boolean var2, boolean var3, boolean var4, MessageSchedulingState var5) {
            this.disableNotification = var1;
            this.fromBackground = var2;
            this.protectContent = var3;
            this.updateOrderOfInstalledStickerSets = var4;
            this.schedulingState = var5;
        }

        public int getConstructor() {
            return -783267022;
        }
    }

    public static class MessageSchedulingStateSendWhenOnline extends MessageSchedulingState {
        public static final int CONSTRUCTOR = 2092947464;

        public MessageSchedulingStateSendWhenOnline() {
        }

        public int getConstructor() {
            return 2092947464;
        }
    }

    public static class MessageSchedulingStateSendAtDate extends MessageSchedulingState {
        public int sendDate;
        public static final int CONSTRUCTOR = -1485570073;

        public MessageSchedulingStateSendAtDate() {
        }

        public MessageSchedulingStateSendAtDate(int var1) {
            this.sendDate = var1;
        }

        public int getConstructor() {
            return -1485570073;
        }
    }

    public abstract static class MessageSchedulingState extends Object {
        public MessageSchedulingState() {
        }
    }

    public static class MessageReplyInfo extends Object {
        public int replyCount;
        public MessageSender[] recentReplierIds;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public long lastMessageId;
        public static final int CONSTRUCTOR = -2093702263;

        public MessageReplyInfo() {
        }

        public MessageReplyInfo(int var1, MessageSender[] var2, long var3, long var5, long var7) {
            this.replyCount = var1;
            this.recentReplierIds = var2;
            this.lastReadInboxMessageId = var3;
            this.lastReadOutboxMessageId = var5;
            this.lastMessageId = var7;
        }

        public int getConstructor() {
            return -2093702263;
        }
    }

    public static class MessageReaction extends Object {
        public ReactionType type;
        public int totalCount;
        public boolean isChosen;
        public MessageSender[] recentSenderIds;
        public static final int CONSTRUCTOR = 583566666;

        public MessageReaction() {
        }

        public MessageReaction(ReactionType var1, int var2, boolean var3, MessageSender[] var4) {
            this.type = var1;
            this.totalCount = var2;
            this.isChosen = var3;
            this.recentSenderIds = var4;
        }

        public int getConstructor() {
            return 583566666;
        }
    }

    public static class MessagePositions extends Object {
        public int totalCount;
        public MessagePosition[] positions;
        public static final int CONSTRUCTOR = -1930466649;

        public MessagePositions() {
        }

        public MessagePositions(int var1, MessagePosition[] var2) {
            this.totalCount = var1;
            this.positions = var2;
        }

        public int getConstructor() {
            return -1930466649;
        }
    }

    public static class MessagePosition extends Object {
        public int position;
        public long messageId;
        public int date;
        public static final int CONSTRUCTOR = 1292189935;

        public MessagePosition() {
        }

        public MessagePosition(int var1, long var2, int var4) {
            this.position = var1;
            this.messageId = var2;
            this.date = var4;
        }

        public int getConstructor() {
            return 1292189935;
        }
    }

    public static class MessageLinkInfo extends Object {
        public boolean isPublic;
        public long chatId;
        public Message message;
        public int mediaTimestamp;
        public boolean forAlbum;
        public boolean forComment;
        public static final int CONSTRUCTOR = -981646294;

        public MessageLinkInfo() {
        }

        public MessageLinkInfo(boolean var1, long var2, Message var4, int var5, boolean var6, boolean var7) {
            this.isPublic = var1;
            this.chatId = var2;
            this.message = var4;
            this.mediaTimestamp = var5;
            this.forAlbum = var6;
            this.forComment = var7;
        }

        public int getConstructor() {
            return -981646294;
        }
    }

    public static class MessageLink extends Object {
        public String link;
        public boolean isPublic;
        public static final int CONSTRUCTOR = -1354089818;

        public MessageLink() {
        }

        public MessageLink(String var1, boolean var2) {
            this.link = var1;
            this.isPublic = var2;
        }

        public int getConstructor() {
            return -1354089818;
        }
    }

    public static class MessageInteractionInfo extends Object {
        public int viewCount;
        public int forwardCount;
        public MessageReplyInfo replyInfo;
        public MessageReaction[] reactions;
        public static final int CONSTRUCTOR = -574858485;

        public MessageInteractionInfo() {
        }

        public MessageInteractionInfo(int var1, int var2, MessageReplyInfo var3, MessageReaction[] var4) {
            this.viewCount = var1;
            this.forwardCount = var2;
            this.replyInfo = var3;
            this.reactions = var4;
        }

        public int getConstructor() {
            return -574858485;
        }
    }

    public static class MessageForwardOriginMessageImport extends MessageForwardOrigin {
        public String senderName;
        public static final int CONSTRUCTOR = -739561951;

        public MessageForwardOriginMessageImport() {
        }

        public MessageForwardOriginMessageImport(String var1) {
            this.senderName = var1;
        }

        public int getConstructor() {
            return -739561951;
        }
    }

    public static class MessageForwardOriginChannel extends MessageForwardOrigin {
        public long chatId;
        public long messageId;
        public String authorSignature;
        public static final int CONSTRUCTOR = 1490730723;

        public MessageForwardOriginChannel() {
        }

        public MessageForwardOriginChannel(long var1, long var3, String var5) {
            this.chatId = var1;
            this.messageId = var3;
            this.authorSignature = var5;
        }

        public int getConstructor() {
            return 1490730723;
        }
    }

    public static class MessageForwardOriginHiddenUser extends MessageForwardOrigin {
        public String senderName;
        public static final int CONSTRUCTOR = -271257885;

        public MessageForwardOriginHiddenUser() {
        }

        public MessageForwardOriginHiddenUser(String var1) {
            this.senderName = var1;
        }

        public int getConstructor() {
            return -271257885;
        }
    }

    public static class MessageForwardOriginChat extends MessageForwardOrigin {
        public long senderChatId;
        public String authorSignature;
        public static final int CONSTRUCTOR = 1526010724;

        public MessageForwardOriginChat() {
        }

        public MessageForwardOriginChat(long var1, String var3) {
            this.senderChatId = var1;
            this.authorSignature = var3;
        }

        public int getConstructor() {
            return 1526010724;
        }
    }

    public static class MessageForwardOriginUser extends MessageForwardOrigin {
        public long senderUserId;
        public static final int CONSTRUCTOR = -355174191;

        public MessageForwardOriginUser() {
        }

        public MessageForwardOriginUser(long var1) {
            this.senderUserId = var1;
        }

        public int getConstructor() {
            return -355174191;
        }
    }

    public abstract static class MessageForwardOrigin extends Object {
        public MessageForwardOrigin() {
        }
    }

    public static class MessageForwardInfo extends Object {
        public MessageForwardOrigin origin;
        public int date;
        public String publicServiceAnnouncementType;
        public long fromChatId;
        public long fromMessageId;
        public static final int CONSTRUCTOR = -327300408;

        public MessageForwardInfo() {
        }

        public MessageForwardInfo(MessageForwardOrigin var1, int var2, String var3, long var4, long var6) {
            this.origin = var1;
            this.date = var2;
            this.publicServiceAnnouncementType = var3;
            this.fromChatId = var4;
            this.fromMessageId = var6;
        }

        public int getConstructor() {
            return -327300408;
        }
    }

    public static class MessageFileTypeUnknown extends MessageFileType {
        public static final int CONSTRUCTOR = 1176353458;

        public MessageFileTypeUnknown() {
        }

        public int getConstructor() {
            return 1176353458;
        }
    }

    public static class MessageFileTypeGroup extends MessageFileType {
        public String title;
        public static final int CONSTRUCTOR = -219836568;

        public MessageFileTypeGroup() {
        }

        public MessageFileTypeGroup(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -219836568;
        }
    }

    public static class MessageFileTypePrivate extends MessageFileType {
        public String name;
        public static final int CONSTRUCTOR = -521908524;

        public MessageFileTypePrivate() {
        }

        public MessageFileTypePrivate(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -521908524;
        }
    }

    public abstract static class MessageFileType extends Object {
        public MessageFileType() {
        }
    }

    public static class MessageCopyOptions extends Object {
        public boolean sendCopy;
        public boolean replaceCaption;
        public FormattedText newCaption;
        public static final int CONSTRUCTOR = 1208442937;

        public MessageCopyOptions() {
        }

        public MessageCopyOptions(boolean var1, boolean var2, FormattedText var3) {
            this.sendCopy = var1;
            this.replaceCaption = var2;
            this.newCaption = var3;
        }

        public int getConstructor() {
            return 1208442937;
        }
    }

    public static class MessageUnsupported extends MessageContent {
        public static final int CONSTRUCTOR = -1816726139;

        public MessageUnsupported() {
        }

        public int getConstructor() {
            return -1816726139;
        }
    }

    public static class MessageProximityAlertTriggered extends MessageContent {
        public MessageSender travelerId;
        public MessageSender watcherId;
        public int distance;
        public static final int CONSTRUCTOR = 67761875;

        public MessageProximityAlertTriggered() {
        }

        public MessageProximityAlertTriggered(MessageSender var1, MessageSender var2, int var3) {
            this.travelerId = var1;
            this.watcherId = var2;
            this.distance = var3;
        }

        public int getConstructor() {
            return 67761875;
        }
    }

    public static class MessagePassportDataReceived extends MessageContent {
        public EncryptedPassportElement[] elements;
        public EncryptedCredentials credentials;
        public static final int CONSTRUCTOR = -1367863624;

        public MessagePassportDataReceived() {
        }

        public MessagePassportDataReceived(EncryptedPassportElement[] var1, EncryptedCredentials var2) {
            this.elements = var1;
            this.credentials = var2;
        }

        public int getConstructor() {
            return -1367863624;
        }
    }

    public static class MessagePassportDataSent extends MessageContent {
        public PassportElementType[] types;
        public static final int CONSTRUCTOR = 1017405171;

        public MessagePassportDataSent() {
        }

        public MessagePassportDataSent(PassportElementType[] var1) {
            this.types = var1;
        }

        public int getConstructor() {
            return 1017405171;
        }
    }

    public static class MessageWebAppDataReceived extends MessageContent {
        public String buttonText;
        public String data;
        public static final int CONSTRUCTOR = -8578539;

        public MessageWebAppDataReceived() {
        }

        public MessageWebAppDataReceived(String var1, String var2) {
            this.buttonText = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return -8578539;
        }
    }

    public static class MessageWebAppDataSent extends MessageContent {
        public String buttonText;
        public static final int CONSTRUCTOR = -83674862;

        public MessageWebAppDataSent() {
        }

        public MessageWebAppDataSent(String var1) {
            this.buttonText = var1;
        }

        public int getConstructor() {
            return -83674862;
        }
    }

    public static class MessageWebsiteConnected extends MessageContent {
        public String domainName;
        public static final int CONSTRUCTOR = -1074551800;

        public MessageWebsiteConnected() {
        }

        public MessageWebsiteConnected(String var1) {
            this.domainName = var1;
        }

        public int getConstructor() {
            return -1074551800;
        }
    }

    public static class MessageContactRegistered extends MessageContent {
        public static final int CONSTRUCTOR = -1502020353;

        public MessageContactRegistered() {
        }

        public int getConstructor() {
            return -1502020353;
        }
    }

    public static class MessageGiftedPremium extends MessageContent {
        public String currency;
        public long amount;
        public int monthCount;
        public Sticker sticker;
        public static final int CONSTRUCTOR = 1580804249;

        public MessageGiftedPremium() {
        }

        public MessageGiftedPremium(String var1, long var2, int var4, Sticker var5) {
            this.currency = var1;
            this.amount = var2;
            this.monthCount = var4;
            this.sticker = var5;
        }

        public int getConstructor() {
            return 1580804249;
        }
    }

    public static class MessagePaymentSuccessfulBot extends MessageContent {
        public String currency;
        public long totalAmount;
        public boolean isRecurring;
        public boolean isFirstRecurring;
        public byte[] invoicePayload;
        public String shippingOptionId;
        public OrderInfo orderInfo;
        public String telegramPaymentChargeId;
        public String providerPaymentChargeId;
        public static final int CONSTRUCTOR = 1759592121;

        public MessagePaymentSuccessfulBot() {
        }

        public MessagePaymentSuccessfulBot(String var1, long var2, boolean var4, boolean var5, byte[] var6, String var7, OrderInfo var8, String var9, String var10) {
            this.currency = var1;
            this.totalAmount = var2;
            this.isRecurring = var4;
            this.isFirstRecurring = var5;
            this.invoicePayload = var6;
            this.shippingOptionId = var7;
            this.orderInfo = var8;
            this.telegramPaymentChargeId = var9;
            this.providerPaymentChargeId = var10;
        }

        public int getConstructor() {
            return 1759592121;
        }
    }

    public static class MessagePaymentSuccessful extends MessageContent {
        public long invoiceChatId;
        public long invoiceMessageId;
        public String currency;
        public long totalAmount;
        public boolean isRecurring;
        public boolean isFirstRecurring;
        public String invoiceName;
        public static final int CONSTRUCTOR = 1406745820;

        public MessagePaymentSuccessful() {
        }

        public MessagePaymentSuccessful(long var1, long var3, String var5, long var6, boolean var8, boolean var9, String var10) {
            this.invoiceChatId = var1;
            this.invoiceMessageId = var3;
            this.currency = var5;
            this.totalAmount = var6;
            this.isRecurring = var8;
            this.isFirstRecurring = var9;
            this.invoiceName = var10;
        }

        public int getConstructor() {
            return 1406745820;
        }
    }

    public static class MessageGameScore extends MessageContent {
        public long gameMessageId;
        public long gameId;
        public int score;
        public static final int CONSTRUCTOR = 1344904575;

        public MessageGameScore() {
        }

        public MessageGameScore(long var1, long var3, int var5) {
            this.gameMessageId = var1;
            this.gameId = var3;
            this.score = var5;
        }

        public int getConstructor() {
            return 1344904575;
        }
    }

    public static class MessageCustomServiceAction extends MessageContent {
        public String text;
        public static final int CONSTRUCTOR = 1435879282;

        public MessageCustomServiceAction() {
        }

        public MessageCustomServiceAction(String var1) {
            this.text = var1;
        }

        public int getConstructor() {
            return 1435879282;
        }
    }

    public static class MessageChatSetTtl extends MessageContent {
        public int ttl;
        public static final int CONSTRUCTOR = 1810060209;

        public MessageChatSetTtl() {
        }

        public MessageChatSetTtl(int var1) {
            this.ttl = var1;
        }

        public int getConstructor() {
            return 1810060209;
        }
    }

    public static class MessageChatSetTheme extends MessageContent {
        public String themeName;
        public static final int CONSTRUCTOR = -1716612088;

        public MessageChatSetTheme() {
        }

        public MessageChatSetTheme(String var1) {
            this.themeName = var1;
        }

        public int getConstructor() {
            return -1716612088;
        }
    }

    public static class MessageScreenshotTaken extends MessageContent {
        public static final int CONSTRUCTOR = -1564971605;

        public MessageScreenshotTaken() {
        }

        public int getConstructor() {
            return -1564971605;
        }
    }

    public static class MessagePinMessage extends MessageContent {
        public long messageId;
        public static final int CONSTRUCTOR = 953503801;

        public MessagePinMessage() {
        }

        public MessagePinMessage(long var1) {
            this.messageId = var1;
        }

        public int getConstructor() {
            return 953503801;
        }
    }

    public static class MessageChatUpgradeFrom extends MessageContent {
        public String title;
        public long basicGroupId;
        public static final int CONSTRUCTOR = 325954268;

        public MessageChatUpgradeFrom() {
        }

        public MessageChatUpgradeFrom(String var1, long var2) {
            this.title = var1;
            this.basicGroupId = var2;
        }

        public int getConstructor() {
            return 325954268;
        }
    }

    public static class MessageChatUpgradeTo extends MessageContent {
        public long supergroupId;
        public static final int CONSTRUCTOR = 104813723;

        public MessageChatUpgradeTo() {
        }

        public MessageChatUpgradeTo(long var1) {
            this.supergroupId = var1;
        }

        public int getConstructor() {
            return 104813723;
        }
    }

    public static class MessageChatDeleteMember extends MessageContent {
        public long userId;
        public static final int CONSTRUCTOR = 938029481;

        public MessageChatDeleteMember() {
        }

        public MessageChatDeleteMember(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 938029481;
        }
    }

    public static class MessageChatJoinByRequest extends MessageContent {
        public static final int CONSTRUCTOR = 1195428732;

        public MessageChatJoinByRequest() {
        }

        public int getConstructor() {
            return 1195428732;
        }
    }

    public static class MessageChatJoinByLink extends MessageContent {
        public static final int CONSTRUCTOR = 1846493311;

        public MessageChatJoinByLink() {
        }

        public int getConstructor() {
            return 1846493311;
        }
    }

    public static class MessageChatAddMembers extends MessageContent {
        public long[] memberUserIds;
        public static final int CONSTRUCTOR = 1701117908;

        public MessageChatAddMembers() {
        }

        public MessageChatAddMembers(long[] var1) {
            this.memberUserIds = var1;
        }

        public int getConstructor() {
            return 1701117908;
        }
    }

    public static class MessageChatDeletePhoto extends MessageContent {
        public static final int CONSTRUCTOR = -184374809;

        public MessageChatDeletePhoto() {
        }

        public int getConstructor() {
            return -184374809;
        }
    }

    public static class MessageChatChangePhoto extends MessageContent {
        public ChatPhoto photo;
        public static final int CONSTRUCTOR = -813415093;

        public MessageChatChangePhoto() {
        }

        public MessageChatChangePhoto(ChatPhoto var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return -813415093;
        }
    }

    public static class MessageChatChangeTitle extends MessageContent {
        public String title;
        public static final int CONSTRUCTOR = 748272449;

        public MessageChatChangeTitle() {
        }

        public MessageChatChangeTitle(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return 748272449;
        }
    }

    public static class MessageSupergroupChatCreate extends MessageContent {
        public String title;
        public static final int CONSTRUCTOR = -434325733;

        public MessageSupergroupChatCreate() {
        }

        public MessageSupergroupChatCreate(String var1) {
            this.title = var1;
        }

        public int getConstructor() {
            return -434325733;
        }
    }

    public static class MessageBasicGroupChatCreate extends MessageContent {
        public String title;
        public long[] memberUserIds;
        public static final int CONSTRUCTOR = 795404060;

        public MessageBasicGroupChatCreate() {
        }

        public MessageBasicGroupChatCreate(String var1, long[] var2) {
            this.title = var1;
            this.memberUserIds = var2;
        }

        public int getConstructor() {
            return 795404060;
        }
    }

    public static class MessageInviteVideoChatParticipants extends MessageContent {
        public int groupCallId;
        public long[] userIds;
        public static final int CONSTRUCTOR = -1459065585;

        public MessageInviteVideoChatParticipants() {
        }

        public MessageInviteVideoChatParticipants(int var1, long[] var2) {
            this.groupCallId = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return -1459065585;
        }
    }

    public static class MessageVideoChatEnded extends MessageContent {
        public int duration;
        public static final int CONSTRUCTOR = 2032544855;

        public MessageVideoChatEnded() {
        }

        public MessageVideoChatEnded(int var1) {
            this.duration = var1;
        }

        public int getConstructor() {
            return 2032544855;
        }
    }

    public static class MessageVideoChatStarted extends MessageContent {
        public int groupCallId;
        public static final int CONSTRUCTOR = 521225561;

        public MessageVideoChatStarted() {
        }

        public MessageVideoChatStarted(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 521225561;
        }
    }

    public static class MessageVideoChatScheduled extends MessageContent {
        public int groupCallId;
        public int startDate;
        public static final int CONSTRUCTOR = -1855185481;

        public MessageVideoChatScheduled() {
        }

        public MessageVideoChatScheduled(int var1, int var2) {
            this.groupCallId = var1;
            this.startDate = var2;
        }

        public int getConstructor() {
            return -1855185481;
        }
    }

    public static class MessageCall extends MessageContent {
        public boolean isVideo;
        public CallDiscardReason discardReason;
        public int duration;
        public static final int CONSTRUCTOR = 538893824;

        public MessageCall() {
        }

        public MessageCall(boolean var1, CallDiscardReason var2, int var3) {
            this.isVideo = var1;
            this.discardReason = var2;
            this.duration = var3;
        }

        public int getConstructor() {
            return 538893824;
        }
    }

    public static class MessageInvoice extends MessageContent {
        public String title;
        public FormattedText description;
        public Photo photo;
        public String currency;
        public long totalAmount;
        public String startParameter;
        public boolean isTest;
        public boolean needShippingAddress;
        public long receiptMessageId;
        public static final int CONSTRUCTOR = -668839796;

        public MessageInvoice() {
        }

        public MessageInvoice(String var1, FormattedText var2, Photo var3, String var4, long var5, String var7, boolean var8, boolean var9, long var10) {
            this.title = var1;
            this.description = var2;
            this.photo = var3;
            this.currency = var4;
            this.totalAmount = var5;
            this.startParameter = var7;
            this.isTest = var8;
            this.needShippingAddress = var9;
            this.receiptMessageId = var10;
        }

        public int getConstructor() {
            return -668839796;
        }
    }

    public static class MessagePoll extends MessageContent {
        public Poll poll;
        public static final int CONSTRUCTOR = -662130099;

        public MessagePoll() {
        }

        public MessagePoll(Poll var1) {
            this.poll = var1;
        }

        public int getConstructor() {
            return -662130099;
        }
    }

    public static class MessageGame extends MessageContent {
        public Game game;
        public static final int CONSTRUCTOR = -69441162;

        public MessageGame() {
        }

        public MessageGame(Game var1) {
            this.game = var1;
        }

        public int getConstructor() {
            return -69441162;
        }
    }

    public static class MessageDice extends MessageContent {
        public DiceStickers initialState;
        public DiceStickers finalState;
        public String emoji;
        public int value;
        public int successAnimationFrameNumber;
        public static final int CONSTRUCTOR = 1115779641;

        public MessageDice() {
        }

        public MessageDice(DiceStickers var1, DiceStickers var2, String var3, int var4, int var5) {
            this.initialState = var1;
            this.finalState = var2;
            this.emoji = var3;
            this.value = var4;
            this.successAnimationFrameNumber = var5;
        }

        public int getConstructor() {
            return 1115779641;
        }
    }

    public static class MessageAnimatedEmoji extends MessageContent {
        public AnimatedEmoji animatedEmoji;
        public String emoji;
        public static final int CONSTRUCTOR = 908195298;

        public MessageAnimatedEmoji() {
        }

        public MessageAnimatedEmoji(AnimatedEmoji var1, String var2) {
            this.animatedEmoji = var1;
            this.emoji = var2;
        }

        public int getConstructor() {
            return 908195298;
        }
    }

    public static class MessageContact extends MessageContent {
        public Contact contact;
        public static final int CONSTRUCTOR = -512684966;

        public MessageContact() {
        }

        public MessageContact(Contact var1) {
            this.contact = var1;
        }

        public int getConstructor() {
            return -512684966;
        }
    }

    public static class MessageVenue extends MessageContent {
        public Venue venue;
        public static final int CONSTRUCTOR = -2146492043;

        public MessageVenue() {
        }

        public MessageVenue(Venue var1) {
            this.venue = var1;
        }

        public int getConstructor() {
            return -2146492043;
        }
    }

    public static class MessageLocation extends MessageContent {
        public Location location;
        public int livePeriod;
        public int expiresIn;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = 303973492;

        public MessageLocation() {
        }

        public MessageLocation(Location var1, int var2, int var3, int var4, int var5) {
            this.location = var1;
            this.livePeriod = var2;
            this.expiresIn = var3;
            this.heading = var4;
            this.proximityAlertRadius = var5;
        }

        public int getConstructor() {
            return 303973492;
        }
    }

    public static class MessageVoiceNote extends MessageContent {
        public VoiceNote voiceNote;
        public FormattedText caption;
        public boolean isListened;
        public static final int CONSTRUCTOR = 527777781;

        public MessageVoiceNote() {
        }

        public MessageVoiceNote(VoiceNote var1, FormattedText var2, boolean var3) {
            this.voiceNote = var1;
            this.caption = var2;
            this.isListened = var3;
        }

        public int getConstructor() {
            return 527777781;
        }
    }

    public static class MessageVideoNote extends MessageContent {
        public VideoNote videoNote;
        public boolean isViewed;
        public boolean isSecret;
        public static final int CONSTRUCTOR = 963323014;

        public MessageVideoNote() {
        }

        public MessageVideoNote(VideoNote var1, boolean var2, boolean var3) {
            this.videoNote = var1;
            this.isViewed = var2;
            this.isSecret = var3;
        }

        public int getConstructor() {
            return 963323014;
        }
    }

    public static class MessageExpiredVideo extends MessageContent {
        public static final int CONSTRUCTOR = -1212209981;

        public MessageExpiredVideo() {
        }

        public int getConstructor() {
            return -1212209981;
        }
    }

    public static class MessageVideo extends MessageContent {
        public Video video;
        public FormattedText caption;
        public boolean isSecret;
        public static final int CONSTRUCTOR = 2021281344;

        public MessageVideo() {
        }

        public MessageVideo(Video var1, FormattedText var2, boolean var3) {
            this.video = var1;
            this.caption = var2;
            this.isSecret = var3;
        }

        public int getConstructor() {
            return 2021281344;
        }
    }

    public static class MessageSticker extends MessageContent {
        public Sticker sticker;
        public boolean isPremium;
        public static final int CONSTRUCTOR = -437199670;

        public MessageSticker() {
        }

        public MessageSticker(Sticker var1, boolean var2) {
            this.sticker = var1;
            this.isPremium = var2;
        }

        public int getConstructor() {
            return -437199670;
        }
    }

    public static class MessageExpiredPhoto extends MessageContent {
        public static final int CONSTRUCTOR = -1404641801;

        public MessageExpiredPhoto() {
        }

        public int getConstructor() {
            return -1404641801;
        }
    }

    public static class MessagePhoto extends MessageContent {
        public Photo photo;
        public FormattedText caption;
        public boolean isSecret;
        public static final int CONSTRUCTOR = -1851395174;

        public MessagePhoto() {
        }

        public MessagePhoto(Photo var1, FormattedText var2, boolean var3) {
            this.photo = var1;
            this.caption = var2;
            this.isSecret = var3;
        }

        public int getConstructor() {
            return -1851395174;
        }
    }

    public static class MessageDocument extends MessageContent {
        public Document document;
        public FormattedText caption;
        public static final int CONSTRUCTOR = 596945783;

        public MessageDocument() {
        }

        public MessageDocument(Document var1, FormattedText var2) {
            this.document = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 596945783;
        }
    }

    public static class MessageAudio extends MessageContent {
        public Audio audio;
        public FormattedText caption;
        public static final int CONSTRUCTOR = 276722716;

        public MessageAudio() {
        }

        public MessageAudio(Audio var1, FormattedText var2) {
            this.audio = var1;
            this.caption = var2;
        }

        public int getConstructor() {
            return 276722716;
        }
    }

    public static class MessageAnimation extends MessageContent {
        public Animation animation;
        public FormattedText caption;
        public boolean isSecret;
        public static final int CONSTRUCTOR = 1306939396;

        public MessageAnimation() {
        }

        public MessageAnimation(Animation var1, FormattedText var2, boolean var3) {
            this.animation = var1;
            this.caption = var2;
            this.isSecret = var3;
        }

        public int getConstructor() {
            return 1306939396;
        }
    }

    public static class MessageText extends MessageContent {
        public FormattedText text;
        public WebPage webPage;
        public static final int CONSTRUCTOR = 1989037971;

        public MessageText() {
        }

        public MessageText(FormattedText var1, WebPage var2) {
            this.text = var1;
            this.webPage = var2;
        }

        public int getConstructor() {
            return 1989037971;
        }
    }

    public abstract static class MessageContent extends Object {
        public MessageContent() {
        }
    }

    public static class MessageCalendarDay extends Object {
        public int totalCount;
        public Message message;
        public static final int CONSTRUCTOR = -376467614;

        public MessageCalendarDay() {
        }

        public MessageCalendarDay(int var1, Message var2) {
            this.totalCount = var1;
            this.message = var2;
        }

        public int getConstructor() {
            return -376467614;
        }
    }

    public static class MessageCalendar extends Object {
        public int totalCount;
        public MessageCalendarDay[] days;
        public static final int CONSTRUCTOR = -1682890519;

        public MessageCalendar() {
        }

        public MessageCalendar(int var1, MessageCalendarDay[] var2) {
            this.totalCount = var1;
            this.days = var2;
        }

        public int getConstructor() {
            return -1682890519;
        }
    }

    public static class Message extends Object {
        public long id;
        public MessageSender senderId;
        public long chatId;
        public MessageSendingState sendingState;
        public MessageSchedulingState schedulingState;
        public boolean isOutgoing;
        public boolean isPinned;
        public boolean canBeEdited;
        public boolean canBeForwarded;
        public boolean canBeSaved;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeDeletedForAllUsers;
        public boolean canGetAddedReactions;
        public boolean canGetStatistics;
        public boolean canGetMessageThread;
        public boolean canGetViewers;
        public boolean canGetMediaTimestampLinks;
        public boolean canReportReactions;
        public boolean hasTimestampedMedia;
        public boolean isChannelPost;
        public boolean containsUnreadMention;
        public int date;
        public int editDate;
        public MessageForwardInfo forwardInfo;
        public MessageInteractionInfo interactionInfo;
        public UnreadReaction[] unreadReactions;
        public long replyInChatId;
        public long replyToMessageId;
        public long messageThreadId;
        public int ttl;
        public double ttlExpiresIn;
        public long viaBotUserId;
        public String authorSignature;
        public long mediaAlbumId;
        public String restrictionReason;
        public MessageContent content;
        public ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = -218456363;

        public Message() {
        }

        public Message(long var1, MessageSender var3, long var4, MessageSendingState var6, MessageSchedulingState var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18, boolean var19, boolean var20, boolean var21, boolean var22, boolean var23, int var24, int var25, MessageForwardInfo var26, MessageInteractionInfo var27, UnreadReaction[] var28, long var29, long var31, long var33, int var35, double var36, long var38, String var40, long var41, String var43, MessageContent var44, ReplyMarkup var45) {
            this.id = var1;
            this.senderId = var3;
            this.chatId = var4;
            this.sendingState = var6;
            this.schedulingState = var7;
            this.isOutgoing = var8;
            this.isPinned = var9;
            this.canBeEdited = var10;
            this.canBeForwarded = var11;
            this.canBeSaved = var12;
            this.canBeDeletedOnlyForSelf = var13;
            this.canBeDeletedForAllUsers = var14;
            this.canGetAddedReactions = var15;
            this.canGetStatistics = var16;
            this.canGetMessageThread = var17;
            this.canGetViewers = var18;
            this.canGetMediaTimestampLinks = var19;
            this.canReportReactions = var20;
            this.hasTimestampedMedia = var21;
            this.isChannelPost = var22;
            this.containsUnreadMention = var23;
            this.date = var24;
            this.editDate = var25;
            this.forwardInfo = var26;
            this.interactionInfo = var27;
            this.unreadReactions = var28;
            this.replyInChatId = var29;
            this.replyToMessageId = var31;
            this.messageThreadId = var33;
            this.ttl = var35;
            this.ttlExpiresIn = var36;
            this.viaBotUserId = var38;
            this.authorSignature = var40;
            this.mediaAlbumId = var41;
            this.restrictionReason = var43;
            this.content = var44;
            this.replyMarkup = var45;
        }

        public int getConstructor() {
            return -218456363;
        }
    }

    public static class MaskPosition extends Object {
        public MaskPoint point;
        public double xShift;
        public double yShift;
        public double scale;
        public static final int CONSTRUCTOR = -2097433026;

        public MaskPosition() {
        }

        public MaskPosition(MaskPoint var1, double var2, double var4, double var6) {
            this.point = var1;
            this.xShift = var2;
            this.yShift = var4;
            this.scale = var6;
        }

        public int getConstructor() {
            return -2097433026;
        }
    }

    public static class MaskPointChin extends MaskPoint {
        public static final int CONSTRUCTOR = 534995335;

        public MaskPointChin() {
        }

        public int getConstructor() {
            return 534995335;
        }
    }

    public static class MaskPointMouth extends MaskPoint {
        public static final int CONSTRUCTOR = 411773406;

        public MaskPointMouth() {
        }

        public int getConstructor() {
            return 411773406;
        }
    }

    public static class MaskPointEyes extends MaskPoint {
        public static final int CONSTRUCTOR = 1748310861;

        public MaskPointEyes() {
        }

        public int getConstructor() {
            return 1748310861;
        }
    }

    public static class MaskPointForehead extends MaskPoint {
        public static final int CONSTRUCTOR = 1027512005;

        public MaskPointForehead() {
        }

        public int getConstructor() {
            return 1027512005;
        }
    }

    public abstract static class MaskPoint extends Object {
        public MaskPoint() {
        }
    }

    public static class LoginUrlInfoRequestConfirmation extends LoginUrlInfo {
        public String url;
        public String domain;
        public long botUserId;
        public boolean requestWriteAccess;
        public static final int CONSTRUCTOR = 2128290863;

        public LoginUrlInfoRequestConfirmation() {
        }

        public LoginUrlInfoRequestConfirmation(String var1, String var2, long var3, boolean var5) {
            this.url = var1;
            this.domain = var2;
            this.botUserId = var3;
            this.requestWriteAccess = var5;
        }

        public int getConstructor() {
            return 2128290863;
        }
    }

    public static class LoginUrlInfoOpen extends LoginUrlInfo {
        public String url;
        public boolean skipConfirm;
        public static final int CONSTRUCTOR = -1079045420;

        public LoginUrlInfoOpen() {
        }

        public LoginUrlInfoOpen(String var1, boolean var2) {
            this.url = var1;
            this.skipConfirm = var2;
        }

        public int getConstructor() {
            return -1079045420;
        }
    }

    public abstract static class LoginUrlInfo extends Object {
        public LoginUrlInfo() {
        }
    }

    public static class LogVerbosityLevel extends Object {
        public int verbosityLevel;
        public static final int CONSTRUCTOR = 1734624234;

        public LogVerbosityLevel() {
        }

        public LogVerbosityLevel(int var1) {
            this.verbosityLevel = var1;
        }

        public int getConstructor() {
            return 1734624234;
        }
    }

    public static class LogTags extends Object {
        public String[] tags;
        public static final int CONSTRUCTOR = -1604930601;

        public LogTags() {
        }

        public LogTags(String[] var1) {
            this.tags = var1;
        }

        public int getConstructor() {
            return -1604930601;
        }
    }

    public static class LogStreamEmpty extends LogStream {
        public static final int CONSTRUCTOR = -499912244;

        public LogStreamEmpty() {
        }

        public int getConstructor() {
            return -499912244;
        }
    }

    public static class LogStreamFile extends LogStream {
        public String path;
        public long maxFileSize;
        public boolean redirectStderr;
        public static final int CONSTRUCTOR = 1532136933;

        public LogStreamFile() {
        }

        public LogStreamFile(String var1, long var2, boolean var4) {
            this.path = var1;
            this.maxFileSize = var2;
            this.redirectStderr = var4;
        }

        public int getConstructor() {
            return 1532136933;
        }
    }

    public static class LogStreamDefault extends LogStream {
        public static final int CONSTRUCTOR = 1390581436;

        public LogStreamDefault() {
        }

        public int getConstructor() {
            return 1390581436;
        }
    }

    public abstract static class LogStream extends Object {
        public LogStream() {
        }
    }

    public static class Location extends Object {
        public double latitude;
        public double longitude;
        public double horizontalAccuracy;
        public static final int CONSTRUCTOR = -443392141;

        public Location() {
        }

        public Location(double var1, double var3, double var5) {
            this.latitude = var1;
            this.longitude = var3;
            this.horizontalAccuracy = var5;
        }

        public int getConstructor() {
            return -443392141;
        }
    }

    public static class LocalizationTargetInfo extends Object {
        public LanguagePackInfo[] languagePacks;
        public static final int CONSTRUCTOR = -2048670809;

        public LocalizationTargetInfo() {
        }

        public LocalizationTargetInfo(LanguagePackInfo[] var1) {
            this.languagePacks = var1;
        }

        public int getConstructor() {
            return -2048670809;
        }
    }

    public static class LocalFile extends Object {
        public String path;
        public boolean canBeDownloaded;
        public boolean canBeDeleted;
        public boolean isDownloadingActive;
        public boolean isDownloadingCompleted;
        public long downloadOffset;
        public long downloadedPrefixSize;
        public long downloadedSize;
        public static final int CONSTRUCTOR = -1562732153;

        public LocalFile() {
        }

        public LocalFile(String var1, boolean var2, boolean var3, boolean var4, boolean var5, long var6, long var8, long var10) {
            this.path = var1;
            this.canBeDownloaded = var2;
            this.canBeDeleted = var3;
            this.isDownloadingActive = var4;
            this.isDownloadingCompleted = var5;
            this.downloadOffset = var6;
            this.downloadedPrefixSize = var8;
            this.downloadedSize = var10;
        }

        public int getConstructor() {
            return -1562732153;
        }
    }

    public static class LanguagePackStrings extends Object {
        public LanguagePackString[] strings;
        public static final int CONSTRUCTOR = 1172082922;

        public LanguagePackStrings() {
        }

        public LanguagePackStrings(LanguagePackString[] var1) {
            this.strings = var1;
        }

        public int getConstructor() {
            return 1172082922;
        }
    }

    public static class LanguagePackStringValueDeleted extends LanguagePackStringValue {
        public static final int CONSTRUCTOR = 1834792698;

        public LanguagePackStringValueDeleted() {
        }

        public int getConstructor() {
            return 1834792698;
        }
    }

    public static class LanguagePackStringValuePluralized extends LanguagePackStringValue {
        public String zeroValue;
        public String oneValue;
        public String twoValue;
        public String fewValue;
        public String manyValue;
        public String otherValue;
        public static final int CONSTRUCTOR = 1906840261;

        public LanguagePackStringValuePluralized() {
        }

        public LanguagePackStringValuePluralized(String var1, String var2, String var3, String var4, String var5, String var6) {
            this.zeroValue = var1;
            this.oneValue = var2;
            this.twoValue = var3;
            this.fewValue = var4;
            this.manyValue = var5;
            this.otherValue = var6;
        }

        public int getConstructor() {
            return 1906840261;
        }
    }

    public static class LanguagePackStringValueOrdinary extends LanguagePackStringValue {
        public String value;
        public static final int CONSTRUCTOR = -249256352;

        public LanguagePackStringValueOrdinary() {
        }

        public LanguagePackStringValueOrdinary(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -249256352;
        }
    }

    public abstract static class LanguagePackStringValue extends Object {
        public LanguagePackStringValue() {
        }
    }

    public static class LanguagePackString extends Object {
        public String key;
        public LanguagePackStringValue value;
        public static final int CONSTRUCTOR = 1307632736;

        public LanguagePackString() {
        }

        public LanguagePackString(String var1, LanguagePackStringValue var2) {
            this.key = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return 1307632736;
        }
    }

    public static class LanguagePackInfo extends Object {
        public String id;
        public String baseLanguagePackId;
        public String name;
        public String nativeName;
        public String pluralCode;
        public boolean isOfficial;
        public boolean isRtl;
        public boolean isBeta;
        public boolean isInstalled;
        public int totalStringCount;
        public int translatedStringCount;
        public int localStringCount;
        public String translationUrl;
        public static final int CONSTRUCTOR = 542199642;

        public LanguagePackInfo() {
        }

        public LanguagePackInfo(String var1, String var2, String var3, String var4, String var5, boolean var6, boolean var7, boolean var8, boolean var9, int var10, int var11, int var12, String var13) {
            this.id = var1;
            this.baseLanguagePackId = var2;
            this.name = var3;
            this.nativeName = var4;
            this.pluralCode = var5;
            this.isOfficial = var6;
            this.isRtl = var7;
            this.isBeta = var8;
            this.isInstalled = var9;
            this.totalStringCount = var10;
            this.translatedStringCount = var11;
            this.localStringCount = var12;
            this.translationUrl = var13;
        }

        public int getConstructor() {
            return 542199642;
        }
    }

    public static class LabeledPricePart extends Object {
        public String label;
        public long amount;
        public static final int CONSTRUCTOR = 552789798;

        public LabeledPricePart() {
        }

        public LabeledPricePart(String var1, long var2) {
            this.label = var1;
            this.amount = var2;
        }

        public int getConstructor() {
            return 552789798;
        }
    }

    public static class KeyboardButtonTypeWebApp extends KeyboardButtonType {
        public String url;
        public static final int CONSTRUCTOR = 1892220770;

        public KeyboardButtonTypeWebApp() {
        }

        public KeyboardButtonTypeWebApp(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 1892220770;
        }
    }

    public static class KeyboardButtonTypeRequestPoll extends KeyboardButtonType {
        public boolean forceRegular;
        public boolean forceQuiz;
        public static final int CONSTRUCTOR = 1902435512;

        public KeyboardButtonTypeRequestPoll() {
        }

        public KeyboardButtonTypeRequestPoll(boolean var1, boolean var2) {
            this.forceRegular = var1;
            this.forceQuiz = var2;
        }

        public int getConstructor() {
            return 1902435512;
        }
    }

    public static class KeyboardButtonTypeRequestLocation extends KeyboardButtonType {
        public static final int CONSTRUCTOR = -125661955;

        public KeyboardButtonTypeRequestLocation() {
        }

        public int getConstructor() {
            return -125661955;
        }
    }

    public static class KeyboardButtonTypeRequestPhoneNumber extends KeyboardButtonType {
        public static final int CONSTRUCTOR = -1529235527;

        public KeyboardButtonTypeRequestPhoneNumber() {
        }

        public int getConstructor() {
            return -1529235527;
        }
    }

    public static class KeyboardButtonTypeText extends KeyboardButtonType {
        public static final int CONSTRUCTOR = -1773037256;

        public KeyboardButtonTypeText() {
        }

        public int getConstructor() {
            return -1773037256;
        }
    }

    public abstract static class KeyboardButtonType extends Object {
        public KeyboardButtonType() {
        }
    }

    public static class KeyboardButton extends Object {
        public String text;
        public KeyboardButtonType type;
        public static final int CONSTRUCTOR = -2069836172;

        public KeyboardButton() {
        }

        public KeyboardButton(String var1, KeyboardButtonType var2) {
            this.text = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -2069836172;
        }
    }

    public static class JsonValueObject extends JsonValue {
        public JsonObjectMember[] members;
        public static final int CONSTRUCTOR = 520252026;

        public JsonValueObject() {
        }

        public JsonValueObject(JsonObjectMember[] var1) {
            this.members = var1;
        }

        public int getConstructor() {
            return 520252026;
        }
    }

    public static class JsonValueArray extends JsonValue {
        public JsonValue[] values;
        public static final int CONSTRUCTOR = -183913546;

        public JsonValueArray() {
        }

        public JsonValueArray(JsonValue[] var1) {
            this.values = var1;
        }

        public int getConstructor() {
            return -183913546;
        }
    }

    public static class JsonValueString extends JsonValue {
        public String value;
        public static final int CONSTRUCTOR = 1597947313;

        public JsonValueString() {
        }

        public JsonValueString(String var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return 1597947313;
        }
    }

    public static class JsonValueNumber extends JsonValue {
        public double value;
        public static final int CONSTRUCTOR = -1010822033;

        public JsonValueNumber() {
        }

        public JsonValueNumber(double var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -1010822033;
        }
    }

    public static class JsonValueBoolean extends JsonValue {
        public boolean value;
        public static final int CONSTRUCTOR = -2142186576;

        public JsonValueBoolean() {
        }

        public JsonValueBoolean(boolean var1) {
            this.value = var1;
        }

        public int getConstructor() {
            return -2142186576;
        }
    }

    public static class JsonValueNull extends JsonValue {
        public static final int CONSTRUCTOR = -92872499;

        public JsonValueNull() {
        }

        public int getConstructor() {
            return -92872499;
        }
    }

    public abstract static class JsonValue extends Object {
        public JsonValue() {
        }
    }

    public static class JsonObjectMember extends Object {
        public String key;
        public JsonValue value;
        public static final int CONSTRUCTOR = -1803309418;

        public JsonObjectMember() {
        }

        public JsonObjectMember(String var1, JsonValue var2) {
            this.key = var1;
            this.value = var2;
        }

        public int getConstructor() {
            return -1803309418;
        }
    }

    public static class Invoice extends Object {
        public String currency;
        public LabeledPricePart[] priceParts;
        public long maxTipAmount;
        public long[] suggestedTipAmounts;
        public String recurringPaymentTermsOfServiceUrl;
        public boolean isTest;
        public boolean needName;
        public boolean needPhoneNumber;
        public boolean needEmailAddress;
        public boolean needShippingAddress;
        public boolean sendPhoneNumberToProvider;
        public boolean sendEmailAddressToProvider;
        public boolean isFlexible;
        public static final int CONSTRUCTOR = 1977205639;

        public Invoice() {
        }

        public Invoice(String var1, LabeledPricePart[] var2, long var3, long[] var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14) {
            this.currency = var1;
            this.priceParts = var2;
            this.maxTipAmount = var3;
            this.suggestedTipAmounts = var5;
            this.recurringPaymentTermsOfServiceUrl = var6;
            this.isTest = var7;
            this.needName = var8;
            this.needPhoneNumber = var9;
            this.needEmailAddress = var10;
            this.needShippingAddress = var11;
            this.sendPhoneNumberToProvider = var12;
            this.sendEmailAddressToProvider = var13;
            this.isFlexible = var14;
        }

        public int getConstructor() {
            return 1977205639;
        }
    }

    public static class InternalLinkTypeVideoChat extends InternalLinkType {
        public String chatUsername;
        public String inviteHash;
        public boolean isLiveStream;
        public static final int CONSTRUCTOR = -2020149068;

        public InternalLinkTypeVideoChat() {
        }

        public InternalLinkTypeVideoChat(String var1, String var2, boolean var3) {
            this.chatUsername = var1;
            this.inviteHash = var2;
            this.isLiveStream = var3;
        }

        public int getConstructor() {
            return -2020149068;
        }
    }

    public static class InternalLinkTypeUserPhoneNumber extends InternalLinkType {
        public String phoneNumber;
        public static final int CONSTRUCTOR = -1955751319;

        public InternalLinkTypeUserPhoneNumber() {
        }

        public InternalLinkTypeUserPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return -1955751319;
        }
    }

    public static class InternalLinkTypeUnsupportedProxy extends InternalLinkType {
        public static final int CONSTRUCTOR = -566649079;

        public InternalLinkTypeUnsupportedProxy() {
        }

        public int getConstructor() {
            return -566649079;
        }
    }

    public static class InternalLinkTypeUnknownDeepLink extends InternalLinkType {
        public String link;
        public static final int CONSTRUCTOR = 625596379;

        public InternalLinkTypeUnknownDeepLink() {
        }

        public InternalLinkTypeUnknownDeepLink(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 625596379;
        }
    }

    public static class InternalLinkTypeThemeSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = -1051903722;

        public InternalLinkTypeThemeSettings() {
        }

        public int getConstructor() {
            return -1051903722;
        }
    }

    public static class InternalLinkTypeTheme extends InternalLinkType {
        public String themeName;
        public static final int CONSTRUCTOR = -200935417;

        public InternalLinkTypeTheme() {
        }

        public InternalLinkTypeTheme(String var1) {
            this.themeName = var1;
        }

        public int getConstructor() {
            return -200935417;
        }
    }

    public static class InternalLinkTypeStickerSet extends InternalLinkType {
        public String stickerSetName;
        public static final int CONSTRUCTOR = -529639751;

        public InternalLinkTypeStickerSet() {
        }

        public InternalLinkTypeStickerSet(String var1) {
            this.stickerSetName = var1;
        }

        public int getConstructor() {
            return -529639751;
        }
    }

    public static class InternalLinkTypeSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = 393561524;

        public InternalLinkTypeSettings() {
        }

        public int getConstructor() {
            return 393561524;
        }
    }

    public static class InternalLinkTypeRestorePurchases extends InternalLinkType {
        public static final int CONSTRUCTOR = 606090371;

        public InternalLinkTypeRestorePurchases() {
        }

        public int getConstructor() {
            return 606090371;
        }
    }

    public static class InternalLinkTypeQrCodeAuthentication extends InternalLinkType {
        public static final int CONSTRUCTOR = -1089332956;

        public InternalLinkTypeQrCodeAuthentication() {
        }

        public int getConstructor() {
            return -1089332956;
        }
    }

    public static class InternalLinkTypePublicChat extends InternalLinkType {
        public String chatUsername;
        public static final int CONSTRUCTOR = -1485547717;

        public InternalLinkTypePublicChat() {
        }

        public InternalLinkTypePublicChat(String var1) {
            this.chatUsername = var1;
        }

        public int getConstructor() {
            return -1485547717;
        }
    }

    public static class InternalLinkTypeProxy extends InternalLinkType {
        public String server;
        public int port;
        public ProxyType type;
        public static final int CONSTRUCTOR = -1313788694;

        public InternalLinkTypeProxy() {
        }

        public InternalLinkTypeProxy(String var1, int var2, ProxyType var3) {
            this.server = var1;
            this.port = var2;
            this.type = var3;
        }

        public int getConstructor() {
            return -1313788694;
        }
    }

    public static class InternalLinkTypePrivacyAndSecuritySettings extends InternalLinkType {
        public static final int CONSTRUCTOR = -1386255665;

        public InternalLinkTypePrivacyAndSecuritySettings() {
        }

        public int getConstructor() {
            return -1386255665;
        }
    }

    public static class InternalLinkTypePremiumFeatures extends InternalLinkType {
        public String referrer;
        public static final int CONSTRUCTOR = 1216892745;

        public InternalLinkTypePremiumFeatures() {
        }

        public InternalLinkTypePremiumFeatures(String var1) {
            this.referrer = var1;
        }

        public int getConstructor() {
            return 1216892745;
        }
    }

    public static class InternalLinkTypePhoneNumberConfirmation extends InternalLinkType {
        public String hash;
        public String phoneNumber;
        public static final int CONSTRUCTOR = 1757375254;

        public InternalLinkTypePhoneNumberConfirmation() {
        }

        public InternalLinkTypePhoneNumberConfirmation(String var1, String var2) {
            this.hash = var1;
            this.phoneNumber = var2;
        }

        public int getConstructor() {
            return 1757375254;
        }
    }

    public static class InternalLinkTypePassportDataRequest extends InternalLinkType {
        public long botUserId;
        public String scope;
        public String publicKey;
        public String nonce;
        public String callbackUrl;
        public static final int CONSTRUCTOR = -988819839;

        public InternalLinkTypePassportDataRequest() {
        }

        public InternalLinkTypePassportDataRequest(long var1, String var3, String var4, String var5, String var6) {
            this.botUserId = var1;
            this.scope = var3;
            this.publicKey = var4;
            this.nonce = var5;
            this.callbackUrl = var6;
        }

        public int getConstructor() {
            return -988819839;
        }
    }

    public static class InternalLinkTypeMessageDraft extends InternalLinkType {
        public FormattedText text;
        public boolean containsLink;
        public static final int CONSTRUCTOR = 661633749;

        public InternalLinkTypeMessageDraft() {
        }

        public InternalLinkTypeMessageDraft(FormattedText var1, boolean var2) {
            this.text = var1;
            this.containsLink = var2;
        }

        public int getConstructor() {
            return 661633749;
        }
    }

    public static class InternalLinkTypeMessage extends InternalLinkType {
        public String url;
        public static final int CONSTRUCTOR = 978541650;

        public InternalLinkTypeMessage() {
        }

        public InternalLinkTypeMessage(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 978541650;
        }
    }

    public static class InternalLinkTypeLanguageSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = -1340479770;

        public InternalLinkTypeLanguageSettings() {
        }

        public int getConstructor() {
            return -1340479770;
        }
    }

    public static class InternalLinkTypeLanguagePack extends InternalLinkType {
        public String languagePackId;
        public static final int CONSTRUCTOR = -1450766996;

        public InternalLinkTypeLanguagePack() {
        }

        public InternalLinkTypeLanguagePack(String var1) {
            this.languagePackId = var1;
        }

        public int getConstructor() {
            return -1450766996;
        }
    }

    public static class InternalLinkTypeInvoice extends InternalLinkType {
        public String invoiceName;
        public static final int CONSTRUCTOR = -213094996;

        public InternalLinkTypeInvoice() {
        }

        public InternalLinkTypeInvoice(String var1) {
            this.invoiceName = var1;
        }

        public int getConstructor() {
            return -213094996;
        }
    }

    public static class InternalLinkTypeInstantView extends InternalLinkType {
        public String url;
        public static final int CONSTRUCTOR = 1019310532;

        public InternalLinkTypeInstantView() {
        }

        public InternalLinkTypeInstantView(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 1019310532;
        }
    }

    public static class InternalLinkTypeGame extends InternalLinkType {
        public String botUsername;
        public String gameShortName;
        public static final int CONSTRUCTOR = -260788787;

        public InternalLinkTypeGame() {
        }

        public InternalLinkTypeGame(String var1, String var2) {
            this.botUsername = var1;
            this.gameShortName = var2;
        }

        public int getConstructor() {
            return -260788787;
        }
    }

    public static class InternalLinkTypeFilterSettings extends InternalLinkType {
        public static final int CONSTRUCTOR = 1501632411;

        public InternalLinkTypeFilterSettings() {
        }

        public int getConstructor() {
            return 1501632411;
        }
    }

    public static class InternalLinkTypeChatInvite extends InternalLinkType {
        public String inviteLink;
        public static final int CONSTRUCTOR = 428621017;

        public InternalLinkTypeChatInvite() {
        }

        public InternalLinkTypeChatInvite(String var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return 428621017;
        }
    }

    public static class InternalLinkTypeChangePhoneNumber extends InternalLinkType {
        public static final int CONSTRUCTOR = -265856255;

        public InternalLinkTypeChangePhoneNumber() {
        }

        public int getConstructor() {
            return -265856255;
        }
    }

    public static class InternalLinkTypeBotAddToChannel extends InternalLinkType {
        public String botUsername;
        public ChatAdministratorRights administratorRights;
        public static final int CONSTRUCTOR = 1401602752;

        public InternalLinkTypeBotAddToChannel() {
        }

        public InternalLinkTypeBotAddToChannel(String var1, ChatAdministratorRights var2) {
            this.botUsername = var1;
            this.administratorRights = var2;
        }

        public int getConstructor() {
            return 1401602752;
        }
    }

    public static class InternalLinkTypeBotStartInGroup extends InternalLinkType {
        public String botUsername;
        public String startParameter;
        public ChatAdministratorRights administratorRights;
        public static final int CONSTRUCTOR = -905081650;

        public InternalLinkTypeBotStartInGroup() {
        }

        public InternalLinkTypeBotStartInGroup(String var1, String var2, ChatAdministratorRights var3) {
            this.botUsername = var1;
            this.startParameter = var2;
            this.administratorRights = var3;
        }

        public int getConstructor() {
            return -905081650;
        }
    }

    public static class InternalLinkTypeBotStart extends InternalLinkType {
        public String botUsername;
        public String startParameter;
        public boolean autostart;
        public static final int CONSTRUCTOR = 1066950637;

        public InternalLinkTypeBotStart() {
        }

        public InternalLinkTypeBotStart(String var1, String var2, boolean var3) {
            this.botUsername = var1;
            this.startParameter = var2;
            this.autostart = var3;
        }

        public int getConstructor() {
            return 1066950637;
        }
    }

    public static class InternalLinkTypeBackground extends InternalLinkType {
        public String backgroundName;
        public static final int CONSTRUCTOR = 185411848;

        public InternalLinkTypeBackground() {
        }

        public InternalLinkTypeBackground(String var1) {
            this.backgroundName = var1;
        }

        public int getConstructor() {
            return 185411848;
        }
    }

    public static class InternalLinkTypeAuthenticationCode extends InternalLinkType {
        public String code;
        public static final int CONSTRUCTOR = -209235982;

        public InternalLinkTypeAuthenticationCode() {
        }

        public InternalLinkTypeAuthenticationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -209235982;
        }
    }

    public static class InternalLinkTypeAttachmentMenuBot extends InternalLinkType {
        public TargetChat targetChat;
        public String botUsername;
        public String url;
        public static final int CONSTRUCTOR = 1682719269;

        public InternalLinkTypeAttachmentMenuBot() {
        }

        public InternalLinkTypeAttachmentMenuBot(TargetChat var1, String var2, String var3) {
            this.targetChat = var1;
            this.botUsername = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return 1682719269;
        }
    }

    public static class InternalLinkTypeActiveSessions extends InternalLinkType {
        public static final int CONSTRUCTOR = 1886108589;

        public InternalLinkTypeActiveSessions() {
        }

        public int getConstructor() {
            return 1886108589;
        }
    }

    public abstract static class InternalLinkType extends Object {
        public InternalLinkType() {
        }
    }

    public static class InputThumbnail extends Object {
        public InputFile thumbnail;
        public int width;
        public int height;
        public static final int CONSTRUCTOR = 1582387236;

        public InputThumbnail() {
        }

        public InputThumbnail(InputFile var1, int var2, int var3) {
            this.thumbnail = var1;
            this.width = var2;
            this.height = var3;
        }

        public int getConstructor() {
            return 1582387236;
        }
    }

    public static class InputSticker extends Object {
        public InputFile sticker;
        public String emojis;
        public StickerFormat format;
        public MaskPosition maskPosition;
        public static final int CONSTRUCTOR = -1692915280;

        public InputSticker() {
        }

        public InputSticker(InputFile var1, String var2, StickerFormat var3, MaskPosition var4) {
            this.sticker = var1;
            this.emojis = var2;
            this.format = var3;
            this.maskPosition = var4;
        }

        public int getConstructor() {
            return -1692915280;
        }
    }

    public static class InputPersonalDocument extends Object {
        public InputFile[] files;
        public InputFile[] translation;
        public static final int CONSTRUCTOR = 1676966826;

        public InputPersonalDocument() {
        }

        public InputPersonalDocument(InputFile[] var1, InputFile[] var2) {
            this.files = var1;
            this.translation = var2;
        }

        public int getConstructor() {
            return 1676966826;
        }
    }

    public static class InputPassportElementErrorSourceFiles extends InputPassportElementErrorSource {
        public byte[][] fileHashes;
        public static final int CONSTRUCTOR = -2008541640;

        public InputPassportElementErrorSourceFiles() {
        }

        public InputPassportElementErrorSourceFiles(byte[][] var1) {
            this.fileHashes = var1;
        }

        public int getConstructor() {
            return -2008541640;
        }
    }

    public static class InputPassportElementErrorSourceFile extends InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = -298492469;

        public InputPassportElementErrorSourceFile() {
        }

        public InputPassportElementErrorSourceFile(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return -298492469;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFiles extends InputPassportElementErrorSource {
        public byte[][] fileHashes;
        public static final int CONSTRUCTOR = -527254048;

        public InputPassportElementErrorSourceTranslationFiles() {
        }

        public InputPassportElementErrorSourceTranslationFiles(byte[][] var1) {
            this.fileHashes = var1;
        }

        public int getConstructor() {
            return -527254048;
        }
    }

    public static class InputPassportElementErrorSourceTranslationFile extends InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = 505842299;

        public InputPassportElementErrorSourceTranslationFile() {
        }

        public InputPassportElementErrorSourceTranslationFile(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return 505842299;
        }
    }

    public static class InputPassportElementErrorSourceSelfie extends InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = -773575528;

        public InputPassportElementErrorSourceSelfie() {
        }

        public InputPassportElementErrorSourceSelfie(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return -773575528;
        }
    }

    public static class InputPassportElementErrorSourceReverseSide extends InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = 413072891;

        public InputPassportElementErrorSourceReverseSide() {
        }

        public InputPassportElementErrorSourceReverseSide(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return 413072891;
        }
    }

    public static class InputPassportElementErrorSourceFrontSide extends InputPassportElementErrorSource {
        public byte[] fileHash;
        public static final int CONSTRUCTOR = 588023741;

        public InputPassportElementErrorSourceFrontSide() {
        }

        public InputPassportElementErrorSourceFrontSide(byte[] var1) {
            this.fileHash = var1;
        }

        public int getConstructor() {
            return 588023741;
        }
    }

    public static class InputPassportElementErrorSourceDataField extends InputPassportElementErrorSource {
        public String fieldName;
        public byte[] dataHash;
        public static final int CONSTRUCTOR = -426795002;

        public InputPassportElementErrorSourceDataField() {
        }

        public InputPassportElementErrorSourceDataField(String var1, byte[] var2) {
            this.fieldName = var1;
            this.dataHash = var2;
        }

        public int getConstructor() {
            return -426795002;
        }
    }

    public static class InputPassportElementErrorSourceUnspecified extends InputPassportElementErrorSource {
        public byte[] elementHash;
        public static final int CONSTRUCTOR = 267230319;

        public InputPassportElementErrorSourceUnspecified() {
        }

        public InputPassportElementErrorSourceUnspecified(byte[] var1) {
            this.elementHash = var1;
        }

        public int getConstructor() {
            return 267230319;
        }
    }

    public abstract static class InputPassportElementErrorSource extends Object {
        public InputPassportElementErrorSource() {
        }
    }

    public static class InputPassportElementError extends Object {
        public PassportElementType type;
        public String message;
        public InputPassportElementErrorSource source;
        public static final int CONSTRUCTOR = 285756898;

        public InputPassportElementError() {
        }

        public InputPassportElementError(PassportElementType var1, String var2, InputPassportElementErrorSource var3) {
            this.type = var1;
            this.message = var2;
            this.source = var3;
        }

        public int getConstructor() {
            return 285756898;
        }
    }

    public static class InputPassportElementEmailAddress extends InputPassportElement {
        public String emailAddress;
        public static final int CONSTRUCTOR = -248605659;

        public InputPassportElementEmailAddress() {
        }

        public InputPassportElementEmailAddress(String var1) {
            this.emailAddress = var1;
        }

        public int getConstructor() {
            return -248605659;
        }
    }

    public static class InputPassportElementPhoneNumber extends InputPassportElement {
        public String phoneNumber;
        public static final int CONSTRUCTOR = 1319357497;

        public InputPassportElementPhoneNumber() {
        }

        public InputPassportElementPhoneNumber(String var1) {
            this.phoneNumber = var1;
        }

        public int getConstructor() {
            return 1319357497;
        }
    }

    public static class InputPassportElementTemporaryRegistration extends InputPassportElement {
        public InputPersonalDocument temporaryRegistration;
        public static final int CONSTRUCTOR = -1913238047;

        public InputPassportElementTemporaryRegistration() {
        }

        public InputPassportElementTemporaryRegistration(InputPersonalDocument var1) {
            this.temporaryRegistration = var1;
        }

        public int getConstructor() {
            return -1913238047;
        }
    }

    public static class InputPassportElementPassportRegistration extends InputPassportElement {
        public InputPersonalDocument passportRegistration;
        public static final int CONSTRUCTOR = 1314562128;

        public InputPassportElementPassportRegistration() {
        }

        public InputPassportElementPassportRegistration(InputPersonalDocument var1) {
            this.passportRegistration = var1;
        }

        public int getConstructor() {
            return 1314562128;
        }
    }

    public static class InputPassportElementRentalAgreement extends InputPassportElement {
        public InputPersonalDocument rentalAgreement;
        public static final int CONSTRUCTOR = 1736154155;

        public InputPassportElementRentalAgreement() {
        }

        public InputPassportElementRentalAgreement(InputPersonalDocument var1) {
            this.rentalAgreement = var1;
        }

        public int getConstructor() {
            return 1736154155;
        }
    }

    public static class InputPassportElementBankStatement extends InputPassportElement {
        public InputPersonalDocument bankStatement;
        public static final int CONSTRUCTOR = -26585208;

        public InputPassportElementBankStatement() {
        }

        public InputPassportElementBankStatement(InputPersonalDocument var1) {
            this.bankStatement = var1;
        }

        public int getConstructor() {
            return -26585208;
        }
    }

    public static class InputPassportElementUtilityBill extends InputPassportElement {
        public InputPersonalDocument utilityBill;
        public static final int CONSTRUCTOR = 1389203841;

        public InputPassportElementUtilityBill() {
        }

        public InputPassportElementUtilityBill(InputPersonalDocument var1) {
            this.utilityBill = var1;
        }

        public int getConstructor() {
            return 1389203841;
        }
    }

    public static class InputPassportElementAddress extends InputPassportElement {
        public Address address;
        public static final int CONSTRUCTOR = 461630480;

        public InputPassportElementAddress() {
        }

        public InputPassportElementAddress(Address var1) {
            this.address = var1;
        }

        public int getConstructor() {
            return 461630480;
        }
    }

    public static class InputPassportElementInternalPassport extends InputPassportElement {
        public InputIdentityDocument internalPassport;
        public static final int CONSTRUCTOR = 715360043;

        public InputPassportElementInternalPassport() {
        }

        public InputPassportElementInternalPassport(InputIdentityDocument var1) {
            this.internalPassport = var1;
        }

        public int getConstructor() {
            return 715360043;
        }
    }

    public static class InputPassportElementIdentityCard extends InputPassportElement {
        public InputIdentityDocument identityCard;
        public static final int CONSTRUCTOR = -9963390;

        public InputPassportElementIdentityCard() {
        }

        public InputPassportElementIdentityCard(InputIdentityDocument var1) {
            this.identityCard = var1;
        }

        public int getConstructor() {
            return -9963390;
        }
    }

    public static class InputPassportElementDriverLicense extends InputPassportElement {
        public InputIdentityDocument driverLicense;
        public static final int CONSTRUCTOR = 304813264;

        public InputPassportElementDriverLicense() {
        }

        public InputPassportElementDriverLicense(InputIdentityDocument var1) {
            this.driverLicense = var1;
        }

        public int getConstructor() {
            return 304813264;
        }
    }

    public static class InputPassportElementPassport extends InputPassportElement {
        public InputIdentityDocument passport;
        public static final int CONSTRUCTOR = -497011356;

        public InputPassportElementPassport() {
        }

        public InputPassportElementPassport(InputIdentityDocument var1) {
            this.passport = var1;
        }

        public int getConstructor() {
            return -497011356;
        }
    }

    public static class InputPassportElementPersonalDetails extends InputPassportElement {
        public PersonalDetails personalDetails;
        public static final int CONSTRUCTOR = 164791359;

        public InputPassportElementPersonalDetails() {
        }

        public InputPassportElementPersonalDetails(PersonalDetails var1) {
            this.personalDetails = var1;
        }

        public int getConstructor() {
            return 164791359;
        }
    }

    public abstract static class InputPassportElement extends Object {
        public InputPassportElement() {
        }
    }

    public static class InputMessageForwarded extends InputMessageContent {
        public long fromChatId;
        public long messageId;
        public boolean inGameShare;
        public MessageCopyOptions copyOptions;
        public static final int CONSTRUCTOR = 1696232440;

        public InputMessageForwarded() {
        }

        public InputMessageForwarded(long var1, long var3, boolean var5, MessageCopyOptions var6) {
            this.fromChatId = var1;
            this.messageId = var3;
            this.inGameShare = var5;
            this.copyOptions = var6;
        }

        public int getConstructor() {
            return 1696232440;
        }
    }

    public static class InputMessagePoll extends InputMessageContent {
        public String question;
        public String[] options;
        public boolean isAnonymous;
        public PollType type;
        public int openPeriod;
        public int closeDate;
        public boolean isClosed;
        public static final int CONSTRUCTOR = 2054629900;

        public InputMessagePoll() {
        }

        public InputMessagePoll(String var1, String[] var2, boolean var3, PollType var4, int var5, int var6, boolean var7) {
            this.question = var1;
            this.options = var2;
            this.isAnonymous = var3;
            this.type = var4;
            this.openPeriod = var5;
            this.closeDate = var6;
            this.isClosed = var7;
        }

        public int getConstructor() {
            return 2054629900;
        }
    }

    public static class InputMessageInvoice extends InputMessageContent {
        public Invoice invoice;
        public String title;
        public String description;
        public String photoUrl;
        public int photoSize;
        public int photoWidth;
        public int photoHeight;
        public byte[] payload;
        public String providerToken;
        public String providerData;
        public String startParameter;
        public static final int CONSTRUCTOR = 1038812175;

        public InputMessageInvoice() {
        }

        public InputMessageInvoice(Invoice var1, String var2, String var3, String var4, int var5, int var6, int var7, byte[] var8, String var9, String var10, String var11) {
            this.invoice = var1;
            this.title = var2;
            this.description = var3;
            this.photoUrl = var4;
            this.photoSize = var5;
            this.photoWidth = var6;
            this.photoHeight = var7;
            this.payload = var8;
            this.providerToken = var9;
            this.providerData = var10;
            this.startParameter = var11;
        }

        public int getConstructor() {
            return 1038812175;
        }
    }

    public static class InputMessageGame extends InputMessageContent {
        public long botUserId;
        public String gameShortName;
        public static final int CONSTRUCTOR = 1252944610;

        public InputMessageGame() {
        }

        public InputMessageGame(long var1, String var3) {
            this.botUserId = var1;
            this.gameShortName = var3;
        }

        public int getConstructor() {
            return 1252944610;
        }
    }

    public static class InputMessageDice extends InputMessageContent {
        public String emoji;
        public boolean clearDraft;
        public static final int CONSTRUCTOR = 841574313;

        public InputMessageDice() {
        }

        public InputMessageDice(String var1, boolean var2) {
            this.emoji = var1;
            this.clearDraft = var2;
        }

        public int getConstructor() {
            return 841574313;
        }
    }

    public static class InputMessageContact extends InputMessageContent {
        public Contact contact;
        public static final int CONSTRUCTOR = -982446849;

        public InputMessageContact() {
        }

        public InputMessageContact(Contact var1) {
            this.contact = var1;
        }

        public int getConstructor() {
            return -982446849;
        }
    }

    public static class InputMessageVenue extends InputMessageContent {
        public Venue venue;
        public static final int CONSTRUCTOR = 1447926269;

        public InputMessageVenue() {
        }

        public InputMessageVenue(Venue var1) {
            this.venue = var1;
        }

        public int getConstructor() {
            return 1447926269;
        }
    }

    public static class InputMessageLocation extends InputMessageContent {
        public Location location;
        public int livePeriod;
        public int heading;
        public int proximityAlertRadius;
        public static final int CONSTRUCTOR = 648735088;

        public InputMessageLocation() {
        }

        public InputMessageLocation(Location var1, int var2, int var3, int var4) {
            this.location = var1;
            this.livePeriod = var2;
            this.heading = var3;
            this.proximityAlertRadius = var4;
        }

        public int getConstructor() {
            return 648735088;
        }
    }

    public static class InputMessageVoiceNote extends InputMessageContent {
        public InputFile voiceNote;
        public int duration;
        public byte[] waveform;
        public FormattedText caption;
        public static final int CONSTRUCTOR = 2136519657;

        public InputMessageVoiceNote() {
        }

        public InputMessageVoiceNote(InputFile var1, int var2, byte[] var3, FormattedText var4) {
            this.voiceNote = var1;
            this.duration = var2;
            this.waveform = var3;
            this.caption = var4;
        }

        public int getConstructor() {
            return 2136519657;
        }
    }

    public static class InputMessageVideoNote extends InputMessageContent {
        public InputFile videoNote;
        public InputThumbnail thumbnail;
        public int duration;
        public int length;
        public static final int CONSTRUCTOR = 279108859;

        public InputMessageVideoNote() {
        }

        public InputMessageVideoNote(InputFile var1, InputThumbnail var2, int var3, int var4) {
            this.videoNote = var1;
            this.thumbnail = var2;
            this.duration = var3;
            this.length = var4;
        }

        public int getConstructor() {
            return 279108859;
        }
    }

    public static class InputMessageVideo extends InputMessageContent {
        public InputFile video;
        public InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int duration;
        public int width;
        public int height;
        public boolean supportsStreaming;
        public FormattedText caption;
        public int ttl;
        public static final int CONSTRUCTOR = -2108486755;

        public InputMessageVideo() {
        }

        public InputMessageVideo(InputFile var1, InputThumbnail var2, int[] var3, int var4, int var5, int var6, boolean var7, FormattedText var8, int var9) {
            this.video = var1;
            this.thumbnail = var2;
            this.addedStickerFileIds = var3;
            this.duration = var4;
            this.width = var5;
            this.height = var6;
            this.supportsStreaming = var7;
            this.caption = var8;
            this.ttl = var9;
        }

        public int getConstructor() {
            return -2108486755;
        }
    }

    public static class InputMessageSticker extends InputMessageContent {
        public InputFile sticker;
        public InputThumbnail thumbnail;
        public int width;
        public int height;
        public String emoji;
        public static final int CONSTRUCTOR = 1072805625;

        public InputMessageSticker() {
        }

        public InputMessageSticker(InputFile var1, InputThumbnail var2, int var3, int var4, String var5) {
            this.sticker = var1;
            this.thumbnail = var2;
            this.width = var3;
            this.height = var4;
            this.emoji = var5;
        }

        public int getConstructor() {
            return 1072805625;
        }
    }

    public static class InputMessagePhoto extends InputMessageContent {
        public InputFile photo;
        public InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int width;
        public int height;
        public FormattedText caption;
        public int ttl;
        public static final int CONSTRUCTOR = 1648801584;

        public InputMessagePhoto() {
        }

        public InputMessagePhoto(InputFile var1, InputThumbnail var2, int[] var3, int var4, int var5, FormattedText var6, int var7) {
            this.photo = var1;
            this.thumbnail = var2;
            this.addedStickerFileIds = var3;
            this.width = var4;
            this.height = var5;
            this.caption = var6;
            this.ttl = var7;
        }

        public int getConstructor() {
            return 1648801584;
        }
    }

    public static class InputMessageDocument extends InputMessageContent {
        public InputFile document;
        public InputThumbnail thumbnail;
        public boolean disableContentTypeDetection;
        public FormattedText caption;
        public static final int CONSTRUCTOR = 1633383097;

        public InputMessageDocument() {
        }

        public InputMessageDocument(InputFile var1, InputThumbnail var2, boolean var3, FormattedText var4) {
            this.document = var1;
            this.thumbnail = var2;
            this.disableContentTypeDetection = var3;
            this.caption = var4;
        }

        public int getConstructor() {
            return 1633383097;
        }
    }

    public static class InputMessageAudio extends InputMessageContent {
        public InputFile audio;
        public InputThumbnail albumCoverThumbnail;
        public int duration;
        public String title;
        public String performer;
        public FormattedText caption;
        public static final int CONSTRUCTOR = -626786126;

        public InputMessageAudio() {
        }

        public InputMessageAudio(InputFile var1, InputThumbnail var2, int var3, String var4, String var5, FormattedText var6) {
            this.audio = var1;
            this.albumCoverThumbnail = var2;
            this.duration = var3;
            this.title = var4;
            this.performer = var5;
            this.caption = var6;
        }

        public int getConstructor() {
            return -626786126;
        }
    }

    public static class InputMessageAnimation extends InputMessageContent {
        public InputFile animation;
        public InputThumbnail thumbnail;
        public int[] addedStickerFileIds;
        public int duration;
        public int width;
        public int height;
        public FormattedText caption;
        public static final int CONSTRUCTOR = 1208433535;

        public InputMessageAnimation() {
        }

        public InputMessageAnimation(InputFile var1, InputThumbnail var2, int[] var3, int var4, int var5, int var6, FormattedText var7) {
            this.animation = var1;
            this.thumbnail = var2;
            this.addedStickerFileIds = var3;
            this.duration = var4;
            this.width = var5;
            this.height = var6;
            this.caption = var7;
        }

        public int getConstructor() {
            return 1208433535;
        }
    }

    public static class InputMessageText extends InputMessageContent {
        public FormattedText text;
        public boolean disableWebPagePreview;
        public boolean clearDraft;
        public static final int CONSTRUCTOR = 247050392;

        public InputMessageText() {
        }

        public InputMessageText(FormattedText var1, boolean var2, boolean var3) {
            this.text = var1;
            this.disableWebPagePreview = var2;
            this.clearDraft = var3;
        }

        public int getConstructor() {
            return 247050392;
        }
    }

    public abstract static class InputMessageContent extends Object {
        public InputMessageContent() {
        }
    }

    public static class InputInvoiceName extends InputInvoice {
        public String name;
        public static final int CONSTRUCTOR = -1312155917;

        public InputInvoiceName() {
        }

        public InputInvoiceName(String var1) {
            this.name = var1;
        }

        public int getConstructor() {
            return -1312155917;
        }
    }

    public static class InputInvoiceMessage extends InputInvoice {
        public long chatId;
        public long messageId;
        public static final int CONSTRUCTOR = 1490872848;

        public InputInvoiceMessage() {
        }

        public InputInvoiceMessage(long var1, long var3) {
            this.chatId = var1;
            this.messageId = var3;
        }

        public int getConstructor() {
            return 1490872848;
        }
    }

    public abstract static class InputInvoice extends Object {
        public InputInvoice() {
        }
    }

    public static class InputInlineQueryResultVoiceNote extends InputInlineQueryResult {
        public String id;
        public String title;
        public String voiceNoteUrl;
        public int voiceNoteDuration;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1790072503;

        public InputInlineQueryResultVoiceNote() {
        }

        public InputInlineQueryResultVoiceNote(String var1, String var2, String var3, int var4, ReplyMarkup var5, InputMessageContent var6) {
            this.id = var1;
            this.title = var2;
            this.voiceNoteUrl = var3;
            this.voiceNoteDuration = var4;
            this.replyMarkup = var5;
            this.inputMessageContent = var6;
        }

        public int getConstructor() {
            return -1790072503;
        }
    }

    public static class InputInlineQueryResultVideo extends InputInlineQueryResult {
        public String id;
        public String title;
        public String description;
        public String thumbnailUrl;
        public String videoUrl;
        public String mimeType;
        public int videoWidth;
        public int videoHeight;
        public int videoDuration;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1724073191;

        public InputInlineQueryResultVideo() {
        }

        public InputInlineQueryResultVideo(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, int var9, ReplyMarkup var10, InputMessageContent var11) {
            this.id = var1;
            this.title = var2;
            this.description = var3;
            this.thumbnailUrl = var4;
            this.videoUrl = var5;
            this.mimeType = var6;
            this.videoWidth = var7;
            this.videoHeight = var8;
            this.videoDuration = var9;
            this.replyMarkup = var10;
            this.inputMessageContent = var11;
        }

        public int getConstructor() {
            return 1724073191;
        }
    }

    public static class InputInlineQueryResultVenue extends InputInlineQueryResult {
        public String id;
        public Venue venue;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 541704509;

        public InputInlineQueryResultVenue() {
        }

        public InputInlineQueryResultVenue(String var1, Venue var2, String var3, int var4, int var5, ReplyMarkup var6, InputMessageContent var7) {
            this.id = var1;
            this.venue = var2;
            this.thumbnailUrl = var3;
            this.thumbnailWidth = var4;
            this.thumbnailHeight = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 541704509;
        }
    }

    public static class InputInlineQueryResultSticker extends InputInlineQueryResult {
        public String id;
        public String thumbnailUrl;
        public String stickerUrl;
        public int stickerWidth;
        public int stickerHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 274007129;

        public InputInlineQueryResultSticker() {
        }

        public InputInlineQueryResultSticker(String var1, String var2, String var3, int var4, int var5, ReplyMarkup var6, InputMessageContent var7) {
            this.id = var1;
            this.thumbnailUrl = var2;
            this.stickerUrl = var3;
            this.stickerWidth = var4;
            this.stickerHeight = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 274007129;
        }
    }

    public static class InputInlineQueryResultPhoto extends InputInlineQueryResult {
        public String id;
        public String title;
        public String description;
        public String thumbnailUrl;
        public String photoUrl;
        public int photoWidth;
        public int photoHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1123338721;

        public InputInlineQueryResultPhoto() {
        }

        public InputInlineQueryResultPhoto(String var1, String var2, String var3, String var4, String var5, int var6, int var7, ReplyMarkup var8, InputMessageContent var9) {
            this.id = var1;
            this.title = var2;
            this.description = var3;
            this.thumbnailUrl = var4;
            this.photoUrl = var5;
            this.photoWidth = var6;
            this.photoHeight = var7;
            this.replyMarkup = var8;
            this.inputMessageContent = var9;
        }

        public int getConstructor() {
            return -1123338721;
        }
    }

    public static class InputInlineQueryResultLocation extends InputInlineQueryResult {
        public String id;
        public Location location;
        public int livePeriod;
        public String title;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1887650218;

        public InputInlineQueryResultLocation() {
        }

        public InputInlineQueryResultLocation(String var1, Location var2, int var3, String var4, String var5, int var6, int var7, ReplyMarkup var8, InputMessageContent var9) {
            this.id = var1;
            this.location = var2;
            this.livePeriod = var3;
            this.title = var4;
            this.thumbnailUrl = var5;
            this.thumbnailWidth = var6;
            this.thumbnailHeight = var7;
            this.replyMarkup = var8;
            this.inputMessageContent = var9;
        }

        public int getConstructor() {
            return -1887650218;
        }
    }

    public static class InputInlineQueryResultGame extends InputInlineQueryResult {
        public String id;
        public String gameShortName;
        public ReplyMarkup replyMarkup;
        public static final int CONSTRUCTOR = 966074327;

        public InputInlineQueryResultGame() {
        }

        public InputInlineQueryResultGame(String var1, String var2, ReplyMarkup var3) {
            this.id = var1;
            this.gameShortName = var2;
            this.replyMarkup = var3;
        }

        public int getConstructor() {
            return 966074327;
        }
    }

    public static class InputInlineQueryResultDocument extends InputInlineQueryResult {
        public String id;
        public String title;
        public String description;
        public String documentUrl;
        public String mimeType;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 578801869;

        public InputInlineQueryResultDocument() {
        }

        public InputInlineQueryResultDocument(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, ReplyMarkup var9, InputMessageContent var10) {
            this.id = var1;
            this.title = var2;
            this.description = var3;
            this.documentUrl = var4;
            this.mimeType = var5;
            this.thumbnailUrl = var6;
            this.thumbnailWidth = var7;
            this.thumbnailHeight = var8;
            this.replyMarkup = var9;
            this.inputMessageContent = var10;
        }

        public int getConstructor() {
            return 578801869;
        }
    }

    public static class InputInlineQueryResultContact extends InputInlineQueryResult {
        public String id;
        public Contact contact;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1846064594;

        public InputInlineQueryResultContact() {
        }

        public InputInlineQueryResultContact(String var1, Contact var2, String var3, int var4, int var5, ReplyMarkup var6, InputMessageContent var7) {
            this.id = var1;
            this.contact = var2;
            this.thumbnailUrl = var3;
            this.thumbnailWidth = var4;
            this.thumbnailHeight = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 1846064594;
        }
    }

    public static class InputInlineQueryResultAudio extends InputInlineQueryResult {
        public String id;
        public String title;
        public String performer;
        public String audioUrl;
        public int audioDuration;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1260139988;

        public InputInlineQueryResultAudio() {
        }

        public InputInlineQueryResultAudio(String var1, String var2, String var3, String var4, int var5, ReplyMarkup var6, InputMessageContent var7) {
            this.id = var1;
            this.title = var2;
            this.performer = var3;
            this.audioUrl = var4;
            this.audioDuration = var5;
            this.replyMarkup = var6;
            this.inputMessageContent = var7;
        }

        public int getConstructor() {
            return 1260139988;
        }
    }

    public static class InputInlineQueryResultArticle extends InputInlineQueryResult {
        public String id;
        public String url;
        public boolean hideUrl;
        public String title;
        public String description;
        public String thumbnailUrl;
        public int thumbnailWidth;
        public int thumbnailHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = 1973670156;

        public InputInlineQueryResultArticle() {
        }

        public InputInlineQueryResultArticle(String var1, String var2, boolean var3, String var4, String var5, String var6, int var7, int var8, ReplyMarkup var9, InputMessageContent var10) {
            this.id = var1;
            this.url = var2;
            this.hideUrl = var3;
            this.title = var4;
            this.description = var5;
            this.thumbnailUrl = var6;
            this.thumbnailWidth = var7;
            this.thumbnailHeight = var8;
            this.replyMarkup = var9;
            this.inputMessageContent = var10;
        }

        public int getConstructor() {
            return 1973670156;
        }
    }

    public static class InputInlineQueryResultAnimation extends InputInlineQueryResult {
        public String id;
        public String title;
        public String thumbnailUrl;
        public String thumbnailMimeType;
        public String videoUrl;
        public String videoMimeType;
        public int videoDuration;
        public int videoWidth;
        public int videoHeight;
        public ReplyMarkup replyMarkup;
        public InputMessageContent inputMessageContent;
        public static final int CONSTRUCTOR = -1489808874;

        public InputInlineQueryResultAnimation() {
        }

        public InputInlineQueryResultAnimation(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, int var9, ReplyMarkup var10, InputMessageContent var11) {
            this.id = var1;
            this.title = var2;
            this.thumbnailUrl = var3;
            this.thumbnailMimeType = var4;
            this.videoUrl = var5;
            this.videoMimeType = var6;
            this.videoDuration = var7;
            this.videoWidth = var8;
            this.videoHeight = var9;
            this.replyMarkup = var10;
            this.inputMessageContent = var11;
        }

        public int getConstructor() {
            return -1489808874;
        }
    }

    public abstract static class InputInlineQueryResult extends Object {
        public InputInlineQueryResult() {
        }
    }

    public static class InputIdentityDocument extends Object {
        public String number;
        public Date expiryDate;
        public InputFile frontSide;
        public InputFile reverseSide;
        public InputFile selfie;
        public InputFile[] translation;
        public static final int CONSTRUCTOR = -381776063;

        public InputIdentityDocument() {
        }

        public InputIdentityDocument(String var1, Date var2, InputFile var3, InputFile var4, InputFile var5, InputFile[] var6) {
            this.number = var1;
            this.expiryDate = var2;
            this.frontSide = var3;
            this.reverseSide = var4;
            this.selfie = var5;
            this.translation = var6;
        }

        public int getConstructor() {
            return -381776063;
        }
    }

    public static class InputFileGenerated extends InputFile {
        public String originalPath;
        public String conversion;
        public long expectedSize;
        public static final int CONSTRUCTOR = -1333385216;

        public InputFileGenerated() {
        }

        public InputFileGenerated(String var1, String var2, long var3) {
            this.originalPath = var1;
            this.conversion = var2;
            this.expectedSize = var3;
        }

        public int getConstructor() {
            return -1333385216;
        }
    }

    public static class InputFileLocal extends InputFile {
        public String path;
        public static final int CONSTRUCTOR = 2056030919;

        public InputFileLocal() {
        }

        public InputFileLocal(String var1) {
            this.path = var1;
        }

        public int getConstructor() {
            return 2056030919;
        }
    }

    public static class InputFileRemote extends InputFile {
        public String id;
        public static final int CONSTRUCTOR = -107574466;

        public InputFileRemote() {
        }

        public InputFileRemote(String var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return -107574466;
        }
    }

    public static class InputFileId extends InputFile {
        public int id;
        public static final int CONSTRUCTOR = 1788906253;

        public InputFileId() {
        }

        public InputFileId(int var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 1788906253;
        }
    }

    public abstract static class InputFile extends Object {
        public InputFile() {
        }
    }

    public static class InputCredentialsGooglePay extends InputCredentials {
        public String data;
        public static final int CONSTRUCTOR = 844384100;

        public InputCredentialsGooglePay() {
        }

        public InputCredentialsGooglePay(String var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return 844384100;
        }
    }

    public static class InputCredentialsApplePay extends InputCredentials {
        public String data;
        public static final int CONSTRUCTOR = -1246570799;

        public InputCredentialsApplePay() {
        }

        public InputCredentialsApplePay(String var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return -1246570799;
        }
    }

    public static class InputCredentialsNew extends InputCredentials {
        public String data;
        public boolean allowSave;
        public static final int CONSTRUCTOR = -829689558;

        public InputCredentialsNew() {
        }

        public InputCredentialsNew(String var1, boolean var2) {
            this.data = var1;
            this.allowSave = var2;
        }

        public int getConstructor() {
            return -829689558;
        }
    }

    public static class InputCredentialsSaved extends InputCredentials {
        public String savedCredentialsId;
        public static final int CONSTRUCTOR = -2034385364;

        public InputCredentialsSaved() {
        }

        public InputCredentialsSaved(String var1) {
            this.savedCredentialsId = var1;
        }

        public int getConstructor() {
            return -2034385364;
        }
    }

    public abstract static class InputCredentials extends Object {
        public InputCredentials() {
        }
    }

    public static class InputChatPhotoAnimation extends InputChatPhoto {
        public InputFile animation;
        public double mainFrameTimestamp;
        public static final int CONSTRUCTOR = 90846242;

        public InputChatPhotoAnimation() {
        }

        public InputChatPhotoAnimation(InputFile var1, double var2) {
            this.animation = var1;
            this.mainFrameTimestamp = var2;
        }

        public int getConstructor() {
            return 90846242;
        }
    }

    public static class InputChatPhotoStatic extends InputChatPhoto {
        public InputFile photo;
        public static final int CONSTRUCTOR = 1979179699;

        public InputChatPhotoStatic() {
        }

        public InputChatPhotoStatic(InputFile var1) {
            this.photo = var1;
        }

        public int getConstructor() {
            return 1979179699;
        }
    }

    public static class InputChatPhotoPrevious extends InputChatPhoto {
        public long chatPhotoId;
        public static final int CONSTRUCTOR = 23128529;

        public InputChatPhotoPrevious() {
        }

        public InputChatPhotoPrevious(long var1) {
            this.chatPhotoId = var1;
        }

        public int getConstructor() {
            return 23128529;
        }
    }

    public abstract static class InputChatPhoto extends Object {
        public InputChatPhoto() {
        }
    }

    public static class InputBackgroundRemote extends InputBackground {
        public long backgroundId;
        public static final int CONSTRUCTOR = -274976231;

        public InputBackgroundRemote() {
        }

        public InputBackgroundRemote(long var1) {
            this.backgroundId = var1;
        }

        public int getConstructor() {
            return -274976231;
        }
    }

    public static class InputBackgroundLocal extends InputBackground {
        public InputFile background;
        public static final int CONSTRUCTOR = -1747094364;

        public InputBackgroundLocal() {
        }

        public InputBackgroundLocal(InputFile var1) {
            this.background = var1;
        }

        public int getConstructor() {
            return -1747094364;
        }
    }

    public abstract static class InputBackground extends Object {
        public InputBackground() {
        }
    }

    public static class InlineQueryResults extends Object {
        public long inlineQueryId;
        public String nextOffset;
        public InlineQueryResult[] results;
        public String switchPmText;
        public String switchPmParameter;
        public static final int CONSTRUCTOR = 1000709656;

        public InlineQueryResults() {
        }

        public InlineQueryResults(long var1, String var3, InlineQueryResult[] var4, String var5, String var6) {
            this.inlineQueryId = var1;
            this.nextOffset = var3;
            this.results = var4;
            this.switchPmText = var5;
            this.switchPmParameter = var6;
        }

        public int getConstructor() {
            return 1000709656;
        }
    }

    public static class InlineQueryResultVoiceNote extends InlineQueryResult {
        public String id;
        public VoiceNote voiceNote;
        public String title;
        public static final int CONSTRUCTOR = -1897393105;

        public InlineQueryResultVoiceNote() {
        }

        public InlineQueryResultVoiceNote(String var1, VoiceNote var2, String var3) {
            this.id = var1;
            this.voiceNote = var2;
            this.title = var3;
        }

        public int getConstructor() {
            return -1897393105;
        }
    }

    public static class InlineQueryResultVideo extends InlineQueryResult {
        public String id;
        public Video video;
        public String title;
        public String description;
        public static final int CONSTRUCTOR = -1373158683;

        public InlineQueryResultVideo() {
        }

        public InlineQueryResultVideo(String var1, Video var2, String var3, String var4) {
            this.id = var1;
            this.video = var2;
            this.title = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return -1373158683;
        }
    }

    public static class InlineQueryResultSticker extends InlineQueryResult {
        public String id;
        public Sticker sticker;
        public static final int CONSTRUCTOR = -1848224245;

        public InlineQueryResultSticker() {
        }

        public InlineQueryResultSticker(String var1, Sticker var2) {
            this.id = var1;
            this.sticker = var2;
        }

        public int getConstructor() {
            return -1848224245;
        }
    }

    public static class InlineQueryResultPhoto extends InlineQueryResult {
        public String id;
        public Photo photo;
        public String title;
        public String description;
        public static final int CONSTRUCTOR = 1848319440;

        public InlineQueryResultPhoto() {
        }

        public InlineQueryResultPhoto(String var1, Photo var2, String var3, String var4) {
            this.id = var1;
            this.photo = var2;
            this.title = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return 1848319440;
        }
    }

    public static class InlineQueryResultDocument extends InlineQueryResult {
        public String id;
        public Document document;
        public String title;
        public String description;
        public static final int CONSTRUCTOR = -1491268539;

        public InlineQueryResultDocument() {
        }

        public InlineQueryResultDocument(String var1, Document var2, String var3, String var4) {
            this.id = var1;
            this.document = var2;
            this.title = var3;
            this.description = var4;
        }

        public int getConstructor() {
            return -1491268539;
        }
    }

    public static class InlineQueryResultAudio extends InlineQueryResult {
        public String id;
        public Audio audio;
        public static final int CONSTRUCTOR = 842650360;

        public InlineQueryResultAudio() {
        }

        public InlineQueryResultAudio(String var1, Audio var2) {
            this.id = var1;
            this.audio = var2;
        }

        public int getConstructor() {
            return 842650360;
        }
    }

    public static class InlineQueryResultAnimation extends InlineQueryResult {
        public String id;
        public Animation animation;
        public String title;
        public static final int CONSTRUCTOR = 2009984267;

        public InlineQueryResultAnimation() {
        }

        public InlineQueryResultAnimation(String var1, Animation var2, String var3) {
            this.id = var1;
            this.animation = var2;
            this.title = var3;
        }

        public int getConstructor() {
            return 2009984267;
        }
    }

    public static class InlineQueryResultGame extends InlineQueryResult {
        public String id;
        public Game game;
        public static final int CONSTRUCTOR = 1706916987;

        public InlineQueryResultGame() {
        }

        public InlineQueryResultGame(String var1, Game var2) {
            this.id = var1;
            this.game = var2;
        }

        public int getConstructor() {
            return 1706916987;
        }
    }

    public static class InlineQueryResultVenue extends InlineQueryResult {
        public String id;
        public Venue venue;
        public Thumbnail thumbnail;
        public static final int CONSTRUCTOR = 1281036382;

        public InlineQueryResultVenue() {
        }

        public InlineQueryResultVenue(String var1, Venue var2, Thumbnail var3) {
            this.id = var1;
            this.venue = var2;
            this.thumbnail = var3;
        }

        public int getConstructor() {
            return 1281036382;
        }
    }

    public static class InlineQueryResultLocation extends InlineQueryResult {
        public String id;
        public Location location;
        public String title;
        public Thumbnail thumbnail;
        public static final int CONSTRUCTOR = 466004752;

        public InlineQueryResultLocation() {
        }

        public InlineQueryResultLocation(String var1, Location var2, String var3, Thumbnail var4) {
            this.id = var1;
            this.location = var2;
            this.title = var3;
            this.thumbnail = var4;
        }

        public int getConstructor() {
            return 466004752;
        }
    }

    public static class InlineQueryResultContact extends InlineQueryResult {
        public String id;
        public Contact contact;
        public Thumbnail thumbnail;
        public static final int CONSTRUCTOR = -181960174;

        public InlineQueryResultContact() {
        }

        public InlineQueryResultContact(String var1, Contact var2, Thumbnail var3) {
            this.id = var1;
            this.contact = var2;
            this.thumbnail = var3;
        }

        public int getConstructor() {
            return -181960174;
        }
    }

    public static class InlineQueryResultArticle extends InlineQueryResult {
        public String id;
        public String url;
        public boolean hideUrl;
        public String title;
        public String description;
        public Thumbnail thumbnail;
        public static final int CONSTRUCTOR = 206340825;

        public InlineQueryResultArticle() {
        }

        public InlineQueryResultArticle(String var1, String var2, boolean var3, String var4, String var5, Thumbnail var6) {
            this.id = var1;
            this.url = var2;
            this.hideUrl = var3;
            this.title = var4;
            this.description = var5;
            this.thumbnail = var6;
        }

        public int getConstructor() {
            return 206340825;
        }
    }

    public abstract static class InlineQueryResult extends Object {
        public InlineQueryResult() {
        }
    }

    public static class InlineKeyboardButtonTypeUser extends InlineKeyboardButtonType {
        public long userId;
        public static final int CONSTRUCTOR = 1836574114;

        public InlineKeyboardButtonTypeUser() {
        }

        public InlineKeyboardButtonTypeUser(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1836574114;
        }
    }

    public static class InlineKeyboardButtonTypeBuy extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = 1360739440;

        public InlineKeyboardButtonTypeBuy() {
        }

        public int getConstructor() {
            return 1360739440;
        }
    }

    public static class InlineKeyboardButtonTypeSwitchInline extends InlineKeyboardButtonType {
        public String query;
        public boolean inCurrentChat;
        public static final int CONSTRUCTOR = -2035563307;

        public InlineKeyboardButtonTypeSwitchInline() {
        }

        public InlineKeyboardButtonTypeSwitchInline(String var1, boolean var2) {
            this.query = var1;
            this.inCurrentChat = var2;
        }

        public int getConstructor() {
            return -2035563307;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackGame extends InlineKeyboardButtonType {
        public static final int CONSTRUCTOR = -383429528;

        public InlineKeyboardButtonTypeCallbackGame() {
        }

        public int getConstructor() {
            return -383429528;
        }
    }

    public static class InlineKeyboardButtonTypeCallbackWithPassword extends InlineKeyboardButtonType {
        public byte[] data;
        public static final int CONSTRUCTOR = 908018248;

        public InlineKeyboardButtonTypeCallbackWithPassword() {
        }

        public InlineKeyboardButtonTypeCallbackWithPassword(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return 908018248;
        }
    }

    public static class InlineKeyboardButtonTypeCallback extends InlineKeyboardButtonType {
        public byte[] data;
        public static final int CONSTRUCTOR = -1127515139;

        public InlineKeyboardButtonTypeCallback() {
        }

        public InlineKeyboardButtonTypeCallback(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return -1127515139;
        }
    }

    public static class InlineKeyboardButtonTypeWebApp extends InlineKeyboardButtonType {
        public String url;
        public static final int CONSTRUCTOR = -1767471672;

        public InlineKeyboardButtonTypeWebApp() {
        }

        public InlineKeyboardButtonTypeWebApp(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -1767471672;
        }
    }

    public static class InlineKeyboardButtonTypeLoginUrl extends InlineKeyboardButtonType {
        public String url;
        public long id;
        public String forwardText;
        public static final int CONSTRUCTOR = -1203413081;

        public InlineKeyboardButtonTypeLoginUrl() {
        }

        public InlineKeyboardButtonTypeLoginUrl(String var1, long var2, String var4) {
            this.url = var1;
            this.id = var2;
            this.forwardText = var4;
        }

        public int getConstructor() {
            return -1203413081;
        }
    }

    public static class InlineKeyboardButtonTypeUrl extends InlineKeyboardButtonType {
        public String url;
        public static final int CONSTRUCTOR = 1130741420;

        public InlineKeyboardButtonTypeUrl() {
        }

        public InlineKeyboardButtonTypeUrl(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return 1130741420;
        }
    }

    public abstract static class InlineKeyboardButtonType extends Object {
        public InlineKeyboardButtonType() {
        }
    }

    public static class InlineKeyboardButton extends Object {
        public String text;
        public InlineKeyboardButtonType type;
        public static final int CONSTRUCTOR = -372105704;

        public InlineKeyboardButton() {
        }

        public InlineKeyboardButton(String var1, InlineKeyboardButtonType var2) {
            this.text = var1;
            this.type = var2;
        }

        public int getConstructor() {
            return -372105704;
        }
    }

    public static class ImportedContacts extends Object {
        public long[] userIds;
        public int[] importerCount;
        public static final int CONSTRUCTOR = 2068432290;

        public ImportedContacts() {
        }

        public ImportedContacts(long[] var1, int[] var2) {
            this.userIds = var1;
            this.importerCount = var2;
        }

        public int getConstructor() {
            return 2068432290;
        }
    }

    public static class IdentityDocument extends Object {
        public String number;
        public Date expiryDate;
        public DatedFile frontSide;
        public DatedFile reverseSide;
        public DatedFile selfie;
        public DatedFile[] translation;
        public static final int CONSTRUCTOR = 445952972;

        public IdentityDocument() {
        }

        public IdentityDocument(String var1, Date var2, DatedFile var3, DatedFile var4, DatedFile var5, DatedFile[] var6) {
            this.number = var1;
            this.expiryDate = var2;
            this.frontSide = var3;
            this.reverseSide = var4;
            this.selfie = var5;
            this.translation = var6;
        }

        public int getConstructor() {
            return 445952972;
        }
    }

    public static class HttpUrl extends Object {
        public String url;
        public static final int CONSTRUCTOR = -2018019930;

        public HttpUrl() {
        }

        public HttpUrl(String var1) {
            this.url = var1;
        }

        public int getConstructor() {
            return -2018019930;
        }
    }

    public static class Hashtags extends Object {
        public String[] hashtags;
        public static final int CONSTRUCTOR = 676798885;

        public Hashtags() {
        }

        public Hashtags(String[] var1) {
            this.hashtags = var1;
        }

        public int getConstructor() {
            return 676798885;
        }
    }

    public static class GroupCallVideoSourceGroup extends Object {
        public String semantics;
        public int[] sourceIds;
        public static final int CONSTRUCTOR = -1190900785;

        public GroupCallVideoSourceGroup() {
        }

        public GroupCallVideoSourceGroup(String var1, int[] var2) {
            this.semantics = var1;
            this.sourceIds = var2;
        }

        public int getConstructor() {
            return -1190900785;
        }
    }

    public static class GroupCallVideoQualityFull extends GroupCallVideoQuality {
        public static final int CONSTRUCTOR = -2125916617;

        public GroupCallVideoQualityFull() {
        }

        public int getConstructor() {
            return -2125916617;
        }
    }

    public static class GroupCallVideoQualityMedium extends GroupCallVideoQuality {
        public static final int CONSTRUCTOR = 394968234;

        public GroupCallVideoQualityMedium() {
        }

        public int getConstructor() {
            return 394968234;
        }
    }

    public static class GroupCallVideoQualityThumbnail extends GroupCallVideoQuality {
        public static final int CONSTRUCTOR = -379186304;

        public GroupCallVideoQualityThumbnail() {
        }

        public int getConstructor() {
            return -379186304;
        }
    }

    public abstract static class GroupCallVideoQuality extends Object {
        public GroupCallVideoQuality() {
        }
    }

    public static class GroupCallStreams extends Object {
        public GroupCallStream[] streams;
        public static final int CONSTRUCTOR = -1032959578;

        public GroupCallStreams() {
        }

        public GroupCallStreams(GroupCallStream[] var1) {
            this.streams = var1;
        }

        public int getConstructor() {
            return -1032959578;
        }
    }

    public static class GroupCallStream extends Object {
        public int channelId;
        public int scale;
        public long timeOffset;
        public static final int CONSTRUCTOR = -264564795;

        public GroupCallStream() {
        }

        public GroupCallStream(int var1, int var2, long var3) {
            this.channelId = var1;
            this.scale = var2;
            this.timeOffset = var3;
        }

        public int getConstructor() {
            return -264564795;
        }
    }

    public static class GroupCallRecentSpeaker extends Object {
        public MessageSender participantId;
        public boolean isSpeaking;
        public static final int CONSTRUCTOR = 1819519436;

        public GroupCallRecentSpeaker() {
        }

        public GroupCallRecentSpeaker(MessageSender var1, boolean var2) {
            this.participantId = var1;
            this.isSpeaking = var2;
        }

        public int getConstructor() {
            return 1819519436;
        }
    }

    public static class GroupCallParticipantVideoInfo extends Object {
        public GroupCallVideoSourceGroup[] sourceGroups;
        public String endpointId;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -14294645;

        public GroupCallParticipantVideoInfo() {
        }

        public GroupCallParticipantVideoInfo(GroupCallVideoSourceGroup[] var1, String var2, boolean var3) {
            this.sourceGroups = var1;
            this.endpointId = var2;
            this.isPaused = var3;
        }

        public int getConstructor() {
            return -14294645;
        }
    }

    public static class GroupCallParticipant extends Object {
        public MessageSender participantId;
        public int audioSourceId;
        public int screenSharingAudioSourceId;
        public GroupCallParticipantVideoInfo videoInfo;
        public GroupCallParticipantVideoInfo screenSharingVideoInfo;
        public String bio;
        public boolean isCurrentUser;
        public boolean isSpeaking;
        public boolean isHandRaised;
        public boolean canBeMutedForAllUsers;
        public boolean canBeUnmutedForAllUsers;
        public boolean canBeMutedForCurrentUser;
        public boolean canBeUnmutedForCurrentUser;
        public boolean isMutedForAllUsers;
        public boolean isMutedForCurrentUser;
        public boolean canUnmuteSelf;
        public int volumeLevel;
        public String order;
        public static final int CONSTRUCTOR = 2059182571;

        public GroupCallParticipant() {
        }

        public GroupCallParticipant(MessageSender var1, int var2, int var3, GroupCallParticipantVideoInfo var4, GroupCallParticipantVideoInfo var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, int var17, String var18) {
            this.participantId = var1;
            this.audioSourceId = var2;
            this.screenSharingAudioSourceId = var3;
            this.videoInfo = var4;
            this.screenSharingVideoInfo = var5;
            this.bio = var6;
            this.isCurrentUser = var7;
            this.isSpeaking = var8;
            this.isHandRaised = var9;
            this.canBeMutedForAllUsers = var10;
            this.canBeUnmutedForAllUsers = var11;
            this.canBeMutedForCurrentUser = var12;
            this.canBeUnmutedForCurrentUser = var13;
            this.isMutedForAllUsers = var14;
            this.isMutedForCurrentUser = var15;
            this.canUnmuteSelf = var16;
            this.volumeLevel = var17;
            this.order = var18;
        }

        public int getConstructor() {
            return 2059182571;
        }
    }

    public static class GroupCallId extends Object {
        public int id;
        public static final int CONSTRUCTOR = 350534469;

        public GroupCallId() {
        }

        public GroupCallId(int var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 350534469;
        }
    }

    public static class GroupCall extends Object {
        public int id;
        public String title;
        public int scheduledStartDate;
        public boolean enabledStartNotification;
        public boolean isActive;
        public boolean isRtmpStream;
        public boolean isJoined;
        public boolean needRejoin;
        public boolean canBeManaged;
        public int participantCount;
        public boolean hasHiddenListeners;
        public boolean loadedAllParticipants;
        public GroupCallRecentSpeaker[] recentSpeakers;
        public boolean isMyVideoEnabled;
        public boolean isMyVideoPaused;
        public boolean canEnableVideo;
        public boolean muteNewParticipants;
        public boolean canToggleMuteNewParticipants;
        public int recordDuration;
        public boolean isVideoRecorded;
        public int duration;
        public static final int CONSTRUCTOR = -123443355;

        public GroupCall() {
        }

        public GroupCall(int var1, String var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, int var10, boolean var11, boolean var12, GroupCallRecentSpeaker[] var13, boolean var14, boolean var15, boolean var16, boolean var17, boolean var18, int var19, boolean var20, int var21) {
            this.id = var1;
            this.title = var2;
            this.scheduledStartDate = var3;
            this.enabledStartNotification = var4;
            this.isActive = var5;
            this.isRtmpStream = var6;
            this.isJoined = var7;
            this.needRejoin = var8;
            this.canBeManaged = var9;
            this.participantCount = var10;
            this.hasHiddenListeners = var11;
            this.loadedAllParticipants = var12;
            this.recentSpeakers = var13;
            this.isMyVideoEnabled = var14;
            this.isMyVideoPaused = var15;
            this.canEnableVideo = var16;
            this.muteNewParticipants = var17;
            this.canToggleMuteNewParticipants = var18;
            this.recordDuration = var19;
            this.isVideoRecorded = var20;
            this.duration = var21;
        }

        public int getConstructor() {
            return -123443355;
        }
    }

    public static class GameHighScores extends Object {
        public GameHighScore[] scores;
        public static final int CONSTRUCTOR = -725770727;

        public GameHighScores() {
        }

        public GameHighScores(GameHighScore[] var1) {
            this.scores = var1;
        }

        public int getConstructor() {
            return -725770727;
        }
    }

    public static class GameHighScore extends Object {
        public int position;
        public long userId;
        public int score;
        public static final int CONSTRUCTOR = 342871838;

        public GameHighScore() {
        }

        public GameHighScore(int var1, long var2, int var4) {
            this.position = var1;
            this.userId = var2;
            this.score = var4;
        }

        public int getConstructor() {
            return 342871838;
        }
    }

    public static class Game extends Object {
        public long id;
        public String shortName;
        public String title;
        public FormattedText text;
        public String description;
        public Photo photo;
        public Animation animation;
        public static final int CONSTRUCTOR = -1565597752;

        public Game() {
        }

        public Game(long var1, String var3, String var4, FormattedText var5, String var6, Photo var7, Animation var8) {
            this.id = var1;
            this.shortName = var3;
            this.title = var4;
            this.text = var5;
            this.description = var6;
            this.photo = var7;
            this.animation = var8;
        }

        public int getConstructor() {
            return -1565597752;
        }
    }

    public static class FoundMessages extends Object {
        public int totalCount;
        public Message[] messages;
        public String nextOffset;
        public static final int CONSTRUCTOR = -529809608;

        public FoundMessages() {
        }

        public FoundMessages(int var1, Message[] var2, String var3) {
            this.totalCount = var1;
            this.messages = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return -529809608;
        }
    }

    public static class FoundFileDownloads extends Object {
        public DownloadedFileCounts totalCounts;
        public FileDownload[] files;
        public String nextOffset;
        public static final int CONSTRUCTOR = 1395890392;

        public FoundFileDownloads() {
        }

        public FoundFileDownloads(DownloadedFileCounts var1, FileDownload[] var2, String var3) {
            this.totalCounts = var1;
            this.files = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return 1395890392;
        }
    }

    public static class FormattedText extends Object {
        public String text;
        public TextEntity[] entities;
        public static final int CONSTRUCTOR = -252624564;

        public FormattedText() {
        }

        public FormattedText(String var1, TextEntity[] var2) {
            this.text = var1;
            this.entities = var2;
        }

        public int getConstructor() {
            return -252624564;
        }
    }

    public static class Files extends Object {
        public File[] files;
        public static final int CONSTRUCTOR = -1127486366;

        public Files() {
        }

        public Files(File[] var1) {
            this.files = var1;
        }

        public int getConstructor() {
            return -1127486366;
        }
    }

    public static class FileTypeWallpaper extends FileType {
        public static final int CONSTRUCTOR = 1854930076;

        public FileTypeWallpaper() {
        }

        public int getConstructor() {
            return 1854930076;
        }
    }

    public static class FileTypeVoiceNote extends FileType {
        public static final int CONSTRUCTOR = -588681661;

        public FileTypeVoiceNote() {
        }

        public int getConstructor() {
            return -588681661;
        }
    }

    public static class FileTypeVideoNote extends FileType {
        public static final int CONSTRUCTOR = -518412385;

        public FileTypeVideoNote() {
        }

        public int getConstructor() {
            return -518412385;
        }
    }

    public static class FileTypeVideo extends FileType {
        public static final int CONSTRUCTOR = 1430816539;

        public FileTypeVideo() {
        }

        public int getConstructor() {
            return 1430816539;
        }
    }

    public static class FileTypeUnknown extends FileType {
        public static final int CONSTRUCTOR = -2011566768;

        public FileTypeUnknown() {
        }

        public int getConstructor() {
            return -2011566768;
        }
    }

    public static class FileTypeThumbnail extends FileType {
        public static final int CONSTRUCTOR = -12443298;

        public FileTypeThumbnail() {
        }

        public int getConstructor() {
            return -12443298;
        }
    }

    public static class FileTypeSticker extends FileType {
        public static final int CONSTRUCTOR = 475233385;

        public FileTypeSticker() {
        }

        public int getConstructor() {
            return 475233385;
        }
    }

    public static class FileTypeSecure extends FileType {
        public static final int CONSTRUCTOR = -1419133146;

        public FileTypeSecure() {
        }

        public int getConstructor() {
            return -1419133146;
        }
    }

    public static class FileTypeSecretThumbnail extends FileType {
        public static final int CONSTRUCTOR = -1401326026;

        public FileTypeSecretThumbnail() {
        }

        public int getConstructor() {
            return -1401326026;
        }
    }

    public static class FileTypeSecret extends FileType {
        public static final int CONSTRUCTOR = -1871899401;

        public FileTypeSecret() {
        }

        public int getConstructor() {
            return -1871899401;
        }
    }

    public static class FileTypeProfilePhoto extends FileType {
        public static final int CONSTRUCTOR = 1795089315;

        public FileTypeProfilePhoto() {
        }

        public int getConstructor() {
            return 1795089315;
        }
    }

    public static class FileTypePhoto extends FileType {
        public static final int CONSTRUCTOR = -1718914651;

        public FileTypePhoto() {
        }

        public int getConstructor() {
            return -1718914651;
        }
    }

    public static class FileTypeNotificationSound extends FileType {
        public static final int CONSTRUCTOR = -1020289271;

        public FileTypeNotificationSound() {
        }

        public int getConstructor() {
            return -1020289271;
        }
    }

    public static class FileTypeDocument extends FileType {
        public static final int CONSTRUCTOR = -564722929;

        public FileTypeDocument() {
        }

        public int getConstructor() {
            return -564722929;
        }
    }

    public static class FileTypeAudio extends FileType {
        public static final int CONSTRUCTOR = -709112160;

        public FileTypeAudio() {
        }

        public int getConstructor() {
            return -709112160;
        }
    }

    public static class FileTypeAnimation extends FileType {
        public static final int CONSTRUCTOR = -290816582;

        public FileTypeAnimation() {
        }

        public int getConstructor() {
            return -290816582;
        }
    }

    public static class FileTypeNone extends FileType {
        public static final int CONSTRUCTOR = 2003009189;

        public FileTypeNone() {
        }

        public int getConstructor() {
            return 2003009189;
        }
    }

    public abstract static class FileType extends Object {
        public FileType() {
        }
    }

    public static class FilePart extends Object {
        public byte[] data;
        public static final int CONSTRUCTOR = 911821878;

        public FilePart() {
        }

        public FilePart(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return 911821878;
        }
    }

    public static class FileDownloadedPrefixSize extends Object {
        public long size;
        public static final int CONSTRUCTOR = -2015205381;

        public FileDownloadedPrefixSize() {
        }

        public FileDownloadedPrefixSize(long var1) {
            this.size = var1;
        }

        public int getConstructor() {
            return -2015205381;
        }
    }

    public static class FileDownload extends Object {
        public int fileId;
        public Message message;
        public int addDate;
        public int completeDate;
        public boolean isPaused;
        public static final int CONSTRUCTOR = -2092100780;

        public FileDownload() {
        }

        public FileDownload(int var1, Message var2, int var3, int var4, boolean var5) {
            this.fileId = var1;
            this.message = var2;
            this.addDate = var3;
            this.completeDate = var4;
            this.isPaused = var5;
        }

        public int getConstructor() {
            return -2092100780;
        }
    }

    public static class File extends Object {
        public int id;
        public long size;
        public long expectedSize;
        public LocalFile local;
        public RemoteFile remote;
        public static final int CONSTRUCTOR = 1263291956;

        public File() {
        }

        public File(int var1, long var2, long var4, LocalFile var6, RemoteFile var7) {
            this.id = var1;
            this.size = var2;
            this.expectedSize = var4;
            this.local = var6;
            this.remote = var7;
        }

        public int getConstructor() {
            return 1263291956;
        }
    }

    public static class Error extends Object {
        public int code;
        public String message;
        public static final int CONSTRUCTOR = -1679978726;

        public Error() {
        }

        public Error(int var1, String var2) {
            this.code = var1;
            this.message = var2;
        }

        public int getConstructor() {
            return -1679978726;
        }
    }

    public static class EncryptedPassportElement extends Object {
        public PassportElementType type;
        public byte[] data;
        public DatedFile frontSide;
        public DatedFile reverseSide;
        public DatedFile selfie;
        public DatedFile[] translation;
        public DatedFile[] files;
        public String value;
        public String hash;
        public static final int CONSTRUCTOR = 2002386193;

        public EncryptedPassportElement() {
        }

        public EncryptedPassportElement(PassportElementType var1, byte[] var2, DatedFile var3, DatedFile var4, DatedFile var5, DatedFile[] var6, DatedFile[] var7, String var8, String var9) {
            this.type = var1;
            this.data = var2;
            this.frontSide = var3;
            this.reverseSide = var4;
            this.selfie = var5;
            this.translation = var6;
            this.files = var7;
            this.value = var8;
            this.hash = var9;
        }

        public int getConstructor() {
            return 2002386193;
        }
    }

    public static class EncryptedCredentials extends Object {
        public byte[] data;
        public byte[] hash;
        public byte[] secret;
        public static final int CONSTRUCTOR = 1331106766;

        public EncryptedCredentials() {
        }

        public EncryptedCredentials(byte[] var1, byte[] var2, byte[] var3) {
            this.data = var1;
            this.hash = var2;
            this.secret = var3;
        }

        public int getConstructor() {
            return 1331106766;
        }
    }

    public static class Emojis extends Object {
        public String[] emojis;
        public static final int CONSTRUCTOR = 950339552;

        public Emojis() {
        }

        public Emojis(String[] var1) {
            this.emojis = var1;
        }

        public int getConstructor() {
            return 950339552;
        }
    }

    public static class EmojiStatuses extends Object {
        public EmojiStatus[] emojiStatuses;
        public static final int CONSTRUCTOR = 1186104146;

        public EmojiStatuses() {
        }

        public EmojiStatuses(EmojiStatus[] var1) {
            this.emojiStatuses = var1;
        }

        public int getConstructor() {
            return 1186104146;
        }
    }

    public static class EmojiStatus extends Object {
        public long customEmojiId;
        public static final int CONSTRUCTOR = 1092133478;

        public EmojiStatus() {
        }

        public EmojiStatus(long var1) {
            this.customEmojiId = var1;
        }

        public int getConstructor() {
            return 1092133478;
        }
    }

    public static class EmojiReaction extends Object {
        public String emoji;
        public String title;
        public boolean isActive;
        public Sticker staticIcon;
        public Sticker appearAnimation;
        public Sticker selectAnimation;
        public Sticker activateAnimation;
        public Sticker effectAnimation;
        public Sticker aroundAnimation;
        public Sticker centerAnimation;
        public static final int CONSTRUCTOR = 1616063583;

        public EmojiReaction() {
        }

        public EmojiReaction(String var1, String var2, boolean var3, Sticker var4, Sticker var5, Sticker var6, Sticker var7, Sticker var8, Sticker var9, Sticker var10) {
            this.emoji = var1;
            this.title = var2;
            this.isActive = var3;
            this.staticIcon = var4;
            this.appearAnimation = var5;
            this.selectAnimation = var6;
            this.activateAnimation = var7;
            this.effectAnimation = var8;
            this.aroundAnimation = var9;
            this.centerAnimation = var10;
        }

        public int getConstructor() {
            return 1616063583;
        }
    }

    public static class EmailAddressAuthenticationCodeInfo extends Object {
        public String emailAddressPattern;
        public int length;
        public static final int CONSTRUCTOR = 1151066659;

        public EmailAddressAuthenticationCodeInfo() {
        }

        public EmailAddressAuthenticationCodeInfo(String var1, int var2) {
            this.emailAddressPattern = var1;
            this.length = var2;
        }

        public int getConstructor() {
            return 1151066659;
        }
    }

    public static class EmailAddressAuthenticationGoogleId extends EmailAddressAuthentication {
        public String token;
        public static final int CONSTRUCTOR = -19142846;

        public EmailAddressAuthenticationGoogleId() {
        }

        public EmailAddressAuthenticationGoogleId(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return -19142846;
        }
    }

    public static class EmailAddressAuthenticationAppleId extends EmailAddressAuthentication {
        public String token;
        public static final int CONSTRUCTOR = 633948265;

        public EmailAddressAuthenticationAppleId() {
        }

        public EmailAddressAuthenticationAppleId(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 633948265;
        }
    }

    public static class EmailAddressAuthenticationCode extends EmailAddressAuthentication {
        public String code;
        public static final int CONSTRUCTOR = -993257022;

        public EmailAddressAuthenticationCode() {
        }

        public EmailAddressAuthenticationCode(String var1) {
            this.code = var1;
        }

        public int getConstructor() {
            return -993257022;
        }
    }

    public abstract static class EmailAddressAuthentication extends Object {
        public EmailAddressAuthentication() {
        }
    }

    public static class DraftMessage extends Object {
        public long replyToMessageId;
        public int date;
        public InputMessageContent inputMessageText;
        public static final int CONSTRUCTOR = 1373050112;

        public DraftMessage() {
        }

        public DraftMessage(long var1, int var3, InputMessageContent var4) {
            this.replyToMessageId = var1;
            this.date = var3;
            this.inputMessageText = var4;
        }

        public int getConstructor() {
            return 1373050112;
        }
    }

    public static class DownloadedFileCounts extends Object {
        public int activeCount;
        public int pausedCount;
        public int completedCount;
        public static final int CONSTRUCTOR = -1973999550;

        public DownloadedFileCounts() {
        }

        public DownloadedFileCounts(int var1, int var2, int var3) {
            this.activeCount = var1;
            this.pausedCount = var2;
            this.completedCount = var3;
        }

        public int getConstructor() {
            return -1973999550;
        }
    }

    public static class Document extends Object {
        public String fileName;
        public String mimeType;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File document;
        public static final int CONSTRUCTOR = -1357271080;

        public Document() {
        }

        public Document(String var1, String var2, Minithumbnail var3, Thumbnail var4, File var5) {
            this.fileName = var1;
            this.mimeType = var2;
            this.minithumbnail = var3;
            this.thumbnail = var4;
            this.document = var5;
        }

        public int getConstructor() {
            return -1357271080;
        }
    }

    public static class DiceStickersSlotMachine extends DiceStickers {
        public Sticker background;
        public Sticker lever;
        public Sticker leftReel;
        public Sticker centerReel;
        public Sticker rightReel;
        public static final int CONSTRUCTOR = -375223124;

        public DiceStickersSlotMachine() {
        }

        public DiceStickersSlotMachine(Sticker var1, Sticker var2, Sticker var3, Sticker var4, Sticker var5) {
            this.background = var1;
            this.lever = var2;
            this.leftReel = var3;
            this.centerReel = var4;
            this.rightReel = var5;
        }

        public int getConstructor() {
            return -375223124;
        }
    }

    public static class DiceStickersRegular extends DiceStickers {
        public Sticker sticker;
        public static final int CONSTRUCTOR = -740299570;

        public DiceStickersRegular() {
        }

        public DiceStickersRegular(Sticker var1) {
            this.sticker = var1;
        }

        public int getConstructor() {
            return -740299570;
        }
    }

    public abstract static class DiceStickers extends Object {
        public DiceStickers() {
        }
    }

    public static class DeviceTokenTizenPush extends DeviceToken {
        public String regId;
        public static final int CONSTRUCTOR = -1359947213;

        public DeviceTokenTizenPush() {
        }

        public DeviceTokenTizenPush(String var1) {
            this.regId = var1;
        }

        public int getConstructor() {
            return -1359947213;
        }
    }

    public static class DeviceTokenBlackBerryPush extends DeviceToken {
        public String token;
        public static final int CONSTRUCTOR = 1559167234;

        public DeviceTokenBlackBerryPush() {
        }

        public DeviceTokenBlackBerryPush(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 1559167234;
        }
    }

    public static class DeviceTokenUbuntuPush extends DeviceToken {
        public String token;
        public static final int CONSTRUCTOR = 1782320422;

        public DeviceTokenUbuntuPush() {
        }

        public DeviceTokenUbuntuPush(String var1) {
            this.token = var1;
        }

        public int getConstructor() {
            return 1782320422;
        }
    }

    public static class DeviceTokenSimplePush extends DeviceToken {
        public String endpoint;
        public static final int CONSTRUCTOR = 49584736;

        public DeviceTokenSimplePush() {
        }

        public DeviceTokenSimplePush(String var1) {
            this.endpoint = var1;
        }

        public int getConstructor() {
            return 49584736;
        }
    }

    public static class DeviceTokenWebPush extends DeviceToken {
        public String endpoint;
        public String p256dhBase64url;
        public String authBase64url;
        public static final int CONSTRUCTOR = -1694507273;

        public DeviceTokenWebPush() {
        }

        public DeviceTokenWebPush(String var1, String var2, String var3) {
            this.endpoint = var1;
            this.p256dhBase64url = var2;
            this.authBase64url = var3;
        }

        public int getConstructor() {
            return -1694507273;
        }
    }

    public static class DeviceTokenMicrosoftPushVoIP extends DeviceToken {
        public String channelUri;
        public static final int CONSTRUCTOR = -785603759;

        public DeviceTokenMicrosoftPushVoIP() {
        }

        public DeviceTokenMicrosoftPushVoIP(String var1) {
            this.channelUri = var1;
        }

        public int getConstructor() {
            return -785603759;
        }
    }

    public static class DeviceTokenMicrosoftPush extends DeviceToken {
        public String channelUri;
        public static final int CONSTRUCTOR = 1224269900;

        public DeviceTokenMicrosoftPush() {
        }

        public DeviceTokenMicrosoftPush(String var1) {
            this.channelUri = var1;
        }

        public int getConstructor() {
            return 1224269900;
        }
    }

    public static class DeviceTokenWindowsPush extends DeviceToken {
        public String accessToken;
        public static final int CONSTRUCTOR = -1410514289;

        public DeviceTokenWindowsPush() {
        }

        public DeviceTokenWindowsPush(String var1) {
            this.accessToken = var1;
        }

        public int getConstructor() {
            return -1410514289;
        }
    }

    public static class DeviceTokenApplePushVoIP extends DeviceToken {
        public String deviceToken;
        public boolean isAppSandbox;
        public boolean encrypt;
        public static final int CONSTRUCTOR = 804275689;

        public DeviceTokenApplePushVoIP() {
        }

        public DeviceTokenApplePushVoIP(String var1, boolean var2, boolean var3) {
            this.deviceToken = var1;
            this.isAppSandbox = var2;
            this.encrypt = var3;
        }

        public int getConstructor() {
            return 804275689;
        }
    }

    public static class DeviceTokenApplePush extends DeviceToken {
        public String deviceToken;
        public boolean isAppSandbox;
        public static final int CONSTRUCTOR = 387541955;

        public DeviceTokenApplePush() {
        }

        public DeviceTokenApplePush(String var1, boolean var2) {
            this.deviceToken = var1;
            this.isAppSandbox = var2;
        }

        public int getConstructor() {
            return 387541955;
        }
    }

    public static class DeviceTokenFirebaseCloudMessaging extends DeviceToken {
        public String token;
        public boolean encrypt;
        public static final int CONSTRUCTOR = -797881849;

        public DeviceTokenFirebaseCloudMessaging() {
        }

        public DeviceTokenFirebaseCloudMessaging(String var1, boolean var2) {
            this.token = var1;
            this.encrypt = var2;
        }

        public int getConstructor() {
            return -797881849;
        }
    }

    public abstract static class DeviceToken extends Object {
        public DeviceToken() {
        }
    }

    public static class DeepLinkInfo extends Object {
        public FormattedText text;
        public boolean needUpdateApplication;
        public static final int CONSTRUCTOR = 1864081662;

        public DeepLinkInfo() {
        }

        public DeepLinkInfo(FormattedText var1, boolean var2) {
            this.text = var1;
            this.needUpdateApplication = var2;
        }

        public int getConstructor() {
            return 1864081662;
        }
    }

    public static class DatedFile extends Object {
        public File file;
        public int date;
        public static final int CONSTRUCTOR = -1840795491;

        public DatedFile() {
        }

        public DatedFile(File var1, int var2) {
            this.file = var1;
            this.date = var2;
        }

        public int getConstructor() {
            return -1840795491;
        }
    }

    public static class DateRange extends Object {
        public int startDate;
        public int endDate;
        public static final int CONSTRUCTOR = 1360333926;

        public DateRange() {
        }

        public DateRange(int var1, int var2) {
            this.startDate = var1;
            this.endDate = var2;
        }

        public int getConstructor() {
            return 1360333926;
        }
    }

    public static class Date extends Object {
        public int day;
        public int month;
        public int year;
        public static final int CONSTRUCTOR = -277956960;

        public Date() {
        }

        public Date(int var1, int var2, int var3) {
            this.day = var1;
            this.month = var2;
            this.year = var3;
        }

        public int getConstructor() {
            return -277956960;
        }
    }

    public static class DatabaseStatistics extends Object {
        public String statistics;
        public static final int CONSTRUCTOR = -1123912880;

        public DatabaseStatistics() {
        }

        public DatabaseStatistics(String var1) {
            this.statistics = var1;
        }

        public int getConstructor() {
            return -1123912880;
        }
    }

    public static class CustomRequestResult extends Object {
        public String result;
        public static final int CONSTRUCTOR = -2009960452;

        public CustomRequestResult() {
        }

        public CustomRequestResult(String var1) {
            this.result = var1;
        }

        public int getConstructor() {
            return -2009960452;
        }
    }

    public static class CountryInfo extends Object {
        public String countryCode;
        public String name;
        public String englishName;
        public boolean isHidden;
        public String[] callingCodes;
        public static final int CONSTRUCTOR = 1617195722;

        public CountryInfo() {
        }

        public CountryInfo(String var1, String var2, String var3, boolean var4, String[] var5) {
            this.countryCode = var1;
            this.name = var2;
            this.englishName = var3;
            this.isHidden = var4;
            this.callingCodes = var5;
        }

        public int getConstructor() {
            return 1617195722;
        }
    }

    public static class Countries extends Object {
        public CountryInfo[] countries;
        public static final int CONSTRUCTOR = 1854211813;

        public Countries() {
        }

        public Countries(CountryInfo[] var1) {
            this.countries = var1;
        }

        public int getConstructor() {
            return 1854211813;
        }
    }

    public static class Count extends Object {
        public int count;
        public static final int CONSTRUCTOR = 1295577348;

        public Count() {
        }

        public Count(int var1) {
            this.count = var1;
        }

        public int getConstructor() {
            return 1295577348;
        }
    }

    public static class Contact extends Object {
        public String phoneNumber;
        public String firstName;
        public String lastName;
        public String vcard;
        public long userId;
        public static final int CONSTRUCTOR = -1993844876;

        public Contact() {
        }

        public Contact(String var1, String var2, String var3, String var4, long var5) {
            this.phoneNumber = var1;
            this.firstName = var2;
            this.lastName = var3;
            this.vcard = var4;
            this.userId = var5;
        }

        public int getConstructor() {
            return -1993844876;
        }
    }

    public static class ConnectionStateReady extends ConnectionState {
        public static final int CONSTRUCTOR = 48608492;

        public ConnectionStateReady() {
        }

        public int getConstructor() {
            return 48608492;
        }
    }

    public static class ConnectionStateUpdating extends ConnectionState {
        public static final int CONSTRUCTOR = -188104009;

        public ConnectionStateUpdating() {
        }

        public int getConstructor() {
            return -188104009;
        }
    }

    public static class ConnectionStateConnecting extends ConnectionState {
        public static final int CONSTRUCTOR = -1298400670;

        public ConnectionStateConnecting() {
        }

        public int getConstructor() {
            return -1298400670;
        }
    }

    public static class ConnectionStateConnectingToProxy extends ConnectionState {
        public static final int CONSTRUCTOR = -93187239;

        public ConnectionStateConnectingToProxy() {
        }

        public int getConstructor() {
            return -93187239;
        }
    }

    public static class ConnectionStateWaitingForNetwork extends ConnectionState {
        public static final int CONSTRUCTOR = 1695405912;

        public ConnectionStateWaitingForNetwork() {
        }

        public int getConstructor() {
            return 1695405912;
        }
    }

    public abstract static class ConnectionState extends Object {
        public ConnectionState() {
        }
    }

    public static class ConnectedWebsites extends Object {
        public ConnectedWebsite[] websites;
        public static final int CONSTRUCTOR = -1727949694;

        public ConnectedWebsites() {
        }

        public ConnectedWebsites(ConnectedWebsite[] var1) {
            this.websites = var1;
        }

        public int getConstructor() {
            return -1727949694;
        }
    }

    public static class ConnectedWebsite extends Object {
        public long id;
        public String domainName;
        public long botUserId;
        public String browser;
        public String platform;
        public int logInDate;
        public int lastActiveDate;
        public String ip;
        public String location;
        public static final int CONSTRUCTOR = 844014445;

        public ConnectedWebsite() {
        }

        public ConnectedWebsite(long var1, String var3, long var4, String var6, String var7, int var8, int var9, String var10, String var11) {
            this.id = var1;
            this.domainName = var3;
            this.botUserId = var4;
            this.browser = var6;
            this.platform = var7;
            this.logInDate = var8;
            this.lastActiveDate = var9;
            this.ip = var10;
            this.location = var11;
        }

        public int getConstructor() {
            return 844014445;
        }
    }

    public static class ClosedVectorPath extends Object {
        public VectorPathCommand[] commands;
        public static final int CONSTRUCTOR = 589951657;

        public ClosedVectorPath() {
        }

        public ClosedVectorPath(VectorPathCommand[] var1) {
            this.commands = var1;
        }

        public int getConstructor() {
            return 589951657;
        }
    }

    public static class CheckStickerSetNameResultNameOccupied extends CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = 1012980872;

        public CheckStickerSetNameResultNameOccupied() {
        }

        public int getConstructor() {
            return 1012980872;
        }
    }

    public static class CheckStickerSetNameResultNameInvalid extends CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = 177992244;

        public CheckStickerSetNameResultNameInvalid() {
        }

        public int getConstructor() {
            return 177992244;
        }
    }

    public static class CheckStickerSetNameResultOk extends CheckStickerSetNameResult {
        public static final int CONSTRUCTOR = -1404308904;

        public CheckStickerSetNameResultOk() {
        }

        public int getConstructor() {
            return -1404308904;
        }
    }

    public abstract static class CheckStickerSetNameResult extends Object {
        public CheckStickerSetNameResult() {
        }
    }

    public static class CheckChatUsernameResultPublicGroupsUnavailable extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -51833641;

        public CheckChatUsernameResultPublicGroupsUnavailable() {
        }

        public int getConstructor() {
            return -51833641;
        }
    }

    public static class CheckChatUsernameResultPublicChatsTooMuch extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = 858247741;

        public CheckChatUsernameResultPublicChatsTooMuch() {
        }

        public int getConstructor() {
            return 858247741;
        }
    }

    public static class CheckChatUsernameResultUsernameOccupied extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = 1320892201;

        public CheckChatUsernameResultUsernameOccupied() {
        }

        public int getConstructor() {
            return 1320892201;
        }
    }

    public static class CheckChatUsernameResultUsernameInvalid extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -636979370;

        public CheckChatUsernameResultUsernameInvalid() {
        }

        public int getConstructor() {
            return -636979370;
        }
    }

    public static class CheckChatUsernameResultOk extends CheckChatUsernameResult {
        public static final int CONSTRUCTOR = -1498956964;

        public CheckChatUsernameResultOk() {
        }

        public int getConstructor() {
            return -1498956964;
        }
    }

    public abstract static class CheckChatUsernameResult extends Object {
        public CheckChatUsernameResult() {
        }
    }

    public static class ChatsNearby extends Object {
        public ChatNearby[] usersNearby;
        public ChatNearby[] supergroupsNearby;
        public static final int CONSTRUCTOR = 187746081;

        public ChatsNearby() {
        }

        public ChatsNearby(ChatNearby[] var1, ChatNearby[] var2) {
            this.usersNearby = var1;
            this.supergroupsNearby = var2;
        }

        public int getConstructor() {
            return 187746081;
        }
    }

    public static class Chats extends Object {
        public int totalCount;
        public long[] chatIds;
        public static final int CONSTRUCTOR = 1809654812;

        public Chats() {
        }

        public Chats(int var1, long[] var2) {
            this.totalCount = var1;
            this.chatIds = var2;
        }

        public int getConstructor() {
            return 1809654812;
        }
    }

    public static class ChatTypeSecret extends ChatType {
        public int secretChatId;
        public long userId;
        public static final int CONSTRUCTOR = 862366513;

        public ChatTypeSecret() {
        }

        public ChatTypeSecret(int var1, long var2) {
            this.secretChatId = var1;
            this.userId = var2;
        }

        public int getConstructor() {
            return 862366513;
        }
    }

    public static class ChatTypeSupergroup extends ChatType {
        public long supergroupId;
        public boolean isChannel;
        public static final int CONSTRUCTOR = -1472570774;

        public ChatTypeSupergroup() {
        }

        public ChatTypeSupergroup(long var1, boolean var3) {
            this.supergroupId = var1;
            this.isChannel = var3;
        }

        public int getConstructor() {
            return -1472570774;
        }
    }

    public static class ChatTypeBasicGroup extends ChatType {
        public long basicGroupId;
        public static final int CONSTRUCTOR = 973884508;

        public ChatTypeBasicGroup() {
        }

        public ChatTypeBasicGroup(long var1) {
            this.basicGroupId = var1;
        }

        public int getConstructor() {
            return 973884508;
        }
    }

    public static class ChatTypePrivate extends ChatType {
        public long userId;
        public static final int CONSTRUCTOR = 1579049844;

        public ChatTypePrivate() {
        }

        public ChatTypePrivate(long var1) {
            this.userId = var1;
        }

        public int getConstructor() {
            return 1579049844;
        }
    }

    public abstract static class ChatType extends Object {
        public ChatType() {
        }
    }

    public static class ChatTheme extends Object {
        public String name;
        public ThemeSettings lightSettings;
        public ThemeSettings darkSettings;
        public static final int CONSTRUCTOR = -113218503;

        public ChatTheme() {
        }

        public ChatTheme(String var1, ThemeSettings var2, ThemeSettings var3) {
            this.name = var1;
            this.lightSettings = var2;
            this.darkSettings = var3;
        }

        public int getConstructor() {
            return -113218503;
        }
    }

    public static class ChatStatisticsMessageSenderInfo extends Object {
        public long userId;
        public int sentMessageCount;
        public int averageCharacterCount;
        public static final int CONSTRUCTOR = 1762295371;

        public ChatStatisticsMessageSenderInfo() {
        }

        public ChatStatisticsMessageSenderInfo(long var1, int var3, int var4) {
            this.userId = var1;
            this.sentMessageCount = var3;
            this.averageCharacterCount = var4;
        }

        public int getConstructor() {
            return 1762295371;
        }
    }

    public static class ChatStatisticsMessageInteractionInfo extends Object {
        public long messageId;
        public int viewCount;
        public int forwardCount;
        public static final int CONSTRUCTOR = -765580756;

        public ChatStatisticsMessageInteractionInfo() {
        }

        public ChatStatisticsMessageInteractionInfo(long var1, int var3, int var4) {
            this.messageId = var1;
            this.viewCount = var3;
            this.forwardCount = var4;
        }

        public int getConstructor() {
            return -765580756;
        }
    }

    public static class ChatStatisticsInviterInfo extends Object {
        public long userId;
        public int addedMemberCount;
        public static final int CONSTRUCTOR = 629396619;

        public ChatStatisticsInviterInfo() {
        }

        public ChatStatisticsInviterInfo(long var1, int var3) {
            this.userId = var1;
            this.addedMemberCount = var3;
        }

        public int getConstructor() {
            return 629396619;
        }
    }

    public static class ChatStatisticsAdministratorActionsInfo extends Object {
        public long userId;
        public int deletedMessageCount;
        public int bannedUserCount;
        public int restrictedUserCount;
        public static final int CONSTRUCTOR = -406467202;

        public ChatStatisticsAdministratorActionsInfo() {
        }

        public ChatStatisticsAdministratorActionsInfo(long var1, int var3, int var4, int var5) {
            this.userId = var1;
            this.deletedMessageCount = var3;
            this.bannedUserCount = var4;
            this.restrictedUserCount = var5;
        }

        public int getConstructor() {
            return -406467202;
        }
    }

    public static class ChatStatisticsChannel extends ChatStatistics {
        public DateRange period;
        public StatisticalValue memberCount;
        public StatisticalValue meanViewCount;
        public StatisticalValue meanShareCount;
        public double enabledNotificationsPercentage;
        public StatisticalGraph memberCountGraph;
        public StatisticalGraph joinGraph;
        public StatisticalGraph muteGraph;
        public StatisticalGraph viewCountByHourGraph;
        public StatisticalGraph viewCountBySourceGraph;
        public StatisticalGraph joinBySourceGraph;
        public StatisticalGraph languageGraph;
        public StatisticalGraph messageInteractionGraph;
        public StatisticalGraph instantViewInteractionGraph;
        public ChatStatisticsMessageInteractionInfo[] recentMessageInteractions;
        public static final int CONSTRUCTOR = -825434183;

        public ChatStatisticsChannel() {
        }

        public ChatStatisticsChannel(DateRange var1, StatisticalValue var2, StatisticalValue var3, StatisticalValue var4, double var5, StatisticalGraph var7, StatisticalGraph var8, StatisticalGraph var9, StatisticalGraph var10, StatisticalGraph var11, StatisticalGraph var12, StatisticalGraph var13, StatisticalGraph var14, StatisticalGraph var15, ChatStatisticsMessageInteractionInfo[] var16) {
            this.period = var1;
            this.memberCount = var2;
            this.meanViewCount = var3;
            this.meanShareCount = var4;
            this.enabledNotificationsPercentage = var5;
            this.memberCountGraph = var7;
            this.joinGraph = var8;
            this.muteGraph = var9;
            this.viewCountByHourGraph = var10;
            this.viewCountBySourceGraph = var11;
            this.joinBySourceGraph = var12;
            this.languageGraph = var13;
            this.messageInteractionGraph = var14;
            this.instantViewInteractionGraph = var15;
            this.recentMessageInteractions = var16;
        }

        public int getConstructor() {
            return -825434183;
        }
    }

    public static class ChatStatisticsSupergroup extends ChatStatistics {
        public DateRange period;
        public StatisticalValue memberCount;
        public StatisticalValue messageCount;
        public StatisticalValue viewerCount;
        public StatisticalValue senderCount;
        public StatisticalGraph memberCountGraph;
        public StatisticalGraph joinGraph;
        public StatisticalGraph joinBySourceGraph;
        public StatisticalGraph languageGraph;
        public StatisticalGraph messageContentGraph;
        public StatisticalGraph actionGraph;
        public StatisticalGraph dayGraph;
        public StatisticalGraph weekGraph;
        public ChatStatisticsMessageSenderInfo[] topSenders;
        public ChatStatisticsAdministratorActionsInfo[] topAdministrators;
        public ChatStatisticsInviterInfo[] topInviters;
        public static final int CONSTRUCTOR = -17244633;

        public ChatStatisticsSupergroup() {
        }

        public ChatStatisticsSupergroup(DateRange var1, StatisticalValue var2, StatisticalValue var3, StatisticalValue var4, StatisticalValue var5, StatisticalGraph var6, StatisticalGraph var7, StatisticalGraph var8, StatisticalGraph var9, StatisticalGraph var10, StatisticalGraph var11, StatisticalGraph var12, StatisticalGraph var13, ChatStatisticsMessageSenderInfo[] var14, ChatStatisticsAdministratorActionsInfo[] var15, ChatStatisticsInviterInfo[] var16) {
            this.period = var1;
            this.memberCount = var2;
            this.messageCount = var3;
            this.viewerCount = var4;
            this.senderCount = var5;
            this.memberCountGraph = var6;
            this.joinGraph = var7;
            this.joinBySourceGraph = var8;
            this.languageGraph = var9;
            this.messageContentGraph = var10;
            this.actionGraph = var11;
            this.dayGraph = var12;
            this.weekGraph = var13;
            this.topSenders = var14;
            this.topAdministrators = var15;
            this.topInviters = var16;
        }

        public int getConstructor() {
            return -17244633;
        }
    }

    public abstract static class ChatStatistics extends Object {
        public ChatStatistics() {
        }
    }

    public static class ChatSourcePublicServiceAnnouncement extends ChatSource {
        public String type;
        public String text;
        public static final int CONSTRUCTOR = -328571244;

        public ChatSourcePublicServiceAnnouncement() {
        }

        public ChatSourcePublicServiceAnnouncement(String var1, String var2) {
            this.type = var1;
            this.text = var2;
        }

        public int getConstructor() {
            return -328571244;
        }
    }

    public static class ChatSourceMtprotoProxy extends ChatSource {
        public static final int CONSTRUCTOR = 394074115;

        public ChatSourceMtprotoProxy() {
        }

        public int getConstructor() {
            return 394074115;
        }
    }

    public abstract static class ChatSource extends Object {
        public ChatSource() {
        }
    }

    public static class ChatReportReasonCustom extends ChatReportReason {
        public static final int CONSTRUCTOR = 1288925974;

        public ChatReportReasonCustom() {
        }

        public int getConstructor() {
            return 1288925974;
        }
    }

    public static class ChatReportReasonPersonalDetails extends ChatReportReason {
        public static final int CONSTRUCTOR = 1121159029;

        public ChatReportReasonPersonalDetails() {
        }

        public int getConstructor() {
            return 1121159029;
        }
    }

    public static class ChatReportReasonIllegalDrugs extends ChatReportReason {
        public static final int CONSTRUCTOR = -844539307;

        public ChatReportReasonIllegalDrugs() {
        }

        public int getConstructor() {
            return -844539307;
        }
    }

    public static class ChatReportReasonFake extends ChatReportReason {
        public static final int CONSTRUCTOR = -1713230446;

        public ChatReportReasonFake() {
        }

        public int getConstructor() {
            return -1713230446;
        }
    }

    public static class ChatReportReasonUnrelatedLocation extends ChatReportReason {
        public static final int CONSTRUCTOR = 2632403;

        public ChatReportReasonUnrelatedLocation() {
        }

        public int getConstructor() {
            return 2632403;
        }
    }

    public static class ChatReportReasonCopyright extends ChatReportReason {
        public static final int CONSTRUCTOR = 986898080;

        public ChatReportReasonCopyright() {
        }

        public int getConstructor() {
            return 986898080;
        }
    }

    public static class ChatReportReasonChildAbuse extends ChatReportReason {
        public static final int CONSTRUCTOR = -1070686531;

        public ChatReportReasonChildAbuse() {
        }

        public int getConstructor() {
            return -1070686531;
        }
    }

    public static class ChatReportReasonPornography extends ChatReportReason {
        public static final int CONSTRUCTOR = 722614385;

        public ChatReportReasonPornography() {
        }

        public int getConstructor() {
            return 722614385;
        }
    }

    public static class ChatReportReasonViolence extends ChatReportReason {
        public static final int CONSTRUCTOR = -1330235395;

        public ChatReportReasonViolence() {
        }

        public int getConstructor() {
            return -1330235395;
        }
    }

    public static class ChatReportReasonSpam extends ChatReportReason {
        public static final int CONSTRUCTOR = -510848863;

        public ChatReportReasonSpam() {
        }

        public int getConstructor() {
            return -510848863;
        }
    }

    public abstract static class ChatReportReason extends Object {
        public ChatReportReason() {
        }
    }

    public static class ChatPosition extends Object {
        public ChatList list;
        public long order;
        public boolean isPinned;
        public ChatSource source;
        public static final int CONSTRUCTOR = -622557355;

        public ChatPosition() {
        }

        public ChatPosition(ChatList var1, long var2, boolean var4, ChatSource var5) {
            this.list = var1;
            this.order = var2;
            this.isPinned = var4;
            this.source = var5;
        }

        public int getConstructor() {
            return -622557355;
        }
    }

    public static class ChatPhotos extends Object {
        public int totalCount;
        public ChatPhoto[] photos;
        public static final int CONSTRUCTOR = -1510699180;

        public ChatPhotos() {
        }

        public ChatPhotos(int var1, ChatPhoto[] var2) {
            this.totalCount = var1;
            this.photos = var2;
        }

        public int getConstructor() {
            return -1510699180;
        }
    }

    public static class ChatPhotoInfo extends Object {
        public File small;
        public File big;
        public Minithumbnail minithumbnail;
        public boolean hasAnimation;
        public static final int CONSTRUCTOR = 167058358;

        public ChatPhotoInfo() {
        }

        public ChatPhotoInfo(File var1, File var2, Minithumbnail var3, boolean var4) {
            this.small = var1;
            this.big = var2;
            this.minithumbnail = var3;
            this.hasAnimation = var4;
        }

        public int getConstructor() {
            return 167058358;
        }
    }

    public static class ChatPhoto extends Object {
        public long id;
        public int addedDate;
        public Minithumbnail minithumbnail;
        public PhotoSize[] sizes;
        public AnimatedChatPhoto animation;
        public AnimatedChatPhoto smallAnimation;
        public static final int CONSTRUCTOR = 1854980206;

        public ChatPhoto() {
        }

        public ChatPhoto(long var1, int var3, Minithumbnail var4, PhotoSize[] var5, AnimatedChatPhoto var6, AnimatedChatPhoto var7) {
            this.id = var1;
            this.addedDate = var3;
            this.minithumbnail = var4;
            this.sizes = var5;
            this.animation = var6;
            this.smallAnimation = var7;
        }

        public int getConstructor() {
            return 1854980206;
        }
    }

    public static class ChatPermissions extends Object {
        public boolean canSendMessages;
        public boolean canSendMediaMessages;
        public boolean canSendPolls;
        public boolean canSendOtherMessages;
        public boolean canAddWebPagePreviews;
        public boolean canChangeInfo;
        public boolean canInviteUsers;
        public boolean canPinMessages;
        public static final int CONSTRUCTOR = 1584650463;

        public ChatPermissions() {
        }

        public ChatPermissions(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8) {
            this.canSendMessages = var1;
            this.canSendMediaMessages = var2;
            this.canSendPolls = var3;
            this.canSendOtherMessages = var4;
            this.canAddWebPagePreviews = var5;
            this.canChangeInfo = var6;
            this.canInviteUsers = var7;
            this.canPinMessages = var8;
        }

        public int getConstructor() {
            return 1584650463;
        }
    }

    public static class ChatNotificationSettings extends Object {
        public boolean useDefaultMuteFor;
        public int muteFor;
        public boolean useDefaultSound;
        public long soundId;
        public boolean useDefaultShowPreview;
        public boolean showPreview;
        public boolean useDefaultDisablePinnedMessageNotifications;
        public boolean disablePinnedMessageNotifications;
        public boolean useDefaultDisableMentionNotifications;
        public boolean disableMentionNotifications;
        public static final int CONSTRUCTOR = 944322400;

        public ChatNotificationSettings() {
        }

        public ChatNotificationSettings(boolean var1, int var2, boolean var3, long var4, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11) {
            this.useDefaultMuteFor = var1;
            this.muteFor = var2;
            this.useDefaultSound = var3;
            this.soundId = var4;
            this.useDefaultShowPreview = var6;
            this.showPreview = var7;
            this.useDefaultDisablePinnedMessageNotifications = var8;
            this.disablePinnedMessageNotifications = var9;
            this.useDefaultDisableMentionNotifications = var10;
            this.disableMentionNotifications = var11;
        }

        public int getConstructor() {
            return 944322400;
        }
    }

    public static class ChatNearby extends Object {
        public long chatId;
        public int distance;
        public static final int CONSTRUCTOR = 48120405;

        public ChatNearby() {
        }

        public ChatNearby(long var1, int var3) {
            this.chatId = var1;
            this.distance = var3;
        }

        public int getConstructor() {
            return 48120405;
        }
    }

    public static class ChatMembersFilterBots extends ChatMembersFilter {
        public static final int CONSTRUCTOR = -1422567288;

        public ChatMembersFilterBots() {
        }

        public int getConstructor() {
            return -1422567288;
        }
    }

    public static class ChatMembersFilterBanned extends ChatMembersFilter {
        public static final int CONSTRUCTOR = -1863102648;

        public ChatMembersFilterBanned() {
        }

        public int getConstructor() {
            return -1863102648;
        }
    }

    public static class ChatMembersFilterRestricted extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 1256282813;

        public ChatMembersFilterRestricted() {
        }

        public int getConstructor() {
            return 1256282813;
        }
    }

    public static class ChatMembersFilterMention extends ChatMembersFilter {
        public long messageThreadId;
        public static final int CONSTRUCTOR = 856419831;

        public ChatMembersFilterMention() {
        }

        public ChatMembersFilterMention(long var1) {
            this.messageThreadId = var1;
        }

        public int getConstructor() {
            return 856419831;
        }
    }

    public static class ChatMembersFilterMembers extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 670504342;

        public ChatMembersFilterMembers() {
        }

        public int getConstructor() {
            return 670504342;
        }
    }

    public static class ChatMembersFilterAdministrators extends ChatMembersFilter {
        public static final int CONSTRUCTOR = -1266893796;

        public ChatMembersFilterAdministrators() {
        }

        public int getConstructor() {
            return -1266893796;
        }
    }

    public static class ChatMembersFilterContacts extends ChatMembersFilter {
        public static final int CONSTRUCTOR = 1774485671;

        public ChatMembersFilterContacts() {
        }

        public int getConstructor() {
            return 1774485671;
        }
    }

    public abstract static class ChatMembersFilter extends Object {
        public ChatMembersFilter() {
        }
    }

    public static class ChatMembers extends Object {
        public int totalCount;
        public ChatMember[] members;
        public static final int CONSTRUCTOR = -497558622;

        public ChatMembers() {
        }

        public ChatMembers(int var1, ChatMember[] var2) {
            this.totalCount = var1;
            this.members = var2;
        }

        public int getConstructor() {
            return -497558622;
        }
    }

    public static class ChatMemberStatusBanned extends ChatMemberStatus {
        public int bannedUntilDate;
        public static final int CONSTRUCTOR = -1653518666;

        public ChatMemberStatusBanned() {
        }

        public ChatMemberStatusBanned(int var1) {
            this.bannedUntilDate = var1;
        }

        public int getConstructor() {
            return -1653518666;
        }
    }

    public static class ChatMemberStatusLeft extends ChatMemberStatus {
        public static final int CONSTRUCTOR = -5815259;

        public ChatMemberStatusLeft() {
        }

        public int getConstructor() {
            return -5815259;
        }
    }

    public static class ChatMemberStatusRestricted extends ChatMemberStatus {
        public boolean isMember;
        public int restrictedUntilDate;
        public ChatPermissions permissions;
        public static final int CONSTRUCTOR = 1661432998;

        public ChatMemberStatusRestricted() {
        }

        public ChatMemberStatusRestricted(boolean var1, int var2, ChatPermissions var3) {
            this.isMember = var1;
            this.restrictedUntilDate = var2;
            this.permissions = var3;
        }

        public int getConstructor() {
            return 1661432998;
        }
    }

    public static class ChatMemberStatusMember extends ChatMemberStatus {
        public static final int CONSTRUCTOR = 844723285;

        public ChatMemberStatusMember() {
        }

        public int getConstructor() {
            return 844723285;
        }
    }

    public static class ChatMemberStatusAdministrator extends ChatMemberStatus {
        public String customTitle;
        public boolean canBeEdited;
        public ChatAdministratorRights rights;
        public static final int CONSTRUCTOR = -70024163;

        public ChatMemberStatusAdministrator() {
        }

        public ChatMemberStatusAdministrator(String var1, boolean var2, ChatAdministratorRights var3) {
            this.customTitle = var1;
            this.canBeEdited = var2;
            this.rights = var3;
        }

        public int getConstructor() {
            return -70024163;
        }
    }

    public static class ChatMemberStatusCreator extends ChatMemberStatus {
        public String customTitle;
        public boolean isAnonymous;
        public boolean isMember;
        public static final int CONSTRUCTOR = -160019714;

        public ChatMemberStatusCreator() {
        }

        public ChatMemberStatusCreator(String var1, boolean var2, boolean var3) {
            this.customTitle = var1;
            this.isAnonymous = var2;
            this.isMember = var3;
        }

        public int getConstructor() {
            return -160019714;
        }
    }

    public abstract static class ChatMemberStatus extends Object {
        public ChatMemberStatus() {
        }
    }

    public static class ChatMember extends Object {
        public MessageSender memberId;
        public long inviterUserId;
        public int joinedChatDate;
        public ChatMemberStatus status;
        public static final int CONSTRUCTOR = 1829953909;

        public ChatMember() {
        }

        public ChatMember(MessageSender var1, long var2, int var4, ChatMemberStatus var5) {
            this.memberId = var1;
            this.inviterUserId = var2;
            this.joinedChatDate = var4;
            this.status = var5;
        }

        public int getConstructor() {
            return 1829953909;
        }
    }

    public static class ChatLocation extends Object {
        public Location location;
        public String address;
        public static final int CONSTRUCTOR = -1566863583;

        public ChatLocation() {
        }

        public ChatLocation(Location var1, String var2) {
            this.location = var1;
            this.address = var2;
        }

        public int getConstructor() {
            return -1566863583;
        }
    }

    public static class ChatLists extends Object {
        public ChatList[] chatLists;
        public static final int CONSTRUCTOR = -258292771;

        public ChatLists() {
        }

        public ChatLists(ChatList[] var1) {
            this.chatLists = var1;
        }

        public int getConstructor() {
            return -258292771;
        }
    }

    public static class ChatListFilter extends ChatList {
        public int chatFilterId;
        public static final int CONSTRUCTOR = -2022707655;

        public ChatListFilter() {
        }

        public ChatListFilter(int var1) {
            this.chatFilterId = var1;
        }

        public int getConstructor() {
            return -2022707655;
        }
    }

    public static class ChatListArchive extends ChatList {
        public static final int CONSTRUCTOR = 362770115;

        public ChatListArchive() {
        }

        public int getConstructor() {
            return 362770115;
        }
    }

    public static class ChatListMain extends ChatList {
        public static final int CONSTRUCTOR = -400991316;

        public ChatListMain() {
        }

        public int getConstructor() {
            return -400991316;
        }
    }

    public abstract static class ChatList extends Object {
        public ChatList() {
        }
    }

    public static class ChatJoinRequestsInfo extends Object {
        public int totalCount;
        public long[] userIds;
        public static final int CONSTRUCTOR = 888534463;

        public ChatJoinRequestsInfo() {
        }

        public ChatJoinRequestsInfo(int var1, long[] var2) {
            this.totalCount = var1;
            this.userIds = var2;
        }

        public int getConstructor() {
            return 888534463;
        }
    }

    public static class ChatJoinRequests extends Object {
        public int totalCount;
        public ChatJoinRequest[] requests;
        public static final int CONSTRUCTOR = 1291680519;

        public ChatJoinRequests() {
        }

        public ChatJoinRequests(int var1, ChatJoinRequest[] var2) {
            this.totalCount = var1;
            this.requests = var2;
        }

        public int getConstructor() {
            return 1291680519;
        }
    }

    public static class ChatJoinRequest extends Object {
        public long userId;
        public int date;
        public String bio;
        public static final int CONSTRUCTOR = 59341416;

        public ChatJoinRequest() {
        }

        public ChatJoinRequest(long var1, int var3, String var4) {
            this.userId = var1;
            this.date = var3;
            this.bio = var4;
        }

        public int getConstructor() {
            return 59341416;
        }
    }

    public static class ChatInviteLinks extends Object {
        public int totalCount;
        public ChatInviteLink[] inviteLinks;
        public static final int CONSTRUCTOR = 112891427;

        public ChatInviteLinks() {
        }

        public ChatInviteLinks(int var1, ChatInviteLink[] var2) {
            this.totalCount = var1;
            this.inviteLinks = var2;
        }

        public int getConstructor() {
            return 112891427;
        }
    }

    public static class ChatInviteLinkMembers extends Object {
        public int totalCount;
        public ChatInviteLinkMember[] members;
        public static final int CONSTRUCTOR = 315635051;

        public ChatInviteLinkMembers() {
        }

        public ChatInviteLinkMembers(int var1, ChatInviteLinkMember[] var2) {
            this.totalCount = var1;
            this.members = var2;
        }

        public int getConstructor() {
            return 315635051;
        }
    }

    public static class ChatInviteLinkMember extends Object {
        public long userId;
        public int joinedChatDate;
        public long approverUserId;
        public static final int CONSTRUCTOR = -1409060582;

        public ChatInviteLinkMember() {
        }

        public ChatInviteLinkMember(long var1, int var3, long var4) {
            this.userId = var1;
            this.joinedChatDate = var3;
            this.approverUserId = var4;
        }

        public int getConstructor() {
            return -1409060582;
        }
    }

    public static class ChatInviteLinkInfo extends Object {
        public long chatId;
        public int accessibleFor;
        public ChatType type;
        public String title;
        public ChatPhotoInfo photo;
        public String description;
        public int memberCount;
        public long[] memberUserIds;
        public boolean createsJoinRequest;
        public boolean isPublic;
        public static final int CONSTRUCTOR = 546234276;

        public ChatInviteLinkInfo() {
        }

        public ChatInviteLinkInfo(long var1, int var3, ChatType var4, String var5, ChatPhotoInfo var6, String var7, int var8, long[] var9, boolean var10, boolean var11) {
            this.chatId = var1;
            this.accessibleFor = var3;
            this.type = var4;
            this.title = var5;
            this.photo = var6;
            this.description = var7;
            this.memberCount = var8;
            this.memberUserIds = var9;
            this.createsJoinRequest = var10;
            this.isPublic = var11;
        }

        public int getConstructor() {
            return 546234276;
        }
    }

    public static class ChatInviteLinkCounts extends Object {
        public ChatInviteLinkCount[] inviteLinkCounts;
        public static final int CONSTRUCTOR = 920326637;

        public ChatInviteLinkCounts() {
        }

        public ChatInviteLinkCounts(ChatInviteLinkCount[] var1) {
            this.inviteLinkCounts = var1;
        }

        public int getConstructor() {
            return 920326637;
        }
    }

    public static class ChatInviteLinkCount extends Object {
        public long userId;
        public int inviteLinkCount;
        public int revokedInviteLinkCount;
        public static final int CONSTRUCTOR = -1021999210;

        public ChatInviteLinkCount() {
        }

        public ChatInviteLinkCount(long var1, int var3, int var4) {
            this.userId = var1;
            this.inviteLinkCount = var3;
            this.revokedInviteLinkCount = var4;
        }

        public int getConstructor() {
            return -1021999210;
        }
    }

    public static class ChatInviteLink extends Object {
        public String inviteLink;
        public String name;
        public long creatorUserId;
        public int date;
        public int editDate;
        public int expirationDate;
        public int memberLimit;
        public int memberCount;
        public int pendingJoinRequestCount;
        public boolean createsJoinRequest;
        public boolean isPrimary;
        public boolean isRevoked;
        public static final int CONSTRUCTOR = -205812476;

        public ChatInviteLink() {
        }

        public ChatInviteLink(String var1, String var2, long var3, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, boolean var13) {
            this.inviteLink = var1;
            this.name = var2;
            this.creatorUserId = var3;
            this.date = var5;
            this.editDate = var6;
            this.expirationDate = var7;
            this.memberLimit = var8;
            this.memberCount = var9;
            this.pendingJoinRequestCount = var10;
            this.createsJoinRequest = var11;
            this.isPrimary = var12;
            this.isRevoked = var13;
        }

        public int getConstructor() {
            return -205812476;
        }
    }

    public static class ChatFilterInfo extends Object {
        public int id;
        public String title;
        public String iconName;
        public static final int CONSTRUCTOR = -943721165;

        public ChatFilterInfo() {
        }

        public ChatFilterInfo(int var1, String var2, String var3) {
            this.id = var1;
            this.title = var2;
            this.iconName = var3;
        }

        public int getConstructor() {
            return -943721165;
        }
    }

    public static class ChatFilter extends Object {
        public String title;
        public String iconName;
        public long[] pinnedChatIds;
        public long[] includedChatIds;
        public long[] excludedChatIds;
        public boolean excludeMuted;
        public boolean excludeRead;
        public boolean excludeArchived;
        public boolean includeContacts;
        public boolean includeNonContacts;
        public boolean includeBots;
        public boolean includeGroups;
        public boolean includeChannels;
        public static final int CONSTRUCTOR = -664815123;

        public ChatFilter() {
        }

        public ChatFilter(String var1, String var2, long[] var3, long[] var4, long[] var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, boolean var13) {
            this.title = var1;
            this.iconName = var2;
            this.pinnedChatIds = var3;
            this.includedChatIds = var4;
            this.excludedChatIds = var5;
            this.excludeMuted = var6;
            this.excludeRead = var7;
            this.excludeArchived = var8;
            this.includeContacts = var9;
            this.includeNonContacts = var10;
            this.includeBots = var11;
            this.includeGroups = var12;
            this.includeChannels = var13;
        }

        public int getConstructor() {
            return -664815123;
        }
    }

    public static class ChatEvents extends Object {
        public ChatEvent[] events;
        public static final int CONSTRUCTOR = -585329664;

        public ChatEvents() {
        }

        public ChatEvents(ChatEvent[] var1) {
            this.events = var1;
        }

        public int getConstructor() {
            return -585329664;
        }
    }

    public static class ChatEventLogFilters extends Object {
        public boolean messageEdits;
        public boolean messageDeletions;
        public boolean messagePins;
        public boolean memberJoins;
        public boolean memberLeaves;
        public boolean memberInvites;
        public boolean memberPromotions;
        public boolean memberRestrictions;
        public boolean infoChanges;
        public boolean settingChanges;
        public boolean inviteLinkChanges;
        public boolean videoChatChanges;
        public static final int CONSTRUCTOR = 1251197299;

        public ChatEventLogFilters() {
        }

        public ChatEventLogFilters(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12) {
            this.messageEdits = var1;
            this.messageDeletions = var2;
            this.messagePins = var3;
            this.memberJoins = var4;
            this.memberLeaves = var5;
            this.memberInvites = var6;
            this.memberPromotions = var7;
            this.memberRestrictions = var8;
            this.infoChanges = var9;
            this.settingChanges = var10;
            this.inviteLinkChanges = var11;
            this.videoChatChanges = var12;
        }

        public int getConstructor() {
            return 1251197299;
        }
    }

    public static class ChatEventVideoChatParticipantVolumeLevelChanged extends ChatEventAction {
        public MessageSender participantId;
        public int volumeLevel;
        public static final int CONSTRUCTOR = 1131385534;

        public ChatEventVideoChatParticipantVolumeLevelChanged() {
        }

        public ChatEventVideoChatParticipantVolumeLevelChanged(MessageSender var1, int var2) {
            this.participantId = var1;
            this.volumeLevel = var2;
        }

        public int getConstructor() {
            return 1131385534;
        }
    }

    public static class ChatEventVideoChatParticipantIsMutedToggled extends ChatEventAction {
        public MessageSender participantId;
        public boolean isMuted;
        public static final int CONSTRUCTOR = 521165047;

        public ChatEventVideoChatParticipantIsMutedToggled() {
        }

        public ChatEventVideoChatParticipantIsMutedToggled(MessageSender var1, boolean var2) {
            this.participantId = var1;
            this.isMuted = var2;
        }

        public int getConstructor() {
            return 521165047;
        }
    }

    public static class ChatEventVideoChatMuteNewParticipantsToggled extends ChatEventAction {
        public boolean muteNewParticipants;
        public static final int CONSTRUCTOR = -126547970;

        public ChatEventVideoChatMuteNewParticipantsToggled() {
        }

        public ChatEventVideoChatMuteNewParticipantsToggled(boolean var1) {
            this.muteNewParticipants = var1;
        }

        public int getConstructor() {
            return -126547970;
        }
    }

    public static class ChatEventVideoChatEnded extends ChatEventAction {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1630039112;

        public ChatEventVideoChatEnded() {
        }

        public ChatEventVideoChatEnded(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1630039112;
        }
    }

    public static class ChatEventVideoChatCreated extends ChatEventAction {
        public int groupCallId;
        public static final int CONSTRUCTOR = 1822853755;

        public ChatEventVideoChatCreated() {
        }

        public ChatEventVideoChatCreated(int var1) {
            this.groupCallId = var1;
        }

        public int getConstructor() {
            return 1822853755;
        }
    }

    public static class ChatEventInviteLinkDeleted extends ChatEventAction {
        public ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -1394974361;

        public ChatEventInviteLinkDeleted() {
        }

        public ChatEventInviteLinkDeleted(ChatInviteLink var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1394974361;
        }
    }

    public static class ChatEventInviteLinkRevoked extends ChatEventAction {
        public ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -1579417629;

        public ChatEventInviteLinkRevoked() {
        }

        public ChatEventInviteLinkRevoked(ChatInviteLink var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -1579417629;
        }
    }

    public static class ChatEventInviteLinkEdited extends ChatEventAction {
        public ChatInviteLink oldInviteLink;
        public ChatInviteLink newInviteLink;
        public static final int CONSTRUCTOR = -460190366;

        public ChatEventInviteLinkEdited() {
        }

        public ChatEventInviteLinkEdited(ChatInviteLink var1, ChatInviteLink var2) {
            this.oldInviteLink = var1;
            this.newInviteLink = var2;
        }

        public int getConstructor() {
            return -460190366;
        }
    }

    public static class ChatEventSignMessagesToggled extends ChatEventAction {
        public boolean signMessages;
        public static final int CONSTRUCTOR = -1313265634;

        public ChatEventSignMessagesToggled() {
        }

        public ChatEventSignMessagesToggled(boolean var1) {
            this.signMessages = var1;
        }

        public int getConstructor() {
            return -1313265634;
        }
    }

    public static class ChatEventIsAllHistoryAvailableToggled extends ChatEventAction {
        public boolean isAllHistoryAvailable;
        public static final int CONSTRUCTOR = -1599063019;

        public ChatEventIsAllHistoryAvailableToggled() {
        }

        public ChatEventIsAllHistoryAvailableToggled(boolean var1) {
            this.isAllHistoryAvailable = var1;
        }

        public int getConstructor() {
            return -1599063019;
        }
    }

    public static class ChatEventInvitesToggled extends ChatEventAction {
        public boolean canInviteUsers;
        public static final int CONSTRUCTOR = -62548373;

        public ChatEventInvitesToggled() {
        }

        public ChatEventInvitesToggled(boolean var1) {
            this.canInviteUsers = var1;
        }

        public int getConstructor() {
            return -62548373;
        }
    }

    public static class ChatEventHasProtectedContentToggled extends ChatEventAction {
        public boolean hasProtectedContent;
        public static final int CONSTRUCTOR = -184270335;

        public ChatEventHasProtectedContentToggled() {
        }

        public ChatEventHasProtectedContentToggled(boolean var1) {
            this.hasProtectedContent = var1;
        }

        public int getConstructor() {
            return -184270335;
        }
    }

    public static class ChatEventUsernameChanged extends ChatEventAction {
        public String oldUsername;
        public String newUsername;
        public static final int CONSTRUCTOR = 1728558443;

        public ChatEventUsernameChanged() {
        }

        public ChatEventUsernameChanged(String var1, String var2) {
            this.oldUsername = var1;
            this.newUsername = var2;
        }

        public int getConstructor() {
            return 1728558443;
        }
    }

    public static class ChatEventTitleChanged extends ChatEventAction {
        public String oldTitle;
        public String newTitle;
        public static final int CONSTRUCTOR = 1134103250;

        public ChatEventTitleChanged() {
        }

        public ChatEventTitleChanged(String var1, String var2) {
            this.oldTitle = var1;
            this.newTitle = var2;
        }

        public int getConstructor() {
            return 1134103250;
        }
    }

    public static class ChatEventStickerSetChanged extends ChatEventAction {
        public long oldStickerSetId;
        public long newStickerSetId;
        public static final int CONSTRUCTOR = -1243130481;

        public ChatEventStickerSetChanged() {
        }

        public ChatEventStickerSetChanged(long var1, long var3) {
            this.oldStickerSetId = var1;
            this.newStickerSetId = var3;
        }

        public int getConstructor() {
            return -1243130481;
        }
    }

    public static class ChatEventSlowModeDelayChanged extends ChatEventAction {
        public int oldSlowModeDelay;
        public int newSlowModeDelay;
        public static final int CONSTRUCTOR = -1653195765;

        public ChatEventSlowModeDelayChanged() {
        }

        public ChatEventSlowModeDelayChanged(int var1, int var2) {
            this.oldSlowModeDelay = var1;
            this.newSlowModeDelay = var2;
        }

        public int getConstructor() {
            return -1653195765;
        }
    }

    public static class ChatEventPhotoChanged extends ChatEventAction {
        public ChatPhoto oldPhoto;
        public ChatPhoto newPhoto;
        public static final int CONSTRUCTOR = -811572541;

        public ChatEventPhotoChanged() {
        }

        public ChatEventPhotoChanged(ChatPhoto var1, ChatPhoto var2) {
            this.oldPhoto = var1;
            this.newPhoto = var2;
        }

        public int getConstructor() {
            return -811572541;
        }
    }

    public static class ChatEventPermissionsChanged extends ChatEventAction {
        public ChatPermissions oldPermissions;
        public ChatPermissions newPermissions;
        public static final int CONSTRUCTOR = -1311557720;

        public ChatEventPermissionsChanged() {
        }

        public ChatEventPermissionsChanged(ChatPermissions var1, ChatPermissions var2) {
            this.oldPermissions = var1;
            this.newPermissions = var2;
        }

        public int getConstructor() {
            return -1311557720;
        }
    }

    public static class ChatEventMessageTtlChanged extends ChatEventAction {
        public int oldMessageTtl;
        public int newMessageTtl;
        public static final int CONSTRUCTOR = 776386995;

        public ChatEventMessageTtlChanged() {
        }

        public ChatEventMessageTtlChanged(int var1, int var2) {
            this.oldMessageTtl = var1;
            this.newMessageTtl = var2;
        }

        public int getConstructor() {
            return 776386995;
        }
    }

    public static class ChatEventLocationChanged extends ChatEventAction {
        public ChatLocation oldLocation;
        public ChatLocation newLocation;
        public static final int CONSTRUCTOR = -405930674;

        public ChatEventLocationChanged() {
        }

        public ChatEventLocationChanged(ChatLocation var1, ChatLocation var2) {
            this.oldLocation = var1;
            this.newLocation = var2;
        }

        public int getConstructor() {
            return -405930674;
        }
    }

    public static class ChatEventLinkedChatChanged extends ChatEventAction {
        public long oldLinkedChatId;
        public long newLinkedChatId;
        public static final int CONSTRUCTOR = 1797419439;

        public ChatEventLinkedChatChanged() {
        }

        public ChatEventLinkedChatChanged(long var1, long var3) {
            this.oldLinkedChatId = var1;
            this.newLinkedChatId = var3;
        }

        public int getConstructor() {
            return 1797419439;
        }
    }

    public static class ChatEventDescriptionChanged extends ChatEventAction {
        public String oldDescription;
        public String newDescription;
        public static final int CONSTRUCTOR = 39112478;

        public ChatEventDescriptionChanged() {
        }

        public ChatEventDescriptionChanged(String var1, String var2) {
            this.oldDescription = var1;
            this.newDescription = var2;
        }

        public int getConstructor() {
            return 39112478;
        }
    }

    public static class ChatEventAvailableReactionsChanged extends ChatEventAction {
        public ChatAvailableReactions oldAvailableReactions;
        public ChatAvailableReactions newAvailableReactions;
        public static final int CONSTRUCTOR = -1749491521;

        public ChatEventAvailableReactionsChanged() {
        }

        public ChatEventAvailableReactionsChanged(ChatAvailableReactions var1, ChatAvailableReactions var2) {
            this.oldAvailableReactions = var1;
            this.newAvailableReactions = var2;
        }

        public int getConstructor() {
            return -1749491521;
        }
    }

    public static class ChatEventMemberRestricted extends ChatEventAction {
        public MessageSender memberId;
        public ChatMemberStatus oldStatus;
        public ChatMemberStatus newStatus;
        public static final int CONSTRUCTOR = 1603608069;

        public ChatEventMemberRestricted() {
        }

        public ChatEventMemberRestricted(MessageSender var1, ChatMemberStatus var2, ChatMemberStatus var3) {
            this.memberId = var1;
            this.oldStatus = var2;
            this.newStatus = var3;
        }

        public int getConstructor() {
            return 1603608069;
        }
    }

    public static class ChatEventMemberPromoted extends ChatEventAction {
        public long userId;
        public ChatMemberStatus oldStatus;
        public ChatMemberStatus newStatus;
        public static final int CONSTRUCTOR = 525297761;

        public ChatEventMemberPromoted() {
        }

        public ChatEventMemberPromoted(long var1, ChatMemberStatus var3, ChatMemberStatus var4) {
            this.userId = var1;
            this.oldStatus = var3;
            this.newStatus = var4;
        }

        public int getConstructor() {
            return 525297761;
        }
    }

    public static class ChatEventMemberLeft extends ChatEventAction {
        public static final int CONSTRUCTOR = -948420593;

        public ChatEventMemberLeft() {
        }

        public int getConstructor() {
            return -948420593;
        }
    }

    public static class ChatEventMemberInvited extends ChatEventAction {
        public long userId;
        public ChatMemberStatus status;
        public static final int CONSTRUCTOR = 953663433;

        public ChatEventMemberInvited() {
        }

        public ChatEventMemberInvited(long var1, ChatMemberStatus var3) {
            this.userId = var1;
            this.status = var3;
        }

        public int getConstructor() {
            return 953663433;
        }
    }

    public static class ChatEventMemberJoinedByRequest extends ChatEventAction {
        public long approverUserId;
        public ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -1647804865;

        public ChatEventMemberJoinedByRequest() {
        }

        public ChatEventMemberJoinedByRequest(long var1, ChatInviteLink var3) {
            this.approverUserId = var1;
            this.inviteLink = var3;
        }

        public int getConstructor() {
            return -1647804865;
        }
    }

    public static class ChatEventMemberJoinedByInviteLink extends ChatEventAction {
        public ChatInviteLink inviteLink;
        public static final int CONSTRUCTOR = -253307459;

        public ChatEventMemberJoinedByInviteLink() {
        }

        public ChatEventMemberJoinedByInviteLink(ChatInviteLink var1) {
            this.inviteLink = var1;
        }

        public int getConstructor() {
            return -253307459;
        }
    }

    public static class ChatEventMemberJoined extends ChatEventAction {
        public static final int CONSTRUCTOR = -235468508;

        public ChatEventMemberJoined() {
        }

        public int getConstructor() {
            return -235468508;
        }
    }

    public static class ChatEventPollStopped extends ChatEventAction {
        public Message message;
        public static final int CONSTRUCTOR = 2009893861;

        public ChatEventPollStopped() {
        }

        public ChatEventPollStopped(Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return 2009893861;
        }
    }

    public static class ChatEventMessageUnpinned extends ChatEventAction {
        public Message message;
        public static final int CONSTRUCTOR = -376161513;

        public ChatEventMessageUnpinned() {
        }

        public ChatEventMessageUnpinned(Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return -376161513;
        }
    }

    public static class ChatEventMessagePinned extends ChatEventAction {
        public Message message;
        public static final int CONSTRUCTOR = 438742298;

        public ChatEventMessagePinned() {
        }

        public ChatEventMessagePinned(Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return 438742298;
        }
    }

    public static class ChatEventMessageDeleted extends ChatEventAction {
        public Message message;
        public static final int CONSTRUCTOR = -892974601;

        public ChatEventMessageDeleted() {
        }

        public ChatEventMessageDeleted(Message var1) {
            this.message = var1;
        }

        public int getConstructor() {
            return -892974601;
        }
    }

    public static class ChatEventMessageEdited extends ChatEventAction {
        public Message oldMessage;
        public Message newMessage;
        public static final int CONSTRUCTOR = -430967304;

        public ChatEventMessageEdited() {
        }

        public ChatEventMessageEdited(Message var1, Message var2) {
            this.oldMessage = var1;
            this.newMessage = var2;
        }

        public int getConstructor() {
            return -430967304;
        }
    }

    public abstract static class ChatEventAction extends Object {
        public ChatEventAction() {
        }
    }

    public static class ChatEvent extends Object {
        public long id;
        public int date;
        public MessageSender memberId;
        public ChatEventAction action;
        public static final int CONSTRUCTOR = -652102704;

        public ChatEvent() {
        }

        public ChatEvent(long var1, int var3, MessageSender var4, ChatEventAction var5) {
            this.id = var1;
            this.date = var3;
            this.memberId = var4;
            this.action = var5;
        }

        public int getConstructor() {
            return -652102704;
        }
    }

    public static class ChatAvailableReactionsSome extends ChatAvailableReactions {
        public ReactionType[] reactions;
        public static final int CONSTRUCTOR = -640810821;

        public ChatAvailableReactionsSome() {
        }

        public ChatAvailableReactionsSome(ReactionType[] var1) {
            this.reactions = var1;
        }

        public int getConstructor() {
            return -640810821;
        }
    }

    public static class ChatAvailableReactionsAll extends ChatAvailableReactions {
        public static final int CONSTRUCTOR = -537887666;

        public ChatAvailableReactionsAll() {
        }

        public int getConstructor() {
            return -537887666;
        }
    }

    public abstract static class ChatAvailableReactions extends Object {
        public ChatAvailableReactions() {
        }
    }

    public static class ChatAdministrators extends Object {
        public ChatAdministrator[] administrators;
        public static final int CONSTRUCTOR = -2126186435;

        public ChatAdministrators() {
        }

        public ChatAdministrators(ChatAdministrator[] var1) {
            this.administrators = var1;
        }

        public int getConstructor() {
            return -2126186435;
        }
    }

    public static class ChatAdministratorRights extends Object {
        public boolean canManageChat;
        public boolean canChangeInfo;
        public boolean canPostMessages;
        public boolean canEditMessages;
        public boolean canDeleteMessages;
        public boolean canInviteUsers;
        public boolean canRestrictMembers;
        public boolean canPinMessages;
        public boolean canPromoteMembers;
        public boolean canManageVideoChats;
        public boolean isAnonymous;
        public static final int CONSTRUCTOR = 1878886718;

        public ChatAdministratorRights() {
        }

        public ChatAdministratorRights(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11) {
            this.canManageChat = var1;
            this.canChangeInfo = var2;
            this.canPostMessages = var3;
            this.canEditMessages = var4;
            this.canDeleteMessages = var5;
            this.canInviteUsers = var6;
            this.canRestrictMembers = var7;
            this.canPinMessages = var8;
            this.canPromoteMembers = var9;
            this.canManageVideoChats = var10;
            this.isAnonymous = var11;
        }

        public int getConstructor() {
            return 1878886718;
        }
    }

    public static class ChatAdministrator extends Object {
        public long userId;
        public String customTitle;
        public boolean isOwner;
        public static final int CONSTRUCTOR = 1920449836;

        public ChatAdministrator() {
        }

        public ChatAdministrator(long var1, String var3, boolean var4) {
            this.userId = var1;
            this.customTitle = var3;
            this.isOwner = var4;
        }

        public int getConstructor() {
            return 1920449836;
        }
    }

    public static class ChatActionBarJoinRequest extends ChatActionBar {
        public String title;
        public boolean isChannel;
        public int requestDate;
        public static final int CONSTRUCTOR = 1037140744;

        public ChatActionBarJoinRequest() {
        }

        public ChatActionBarJoinRequest(String var1, boolean var2, int var3) {
            this.title = var1;
            this.isChannel = var2;
            this.requestDate = var3;
        }

        public int getConstructor() {
            return 1037140744;
        }
    }

    public static class ChatActionBarSharePhoneNumber extends ChatActionBar {
        public static final int CONSTRUCTOR = 35188697;

        public ChatActionBarSharePhoneNumber() {
        }

        public int getConstructor() {
            return 35188697;
        }
    }

    public static class ChatActionBarAddContact extends ChatActionBar {
        public static final int CONSTRUCTOR = -733325295;

        public ChatActionBarAddContact() {
        }

        public int getConstructor() {
            return -733325295;
        }
    }

    public static class ChatActionBarReportAddBlock extends ChatActionBar {
        public boolean canUnarchive;
        public int distance;
        public static final int CONSTRUCTOR = -914150419;

        public ChatActionBarReportAddBlock() {
        }

        public ChatActionBarReportAddBlock(boolean var1, int var2) {
            this.canUnarchive = var1;
            this.distance = var2;
        }

        public int getConstructor() {
            return -914150419;
        }
    }

    public static class ChatActionBarInviteMembers extends ChatActionBar {
        public static final int CONSTRUCTOR = 1985313904;

        public ChatActionBarInviteMembers() {
        }

        public int getConstructor() {
            return 1985313904;
        }
    }

    public static class ChatActionBarReportUnrelatedLocation extends ChatActionBar {
        public static final int CONSTRUCTOR = 758175489;

        public ChatActionBarReportUnrelatedLocation() {
        }

        public int getConstructor() {
            return 758175489;
        }
    }

    public static class ChatActionBarReportSpam extends ChatActionBar {
        public boolean canUnarchive;
        public static final int CONSTRUCTOR = -1312758246;

        public ChatActionBarReportSpam() {
        }

        public ChatActionBarReportSpam(boolean var1) {
            this.canUnarchive = var1;
        }

        public int getConstructor() {
            return -1312758246;
        }
    }

    public abstract static class ChatActionBar extends Object {
        public ChatActionBar() {
        }
    }

    public static class ChatActionCancel extends ChatAction {
        public static final int CONSTRUCTOR = 1160523958;

        public ChatActionCancel() {
        }

        public int getConstructor() {
            return 1160523958;
        }
    }

    public static class ChatActionWatchingAnimations extends ChatAction {
        public String emoji;
        public static final int CONSTRUCTOR = 2052990641;

        public ChatActionWatchingAnimations() {
        }

        public ChatActionWatchingAnimations(String var1) {
            this.emoji = var1;
        }

        public int getConstructor() {
            return 2052990641;
        }
    }

    public static class ChatActionUploadingVideoNote extends ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 1172364918;

        public ChatActionUploadingVideoNote() {
        }

        public ChatActionUploadingVideoNote(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 1172364918;
        }
    }

    public static class ChatActionRecordingVideoNote extends ChatAction {
        public static final int CONSTRUCTOR = 16523393;

        public ChatActionRecordingVideoNote() {
        }

        public int getConstructor() {
            return 16523393;
        }
    }

    public static class ChatActionStartPlayingGame extends ChatAction {
        public static final int CONSTRUCTOR = -865884164;

        public ChatActionStartPlayingGame() {
        }

        public int getConstructor() {
            return -865884164;
        }
    }

    public static class ChatActionChoosingContact extends ChatAction {
        public static final int CONSTRUCTOR = -1222507496;

        public ChatActionChoosingContact() {
        }

        public int getConstructor() {
            return -1222507496;
        }
    }

    public static class ChatActionChoosingLocation extends ChatAction {
        public static final int CONSTRUCTOR = -2017893596;

        public ChatActionChoosingLocation() {
        }

        public int getConstructor() {
            return -2017893596;
        }
    }

    public static class ChatActionChoosingSticker extends ChatAction {
        public static final int CONSTRUCTOR = 372753697;

        public ChatActionChoosingSticker() {
        }

        public int getConstructor() {
            return 372753697;
        }
    }

    public static class ChatActionUploadingDocument extends ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 167884362;

        public ChatActionUploadingDocument() {
        }

        public ChatActionUploadingDocument(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 167884362;
        }
    }

    public static class ChatActionUploadingPhoto extends ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 654240583;

        public ChatActionUploadingPhoto() {
        }

        public ChatActionUploadingPhoto(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 654240583;
        }
    }

    public static class ChatActionUploadingVoiceNote extends ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = -613643666;

        public ChatActionUploadingVoiceNote() {
        }

        public ChatActionUploadingVoiceNote(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return -613643666;
        }
    }

    public static class ChatActionRecordingVoiceNote extends ChatAction {
        public static final int CONSTRUCTOR = -808850058;

        public ChatActionRecordingVoiceNote() {
        }

        public int getConstructor() {
            return -808850058;
        }
    }

    public static class ChatActionUploadingVideo extends ChatAction {
        public int progress;
        public static final int CONSTRUCTOR = 1234185270;

        public ChatActionUploadingVideo() {
        }

        public ChatActionUploadingVideo(int var1) {
            this.progress = var1;
        }

        public int getConstructor() {
            return 1234185270;
        }
    }

    public static class ChatActionRecordingVideo extends ChatAction {
        public static final int CONSTRUCTOR = 216553362;

        public ChatActionRecordingVideo() {
        }

        public int getConstructor() {
            return 216553362;
        }
    }

    public static class ChatActionTyping extends ChatAction {
        public static final int CONSTRUCTOR = 380122167;

        public ChatActionTyping() {
        }

        public int getConstructor() {
            return 380122167;
        }
    }

    public abstract static class ChatAction extends Object {
        public ChatAction() {
        }
    }

    public static class Chat extends Object {
        public long id;
        public ChatType type;
        public String title;
        public ChatPhotoInfo photo;
        public ChatPermissions permissions;
        public Message lastMessage;
        public ChatPosition[] positions;
        public MessageSender messageSenderId;
        public boolean hasProtectedContent;
        public boolean isMarkedAsUnread;
        public boolean isBlocked;
        public boolean hasScheduledMessages;
        public boolean canBeDeletedOnlyForSelf;
        public boolean canBeDeletedForAllUsers;
        public boolean canBeReported;
        public boolean defaultDisableNotification;
        public int unreadCount;
        public long lastReadInboxMessageId;
        public long lastReadOutboxMessageId;
        public int unreadMentionCount;
        public int unreadReactionCount;
        public ChatNotificationSettings notificationSettings;
        public ChatAvailableReactions availableReactions;
        public int messageTtl;
        public String themeName;
        public ChatActionBar actionBar;
        public VideoChat videoChat;
        public ChatJoinRequestsInfo pendingJoinRequests;
        public long replyMarkupMessageId;
        public DraftMessage draftMessage;
        public String clientData;
        public static final int CONSTRUCTOR = -1395697186;

        public Chat() {
        }

        public Chat(long var1, ChatType var3, String var4, ChatPhotoInfo var5, ChatPermissions var6, Message var7, ChatPosition[] var8, MessageSender var9, boolean var10, boolean var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, int var18, long var19, long var21, int var23, int var24, ChatNotificationSettings var25, ChatAvailableReactions var26, int var27, String var28, ChatActionBar var29, VideoChat var30, ChatJoinRequestsInfo var31, long var32, DraftMessage var34, String var35) {
            this.id = var1;
            this.type = var3;
            this.title = var4;
            this.photo = var5;
            this.permissions = var6;
            this.lastMessage = var7;
            this.positions = var8;
            this.messageSenderId = var9;
            this.hasProtectedContent = var10;
            this.isMarkedAsUnread = var11;
            this.isBlocked = var12;
            this.hasScheduledMessages = var13;
            this.canBeDeletedOnlyForSelf = var14;
            this.canBeDeletedForAllUsers = var15;
            this.canBeReported = var16;
            this.defaultDisableNotification = var17;
            this.unreadCount = var18;
            this.lastReadInboxMessageId = var19;
            this.lastReadOutboxMessageId = var21;
            this.unreadMentionCount = var23;
            this.unreadReactionCount = var24;
            this.notificationSettings = var25;
            this.availableReactions = var26;
            this.messageTtl = var27;
            this.themeName = var28;
            this.actionBar = var29;
            this.videoChat = var30;
            this.pendingJoinRequests = var31;
            this.replyMarkupMessageId = var32;
            this.draftMessage = var34;
            this.clientData = var35;
        }

        public int getConstructor() {
            return -1395697186;
        }
    }

    public static class CanTransferOwnershipResultSessionTooFresh extends CanTransferOwnershipResult {
        public int retryAfter;
        public static final int CONSTRUCTOR = 984664289;

        public CanTransferOwnershipResultSessionTooFresh() {
        }

        public CanTransferOwnershipResultSessionTooFresh(int var1) {
            this.retryAfter = var1;
        }

        public int getConstructor() {
            return 984664289;
        }
    }

    public static class CanTransferOwnershipResultPasswordTooFresh extends CanTransferOwnershipResult {
        public int retryAfter;
        public static final int CONSTRUCTOR = 811440913;

        public CanTransferOwnershipResultPasswordTooFresh() {
        }

        public CanTransferOwnershipResultPasswordTooFresh(int var1) {
            this.retryAfter = var1;
        }

        public int getConstructor() {
            return 811440913;
        }
    }

    public static class CanTransferOwnershipResultPasswordNeeded extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = 1548372703;

        public CanTransferOwnershipResultPasswordNeeded() {
        }

        public int getConstructor() {
            return 1548372703;
        }
    }

    public static class CanTransferOwnershipResultOk extends CanTransferOwnershipResult {
        public static final int CONSTRUCTOR = -89881021;

        public CanTransferOwnershipResultOk() {
        }

        public int getConstructor() {
            return -89881021;
        }
    }

    public abstract static class CanTransferOwnershipResult extends Object {
        public CanTransferOwnershipResult() {
        }
    }

    public static class CallbackQueryPayloadGame extends CallbackQueryPayload {
        public String gameShortName;
        public static final int CONSTRUCTOR = 1303571512;

        public CallbackQueryPayloadGame() {
        }

        public CallbackQueryPayloadGame(String var1) {
            this.gameShortName = var1;
        }

        public int getConstructor() {
            return 1303571512;
        }
    }

    public static class CallbackQueryPayloadDataWithPassword extends CallbackQueryPayload {
        public String password;
        public byte[] data;
        public static final int CONSTRUCTOR = 1340266738;

        public CallbackQueryPayloadDataWithPassword() {
        }

        public CallbackQueryPayloadDataWithPassword(String var1, byte[] var2) {
            this.password = var1;
            this.data = var2;
        }

        public int getConstructor() {
            return 1340266738;
        }
    }

    public static class CallbackQueryPayloadData extends CallbackQueryPayload {
        public byte[] data;
        public static final int CONSTRUCTOR = -1977729946;

        public CallbackQueryPayloadData() {
        }

        public CallbackQueryPayloadData(byte[] var1) {
            this.data = var1;
        }

        public int getConstructor() {
            return -1977729946;
        }
    }

    public abstract static class CallbackQueryPayload extends Object {
        public CallbackQueryPayload() {
        }
    }

    public static class CallbackQueryAnswer extends Object {
        public String text;
        public boolean showAlert;
        public String url;
        public static final int CONSTRUCTOR = 360867933;

        public CallbackQueryAnswer() {
        }

        public CallbackQueryAnswer(String var1, boolean var2, String var3) {
            this.text = var1;
            this.showAlert = var2;
            this.url = var3;
        }

        public int getConstructor() {
            return 360867933;
        }
    }

    public static class CallStateError extends CallState {
        public Error error;
        public static final int CONSTRUCTOR = -975215467;

        public CallStateError() {
        }

        public CallStateError(Error var1) {
            this.error = var1;
        }

        public int getConstructor() {
            return -975215467;
        }
    }

    public static class CallStateDiscarded extends CallState {
        public CallDiscardReason reason;
        public boolean needRating;
        public boolean needDebugInformation;
        public boolean needLog;
        public static final int CONSTRUCTOR = 1394310213;

        public CallStateDiscarded() {
        }

        public CallStateDiscarded(CallDiscardReason var1, boolean var2, boolean var3, boolean var4) {
            this.reason = var1;
            this.needRating = var2;
            this.needDebugInformation = var3;
            this.needLog = var4;
        }

        public int getConstructor() {
            return 1394310213;
        }
    }

    public static class CallStateHangingUp extends CallState {
        public static final int CONSTRUCTOR = -2133790038;

        public CallStateHangingUp() {
        }

        public int getConstructor() {
            return -2133790038;
        }
    }

    public static class CallStateReady extends CallState {
        public CallProtocol protocol;
        public CallServer[] servers;
        public String config;
        public byte[] encryptionKey;
        public String[] emojis;
        public boolean allowP2p;
        public static final int CONSTRUCTOR = -2000107571;

        public CallStateReady() {
        }

        public CallStateReady(CallProtocol var1, CallServer[] var2, String var3, byte[] var4, String[] var5, boolean var6) {
            this.protocol = var1;
            this.servers = var2;
            this.config = var3;
            this.encryptionKey = var4;
            this.emojis = var5;
            this.allowP2p = var6;
        }

        public int getConstructor() {
            return -2000107571;
        }
    }

    public static class CallStateExchangingKeys extends CallState {
        public static final int CONSTRUCTOR = -1848149403;

        public CallStateExchangingKeys() {
        }

        public int getConstructor() {
            return -1848149403;
        }
    }

    public static class CallStatePending extends CallState {
        public boolean isCreated;
        public boolean isReceived;
        public static final int CONSTRUCTOR = 1073048620;

        public CallStatePending() {
        }

        public CallStatePending(boolean var1, boolean var2) {
            this.isCreated = var1;
            this.isReceived = var2;
        }

        public int getConstructor() {
            return 1073048620;
        }
    }

    public abstract static class CallState extends Object {
        public CallState() {
        }
    }

    public static class CallServerTypeWebrtc extends CallServerType {
        public String username;
        public String password;
        public boolean supportsTurn;
        public boolean supportsStun;
        public static final int CONSTRUCTOR = 1250622821;

        public CallServerTypeWebrtc() {
        }

        public CallServerTypeWebrtc(String var1, String var2, boolean var3, boolean var4) {
            this.username = var1;
            this.password = var2;
            this.supportsTurn = var3;
            this.supportsStun = var4;
        }

        public int getConstructor() {
            return 1250622821;
        }
    }

    public static class CallServerTypeTelegramReflector extends CallServerType {
        public byte[] peerTag;
        public boolean isTcp;
        public static final int CONSTRUCTOR = 850343189;

        public CallServerTypeTelegramReflector() {
        }

        public CallServerTypeTelegramReflector(byte[] var1, boolean var2) {
            this.peerTag = var1;
            this.isTcp = var2;
        }

        public int getConstructor() {
            return 850343189;
        }
    }

    public abstract static class CallServerType extends Object {
        public CallServerType() {
        }
    }

    public static class CallServer extends Object {
        public long id;
        public String ipAddress;
        public String ipv6Address;
        public int port;
        public CallServerType type;
        public static final int CONSTRUCTOR = 1865932695;

        public CallServer() {
        }

        public CallServer(long var1, String var3, String var4, int var5, CallServerType var6) {
            this.id = var1;
            this.ipAddress = var3;
            this.ipv6Address = var4;
            this.port = var5;
            this.type = var6;
        }

        public int getConstructor() {
            return 1865932695;
        }
    }

    public static class CallProtocol extends Object {
        public boolean udpP2p;
        public boolean udpReflector;
        public int minLayer;
        public int maxLayer;
        public String[] libraryVersions;
        public static final int CONSTRUCTOR = -1075562897;

        public CallProtocol() {
        }

        public CallProtocol(boolean var1, boolean var2, int var3, int var4, String[] var5) {
            this.udpP2p = var1;
            this.udpReflector = var2;
            this.minLayer = var3;
            this.maxLayer = var4;
            this.libraryVersions = var5;
        }

        public int getConstructor() {
            return -1075562897;
        }
    }

    public static class CallProblemPixelatedVideo extends CallProblem {
        public static final int CONSTRUCTOR = 2115315411;

        public CallProblemPixelatedVideo() {
        }

        public int getConstructor() {
            return 2115315411;
        }
    }

    public static class CallProblemDistortedVideo extends CallProblem {
        public static final int CONSTRUCTOR = 385245706;

        public CallProblemDistortedVideo() {
        }

        public int getConstructor() {
            return 385245706;
        }
    }

    public static class CallProblemDropped extends CallProblem {
        public static final int CONSTRUCTOR = -1207311487;

        public CallProblemDropped() {
        }

        public int getConstructor() {
            return -1207311487;
        }
    }

    public static class CallProblemSilentRemote extends CallProblem {
        public static final int CONSTRUCTOR = 573634714;

        public CallProblemSilentRemote() {
        }

        public int getConstructor() {
            return 573634714;
        }
    }

    public static class CallProblemSilentLocal extends CallProblem {
        public static final int CONSTRUCTOR = 253652790;

        public CallProblemSilentLocal() {
        }

        public int getConstructor() {
            return 253652790;
        }
    }

    public static class CallProblemDistortedSpeech extends CallProblem {
        public static final int CONSTRUCTOR = 379960581;

        public CallProblemDistortedSpeech() {
        }

        public int getConstructor() {
            return 379960581;
        }
    }

    public static class CallProblemInterruptions extends CallProblem {
        public static final int CONSTRUCTOR = 1119493218;

        public CallProblemInterruptions() {
        }

        public int getConstructor() {
            return 1119493218;
        }
    }

    public static class CallProblemNoise extends CallProblem {
        public static final int CONSTRUCTOR = 1053065359;

        public CallProblemNoise() {
        }

        public int getConstructor() {
            return 1053065359;
        }
    }

    public static class CallProblemEcho extends CallProblem {
        public static final int CONSTRUCTOR = 801116548;

        public CallProblemEcho() {
        }

        public int getConstructor() {
            return 801116548;
        }
    }

    public abstract static class CallProblem extends Object {
        public CallProblem() {
        }
    }

    public static class CallId extends Object {
        public int id;
        public static final int CONSTRUCTOR = 65717769;

        public CallId() {
        }

        public CallId(int var1) {
            this.id = var1;
        }

        public int getConstructor() {
            return 65717769;
        }
    }

    public static class CallDiscardReasonHungUp extends CallDiscardReason {
        public static final int CONSTRUCTOR = 438216166;

        public CallDiscardReasonHungUp() {
        }

        public int getConstructor() {
            return 438216166;
        }
    }

    public static class CallDiscardReasonDisconnected extends CallDiscardReason {
        public static final int CONSTRUCTOR = -1342872670;

        public CallDiscardReasonDisconnected() {
        }

        public int getConstructor() {
            return -1342872670;
        }
    }

    public static class CallDiscardReasonDeclined extends CallDiscardReason {
        public static final int CONSTRUCTOR = -1729926094;

        public CallDiscardReasonDeclined() {
        }

        public int getConstructor() {
            return -1729926094;
        }
    }

    public static class CallDiscardReasonMissed extends CallDiscardReason {
        public static final int CONSTRUCTOR = 1680358012;

        public CallDiscardReasonMissed() {
        }

        public int getConstructor() {
            return 1680358012;
        }
    }

    public static class CallDiscardReasonEmpty extends CallDiscardReason {
        public static final int CONSTRUCTOR = -1258917949;

        public CallDiscardReasonEmpty() {
        }

        public int getConstructor() {
            return -1258917949;
        }
    }

    public abstract static class CallDiscardReason extends Object {
        public CallDiscardReason() {
        }
    }

    public static class Call extends Object {
        public int id;
        public long userId;
        public boolean isOutgoing;
        public boolean isVideo;
        public CallState state;
        public static final int CONSTRUCTOR = 920360804;

        public Call() {
        }

        public Call(int var1, long var2, boolean var4, boolean var5, CallState var6) {
            this.id = var1;
            this.userId = var2;
            this.isOutgoing = var4;
            this.isVideo = var5;
            this.state = var6;
        }

        public int getConstructor() {
            return 920360804;
        }
    }

    public static class BotMenuButton extends Object {
        public String text;
        public String url;
        public static final int CONSTRUCTOR = -944407322;

        public BotMenuButton() {
        }

        public BotMenuButton(String var1, String var2) {
            this.text = var1;
            this.url = var2;
        }

        public int getConstructor() {
            return -944407322;
        }
    }

    public static class BotInfo extends Object {
        public String shareText;
        public String description;
        public Photo photo;
        public Animation animation;
        public BotMenuButton menuButton;
        public BotCommand[] commands;
        public ChatAdministratorRights defaultGroupAdministratorRights;
        public ChatAdministratorRights defaultChannelAdministratorRights;
        public static final int CONSTRUCTOR = 429675178;

        public BotInfo() {
        }

        public BotInfo(String var1, String var2, Photo var3, Animation var4, BotMenuButton var5, BotCommand[] var6, ChatAdministratorRights var7, ChatAdministratorRights var8) {
            this.shareText = var1;
            this.description = var2;
            this.photo = var3;
            this.animation = var4;
            this.menuButton = var5;
            this.commands = var6;
            this.defaultGroupAdministratorRights = var7;
            this.defaultChannelAdministratorRights = var8;
        }

        public int getConstructor() {
            return 429675178;
        }
    }

    public static class BotCommands extends Object {
        public long botUserId;
        public BotCommand[] commands;
        public static final int CONSTRUCTOR = 1741364468;

        public BotCommands() {
        }

        public BotCommands(long var1, BotCommand[] var3) {
            this.botUserId = var1;
            this.commands = var3;
        }

        public int getConstructor() {
            return 1741364468;
        }
    }

    public static class BotCommandScopeChatMember extends BotCommandScope {
        public long chatId;
        public long userId;
        public static final int CONSTRUCTOR = -211380494;

        public BotCommandScopeChatMember() {
        }

        public BotCommandScopeChatMember(long var1, long var3) {
            this.chatId = var1;
            this.userId = var3;
        }

        public int getConstructor() {
            return -211380494;
        }
    }

    public static class BotCommandScopeChatAdministrators extends BotCommandScope {
        public long chatId;
        public static final int CONSTRUCTOR = 1119682126;

        public BotCommandScopeChatAdministrators() {
        }

        public BotCommandScopeChatAdministrators(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return 1119682126;
        }
    }

    public static class BotCommandScopeChat extends BotCommandScope {
        public long chatId;
        public static final int CONSTRUCTOR = -430234971;

        public BotCommandScopeChat() {
        }

        public BotCommandScopeChat(long var1) {
            this.chatId = var1;
        }

        public int getConstructor() {
            return -430234971;
        }
    }

    public static class BotCommandScopeAllChatAdministrators extends BotCommandScope {
        public static final int CONSTRUCTOR = 1998329169;

        public BotCommandScopeAllChatAdministrators() {
        }

        public int getConstructor() {
            return 1998329169;
        }
    }

    public static class BotCommandScopeAllGroupChats extends BotCommandScope {
        public static final int CONSTRUCTOR = -981088162;

        public BotCommandScopeAllGroupChats() {
        }

        public int getConstructor() {
            return -981088162;
        }
    }

    public static class BotCommandScopeAllPrivateChats extends BotCommandScope {
        public static final int CONSTRUCTOR = -344889543;

        public BotCommandScopeAllPrivateChats() {
        }

        public int getConstructor() {
            return -344889543;
        }
    }

    public static class BotCommandScopeDefault extends BotCommandScope {
        public static final int CONSTRUCTOR = 795652779;

        public BotCommandScopeDefault() {
        }

        public int getConstructor() {
            return 795652779;
        }
    }

    public abstract static class BotCommandScope extends Object {
        public BotCommandScope() {
        }
    }

    public static class BotCommand extends Object {
        public String command;
        public String description;
        public static final int CONSTRUCTOR = -1032140601;

        public BotCommand() {
        }

        public BotCommand(String var1, String var2) {
            this.command = var1;
            this.description = var2;
        }

        public int getConstructor() {
            return -1032140601;
        }
    }

    public static class BasicGroupFullInfo extends Object {
        public ChatPhoto photo;
        public String description;
        public long creatorUserId;
        public ChatMember[] members;
        public ChatInviteLink inviteLink;
        public BotCommands[] botCommands;
        public static final int CONSTRUCTOR = 2022233397;

        public BasicGroupFullInfo() {
        }

        public BasicGroupFullInfo(ChatPhoto var1, String var2, long var3, ChatMember[] var5, ChatInviteLink var6, BotCommands[] var7) {
            this.photo = var1;
            this.description = var2;
            this.creatorUserId = var3;
            this.members = var5;
            this.inviteLink = var6;
            this.botCommands = var7;
        }

        public int getConstructor() {
            return 2022233397;
        }
    }

    public static class BasicGroup extends Object {
        public long id;
        public int memberCount;
        public ChatMemberStatus status;
        public boolean isActive;
        public long upgradedToSupergroupId;
        public static final int CONSTRUCTOR = -194767217;

        public BasicGroup() {
        }

        public BasicGroup(long var1, int var3, ChatMemberStatus var4, boolean var5, long var6) {
            this.id = var1;
            this.memberCount = var3;
            this.status = var4;
            this.isActive = var5;
            this.upgradedToSupergroupId = var6;
        }

        public int getConstructor() {
            return -194767217;
        }
    }

    public static class BankCardInfo extends Object {
        public String title;
        public BankCardActionOpenUrl[] actions;
        public static final int CONSTRUCTOR = -2116647730;

        public BankCardInfo() {
        }

        public BankCardInfo(String var1, BankCardActionOpenUrl[] var2) {
            this.title = var1;
            this.actions = var2;
        }

        public int getConstructor() {
            return -2116647730;
        }
    }

    public static class BankCardActionOpenUrl extends Object {
        public String text;
        public String url;
        public static final int CONSTRUCTOR = -196454267;

        public BankCardActionOpenUrl() {
        }

        public BankCardActionOpenUrl(String var1, String var2) {
            this.text = var1;
            this.url = var2;
        }

        public int getConstructor() {
            return -196454267;
        }
    }

    public static class Backgrounds extends Object {
        public Background[] backgrounds;
        public static final int CONSTRUCTOR = 724728704;

        public Backgrounds() {
        }

        public Backgrounds(Background[] var1) {
            this.backgrounds = var1;
        }

        public int getConstructor() {
            return 724728704;
        }
    }

    public static class BackgroundTypeFill extends BackgroundType {
        public BackgroundFill fill;
        public static final int CONSTRUCTOR = 993008684;

        public BackgroundTypeFill() {
        }

        public BackgroundTypeFill(BackgroundFill var1) {
            this.fill = var1;
        }

        public int getConstructor() {
            return 993008684;
        }
    }

    public static class BackgroundTypePattern extends BackgroundType {
        public BackgroundFill fill;
        public int intensity;
        public boolean isInverted;
        public boolean isMoving;
        public static final int CONSTRUCTOR = 1290213117;

        public BackgroundTypePattern() {
        }

        public BackgroundTypePattern(BackgroundFill var1, int var2, boolean var3, boolean var4) {
            this.fill = var1;
            this.intensity = var2;
            this.isInverted = var3;
            this.isMoving = var4;
        }

        public int getConstructor() {
            return 1290213117;
        }
    }

    public static class BackgroundTypeWallpaper extends BackgroundType {
        public boolean isBlurred;
        public boolean isMoving;
        public static final int CONSTRUCTOR = 1972128891;

        public BackgroundTypeWallpaper() {
        }

        public BackgroundTypeWallpaper(boolean var1, boolean var2) {
            this.isBlurred = var1;
            this.isMoving = var2;
        }

        public int getConstructor() {
            return 1972128891;
        }
    }

    public abstract static class BackgroundType extends Object {
        public BackgroundType() {
        }
    }

    public static class BackgroundFillFreeformGradient extends BackgroundFill {
        public int[] colors;
        public static final int CONSTRUCTOR = -1145469255;

        public BackgroundFillFreeformGradient() {
        }

        public BackgroundFillFreeformGradient(int[] var1) {
            this.colors = var1;
        }

        public int getConstructor() {
            return -1145469255;
        }
    }

    public static class BackgroundFillGradient extends BackgroundFill {
        public int topColor;
        public int bottomColor;
        public int rotationAngle;
        public static final int CONSTRUCTOR = -1839206017;

        public BackgroundFillGradient() {
        }

        public BackgroundFillGradient(int var1, int var2, int var3) {
            this.topColor = var1;
            this.bottomColor = var2;
            this.rotationAngle = var3;
        }

        public int getConstructor() {
            return -1839206017;
        }
    }

    public static class BackgroundFillSolid extends BackgroundFill {
        public int color;
        public static final int CONSTRUCTOR = 1010678813;

        public BackgroundFillSolid() {
        }

        public BackgroundFillSolid(int var1) {
            this.color = var1;
        }

        public int getConstructor() {
            return 1010678813;
        }
    }

    public abstract static class BackgroundFill extends Object {
        public BackgroundFill() {
        }
    }

    public static class Background extends Object {
        public long id;
        public boolean isDefault;
        public boolean isDark;
        public String name;
        public Document document;
        public BackgroundType type;
        public static final int CONSTRUCTOR = -429971172;

        public Background() {
        }

        public Background(long var1, boolean var3, boolean var4, String var5, Document var6, BackgroundType var7) {
            this.id = var1;
            this.isDefault = var3;
            this.isDark = var4;
            this.name = var5;
            this.document = var6;
            this.type = var7;
        }

        public int getConstructor() {
            return -429971172;
        }
    }

    public static class AvailableReactions extends Object {
        public AvailableReaction[] topReactions;
        public AvailableReaction[] recentReactions;
        public AvailableReaction[] popularReactions;
        public boolean allowCustomEmoji;
        public static final int CONSTRUCTOR = 1995943616;

        public AvailableReactions() {
        }

        public AvailableReactions(AvailableReaction[] var1, AvailableReaction[] var2, AvailableReaction[] var3, boolean var4) {
            this.topReactions = var1;
            this.recentReactions = var2;
            this.popularReactions = var3;
            this.allowCustomEmoji = var4;
        }

        public int getConstructor() {
            return 1995943616;
        }
    }

    public static class AvailableReaction extends Object {
        public ReactionType type;
        public boolean needsPremium;
        public static final int CONSTRUCTOR = -117292153;

        public AvailableReaction() {
        }

        public AvailableReaction(ReactionType var1, boolean var2) {
            this.type = var1;
            this.needsPremium = var2;
        }

        public int getConstructor() {
            return -117292153;
        }
    }

    public static class AutoDownloadSettingsPresets extends Object {
        public AutoDownloadSettings low;
        public AutoDownloadSettings medium;
        public AutoDownloadSettings high;
        public static final int CONSTRUCTOR = -782099166;

        public AutoDownloadSettingsPresets() {
        }

        public AutoDownloadSettingsPresets(AutoDownloadSettings var1, AutoDownloadSettings var2, AutoDownloadSettings var3) {
            this.low = var1;
            this.medium = var2;
            this.high = var3;
        }

        public int getConstructor() {
            return -782099166;
        }
    }

    public static class AutoDownloadSettings extends Object {
        public boolean isAutoDownloadEnabled;
        public int maxPhotoFileSize;
        public long maxVideoFileSize;
        public long maxOtherFileSize;
        public int videoUploadBitrate;
        public boolean preloadLargeVideos;
        public boolean preloadNextAudio;
        public boolean useLessDataForCalls;
        public static final int CONSTRUCTOR = -813805749;

        public AutoDownloadSettings() {
        }

        public AutoDownloadSettings(boolean var1, int var2, long var3, long var5, int var7, boolean var8, boolean var9, boolean var10) {
            this.isAutoDownloadEnabled = var1;
            this.maxPhotoFileSize = var2;
            this.maxVideoFileSize = var3;
            this.maxOtherFileSize = var5;
            this.videoUploadBitrate = var7;
            this.preloadLargeVideos = var8;
            this.preloadNextAudio = var9;
            this.useLessDataForCalls = var10;
        }

        public int getConstructor() {
            return -813805749;
        }
    }

    public static class AuthorizationStateClosed extends AuthorizationState {
        public static final int CONSTRUCTOR = 1526047584;

        public AuthorizationStateClosed() {
        }

        public int getConstructor() {
            return 1526047584;
        }
    }

    public static class AuthorizationStateClosing extends AuthorizationState {
        public static final int CONSTRUCTOR = 445855311;

        public AuthorizationStateClosing() {
        }

        public int getConstructor() {
            return 445855311;
        }
    }

    public static class AuthorizationStateLoggingOut extends AuthorizationState {
        public static final int CONSTRUCTOR = 154449270;

        public AuthorizationStateLoggingOut() {
        }

        public int getConstructor() {
            return 154449270;
        }
    }

    public static class AuthorizationStateReady extends AuthorizationState {
        public static final int CONSTRUCTOR = -1834871737;

        public AuthorizationStateReady() {
        }

        public int getConstructor() {
            return -1834871737;
        }
    }

    public static class AuthorizationStateWaitPassword extends AuthorizationState {
        public String passwordHint;
        public boolean hasRecoveryEmailAddress;
        public String recoveryEmailAddressPattern;
        public static final int CONSTRUCTOR = 187548796;

        public AuthorizationStateWaitPassword() {
        }

        public AuthorizationStateWaitPassword(String var1, boolean var2, String var3) {
            this.passwordHint = var1;
            this.hasRecoveryEmailAddress = var2;
            this.recoveryEmailAddressPattern = var3;
        }

        public int getConstructor() {
            return 187548796;
        }
    }

    public static class AuthorizationStateWaitRegistration extends AuthorizationState {
        public TermsOfService termsOfService;
        public static final int CONSTRUCTOR = 550350511;

        public AuthorizationStateWaitRegistration() {
        }

        public AuthorizationStateWaitRegistration(TermsOfService var1) {
            this.termsOfService = var1;
        }

        public int getConstructor() {
            return 550350511;
        }
    }

    public static class AuthorizationStateWaitOtherDeviceConfirmation extends AuthorizationState {
        public String link;
        public static final int CONSTRUCTOR = 860166378;

        public AuthorizationStateWaitOtherDeviceConfirmation() {
        }

        public AuthorizationStateWaitOtherDeviceConfirmation(String var1) {
            this.link = var1;
        }

        public int getConstructor() {
            return 860166378;
        }
    }

    public static class AuthorizationStateWaitCode extends AuthorizationState {
        public AuthenticationCodeInfo codeInfo;
        public static final int CONSTRUCTOR = 52643073;

        public AuthorizationStateWaitCode() {
        }

        public AuthorizationStateWaitCode(AuthenticationCodeInfo var1) {
            this.codeInfo = var1;
        }

        public int getConstructor() {
            return 52643073;
        }
    }

    public static class AuthorizationStateWaitEmailCode extends AuthorizationState {
        public boolean allowAppleId;
        public boolean allowGoogleId;
        public EmailAddressAuthenticationCodeInfo codeInfo;
        public int nextPhoneNumberAuthorizationDate;
        public static final int CONSTRUCTOR = 174262505;

        public AuthorizationStateWaitEmailCode() {
        }

        public AuthorizationStateWaitEmailCode(boolean var1, boolean var2, EmailAddressAuthenticationCodeInfo var3, int var4) {
            this.allowAppleId = var1;
            this.allowGoogleId = var2;
            this.codeInfo = var3;
            this.nextPhoneNumberAuthorizationDate = var4;
        }

        public int getConstructor() {
            return 174262505;
        }
    }

    public static class AuthorizationStateWaitEmailAddress extends AuthorizationState {
        public boolean allowAppleId;
        public boolean allowGoogleId;
        public static final int CONSTRUCTOR = 1040478663;

        public AuthorizationStateWaitEmailAddress() {
        }

        public AuthorizationStateWaitEmailAddress(boolean var1, boolean var2) {
            this.allowAppleId = var1;
            this.allowGoogleId = var2;
        }

        public int getConstructor() {
            return 1040478663;
        }
    }

    public static class AuthorizationStateWaitPhoneNumber extends AuthorizationState {
        public static final int CONSTRUCTOR = 306402531;

        public AuthorizationStateWaitPhoneNumber() {
        }

        public int getConstructor() {
            return 306402531;
        }
    }

    public static class AuthorizationStateWaitTdlibParameters extends AuthorizationState {
        public static final int CONSTRUCTOR = 904720988;

        public AuthorizationStateWaitTdlibParameters() {
        }

        public int getConstructor() {
            return 904720988;
        }
    }

    public abstract static class AuthorizationState extends Object {
        public AuthorizationState() {
        }
    }

    public static class AuthenticationCodeTypeMissedCall extends AuthenticationCodeType {
        public String phoneNumberPrefix;
        public int length;
        public static final int CONSTRUCTOR = 700123783;

        public AuthenticationCodeTypeMissedCall() {
        }

        public AuthenticationCodeTypeMissedCall(String var1, int var2) {
            this.phoneNumberPrefix = var1;
            this.length = var2;
        }

        public int getConstructor() {
            return 700123783;
        }
    }

    public static class AuthenticationCodeTypeFlashCall extends AuthenticationCodeType {
        public String pattern;
        public static final int CONSTRUCTOR = 1395882402;

        public AuthenticationCodeTypeFlashCall() {
        }

        public AuthenticationCodeTypeFlashCall(String var1) {
            this.pattern = var1;
        }

        public int getConstructor() {
            return 1395882402;
        }
    }

    public static class AuthenticationCodeTypeCall extends AuthenticationCodeType {
        public int length;
        public static final int CONSTRUCTOR = 1636265063;

        public AuthenticationCodeTypeCall() {
        }

        public AuthenticationCodeTypeCall(int var1) {
            this.length = var1;
        }

        public int getConstructor() {
            return 1636265063;
        }
    }

    public static class AuthenticationCodeTypeSms extends AuthenticationCodeType {
        public int length;
        public static final int CONSTRUCTOR = 962650760;

        public AuthenticationCodeTypeSms() {
        }

        public AuthenticationCodeTypeSms(int var1) {
            this.length = var1;
        }

        public int getConstructor() {
            return 962650760;
        }
    }

    public static class AuthenticationCodeTypeTelegramMessage extends AuthenticationCodeType {
        public int length;
        public static final int CONSTRUCTOR = 2079628074;

        public AuthenticationCodeTypeTelegramMessage() {
        }

        public AuthenticationCodeTypeTelegramMessage(int var1) {
            this.length = var1;
        }

        public int getConstructor() {
            return 2079628074;
        }
    }

    public abstract static class AuthenticationCodeType extends Object {
        public AuthenticationCodeType() {
        }
    }

    public static class AuthenticationCodeInfo extends Object {
        public String phoneNumber;
        public AuthenticationCodeType type;
        public AuthenticationCodeType nextType;
        public int timeout;
        public static final int CONSTRUCTOR = -860345416;

        public AuthenticationCodeInfo() {
        }

        public AuthenticationCodeInfo(String var1, AuthenticationCodeType var2, AuthenticationCodeType var3, int var4) {
            this.phoneNumber = var1;
            this.type = var2;
            this.nextType = var3;
            this.timeout = var4;
        }

        public int getConstructor() {
            return -860345416;
        }
    }

    public static class Audio extends Object {
        public int duration;
        public String title;
        public String performer;
        public String fileName;
        public String mimeType;
        public Minithumbnail albumCoverMinithumbnail;
        public Thumbnail albumCoverThumbnail;
        public Thumbnail[] externalAlbumCovers;
        public File audio;
        public static final int CONSTRUCTOR = -166398841;

        public Audio() {
        }

        public Audio(int var1, String var2, String var3, String var4, String var5, Minithumbnail var6, Thumbnail var7, Thumbnail[] var8, File var9) {
            this.duration = var1;
            this.title = var2;
            this.performer = var3;
            this.fileName = var4;
            this.mimeType = var5;
            this.albumCoverMinithumbnail = var6;
            this.albumCoverThumbnail = var7;
            this.externalAlbumCovers = var8;
            this.audio = var9;
        }

        public int getConstructor() {
            return -166398841;
        }
    }

    public static class AttachmentMenuBotColor extends Object {
        public int lightColor;
        public int darkColor;
        public static final int CONSTRUCTOR = 1680039612;

        public AttachmentMenuBotColor() {
        }

        public AttachmentMenuBotColor(int var1, int var2) {
            this.lightColor = var1;
            this.darkColor = var2;
        }

        public int getConstructor() {
            return 1680039612;
        }
    }

    public static class AttachmentMenuBot extends Object {
        public long botUserId;
        public boolean supportsSelfChat;
        public boolean supportsUserChats;
        public boolean supportsBotChats;
        public boolean supportsGroupChats;
        public boolean supportsChannelChats;
        public boolean supportsSettings;
        public String name;
        public AttachmentMenuBotColor nameColor;
        public File defaultIcon;
        public File iosStaticIcon;
        public File iosAnimatedIcon;
        public File androidIcon;
        public File macosIcon;
        public AttachmentMenuBotColor iconColor;
        public File webAppPlaceholder;
        public static final int CONSTRUCTOR = -1566056904;

        public AttachmentMenuBot() {
        }

        public AttachmentMenuBot(long var1, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, String var9, AttachmentMenuBotColor var10, File var11, File var12, File var13, File var14, File var15, AttachmentMenuBotColor var16, File var17) {
            this.botUserId = var1;
            this.supportsSelfChat = var3;
            this.supportsUserChats = var4;
            this.supportsBotChats = var5;
            this.supportsGroupChats = var6;
            this.supportsChannelChats = var7;
            this.supportsSettings = var8;
            this.name = var9;
            this.nameColor = var10;
            this.defaultIcon = var11;
            this.iosStaticIcon = var12;
            this.iosAnimatedIcon = var13;
            this.androidIcon = var14;
            this.macosIcon = var15;
            this.iconColor = var16;
            this.webAppPlaceholder = var17;
        }

        public int getConstructor() {
            return -1566056904;
        }
    }

    public static class Animations extends Object {
        public Animation[] animations;
        public static final int CONSTRUCTOR = 344216945;

        public Animations() {
        }

        public Animations(Animation[] var1) {
            this.animations = var1;
        }

        public int getConstructor() {
            return 344216945;
        }
    }

    public static class Animation extends Object {
        public int duration;
        public int width;
        public int height;
        public String fileName;
        public String mimeType;
        public boolean hasStickers;
        public Minithumbnail minithumbnail;
        public Thumbnail thumbnail;
        public File animation;
        public static final int CONSTRUCTOR = -872359106;

        public Animation() {
        }

        public Animation(int var1, int var2, int var3, String var4, String var5, boolean var6, Minithumbnail var7, Thumbnail var8, File var9) {
            this.duration = var1;
            this.width = var2;
            this.height = var3;
            this.fileName = var4;
            this.mimeType = var5;
            this.hasStickers = var6;
            this.minithumbnail = var7;
            this.thumbnail = var8;
            this.animation = var9;
        }

        public int getConstructor() {
            return -872359106;
        }
    }

    public static class AnimatedEmoji extends Object {
        public Sticker sticker;
        public int fitzpatrickType;
        public File sound;
        public static final int CONSTRUCTOR = -1816658231;

        public AnimatedEmoji() {
        }

        public AnimatedEmoji(Sticker var1, int var2, File var3) {
            this.sticker = var1;
            this.fitzpatrickType = var2;
            this.sound = var3;
        }

        public int getConstructor() {
            return -1816658231;
        }
    }

    public static class AnimatedChatPhoto extends Object {
        public int length;
        public File file;
        public double mainFrameTimestamp;
        public static final int CONSTRUCTOR = 191994926;

        public AnimatedChatPhoto() {
        }

        public AnimatedChatPhoto(int var1, File var2, double var3) {
            this.length = var1;
            this.file = var2;
            this.mainFrameTimestamp = var3;
        }

        public int getConstructor() {
            return 191994926;
        }
    }

    public static class Address extends Object {
        public String countryCode;
        public String state;
        public String city;
        public String streetLine1;
        public String streetLine2;
        public String postalCode;
        public static final int CONSTRUCTOR = -2043654342;

        public Address() {
        }

        public Address(String var1, String var2, String var3, String var4, String var5, String var6) {
            this.countryCode = var1;
            this.state = var2;
            this.city = var3;
            this.streetLine1 = var4;
            this.streetLine2 = var5;
            this.postalCode = var6;
        }

        public int getConstructor() {
            return -2043654342;
        }
    }

    public static class AddedReactions extends Object {
        public int totalCount;
        public AddedReaction[] reactions;
        public String nextOffset;
        public static final int CONSTRUCTOR = 226352304;

        public AddedReactions() {
        }

        public AddedReactions(int var1, AddedReaction[] var2, String var3) {
            this.totalCount = var1;
            this.reactions = var2;
            this.nextOffset = var3;
        }

        public int getConstructor() {
            return 226352304;
        }
    }

    public static class AddedReaction extends Object {
        public ReactionType type;
        public MessageSender senderId;
        public static final int CONSTRUCTOR = -1130587313;

        public AddedReaction() {
        }

        public AddedReaction(ReactionType var1, MessageSender var2) {
            this.type = var1;
            this.senderId = var2;
        }

        public int getConstructor() {
            return -1130587313;
        }
    }

    public static class AccountTtl extends Object {
        public int days;
        public static final int CONSTRUCTOR = 1324495492;

        public AccountTtl() {
        }

        public AccountTtl(int var1) {
            this.days = var1;
        }

        public int getConstructor() {
            return 1324495492;
        }
    }

    public abstract static class Function<R extends Object> extends Object {
        public Function() {
        }

        public native String toString();
    }

    public abstract static class Object {
        public Object() {
        }

        public native String toString();

        public abstract int getConstructor();
    }
}
