/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.client.file.options;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import alluxio.test.util.CommonUtils;

import org.junit.Test;

import java.util.Random;

/**
 * Tests for the {@link FreeOptions} class.
 */
public class FreeOptionsTest {
  /**
   * Tests that building a {@link FreeOptions} with the defaults works.
   */
  @Test
  public void defaults() {
    FreeOptions options = FreeOptions.defaults();

    assertFalse(options.isRecursive());
  }

  /**
   * Tests getting and setting fields.
   */
  @Test
  public void fields() {
    Random random = new Random();
    boolean recursive = random.nextBoolean();

    FreeOptions options = FreeOptions.defaults();
    options.setRecursive(recursive);

    assertEquals(recursive, options.isRecursive());
  }

  @Test
  public void equalsTest() throws Exception {
    CommonUtils.testEquals(FreeOptions.class);
  }
}
