/*
 * Designed and developed by 2020 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gowtham.mvipokedex.models

import com.squareup.moshi.Json

data class PokemonResponse(
  @field:Json(name = "count") val count: Int,
  @field:Json(name = "next") val next: String?,
  @field:Json(name = "previous") val previous: String?,
  @field:Json(name = "results") val results: List<Pokemon>
)
