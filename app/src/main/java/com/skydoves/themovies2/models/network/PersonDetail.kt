/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
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

package com.skydoves.themovies2.models.network

import android.os.Parcelable
import com.skydoves.themovies2.models.NetworkResponseModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PersonDetail(
  val birthday: String?,
  val known_for_department: String,
  val place_of_birth: String,
  val also_known_as: List<String>?,
  val biography: String
) : Parcelable, NetworkResponseModel
