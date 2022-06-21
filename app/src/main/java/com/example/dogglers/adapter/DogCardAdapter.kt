/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(private val context: Context?):
    RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        Layout.GRID
        Layout.HORIZONTAL
        Layout.VERTICAL
        try {
        } catch (e: Exception) {
        }

        return DogCardViewHolder(null)
    }

    override fun getItemCount(): Int = 3 // TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        listOf(
            Dog(
                R.drawable.tzeitel, "Tzeitel", "7", "sunbathing"
            ),
            Dog(
                R.drawable.leroy, "Leroy", "4", "sleeping in dangerous places"
            ),
            Dog(
                R.drawable.frankie, "Frankie", "2", "stealing socks"
            ),
            Dog(
                R.drawable.nox, "Nox", "8", "meeting new animals"
            ),
            Dog(
                R.drawable.faye, "Faye", "8", "Digging in the garden"
            ),
            Dog(
                R.drawable.bella, "Bella", "14", "Chasing sea foam"
            )
        )

        context?.resources

    }
}


