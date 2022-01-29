package com.example.to_do_list.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun getShopItem(id: Int): ShopItem

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)
}