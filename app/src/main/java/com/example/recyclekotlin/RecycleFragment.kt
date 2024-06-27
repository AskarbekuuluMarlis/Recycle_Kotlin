package com.example.recyclekotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclekotlin.databinding.FragmentRecycleBinding

class RecycleFragment : Fragment() {
    lateinit var binding: FragmentRecycleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRecycleBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()

    }

    private fun initAdapter() {
        val adapter = AnimalAdapter(
            arrayListOf(
            Zoo("Мангуст","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/20131107_6156_Mangouste_fauve.jpg/275px-20131107_6156_Mangouste_fauve.jpg"),
            Zoo("Тигр","https://e7.pngegg.com/pngimages/451/91/png-clipart-tiger-tiger.png"),
            Zoo("Лев","https://i.pinimg.com/736x/b5/53/47/b55347df5689075f979f3cb9ab4b6dec.jpg"),
            Zoo("Собака","https://img.freepik.com/free-photo/cute-shepherd-dog-posing-isolated-over-white-background_155003-46179.jpg"),
            Zoo("Кошка","https://www.purina.ru/sites/default/files/2021-10/britanskaya-3.jpg"),
            Zoo("Лошадь","https://e7.pngegg.com/pngimages/497/435/png-clipart-running-horse-product-kind-animal.png"),
            Zoo("Беркут","https://redbook28.ru/wp-content/uploads/2021/10/berkut.jpg"),
            Zoo("Линивец","https://cs13.pikabu.ru/post_img/2023/11/07/10/1699379675147451966.jpg"),
            Zoo("Шакал","https://guns.club/upload/resize_cache/iblock/e6b/8jbfg1ofw73nrwxpi9ehh95msybmr869/400_270_0/%D1%88%D0%B0%D0%BA%D0%B0%D0%BB.jpg"),
            )
        )
binding.recyclerView.adapter = adapter
    }

}