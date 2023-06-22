package ru.parhom.distributionsystem.entity;

public enum Role {
    // TODO: 22.06.2023 of - самый бесполезный предлог в нейминге: DORMITORY_ADMIN - смысл тот же.
    //  По-английски было бы dorminotory's admin. Просто убираем лишнее:)
    ADMIN_OF_DORMITORY, ADMIN_OF_UNIVERSITY, CHIEF_ADMIN
//    todo: советую ввести поле аля title/description, в котором дать человекочитаемое название для каждого элемента.
//     Тут, безусловно, это не обязательно - все достаточно очевидно. Но, в целом, это достаточно распрастраненная и,
//     на мой взгляд, хорошая практика
}
