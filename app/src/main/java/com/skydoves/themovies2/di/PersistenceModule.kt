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

package com.skydoves.themovies2.di

import androidx.room.Room
import com.skydoves.themovies2.room.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val persistenceModule = module {
  single {
    Room
      .databaseBuilder(androidApplication(), AppDatabase::class.java, "TheMovies.db")
      .allowMainThreadQueries()
      .build()
  }

  single(createdAtStart = false) { get<AppDatabase>().movieDao() }
  single(createdAtStart = false) { get<AppDatabase>().tvDao() }
  single(createdAtStart = false) { get<AppDatabase>().peopleDao() }
}
