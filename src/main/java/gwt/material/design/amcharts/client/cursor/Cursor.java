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
package gwt.material.design.amcharts.client.cursor;

import gwt.material.design.amcharts.client.Chart;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcore.client.constants.CursorStick;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Cursor extends Container {

    @JsProperty
    public Chart chart;

    @JsProperty
    public Point downPoint;

    @JsProperty
    public Point upPoint;

    @JsProperty
    public double xPosition;

    @JsProperty
    public double yPosition;

    @JsMethod
    public native void triggerDown(Point point);

    @JsMethod
    public native void triggerMove(Point point);

    /**
     * @param stick See {@link CursorStick}
     */
    @JsMethod
    public native void triggerMove(Point point, String stick);

    @JsMethod
    public native void triggerUp(Point point);

    @JsMethod
    public native void triggerMove(Point point, String stick, boolean force);
}
