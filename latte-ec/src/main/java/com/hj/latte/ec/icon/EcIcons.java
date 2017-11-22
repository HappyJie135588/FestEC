package com.hj.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by HuangJie on 2017/11/22.
 */

public enum EcIcons implements Icon {

    icon_scan('\ue602'),
    icon_ali_pay('\ue67c');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
