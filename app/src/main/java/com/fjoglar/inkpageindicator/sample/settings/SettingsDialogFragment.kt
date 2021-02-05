package com.fjoglar.inkpageindicator.sample.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.fjoglar.inkpageindicator.sample.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SettingsDialogFragment : BottomSheetDialogFragment() {

    companion object {
        private const val TAG = "SettingsDialogFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_settings, container)
    }

    fun show(fragmentManager: FragmentManager) {
        show(fragmentManager, TAG)
    }
}