package ru.norddigital.tgbot.enums;
import com.vdurmont.emoji.EmojiParser;

public enum Icons {
    PLUS(":heavy_plus_sign:"),
    MINUS(":heavy_minus_sign:"),
    CHECK(":white_check_mark:"),
    NOT(":x:"),
    DOUBT(":zzz:"),
    FLAG(":checkered_flag:"),
    SETTINGS(":hammer_and_wrench:"),
    INFO(":information_source:");

    private String value;

    public String get() {
        return EmojiParser.parseToUnicode(value);
    }

    Icons(String value) {
        this.value = value;
    }
}
