package fts.ahmed.carsstore.views.fragments.addEmployees

import android.media.Image
import android.view.View
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import fts.ahmed.carsstore.data.Repository
import fts.ahmed.carsstore.model.Employee

class AddEmployeesViewModel(val repository: Repository):ViewModel() {

    var id = MutableLiveData<String>()
    var fullName = MutableLiveData<String>()
    var dob = MutableLiveData<String>()
    var gender = MutableLiveData<String>()
    var phoneNumber = MutableLiveData<String>()
    var specialization = MutableLiveData<String>()
    var yearsOfExperiance = MutableLiveData<String>()
    var image =MutableLiveData<ImageView>()

    fun addEmployee() {
        val employee =
            Employee(
                id.value.orEmpty(),
                fullName.value.orEmpty(),
                dob.value.orEmpty(),
                gender.value.orEmpty(),
                phoneNumber.value.orEmpty(),
                specialization.value.orEmpty(),
                yearsOfExperiance.value.orEmpty()
            )
        repository.addEmployee(employee)
    }

}