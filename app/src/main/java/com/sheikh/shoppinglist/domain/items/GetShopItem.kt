package com.sheikh.shoppinglist.domain.items

import com.sheikh.shoppinglist.domain.repository.Repository

class GetShopItem(private val repository: Repository) {

    suspend fun getShopItem(id: Int): ShopItem {
        return repository.getShopItem(id)
    }
}