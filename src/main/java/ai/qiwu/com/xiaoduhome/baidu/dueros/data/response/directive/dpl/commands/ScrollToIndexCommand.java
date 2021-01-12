/* 
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.qiwu.com.xiaoduhome.baidu.dueros.data.response.directive.dpl.commands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 将当前的List视图滑动到指定item所在的列表项处, index表示列表项的序号
 * 
 * @author hujie08(hujie08@baidu.com)
 * @version V1.0
 * @since 2018年4月28日
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScrollToIndexCommand extends BaseCommand {

    private int index;
    private AlignType align;

    public int getIndex() {
        return index;
    }

    public ScrollToIndexCommand setIndex(int index) {
        this.index = index;
        return this;
    }

    public AlignType getAlign() {
        return align;
    }

    public ScrollToIndexCommand setAlign(AlignType align) {
        this.align = align;
        return this;
    }

    public ScrollToIndexCommand() {
        super("ScrollToIndex");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public enum AlignType {

        FIRST("first"), CENTER("center"), LAST("last"), VISIBLE("visible");

        private String align;

        @JsonValue
        public String getAlign() {
            return align;
        }

        public void setAlign(String align) {
            this.align = align;
        }

        private AlignType(String align) {
            this.align = align;
        }
    }
}