package com.macro.mall.tiny.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangyl
 * @Date: 2020-03-01 18:11
 * @Description:
 */
public enum RegionLevelEnum {

    LEVEL_PROVINCE("1"),
    LEVEL_CITY("2"),
    LEVEL_AREA("3");

    private static final Map<String, RegionLevelEnum> regionLevelEnums = new HashMap<>(8);

    static {
        Arrays.stream(RegionLevelEnum.values()).forEach(regionLevelEnum -> {
            regionLevelEnums.put(regionLevelEnum.getCode(), regionLevelEnum);
        });
    }

    RegionLevelEnum(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public static RegionLevelEnum enumOf(String code) {
        return regionLevelEnums.get(code);
    }


}
