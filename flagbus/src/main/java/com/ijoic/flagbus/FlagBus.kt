/*
 *
 *  Copyright(c) 2018 VerstSiu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ijoic.flagbus

/**
 * Flag bus
 *
 * @author verstsiu on 2018/8/23.
 * @version 1.0
 */
object FlagBus {
  /**
   * Debug enabled status.
   *
   * <p>Default as <code>false</code></p>
   */
  @JvmStatic
  var isDebugEnabled = false

  /**
   * Test enabled status.
   *
   * <p>Default as <code>false</code></p>
   */
  @JvmStatic
  var isTestEnabled = false

  /**
   * Alpha enabled status.
   *
   * <p>Default as <code>false</code></p>
   */
  @JvmStatic
  var isAlphaEnabled = false

  /**
   * Beta enabled status.
   *
   * <p>Default as <code>false</code></p>
   */
  @JvmStatic
  var isBetaEnabled = false

  /**
   * Store release status.
   *
   * Use to differ apks from which downloaded from application stores(such as Google Play).
   *
   * <p>Default as <code>false</code></p>
   */
  @JvmStatic
  var isStoreRelease = false
}
