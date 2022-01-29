package com.example.to_do_list.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(id: Int): ShopItem {
        return shopListRepository.getShopItem(id)
    }
}