package com.kit20160553.aop_part3_chapter06.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.kit20160553.aop_part3_chapter06.R
import com.kit20160553.aop_part3_chapter06.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null
    private lateinit var articleAdapter: ArticleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentHomeBinding = FragmentHomeBinding.bind(view)
        binding = fragmentHomeBinding
        articleAdapter = ArticleAdapter()
        articleAdapter.submitList(mutableListOf<ArticleModel>().apply {
            add(ArticleModel("0", "aaaa", 10000, "5000원", ""))
            add(ArticleModel("0", "ㅠㅠㅠㅠ", 210000, "51000원", ""))
        })

        fragmentHomeBinding.articleRecyclerView.layoutManager = LinearLayoutManager(context)
        fragmentHomeBinding.articleRecyclerView.adapter = articleAdapter
    }

}