databaseChangeLog = {

    changeSet(author: "humblephonix (generated)", id: "1385919264763-1") {
        createTable(tableName: "_group") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "_groupPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime")

            column(name: "description", type: "varchar(255)")

            column(name: "external", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "protect", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "realm", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-2") {
        createTable(tableName: "_group_roles") {
            column(name: "role_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "group_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-3") {
        createTable(tableName: "_group_users") {
            column(name: "user_base_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "group_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-4") {
        createTable(tableName: "_role") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "_rolePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime")

            column(name: "description", type: "varchar(255)")

            column(name: "external", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "protect", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "realm", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-5") {
        createTable(tableName: "_role_users") {
            column(name: "role_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "user_base_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-6") {
        createTable(tableName: "_user") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "_userPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "action_hash", type: "varchar(255)")

            column(name: "date_created", type: "datetime")

            column(name: "enabled", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "expiration", type: "datetime")

            column(name: "external", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "federated", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "password_hash", type: "varchar(255)")

            column(name: "realm", type: "varchar(255)")

            column(name: "remoteapi", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "username", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "class", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-7") {
        createTable(tableName: "_user_passwd_history") {
            column(name: "user_base_id", type: "bigint")

            column(name: "passwd_history_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-8") {
        createTable(tableName: "add_on") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "add_onPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-9") {
        createTable(tableName: "add_on_add_on_option") {
            column(name: "add_on_options_id", type: "bigint")

            column(name: "add_on_option_id", type: "bigint")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-10") {
        createTable(tableName: "add_on_option") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "add_on_optionPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "price", type: "double precision") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-11") {
        createTable(tableName: "add_on_type") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "add_on_typePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-12") {
        createTable(tableName: "address") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "addressPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_line1", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_line2", type: "varchar(255)")

            column(name: "country_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "house_number", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "post_code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "province", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-13") {
        createTable(tableName: "country") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "countryPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-14") {
        createTable(tableName: "department") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "departmentPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-15") {
        createTable(tableName: "employee") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "employeePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_address_line1", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_address_line2", type: "varchar(255)")

            column(name: "address_country_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_house_number", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_post_code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_province", type: "varchar(255)")

            column(name: "code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "first_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "phone_number", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "store_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-16") {
        createTable(tableName: "inventory_item") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "inventory_itePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "is_tracked", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "price", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "product_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "sku", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-17") {
        createTable(tableName: "inventory_item_global_supplier") {
            column(name: "supplier_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "inventory_item_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-18") {
        createTable(tableName: "level_permission_fifth") {
            column(name: "level_permission_id", type: "bigint")

            column(name: "fifth_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-19") {
        createTable(tableName: "level_permission_first") {
            column(name: "level_permission_id", type: "bigint")

            column(name: "first_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-20") {
        createTable(tableName: "level_permission_fourth") {
            column(name: "level_permission_id", type: "bigint")

            column(name: "fourth_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-21") {
        createTable(tableName: "level_permission_second") {
            column(name: "level_permission_id", type: "bigint")

            column(name: "second_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-22") {
        createTable(tableName: "level_permission_sixth") {
            column(name: "level_permission_id", type: "bigint")

            column(name: "sixth_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-23") {
        createTable(tableName: "level_permission_third") {
            column(name: "level_permission_id", type: "bigint")

            column(name: "third_string", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-24") {
        createTable(tableName: "line_item") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "line_itemPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "inventory_item_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "quantity", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "transaction_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-25") {
        createTable(tableName: "login_record") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "login_recordPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime")

            column(name: "last_updated", type: "datetime")

            column(name: "owner_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "remote_addr", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "remote_host", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "user_agent", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-26") {
        createTable(tableName: "merchant") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "merchantPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-27") {
        createTable(tableName: "modifier") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "modifierPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-28") {
        createTable(tableName: "modifier_option") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "modifier_optiPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "is_base", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "modifier_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "price", type: "double precision") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-29") {
        createTable(tableName: "operation_type") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "operation_typPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-30") {
        createTable(tableName: "payment") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "paymentPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "amount", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "payment_num", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "payment_type_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "transaction_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-31") {
        createTable(tableName: "payment_type") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "payment_typePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-32") {
        createTable(tableName: "permission") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "permissionPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "actions", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "group_id", type: "bigint")

            column(name: "managed", type: "bit") {
                constraints(nullable: "false")
            }

            column(name: "possible_actions", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "role_id", type: "bigint")

            column(name: "target", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "user_id", type: "bigint")

            column(name: "class", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-33") {
        createTable(tableName: "product") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "productPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "category_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "cost", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "department_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "pricing_type_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-34") {
        createTable(tableName: "product_add_on") {
            column(name: "product_addon_id", type: "bigint")

            column(name: "add_on_id", type: "bigint")

            column(name: "product_exclude_options_id", type: "bigint")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-35") {
        createTable(tableName: "product_category") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "product_categPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-36") {
        createTable(tableName: "product_modifier") {
            column(name: "product_modifiers_id", type: "bigint")

            column(name: "modifier_id", type: "bigint")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-37") {
        createTable(tableName: "product_pricing_type") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "product_priciPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-38") {
        createTable(tableName: "product_product_unit_type") {
            column(name: "product_product_unit_type_id", type: "bigint")

            column(name: "product_unit_type_id", type: "bigint")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-39") {
        createTable(tableName: "product_raw_good_item") {
            column(name: "product_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "raw_good_item_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-40") {
        createTable(tableName: "product_unit_type") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "product_unit_PK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-41") {
        createTable(tableName: "profile_base") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "profile_basePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime")

            column(name: "email", type: "varchar(255)")

            column(name: "email_hash", type: "varchar(255)")

            column(name: "full_name", type: "varchar(255)")

            column(name: "last_updated", type: "datetime")

            column(name: "nick_name", type: "varchar(255)")

            column(name: "non_verified_email", type: "varchar(255)")

            column(name: "owner_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "class", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-42") {
        createTable(tableName: "raw_good_item") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "raw_good_itemPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "cost", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "quantity", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-43") {
        createTable(tableName: "raw_good_item_raw_good_supplier") {
            column(name: "supplier_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "raw_good_item_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-44") {
        createTable(tableName: "register") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "registerPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "store_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-45") {
        createTable(tableName: "store") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "storePK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_address_line1", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_address_line2", type: "varchar(255)")

            column(name: "address_country_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_house_number", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_post_code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_province", type: "varchar(255)")

            column(name: "code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-46") {
        createTable(tableName: "store_inventory") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "store_inventoPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "item_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "quantity", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "store_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-47") {
        createTable(tableName: "store_inventory_store_supplier") {
            column(name: "supplier_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "store_inventory_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-48") {
        createTable(tableName: "supplier") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "supplierPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_address_line1", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_address_line2", type: "varchar(255)")

            column(name: "address_country_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "address_house_number", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_post_code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "address_province", type: "varchar(255)")

            column(name: "code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-49") {
        createTable(tableName: "transaction") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "transactionPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "amount", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "cashier_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "date", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "operation_type_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "order_num", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "payment_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "register_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "register_code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "store_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "store_code", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "tax", type: "double precision") {
                constraints(nullable: "false")
            }

            column(name: "trans_num", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-50") {
        createTable(tableName: "url") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "urlPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "alt_text", type: "varchar(255)")

            column(name: "description", type: "varchar(255)")

            column(name: "location", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-51") {
        addPrimaryKey(columnNames: "group_id, role_id", tableName: "_group_roles")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-52") {
        addPrimaryKey(columnNames: "group_id, user_base_id", tableName: "_group_users")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-53") {
        addPrimaryKey(columnNames: "role_id, user_base_id", tableName: "_role_users")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-54") {
        addPrimaryKey(columnNames: "inventory_item_id, supplier_id", tableName: "inventory_item_global_supplier")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-55") {
        addPrimaryKey(columnNames: "product_id, raw_good_item_id", tableName: "product_raw_good_item")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-56") {
        addPrimaryKey(columnNames: "raw_good_item_id, supplier_id", tableName: "raw_good_item_raw_good_supplier")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-57") {
        addPrimaryKey(columnNames: "store_inventory_id, supplier_id", tableName: "store_inventory_store_supplier")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-116") {
        createIndex(indexName: "name_uniq_1385919264596", tableName: "_group", unique: "true") {
            column(name: "name")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-117") {
        createIndex(indexName: "FK1C8B2B3E58B53589", tableName: "_group_roles") {
            column(name: "group_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-118") {
        createIndex(indexName: "FK1C8B2B3E6CC00BEB", tableName: "_group_roles") {
            column(name: "role_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-119") {
        createIndex(indexName: "FK1CB72A8958B53589", tableName: "_group_users") {
            column(name: "group_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-120") {
        createIndex(indexName: "FK1CB72A89DF6C6382", tableName: "_group_users") {
            column(name: "user_base_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-121") {
        createIndex(indexName: "name_uniq_1385919264620", tableName: "_role", unique: "true") {
            column(name: "name")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-122") {
        createIndex(indexName: "FKADD6169E6CC00BEB", tableName: "_role_users") {
            column(name: "role_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-123") {
        createIndex(indexName: "FKADD6169EDF6C6382", tableName: "_role_users") {
            column(name: "user_base_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-124") {
        createIndex(indexName: "username_uniq_1385919264624", tableName: "_user", unique: "true") {
            column(name: "username")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-125") {
        createIndex(indexName: "FKA4C16028DF6C6382", tableName: "_user_passwd_history") {
            column(name: "user_base_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-126") {
        createIndex(indexName: "FKAB362A3DBCDF33C3", tableName: "add_on") {
            column(name: "type_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-127") {
        createIndex(indexName: "FK92039A358EB4B421", tableName: "add_on_add_on_option") {
            column(name: "add_on_option_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-128") {
        createIndex(indexName: "FK92039A3593D41E47", tableName: "add_on_add_on_option") {
            column(name: "add_on_options_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-129") {
        createIndex(indexName: "FKBB979BF4F65602", tableName: "address") {
            column(name: "country_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-130") {
        createIndex(indexName: "code_uniq_1385919264632", tableName: "department", unique: "true") {
            column(name: "code")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-131") {
        createIndex(indexName: "FK4722E6AE164FCF2D", tableName: "employee") {
            column(name: "address_country_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-132") {
        createIndex(indexName: "FK4722E6AE59F6F41A", tableName: "employee") {
            column(name: "store_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-133") {
        createIndex(indexName: "FKFE0194168B0B1763", tableName: "inventory_item") {
            column(name: "product_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-134") {
        createIndex(indexName: "sku_uniq_1385919264638", tableName: "inventory_item", unique: "true") {
            column(name: "sku")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-135") {
        createIndex(indexName: "FK9DA28CBF7317C12E", tableName: "inventory_item_global_supplier") {
            column(name: "inventory_item_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-136") {
        createIndex(indexName: "FK9DA28CBF7496AA34", tableName: "inventory_item_global_supplier") {
            column(name: "supplier_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-137") {
        createIndex(indexName: "FKC93CB6A275D6DDF2", tableName: "level_permission_fifth") {
            column(name: "level_permission_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-138") {
        createIndex(indexName: "FKC93CE39B75D6DDF2", tableName: "level_permission_first") {
            column(name: "level_permission_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-139") {
        createIndex(indexName: "FK5EB5768F75D6DDF2", tableName: "level_permission_fourth") {
            column(name: "level_permission_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-140") {
        createIndex(indexName: "FK744F50E975D6DDF2", tableName: "level_permission_second") {
            column(name: "level_permission_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-141") {
        createIndex(indexName: "FKC9F42BC175D6DDF2", tableName: "level_permission_sixth") {
            column(name: "level_permission_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-142") {
        createIndex(indexName: "FKCA01965275D6DDF2", tableName: "level_permission_third") {
            column(name: "level_permission_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-143") {
        createIndex(indexName: "FK94ED5C7E64155E41", tableName: "line_item") {
            column(name: "transaction_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-144") {
        createIndex(indexName: "FK94ED5C7E7317C12E", tableName: "line_item") {
            column(name: "inventory_item_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-145") {
        createIndex(indexName: "FKF43101E7FB71BCD4", tableName: "login_record") {
            column(name: "owner_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-146") {
        createIndex(indexName: "FK3060F2DDEA5B6F71", tableName: "modifier_option") {
            column(name: "modifier_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-147") {
        createIndex(indexName: "type_uniq_1385919264648", tableName: "operation_type", unique: "true") {
            column(name: "type")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-148") {
        createIndex(indexName: "FKD11C320664155E41", tableName: "payment") {
            column(name: "transaction_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-149") {
        createIndex(indexName: "FKD11C3206728356AE", tableName: "payment") {
            column(name: "payment_type_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-150") {
        createIndex(indexName: "FKE125C5CF58B53589", tableName: "permission") {
            column(name: "group_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-151") {
        createIndex(indexName: "FKE125C5CF6CC00BEB", tableName: "permission") {
            column(name: "role_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-152") {
        createIndex(indexName: "FKE125C5CF8F8B0CBC", tableName: "permission") {
            column(name: "user_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-153") {
        createIndex(indexName: "FKED8DCCEF6A2D2FF5", tableName: "product") {
            column(name: "department_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-154") {
        createIndex(indexName: "FKED8DCCEF6F960CF", tableName: "product") {
            column(name: "pricing_type_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-155") {
        createIndex(indexName: "FKED8DCCEFA53A212", tableName: "product") {
            column(name: "category_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-156") {
        createIndex(indexName: "name_uniq_1385919264655", tableName: "product", unique: "true") {
            column(name: "name")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-157") {
        createIndex(indexName: "FKE173BF8D339B9429", tableName: "product_add_on") {
            column(name: "product_exclude_options_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-158") {
        createIndex(indexName: "FKE173BF8D76F135C2", tableName: "product_add_on") {
            column(name: "product_addon_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-159") {
        createIndex(indexName: "FKE173BF8DC3C78F06", tableName: "product_add_on") {
            column(name: "add_on_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-160") {
        createIndex(indexName: "FK787D84275B051E06", tableName: "product_modifier") {
            column(name: "product_modifiers_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-161") {
        createIndex(indexName: "FK787D8427EA5B6F71", tableName: "product_modifier") {
            column(name: "modifier_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-162") {
        createIndex(indexName: "name_uniq_1385919264658", tableName: "product_pricing_type", unique: "true") {
            column(name: "name")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-163") {
        createIndex(indexName: "FK2AC362753070A9CB", tableName: "product_product_unit_type") {
            column(name: "product_unit_type_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-164") {
        createIndex(indexName: "FK2AC3627589AE4C1D", tableName: "product_product_unit_type") {
            column(name: "product_product_unit_type_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-165") {
        createIndex(indexName: "FK90E712AE6789A02F", tableName: "product_raw_good_item") {
            column(name: "raw_good_item_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-166") {
        createIndex(indexName: "FK90E712AE8B0B1763", tableName: "product_raw_good_item") {
            column(name: "product_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-167") {
        createIndex(indexName: "FK48EAD7A7FB71BCD4", tableName: "profile_base") {
            column(name: "owner_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-168") {
        createIndex(indexName: "email_uniq_1385919264662", tableName: "profile_base", unique: "true") {
            column(name: "email")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-169") {
        createIndex(indexName: "owner_id_uniq_1385919264665", tableName: "profile_base", unique: "true") {
            column(name: "owner_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-170") {
        createIndex(indexName: "FKF7593B366789A02F", tableName: "raw_good_item_raw_good_supplier") {
            column(name: "raw_good_item_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-171") {
        createIndex(indexName: "FKF7593B367496AA34", tableName: "raw_good_item_raw_good_supplier") {
            column(name: "supplier_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-172") {
        createIndex(indexName: "FKD6DC2EA359F6F41A", tableName: "register") {
            column(name: "store_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-173") {
        createIndex(indexName: "code_uniq_1385919264669", tableName: "register", unique: "true") {
            column(name: "code")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-174") {
        createIndex(indexName: "FK68AF8E1164FCF2D", tableName: "store") {
            column(name: "address_country_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-175") {
        createIndex(indexName: "code_uniq_1385919264672", tableName: "store", unique: "true") {
            column(name: "code")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-176") {
        createIndex(indexName: "FK7B07277E59F6F41A", tableName: "store_inventory") {
            column(name: "store_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-177") {
        createIndex(indexName: "FK7B07277EF7891D11", tableName: "store_inventory") {
            column(name: "item_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-178") {
        createIndex(indexName: "FKFE373A4B29FE8D9C", tableName: "store_inventory_store_supplier") {
            column(name: "store_inventory_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-179") {
        createIndex(indexName: "FKFE373A4B7496AA34", tableName: "store_inventory_store_supplier") {
            column(name: "supplier_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-180") {
        createIndex(indexName: "FK9CDBF9CC164FCF2D", tableName: "supplier") {
            column(name: "address_country_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-181") {
        createIndex(indexName: "code_uniq_1385919264678", tableName: "supplier", unique: "true") {
            column(name: "code")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-182") {
        createIndex(indexName: "FK7FA0D2DE1B5DDE30", tableName: "transaction") {
            column(name: "operation_type_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-183") {
        createIndex(indexName: "FK7FA0D2DE27E0E8C1", tableName: "transaction") {
            column(name: "payment_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-184") {
        createIndex(indexName: "FK7FA0D2DE498CB47", tableName: "transaction") {
            column(name: "register_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-185") {
        createIndex(indexName: "FK7FA0D2DE54B17D7E", tableName: "transaction") {
            column(name: "cashier_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-186") {
        createIndex(indexName: "FK7FA0D2DE59F6F41A", tableName: "transaction") {
            column(name: "store_id")
        }
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-58") {
        addForeignKeyConstraint(baseColumnNames: "group_id", baseTableName: "_group_roles", constraintName: "FK1C8B2B3E58B53589", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_group", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-59") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "_group_roles", constraintName: "FK1C8B2B3E6CC00BEB", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_role", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-60") {
        addForeignKeyConstraint(baseColumnNames: "group_id", baseTableName: "_group_users", constraintName: "FK1CB72A8958B53589", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_group", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-61") {
        addForeignKeyConstraint(baseColumnNames: "user_base_id", baseTableName: "_group_users", constraintName: "FK1CB72A89DF6C6382", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_user", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-62") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "_role_users", constraintName: "FKADD6169E6CC00BEB", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_role", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-63") {
        addForeignKeyConstraint(baseColumnNames: "user_base_id", baseTableName: "_role_users", constraintName: "FKADD6169EDF6C6382", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_user", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-64") {
        addForeignKeyConstraint(baseColumnNames: "user_base_id", baseTableName: "_user_passwd_history", constraintName: "FKA4C16028DF6C6382", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_user", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-65") {
        addForeignKeyConstraint(baseColumnNames: "type_id", baseTableName: "add_on", constraintName: "FKAB362A3DBCDF33C3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "add_on_type", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-66") {
        addForeignKeyConstraint(baseColumnNames: "add_on_option_id", baseTableName: "add_on_add_on_option", constraintName: "FK92039A358EB4B421", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "add_on_option", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-67") {
        addForeignKeyConstraint(baseColumnNames: "add_on_options_id", baseTableName: "add_on_add_on_option", constraintName: "FK92039A3593D41E47", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "add_on", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-68") {
        addForeignKeyConstraint(baseColumnNames: "country_id", baseTableName: "address", constraintName: "FKBB979BF4F65602", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-69") {
        addForeignKeyConstraint(baseColumnNames: "address_country_id", baseTableName: "employee", constraintName: "FK4722E6AE164FCF2D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-70") {
        addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "employee", constraintName: "FK4722E6AE59F6F41A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-71") {
        addForeignKeyConstraint(baseColumnNames: "product_id", baseTableName: "inventory_item", constraintName: "FKFE0194168B0B1763", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-72") {
        addForeignKeyConstraint(baseColumnNames: "inventory_item_id", baseTableName: "inventory_item_global_supplier", constraintName: "FK9DA28CBF7317C12E", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventory_item", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-73") {
        addForeignKeyConstraint(baseColumnNames: "supplier_id", baseTableName: "inventory_item_global_supplier", constraintName: "FK9DA28CBF7496AA34", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "supplier", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-74") {
        addForeignKeyConstraint(baseColumnNames: "level_permission_id", baseTableName: "level_permission_fifth", constraintName: "FKC93CB6A275D6DDF2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "permission", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-75") {
        addForeignKeyConstraint(baseColumnNames: "level_permission_id", baseTableName: "level_permission_first", constraintName: "FKC93CE39B75D6DDF2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "permission", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-76") {
        addForeignKeyConstraint(baseColumnNames: "level_permission_id", baseTableName: "level_permission_fourth", constraintName: "FK5EB5768F75D6DDF2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "permission", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-77") {
        addForeignKeyConstraint(baseColumnNames: "level_permission_id", baseTableName: "level_permission_second", constraintName: "FK744F50E975D6DDF2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "permission", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-78") {
        addForeignKeyConstraint(baseColumnNames: "level_permission_id", baseTableName: "level_permission_sixth", constraintName: "FKC9F42BC175D6DDF2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "permission", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-79") {
        addForeignKeyConstraint(baseColumnNames: "level_permission_id", baseTableName: "level_permission_third", constraintName: "FKCA01965275D6DDF2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "permission", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-80") {
        addForeignKeyConstraint(baseColumnNames: "inventory_item_id", baseTableName: "line_item", constraintName: "FK94ED5C7E7317C12E", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventory_item", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-81") {
        addForeignKeyConstraint(baseColumnNames: "transaction_id", baseTableName: "line_item", constraintName: "FK94ED5C7E64155E41", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "transaction", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-82") {
        addForeignKeyConstraint(baseColumnNames: "owner_id", baseTableName: "login_record", constraintName: "FKF43101E7FB71BCD4", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_user", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-83") {
        addForeignKeyConstraint(baseColumnNames: "modifier_id", baseTableName: "modifier_option", constraintName: "FK3060F2DDEA5B6F71", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "modifier", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-84") {
        addForeignKeyConstraint(baseColumnNames: "payment_type_id", baseTableName: "payment", constraintName: "FKD11C3206728356AE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "payment_type", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-85") {
        addForeignKeyConstraint(baseColumnNames: "transaction_id", baseTableName: "payment", constraintName: "FKD11C320664155E41", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "transaction", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-86") {
        addForeignKeyConstraint(baseColumnNames: "group_id", baseTableName: "permission", constraintName: "FKE125C5CF58B53589", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_group", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-87") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "permission", constraintName: "FKE125C5CF6CC00BEB", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_role", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-88") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "permission", constraintName: "FKE125C5CF8F8B0CBC", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_user", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-89") {
        addForeignKeyConstraint(baseColumnNames: "category_id", baseTableName: "product", constraintName: "FKED8DCCEFA53A212", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product_category", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-90") {
        addForeignKeyConstraint(baseColumnNames: "department_id", baseTableName: "product", constraintName: "FKED8DCCEF6A2D2FF5", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "department", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-91") {
        addForeignKeyConstraint(baseColumnNames: "pricing_type_id", baseTableName: "product", constraintName: "FKED8DCCEF6F960CF", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product_pricing_type", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-92") {
        addForeignKeyConstraint(baseColumnNames: "add_on_id", baseTableName: "product_add_on", constraintName: "FKE173BF8DC3C78F06", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "add_on", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-93") {
        addForeignKeyConstraint(baseColumnNames: "product_addon_id", baseTableName: "product_add_on", constraintName: "FKE173BF8D76F135C2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-94") {
        addForeignKeyConstraint(baseColumnNames: "product_exclude_options_id", baseTableName: "product_add_on", constraintName: "FKE173BF8D339B9429", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-95") {
        addForeignKeyConstraint(baseColumnNames: "modifier_id", baseTableName: "product_modifier", constraintName: "FK787D8427EA5B6F71", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "modifier", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-96") {
        addForeignKeyConstraint(baseColumnNames: "product_modifiers_id", baseTableName: "product_modifier", constraintName: "FK787D84275B051E06", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-97") {
        addForeignKeyConstraint(baseColumnNames: "product_product_unit_type_id", baseTableName: "product_product_unit_type", constraintName: "FK2AC3627589AE4C1D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-98") {
        addForeignKeyConstraint(baseColumnNames: "product_unit_type_id", baseTableName: "product_product_unit_type", constraintName: "FK2AC362753070A9CB", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product_unit_type", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-99") {
        addForeignKeyConstraint(baseColumnNames: "product_id", baseTableName: "product_raw_good_item", constraintName: "FK90E712AE8B0B1763", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "product", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-100") {
        addForeignKeyConstraint(baseColumnNames: "raw_good_item_id", baseTableName: "product_raw_good_item", constraintName: "FK90E712AE6789A02F", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "raw_good_item", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-101") {
        addForeignKeyConstraint(baseColumnNames: "owner_id", baseTableName: "profile_base", constraintName: "FK48EAD7A7FB71BCD4", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "_user", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-102") {
        addForeignKeyConstraint(baseColumnNames: "raw_good_item_id", baseTableName: "raw_good_item_raw_good_supplier", constraintName: "FKF7593B366789A02F", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "raw_good_item", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-103") {
        addForeignKeyConstraint(baseColumnNames: "supplier_id", baseTableName: "raw_good_item_raw_good_supplier", constraintName: "FKF7593B367496AA34", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "supplier", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-104") {
        addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "register", constraintName: "FKD6DC2EA359F6F41A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-105") {
        addForeignKeyConstraint(baseColumnNames: "address_country_id", baseTableName: "store", constraintName: "FK68AF8E1164FCF2D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-106") {
        addForeignKeyConstraint(baseColumnNames: "item_id", baseTableName: "store_inventory", constraintName: "FK7B07277EF7891D11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventory_item", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-107") {
        addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "store_inventory", constraintName: "FK7B07277E59F6F41A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-108") {
        addForeignKeyConstraint(baseColumnNames: "store_inventory_id", baseTableName: "store_inventory_store_supplier", constraintName: "FKFE373A4B29FE8D9C", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store_inventory", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-109") {
        addForeignKeyConstraint(baseColumnNames: "supplier_id", baseTableName: "store_inventory_store_supplier", constraintName: "FKFE373A4B7496AA34", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "supplier", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-110") {
        addForeignKeyConstraint(baseColumnNames: "address_country_id", baseTableName: "supplier", constraintName: "FK9CDBF9CC164FCF2D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-111") {
        addForeignKeyConstraint(baseColumnNames: "cashier_id", baseTableName: "transaction", constraintName: "FK7FA0D2DE54B17D7E", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "employee", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-112") {
        addForeignKeyConstraint(baseColumnNames: "operation_type_id", baseTableName: "transaction", constraintName: "FK7FA0D2DE1B5DDE30", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "operation_type", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-113") {
        addForeignKeyConstraint(baseColumnNames: "payment_id", baseTableName: "transaction", constraintName: "FK7FA0D2DE27E0E8C1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "payment", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-114") {
        addForeignKeyConstraint(baseColumnNames: "register_id", baseTableName: "transaction", constraintName: "FK7FA0D2DE498CB47", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "register", referencesUniqueColumn: "false")
    }

    changeSet(author: "humblephonix (generated)", id: "1385919264763-115") {
        addForeignKeyConstraint(baseColumnNames: "store_id", baseTableName: "transaction", constraintName: "FK7FA0D2DE59F6F41A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "store", referencesUniqueColumn: "false")
    }
}
