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
package gwt.material.design.amcore.client.list;

import gwt.material.design.amcore.client.events.AmEvent;
import gwt.material.design.amcore.client.events.EventDispatcher;
import gwt.material.design.amcore.client.events.SortedListEvents;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class OrderedList<T> {

    @JsProperty
    public EventDispatcher<AmEvent<SortedListEvents<T>>> events;

    @JsProperty
    public T first;

    @JsProperty
    public T last;

    @JsProperty
    public int length;

    @JsProperty
    public T[] values;

    @JsMethod
    public native void clear();

    @JsMethod
    public native boolean contains(T value);

    @JsMethod
    public native void each(Object object);

    @JsMethod
    public native T getIndex(int index);

    @JsMethod
    public native int indexOf(T value);

    @JsMethod
    public native void insert(T value);

    @JsMethod
    public native List<T> iterator();

    @JsMethod
    public native void remove(T value);

    @JsMethod
    public native void setAll(T[] values);

    @JsMethod
    public native OrderedList<T> slice(int start, int end);
}
