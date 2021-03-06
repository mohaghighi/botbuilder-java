/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for InputHints.
 */
public enum InputHints {
    /** Enum value acceptingInput. */
    ACCEPTING_INPUT("acceptingInput"),

    /** Enum value ignoringInput. */
    IGNORING_INPUT("ignoringInput"),

    /** Enum value expectingInput. */
    EXPECTING_INPUT("expectingInput");

    /** The actual serialized value for a InputHints instance. */
    private String value;

    InputHints(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InputHints instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InputHints object, or null if unable to parse.
     */
    @JsonCreator
    public static InputHints fromString(String value) {
        InputHints[] items = InputHints.values();
        for (InputHints item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
