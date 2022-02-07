package org.adligo.i_bytes.shared;

/**
 * This interface provides getters for the I_Bytes and I_BigBytes.<br/>
 * 
 * @author scott
 *
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code><pre>
 */
public interface I_BytesGetters {
  /**
   * return the byte at this index
   * @param idx
   * @return
   * @throws {@link ArrayIndexOutOfBoundsException} as well as
   *   {@link IllegalArgumentException} if the 
   *   index is larger than the size.
   */
  public byte get(int idx);
}
