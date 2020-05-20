import axios from 'axios'
const state = {
    player : {},
    fail : false,
    auth : false
}

const actions = {
    async login({commit}){
        const headers = {
            'Content-Type': 'text/plain'
        }

        axios.post('', player, header)
            .then(({data})=>{
                commit('login_commit',data)
            })
            .catch(()=>{
                state.fail=true})
    }
    ,
    async join({commit}){
        alert('counter.js alert')
        commit('join')
    }
}
const mutations = {
    login_commit(state, data){
        state.auth=true
        state.player=data.player
        localStorage.setItem('token', data.token)
        localStorage.setItem('playerId', data.player.playerId)
        if(data.player.auth === 'USER'){
            alert('일반 사용자')
            /*일반 사용자*/
        }else{
            alert('관리 자')
            /*관리자*/
        }
        alert('로그인 완료:mutations')
    }
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