package fts.ahmed.carsstore.views.fragments.addPurches

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fts.ahmed.carsstore.R
import fts.ahmed.carsstore.databinding.FragmentAddPurchesBinding

class AddPurchesFragment : Fragment() {


    private lateinit var binding :FragmentAddPurchesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentAddPurchesBinding.inflate(layoutInflater)
        return binding.root
    }

}