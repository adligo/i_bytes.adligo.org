package org.adligo.i_bytes.shared;


/**
 * This interface provides a view to a byte[], with out copying the data and
 * keeping the logic for the view separate from the Bytes class.
 * <br/>
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
public interface I_BytesView extends I_Bytes {
  /**
   * Update the start to a new start, the start MUST be less than 
   * or equal to the end.  If the start and the end are the same,
   * then the size is zero.
   * @param start
   * @return
   */
  public int getStart();
  
  /**
   * Update the start to a new start, the start MUST be less than 
   * or equal to the end.  If the start and the end are the same,
   * then the size is zero.
   * @param start
   * @return
   */
  public int getEnd();
}
