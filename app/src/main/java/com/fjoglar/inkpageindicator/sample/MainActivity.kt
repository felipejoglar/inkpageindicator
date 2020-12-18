/*
 * Copyright 2020 Felipe Joglar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fjoglar.inkpageindicator.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fjoglar.inkpageindicator.sample.databinding.ActivityMainBinding
import com.fjoglar.inkpageindicator.sample.pages.PageAdapter
import com.fjoglar.inkpageindicator.sample.pages.PageFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPager()
    }

    private fun setupViewPager() {
        with(binding) {
            viewPager.adapter = PageAdapter(getPages(5), supportFragmentManager, lifecycle)
            inkPageIndicator.setViewPager(viewPager)
        }
    }

    private fun getPages(pagesCount: Int): List<Fragment> {
        val pages = mutableListOf<Fragment>()
        for (i in 1..pagesCount) {
            pages.add(PageFragment.newInstance(i))
        }
        return pages
    }
}