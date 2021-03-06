package org.oppia.android.util.caching.testing

import dagger.Module
import dagger.Provides
import org.oppia.android.util.caching.CacheAssetsLocally
import org.oppia.android.util.caching.LoadImagesFromAssets
import org.oppia.android.util.caching.LoadLessonProtosFromAssets
import org.oppia.android.util.caching.TopicListToCache

/**
 * Provides test dependencies corresponding to the app's caching policies. In particular, this
 * module disables caching since most tests do not need to test caching flows.
 */
@Module
class CachingTestModule {
  @Provides
  @CacheAssetsLocally
  fun provideCacheAssetsLocally(): Boolean = false

  @Provides
  @TopicListToCache
  fun provideTopicListToCache(): List<String> = listOf()

  @Provides
  @LoadLessonProtosFromAssets
  fun provideLoadLessonProtosFromAssets(): Boolean = false

  @Provides
  @LoadImagesFromAssets
  fun provideLoadImagesFromAssets(): Boolean = false
}
