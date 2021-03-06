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
package org.spongepowered.api.world.weather;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 * All possible {@link Weather}s in vanilla minecraft.
 */
public final class Weathers {

    // SORTFIELDS:ON

    public static final Weather CLEAR = DummyObjectProvider.createFor(Weather.class, "CLEAR");

    public static final Weather RAIN = DummyObjectProvider.createFor(Weather.class, "RAIN");

    public static final Weather THUNDER_STORM = DummyObjectProvider.createFor(Weather.class, "THUNDER_STORM");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private Weathers() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
