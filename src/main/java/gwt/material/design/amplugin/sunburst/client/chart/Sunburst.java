/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
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
package gwt.material.design.amplugin.sunburst.client.chart;

import gwt.material.design.amcharts.client.PieChart;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amplugin.sunburst.client.datafield.SunburstDataFields;
import gwt.material.design.amplugin.sunburst.client.series.SunburstSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class Sunburst extends PieChart {

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public SunburstDataFields dataFields;

    @JsProperty
    public DictionaryTemplate<String, SunburstSeries> seriesTemplates;

    @JsMethod
    public native Sunburst constructor();
}
