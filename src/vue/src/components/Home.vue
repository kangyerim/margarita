<template>
    <div id="app">
        <Layout>
            <template #header = "header">
                <h1>{{header.title}}</h1>
                <h3>{{header.title}}</h3>
                <h3>회원가입 :)</h3>
            </template>
        </Layout>
    </div>
</template>

<script>
    import Layout from "./common/Layout";
    export default {
        name: "Home",
        components: {Layout},
        comments : {Layout},
        data : () => {
            return {

            }
        }
    }
</script>

<style scoped>

</style>