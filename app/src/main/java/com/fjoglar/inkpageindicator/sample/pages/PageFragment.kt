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

package com.fjoglar.inkpageindicator.sample.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fjoglar.inkpageindicator.sample.R
import com.fjoglar.inkpageindicator.sample.databinding.FragmentPageBinding

class PageFragment : Fragment(R.layout.fragment_page) {

    companion object {

        private const val ARG_PAGE_NUMBER = "arg_page_number"

        fun newInstance(
            pageNumber: Int,
        ): PageFragment = PageFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_PAGE_NUMBER, pageNumber)
            }
        }
    }

    private var pageNumber: Int = 0

    private var _binding: FragmentPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPageBinding.inflate(inflater, container, false)
        val view = binding.root

        arguments?.let {
            pageNumber = it.getInt(ARG_PAGE_NUMBER)
        }

        binding.tvPageNumber.text = pageNumber.toString()

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}