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
package gwt.material.design.amcore.client.ui;

import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcore.client.adapter.CircleAdapter;
import gwt.material.design.amcore.client.base.Percent;
import gwt.material.design.amcore.client.base.Sprite;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Circle extends Sprite {

    @JsProperty
    public Adapter<Circle, CircleAdapter> adapter;

    @JsProperty
    public Number pixelRadius;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object radius;

    @JsProperty
    public Object propertyFields;
}