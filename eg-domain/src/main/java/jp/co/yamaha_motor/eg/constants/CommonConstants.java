package jp.co.yamaha_motor.eg.constants;

public class CommonConstants {
    /** ログインAction用のダミーユーザーID */
    public static final String DUMMY_USER_ID = "123456";

    /** ログイン判定用(成功) */
    public static final int LOGIN_SUCCESS = 0;

    /** ログイン判定用(失敗) */
    public static final int LOGIN_FAILED = 1;

    /** 取得判定用(成功) */
    public static final int PURCHASE_SUCCESS = 0;

    /** 権限判定用(権限なし) */
    public static final int NO_PERMISSION = 100;

    /** daoのbean取得用(SP101_2) */
    public static final String KGSEC101_2 = "kgsec101_2";

    /** daoのbean取得用(SP107) */
    public static final String KGSEC107 = "kgsec107";

    /** daoのbean取得用(SP108_2) */
    public static final String KGSEC108_2 = "kgsec108_2";

    /** daoのbean取得用(SP135) */
    public static final String KGSEC135 = "kgsec135";

    /** システム稼動判定用(稼働中) */
    public static final String SYSTEM_IS_RUNNING = "0";

    /** システム稼動判定用(停止中) */
    public static final String SYSTEM_UNDER_SUSPENSION = "1";

    /** システム稼動判定用(開発中) */
    public static final String SYSTEM_UNDER_DEVELOPMENT = "2";

    /** システム稼動判定用(テスト稼働中) */
    public static final String SYSTEM_IS_TEST_RUNNING = "3";

    /** システム稼動判定用(テスト停止中) */
    public static final String SYSTEM_IS_TEST_UNDER_SUSPENSION = "4";

    /** ログイン判定用(ログイン済み) */
    public static final String LOGGED_IN = "00";

    /** ログイン判定用(未ログイン) */
    public static final String NOT_LOGGED_IN = "01";

    /** ロケール用(日本語) */
    public static final String LOCALE_IS_JAPANESE = "01";

    /** ロケール用(英語) */
    public static final String LOCALE_IS_ENGLISH = "02";

    /** ロケール用(その他言語) */
    public static final String LOCALE_IS_OTHERS = "03";

    /** ローカルメニュー取得用グループID */
    public static String DUMMY_GROUP_ID = "01";

    /** システムコード */
    public static String SYSTEM_CD = "KNGF";
}
