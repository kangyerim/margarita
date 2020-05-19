const state = {
    userid : '',
    password : ''
}

const actions = {
    login({commit}){
        commit('login')
    },
    join({commit}){
        alert('counter.js alert')
        commit('join')
    }
}
const mutations = {

}
const getters = {

}
export default {
    name : 'player',
    namespace : true,
    state,
    actions,
    mutations,
    getters
}