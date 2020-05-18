<template>
    <div>
        <div>카운터: {{count}}</div>
        <button @click="increment">+</button>
        <br>
        <button @click="decrement">-</button>
        <br>
        <button @click="incrementIfOdd">increment If Odd</button>
        <br>
        <button @click="incrementIfAsync">increment If Async</button>

        <div>
            <div>최근 5개 값의 로그 : {{recentHistory}}</div>
        </div>
    </div>
</template>

<script>
    import {mapGetters, mapActions} from 'vuex'
    export default {
        computed: mapGetters([
            'count',
            'recentHistory'
        ]),
        methods: mapActions([
            'increment',
            'decrement',
            'incrementIfOdd',
            'incrementIfAsync'
        ])
    }
</script>

<style scoped>

</style>