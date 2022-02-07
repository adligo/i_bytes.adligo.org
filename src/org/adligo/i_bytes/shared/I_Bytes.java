package org.adligo.i_bytes.shared;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * This interfaces represents a immutable representation of bytes, which will likely
 * mimic immutability in most implementations.  This can be accomplished 
 * by providing a view of a underlying byte array or ByteArrays. Mimicking
 * immutability allows use of a psudo functional style while NOT duplicating
 * memory for actual immutability. <br/>
 *   Also note that a {@link Supplier}&lt;Optional&lt;I_Bytes&gt;&gt;> or 
 * {@link Consumer}&lt;Optional&lt;I_Bytes&gt;&gt; may be 
 * used to represent infinite streams of Bytes. <br/>
 *   Implementations are necessarily NotThreadsafe, however there are consumer / producer
 * thread hand off patterns which could use the implementations without thread safety problems.
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
public interface I_Bytes extends I_Size, I_BytesGetters {
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
