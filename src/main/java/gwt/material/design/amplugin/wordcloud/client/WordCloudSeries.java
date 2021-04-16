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
package gwt.material.design.amplugin.wordcloud.client;

import gwt.material.design.amcharts.client.series.Series;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.ui.Label;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_wordCloud")
public class WordCloudSeries extends Series {

    @JsProperty
    public int accuracy;

    @JsProperty
    public int[] angles;

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public WordCloudSeriesDataFields dataFields;

    @JsProperty
    public String[] excludeWords;

    @JsProperty
    public ListTemplate<Label> labels;

    @JsProperty
    public Container labelsContainer;

    @JsProperty
    public int maxCount;

    @JsProperty
    public int maxFontSize;

    @JsProperty
    public int minFontSize;

    @JsProperty
    public int minValue;

    @JsProperty
    public int minWordLength;

    @JsProperty
    public double randomness;

    @JsProperty
    public double rotationThreshold;

    @JsProperty
    public int step;

    @JsProperty
    public String text;

    @JsMethod
    public native WordCloudSeries constructor();

    @JsMethod
    public native void copyFrom(WordCloudSeries series);

    @JsMethod
    public native boolean isCapitalized(String word);
}
