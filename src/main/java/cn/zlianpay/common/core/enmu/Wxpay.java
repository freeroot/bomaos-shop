package cn.zlianpay.common.core.enmu;

public enum Wxpay {
    MQPAY_WXPAY("mqpay_wxpay"),
    ZLIANPAY_WXPAY("zlianpay_wxpay"),
    YUNGOUOS_WXPAY("yungouos_wxpay"),
    XUNHUPAY_WXPAY("xunhupay_wxpay"),
    JIEPAY_WXPAY("jiepay_wxpay"),
    PAYJS_WXPAY("payjs_wxpay"),
    YUNFU_WXPAY("yunfu_wxpay"),
    WXPAY("wxpay"),
    WXPAU_H5("wxpay_h5");

    Wxpay(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }

    public static boolean getByValue(String value) {
        for (Wxpay wxpay : values()) {
            if (wxpay.getCode().equals(value)) {
                return true;
            }
        }
        return false;
    }

}
