package com.commerce.products

/**
 * AddOnOption is one option configured inside AddOn Group
 */
class AddOnOption {

    String name

    double price

    static belongsTo = [addonGroup:AddOn]

    static constraints = {
    }
}