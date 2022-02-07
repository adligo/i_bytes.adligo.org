package org.adligo.i_bytes.shared;

import java.math.BigInteger;
/**
 * This interfaces represents a mutable collection of bytes of any size. 
 * Buffering limiters should be included to wrappers of usage of implementations
 * of this class. <br/>
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
public interface I_BigBytesMutant extends I_BigBytes, I_BytesSetters {
  /**
   * add the bytes growing the size if necessary
   * @param idx
   * @param b
   * @return
   */
  public I_BigBytesMutant add(BigInteger idx, byte b);
  
  /**
   * add the bytes growing the size if necessary
   * @param idx
   * @param b
   * @return
   */
  public I_BigBytesMutant add(BigInteger idx, byte[] b);
  
  /**
   * add the bytes growing the size if necessary
   * @param idx
   * @param bytes
   * @return
   */
  public I_BigBytesMutant add(BigInteger idx, I_Bytes bytes);
  
  /**
   * set the bytes, overwriting the current byte
   * @param idx
   * @param b
   * @return
   * @throws {@link ArrayIndexOutOfBoundsException} as well as
   *   {@link IllegalArgumentException} if the 
   *   index is larger than the size.
   */
  public I_BigBytesMutant set(BigInteger idx, byte b);
  
  /**
   * set the bytes, overwriting the current bytes
   * @param idx
   * @param b
   * @return
   * @throws {@link ArrayIndexOutOfBoundsException} as well as
   *   {@link IllegalArgumentException} if the 
   *   index is larger than the size.
   */
  public I_BigBytesMutant set(BigInteger idx, byte[] b);
  
  /**
   * set the bytes, overwriting the current bytes
   * @param idx
   * @param bytes
   * @return
   * @throws {@link ArrayIndexOutOfBoundsException} as well as
   *   {@link IllegalArgumentException} if the 
   *   index is larger than the size.
   */
  public I_BigBytesMutant set(BigInteger idx, I_Bytes bytes);
}
