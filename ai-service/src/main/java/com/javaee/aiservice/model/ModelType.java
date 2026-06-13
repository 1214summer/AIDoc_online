package com.javaee.aiservice.model;

public enum ModelType {
    QWEN36_PLUS("qwen3.6-plus", "通义千问3.6 Plus", "openai", "Qwen/Qwen2.5-7B-Instruct"),
    GLM5("glm-5", "智谱GLM-5", "openai", "THUDM/GLM-4-32B-0414"),
    KIMI_K25("kimi-k2.5", "月之暗面K2.5", "openai", "moonshot-v1-8k"),
    MINIMAX_M25("MiniMax-M2.5", "MiniMax M2.5", "openai", "MiniMaxAI/MiniMax-Text-01");

    private final String code;
    private final String name;
    private final String provider;
    private final String siliconflowModel;

    ModelType(String code, String name, String provider, String siliconflowModel) {
        this.code = code;
        this.name = name;
        this.provider = provider;
        this.siliconflowModel = siliconflowModel;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getProvider() {
        return provider;
    }

    public String getSiliconflowModel() {
        return siliconflowModel;
    }

    public static ModelType fromCode(String code) {
        for (ModelType type : values()) {
            if (type.code.equalsIgnoreCase(code)) {
                return type;
            }
        }
        return QWEN36_PLUS;
    }
}