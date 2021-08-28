package com.epam.tc.hw4.utilitis;

import io.qameta.allure.Attachment;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AttachmentUtil {

    @Attachment
    public byte[] makeScreenshotAttachment (String name, byte[] source) {
        return source;
    }
}
