/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcharts.client.base;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class TimeInterval {

    @JsProperty
    public int count;

    /**
     * @see gwt.material.design.amcore.client.constants.TimeUnit
     */
    @JsProperty
    public String timeUnit;

    @JsOverlay
    public static final TimeInterval create(int count, String timeUnit) {
        TimeInterval timeInterval = new TimeInterval();
        timeInterval.count = count;
        timeInterval.timeUnit = timeUnit;
        return timeInterval;
    }
}
