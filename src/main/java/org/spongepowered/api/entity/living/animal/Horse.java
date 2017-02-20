/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.entity.living.animal;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.mutable.entity.HorseData;
import org.spongepowered.api.data.type.HorseColor;
import org.spongepowered.api.data.type.HorseStyle;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.item.inventory.Carrier;

/**
 * Represents a horse.
 */
public interface Horse extends Animal, Carrier {

    /**
     * Gets a copy of the {@link HorseData} representing this {@link Horse}.
     *
     * @return A copy of the horse data
     * @deprecated This is now only usable with {@link RideableHorse}s.
     */
    @Deprecated
    default HorseData getHorseData() {
        return get(HorseData.class).get();
    }

    /**
     * Gets the {@link Value} of the {@link HorseVariant} for this
     * {@link Horse}.
     *
     * @return The variant value
     * @deprecated Now represented by separate entity types for the variants
     */
    @Deprecated
    default Value<org.spongepowered.api.data.type.HorseVariant> variant() {
        return getValue(Keys.HORSE_VARIANT).get();
    }

    /**
     * Gets the {@link Value} of the {@link HorseStyle} for this
     * {@link Horse}.
     *
     * @return The horse style
     * @deprecated This is now only usable with {@link RideableHorse}s.
     */
    @Deprecated
    default Value<HorseStyle> style() {
        return getValue(Keys.HORSE_STYLE).get();
    }

    /**
     * Gets the {@link Value} of the {@link HorseColor} for this
     * {@link Horse}.
     *
     * @return The horse color
     * @deprecated This is now only usable with {@link RideableHorse}s.
     */
    @Deprecated
    default Value<HorseColor> color() {
        return getValue(Keys.HORSE_COLOR).get();
    }

}
