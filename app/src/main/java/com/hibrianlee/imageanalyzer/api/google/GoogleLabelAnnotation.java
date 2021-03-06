/*
 * Copyright (C) 2018 Brian Lee (@hiBrianLee)
 *
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
 */

package com.hibrianlee.imageanalyzer.api.google;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hibrianlee.imageanalyzer.api.JsonModel;

class GoogleLabelAnnotation extends JsonModel {

    private final String description;
    private final float score;

    @JsonCreator
    public GoogleLabelAnnotation(@JsonProperty("description") String description,
                                 @JsonProperty("score") float score) {
        this.description = description;
        this.score = score;
    }

    String getDescription() {
        return description;
    }

    float getScore() {
        return score;
    }
}
