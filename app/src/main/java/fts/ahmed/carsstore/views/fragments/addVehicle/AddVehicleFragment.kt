package fts.ahmed.carsstore.views.fragments.addVehicle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fts.ahmed.carsstore.R
import fts.ahmed.carsstore.databinding.FragmentAddVehicleBinding
class AddVehicleFragment : Fragment() {

    private lateinit var binding: FragmentAddVehicleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAddVehicleBinding.inflate(layoutInflater)
        return binding.root
    }


}