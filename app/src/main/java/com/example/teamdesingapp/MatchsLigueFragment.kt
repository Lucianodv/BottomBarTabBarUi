package com.example.teamdesingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.teamdesingapp.databinding.FragmentMatchsLigueBinding


class MatchsLigueFragment : Fragment() {

    private lateinit var binding: FragmentMatchsLigueBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMatchsLigueBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = viewPagerAdapter(parentFragmentManager)
        adapter.addFragments(MatchsTabFragment(),"Matchs")
        adapter.addFragments(LigueTabFragment(),"Ligue")


        binding.viewPager.adapter = adapter
        binding.tabLayaout.setupWithViewPager(binding.viewPager)


    }

}


