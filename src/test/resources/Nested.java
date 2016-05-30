/*
 * 
 * Copyright 2016 Roland Huss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author roland
 * @since 30/05/16
 */
public class Nested {

    /**
     * Inner bean
     */
    @Parameter
    InnerNested inner;

    /**
     * Name of nested
     */
    @Parameter
    String name;

    /**
     * Button to push
     */
    @Parameter
    boolean button;

    /**
     * Max hits
     */
    @Parameter
    int max;

    /**
     * Min hits
     */
    @Parameter
    Integer min;

    public static class InnerNested {

        /**
         * The colour of life
         */
        @Parameter
        String colour;
    }
}
