package org.jolokia.poblano;

import java.util.Arrays;

import javax.tools.JavaFileObject;

import com.google.testing.compile.JavaFileObjects;
import org.junit.Test;

import static com.google.common.truth.Truth.assert_;
import static com.google.testing.compile.JavaSourcesSubjectFactory.javaSources;

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

/**
 * @author roland
 * @since 23/05/16
 */
public class PoblanoProcessorTest {

    @Test
    public void simple() throws Exception {
        JavaFileObject mojoFile = JavaFileObjects.forResource("TestMojo.java");
        assert_().about(javaSources())
                 .that(Arrays.asList(mojoFile))
                 .processedWith(new PoblanoProcessor())
                 .compilesWithoutError();
    }

}
