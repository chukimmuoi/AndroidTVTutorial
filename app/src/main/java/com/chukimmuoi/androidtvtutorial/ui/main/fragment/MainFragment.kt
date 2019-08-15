package com.chukimmuoi.androidtvtutorial.ui.main.fragment

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.leanback.app.BrowseFragment
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.PresenterSelector
import com.chukimmuoi.androidtvtutorial.R

/**
 * @author  : Vinsmart
 * @Skype   : chukimmuoi
 * @Mobile  : +84 373 672 505
 * @Email   : v.muoick@vinsmart.net.vn
 * @Project : AndroidTVTutorial
 * Created by CHUKIMMUOI on 8/15/2019.
 */
class MainFragment: BrowseSupportFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupUIElements()
    }

    private fun setupUIElements() {
        activity?.let {
            badgeDrawable = ContextCompat.getDrawable(it, R.drawable.videos_by_google_banner)
            title = "Videos by Google" // Badge, when set, takes precedent
            // over title
            headersState = HEADERS_ENABLED
            isHeadersTransitionOnBackEnabled = true

            // set fastLane (or headers) background color
            brandColor = ContextCompat.getColor(it, R.color.fastlane_background)

            // set search icon color
            searchAffordanceColor = ContextCompat.getColor(it, R.color.search_opaque)
        }
    }
}