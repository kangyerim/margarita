<template>
    <div>
        <div>{{count}}</div>
        <button @click="increment" class="btn">클릭</button>
        <button @click="zero" class="btn cancel">초기화</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            count: 0
        }
    },
    methods: {
        increment() {
            this.count++
        },
        zero() {
            this.count = 0
        }
    }
}
</script>

<style scoped>
    .btn {
        width: 200px;
        background-color: lightcoral;
        text-align: center;
    }
    .cancel {
        width: 200px;
        background-color: lightseagreen;
        text-align: center;
    }
</style>