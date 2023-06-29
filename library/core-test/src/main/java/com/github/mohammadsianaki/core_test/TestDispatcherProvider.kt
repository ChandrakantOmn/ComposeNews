package com.github.mohammadsianaki.core_test

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestCoroutineScheduler

@OptIn(ExperimentalCoroutinesApi::class)
class TestDispatcherProvider(testScheduler: TestCoroutineScheduler = TestCoroutineScheduler()) :
    DispatcherProvider {
    override val ui: CoroutineDispatcher = StandardTestDispatcher(testScheduler)
    override val io: CoroutineDispatcher = StandardTestDispatcher(testScheduler)
    override val bg: CoroutineDispatcher = StandardTestDispatcher(testScheduler)
}